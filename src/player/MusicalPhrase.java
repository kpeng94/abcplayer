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
    
    public MusicalPhrase clone() {
        return new MusicalPhrase(new ArrayList<Bar>(this.bars));
    }
    
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bars == null) ? 0 : bars.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MusicalPhrase other = (MusicalPhrase) obj;
		if (bars == null) {
			if (other.bars != null)
				return false;
		} else if (!bars.equals(other.bars))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "MusicalPhrase [bars=" + bars + "]";
	}
    
}
