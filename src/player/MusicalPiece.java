package player;

import java.util.ArrayList;

import javax.sound.midi.MidiUnavailableException;

import sound.LyricListener;
import sound.Pitch;
import sound.SequencePlayer;
/**
 * Represents an ABC file after being parsed, made up of a list of MusicalPhrases
 * Also stores header information, like title, composer, meter, and tempo
 *
 */
public class MusicalPiece {
    private String title;
    private String composer;
    private Integer beatUnit; // denominator in meter, represents the note value that represents one beat
    private Integer measureLength; // numerator in meter, represents number of beats in a measure
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
    
    /** Returns the integer number of ticks per beat
     * @return ticks
     */
    public Integer getTicks() {
        int ticks = 1;
        int gcd;
        for (int i = 0; i < phrases.size(); i++) {
            int phraseTicks = phrases.get(i).getTicks();
            /**
             * Computing the gcd of the two will help us compute the LCM.
             */
            gcd = 1;
            if (phraseTicks % 2 == 0 && ticks % 2 == 0)
                gcd = 2;
            for (int j = 3; j <= Math.min(phraseTicks, ticks); j++) {
                if (phraseTicks % j == 0 && ticks % j == 0) {
                    gcd = j;
                }
            }
            /**
             * Compute the least common multiple of ticks and phraseTicks
             */
            ticks = phraseTicks * ticks / gcd;
        }
        return ticks;
    }
    
    /**
     *  Queues the notes and lyrics to be played by the Sequence Player
     * 
     */
    public void playPiece() {
        System.out.println("Title: " + this.title);
        System.out.println("Composer: " + this.composer);
        System.out.println("Played in " + this.measureLength + "/" + this.beatUnit + " time @ " + this.tempo + " BPM.");
        SequencePlayer player;
        try {
            LyricListener listener = new LyricListener() {
                public void processLyricEvent(String text) {
                    System.out.println(text);
                }
            };
            player = new SequencePlayer(this.getTempo(), this.getTicks(), listener);
            for (MusicalPhrase phrase : this.phrases) {
                int tickCount = 0;
                for (Bar bar : phrase.getBars()) {
                    for (Note note : bar.getNotes()) {
                        if (note instanceof PitchNote) {
                            for(int i=0; i<note.getNote().length; i++)
                            	player.addNote(note.getNote()[i], tickCount, this.getTicks() * this.measureLength * note.getNumerator() / note.getDenominator());
                        }
                        if (!(note.getLyric().equals(""))) {
                            player.addLyricEvent(note.getLyric(), tickCount);
                        }
                        tickCount += note.getNumerator() * this.measureLength * this.getTicks() / note.getDenominator();
                    }
                }
            }
            player.play();
        }
        catch (Exception e) {
            e.printStackTrace();
        }  
    }

    /**
     * Returns the title of the MusicalPiece
     * @return the title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Returns the composer of the MusicalPiece
     * @return the composer
     */
    public String getComposer() {
        return this.composer;
    }

    /**
     * Returns the note value that represents a beat of the MusicalPiece
     * @return beatUnit
     */
    public Integer getBeatUnit() {
        return this.beatUnit;
    }

    /**
     * Returns the number of beats in a measure 
     * @return measureLength
     */
    public Integer getMeasureLength() {
        return this.measureLength;
    }

    /**
     * Returns the tempo of the MusicalPiece
     * @return tempo
     */
    public Integer getTempo() {
        return this.tempo;
    }

}
