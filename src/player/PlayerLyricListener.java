package player;

import grammar.ABCLyricBaseListener;
import grammar.ABCLyricParser;

import java.util.ArrayList;
/**
 * Listener to parse Lyrics
 *
 */
public class PlayerLyricListener extends ABCLyricBaseListener{
    private ArrayList<Bar> barsInLine;
    private int barPosition = 0;
    private int notePositionInBar = 0;
    
    /**
     * Constructor
     * @param barsInLine - represents all the bars of notes that correspond to the line of lyrics
     */
    public PlayerLyricListener(ArrayList<Bar> barsInLine) {
        this.barsInLine = barsInLine;
    }
    
    /**
     * Returns the barsInLine
     * @return ArrayList of Bars
     */
    public ArrayList<Bar> getBarsInLine() {
        return this.barsInLine;
    }

    /**
     * Adds the word to the appropriate note
     * @param ctx Context for word
     */
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
        // Handling what happens if we see an *
        if (ctx.ASTERISK() != null) {
            this.notePositionInBar++;
            if (this.notePositionInBar == this.barsInLine.get(barPosition).getNotes().size()) {
                this.barPosition++;
                this.notePositionInBar = 0;
            }
        }
        // Handling when we see a | in lyrics
        else if (ctx.BAR() != null) {
            if (this.notePositionInBar != 0) {
                this.barPosition++;
            }
            this.notePositionInBar = 0;
        } else {
        	// Case of when we have an _ in Lyrics
            if (ctx.UNDERSCORE() != null) {
                String word = ctx.WORD().getText().replace("~"," ").replace("\\-", "-");
                this.barsInLine.get(barPosition).getNotes().get(notePositionInBar).setLyric(word.concat(" (FOR "+(ctx.UNDERSCORE().getText().lastIndexOf("_") + 2 + " NOTES)")));
                this.notePositionInBar += ctx.UNDERSCORE().getText().lastIndexOf("_") + 2;
                while(barPosition < this.barsInLine.size() && this.notePositionInBar >= this.barsInLine.get(barPosition).getNotes().size() ) {
                    this.notePositionInBar -= this.barsInLine.get(barPosition).getNotes().size();
                    this.barPosition++;
                }
            } 
            // Case of when we have spaces in the lyrics
            if (ctx.SPACES() != null) {
                String word = ctx.WORD().getText().replace("~"," ").replace("\\-", "-");
                this.barsInLine.get(barPosition).getNotes().get(notePositionInBar).setLyric(word);
                this.notePositionInBar++;
                if (this.notePositionInBar == this.barsInLine.get(barPosition).getNotes().size()) {
                    this.barPosition++;
                    this.notePositionInBar = 0;
                }
            }
            // Case of when we have a - in the lyrics
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
