package player;

import grammar.ABCLyricBaseListener;
import grammar.ABCLyricParser;

import java.util.ArrayList;

public class PlayerLyricListener extends ABCLyricBaseListener{
    private ArrayList<Bar> barsInLine;
    private int barPosition = 0;
    private int notePositionInBar = 0;
    
    public PlayerLyricListener(ArrayList<Bar> barsInLine) {
        this.barsInLine = barsInLine;
    }
    
    public ArrayList<Bar> getBarsInLine() {
        return this.barsInLine;
    }

    @Override
    public void exitWord(ABCLyricParser.WordContext ctx) {
        while(barPosition < this.barsInLine.size() && this.notePositionInBar >= this.barsInLine.get(barPosition).getNotes().size() ) {
            this.notePositionInBar -= this.barsInLine.get(barPosition).getNotes().size();
            this.barPosition++;
        }
        while (this.barsInLine.get(barPosition).getNotes().get(notePositionInBar).getClass() == RestNote.class) {
            this.notePositionInBar++;
            // Need to readjust again to make sure there are no index out of bounds exceptions.
            while(barPosition < this.barsInLine.size() && this.notePositionInBar >= this.barsInLine.get(barPosition).getNotes().size() ) {
                this.notePositionInBar -= this.barsInLine.get(barPosition).getNotes().size();
                this.barPosition++;
            }
        }
        if (ctx.ASTERISK() != null) {
            this.notePositionInBar++;
            if (this.notePositionInBar == this.barsInLine.get(barPosition).getNotes().size()) {
                this.barPosition++;
                this.notePositionInBar = 0;
            }
        } else if (ctx.BAR() != null) {
            if (this.notePositionInBar != 0) {
                this.barPosition++;
            }
            this.notePositionInBar = 0;
        } else {
            if (ctx.UNDERSCORE() != null) {
                String word = ctx.WORD().getText().replace("~"," ").replace("\\-", "-");
                this.barsInLine.get(barPosition).getNotes().get(notePositionInBar).setLyric(word.concat(" (FOR "+(ctx.UNDERSCORE().getText().lastIndexOf("_") + 2 + " NOTES)")));
                this.notePositionInBar += ctx.UNDERSCORE().getText().lastIndexOf("_") + 2;
                while(barPosition < this.barsInLine.size() && this.notePositionInBar >= this.barsInLine.get(barPosition).getNotes().size() ) {
                    this.notePositionInBar -= this.barsInLine.get(barPosition).getNotes().size();
                    this.barPosition++;
                }
            } 
            if (ctx.SPACES() != null) {
                String word = ctx.WORD().getText().replace("~"," ").replace("\\-", "-");
                this.barsInLine.get(barPosition).getNotes().get(notePositionInBar).setLyric(word);
                this.notePositionInBar++;
                if (this.notePositionInBar == this.barsInLine.get(barPosition).getNotes().size()) {
                    this.barPosition++;
                    this.notePositionInBar = 0;
                }
            }
            if (ctx.HYPHEN() != null) {
                String word = ctx.WORD().getText().replace("~"," ").replace("\\-", "-");
                this.barsInLine.get(barPosition).getNotes().get(notePositionInBar).setLyric(word);
                this.notePositionInBar += ctx.HYPHEN().getText().lastIndexOf("-") + 1;
                while(barPosition < this.barsInLine.size() && this.notePositionInBar >= this.barsInLine.get(barPosition).getNotes().size() ) {
                    this.notePositionInBar -= this.barsInLine.get(barPosition).getNotes().size();
                    this.barPosition++;
                }
            }
            
            if (ctx.HYPHEN() == null && ctx.SPACES() == null && ctx.UNDERSCORE() == null) {
                String word = ctx.WORD().getText().replace("~"," ").replace("\\-", "-");
                this.barsInLine.get(barPosition).getNotes().get(notePositionInBar).setLyric(word);
                this.notePositionInBar++;
                if (this.notePositionInBar == this.barsInLine.get(barPosition).getNotes().size()) {
                    this.barPosition++;
                    this.notePositionInBar = 0;
                }
            }
        }
        
    }

}
