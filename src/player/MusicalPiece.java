package player;

import java.util.ArrayList;

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
            for (int j = 3; j < Math.min(phraseTicks, ticks); j += 2) {
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
