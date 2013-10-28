package player;

import java.util.ArrayList;

/**
 * Represents the bars for each voice
 * Comprised as a list of bars
 *
 */
public class MusicalPhrase {
    private ArrayList<Bar> bars;
    
    public MusicalPhrase(ArrayList<Bar> bars) {
        this.bars = bars;
    }
    /**
     * Returns the measures of the MusicalPhrase
     * @return list of Bars
     */
    public ArrayList<Bar> getBars() {
        return new ArrayList<Bar>(this.bars);
    }

    /** Returns the integer number of ticks per beat
     * @return ticks
     */
    public int getTicks() {
        int ticks = 1;
        int gcd;
        for (int i = 0; i < bars.size(); i++) {
            int barTicks = bars.get(i).getTicks();
            /**
             * Computing the gcd of the two will help us compute the LCM.
             */
            gcd = 1;
            if (barTicks % 2 == 0 && ticks % 2 == 0)
                gcd = 2;
            for (int j = 3; j <= Math.min(barTicks, ticks); j++) {
                if (barTicks % j == 0 && ticks % j == 0) {
                    gcd = j;
                }
            }
            /**
             * Compute the least common multiple of ticks and barTicks
             */
            ticks = barTicks * ticks / gcd;
        }
        return ticks;
    }
    
}
