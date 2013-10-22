package player;

import java.util.ArrayList;

public class MusicalPhrase {
    private ArrayList<Bar> bars;
    
    public MusicalPhrase(ArrayList<Bar> bars) {
        this.bars = bars;
    }

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
            for (int j = 3; j < Math.min(barTicks, ticks); j += 2) {
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
