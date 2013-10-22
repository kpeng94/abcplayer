package player;

import java.util.ArrayList;

import javax.sound.midi.MidiUnavailableException;

import sound.LyricListener;
import sound.SequencePlayer;

public class MusicalPiece {
    private String title;
    private String composer;
    private Integer beatUnit;
    private Integer measureLength;
    private Integer tempo;
    private ArrayList<MusicalPhrase> phrases;
    
    public MusicalPiece(String title, String composer, Integer beatUnit, Integer measureLength, Integer tempo, ArrayList<MusicalPhrase> phrases) {
        this.title = title;
        this.composer = composer;
        this.beatUnit = beatUnit;
        this.measureLength = measureLength;
        this.tempo = tempo;
        this.phrases = phrases;
    }
    
    /**
     * @return ticks
     */
    public Integer getTicks() {
        //TODO: (kpeng94) Implement this using phrases
        return 0;
    }
    
    /**
     * @return ticks
     */
    public void playPiece() {
        SequencePlayer player;
        try {
            LyricListener listener = new LyricListener() {
                public void processLyricEvent(String text) {
                    System.out.print(text);
                }
            };
            player = new SequencePlayer(this.getTempo(), this.getTicks(), listener);
            for (MusicalPhrase phrase : this.phrases) {
                for (Bar bar : phrase.getBars()) {
                    for (Note note : bar.getNotes()) {
                        
                    }
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }  
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return the composer
     */
    public String getComposer() {
        return this.composer;
    }

    /**
     * @return the beatUnit
     */
    public Integer getBeatUnit() {
        return this.beatUnit;
    }

    /**
     * @return the measureLength
     */
    public Integer getMeasureLength() {
        return this.measureLength;
    }

    /**
     * @return the tempo
     */
    public Integer getTempo() {
        return this.tempo;
    }

}
