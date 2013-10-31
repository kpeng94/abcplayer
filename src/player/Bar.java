package player;

import java.util.ArrayList;
/**
 * Represents a measure as a list of notes, restricted by measureLength and noteSum
 * 
 */
public class Bar {
    private int meterNumerator; // represents measure length
    private int meterDenominator; // represents note value that represents a beat
    private double meter;
    private double notesSum;
    private ArrayList<Note> notes;
    
    /**
     * Constructor for a bar, calculates the meter based off of meterNumerator and meterDenominator
     * @param meterNumerator - represents measure length
     * @param meterDenominator - represents note value that represents a beat
     */
    public Bar(int meterNumerator, int meterDenominator) {
        this.meterNumerator = meterNumerator;
        this.meterDenominator = meterDenominator;
        this.meter=(double) this.meterNumerator/this.meterDenominator;
        this.notesSum = 0.0;
        this.notes = new ArrayList<Note>();
    }
    
    /**
     * Constructs a new bar from a passed in bar
     * @param bar
     */
    public Bar(Bar bar) {
        this.meterNumerator = bar.meterNumerator;
        this.meterDenominator = bar.meterDenominator;
        this.meter = bar.meter;
        this.notesSum = bar.notesSum;
        this.notes = new ArrayList<Note>(bar.getNotes());
    }
    
    /**
     * Adds a note to the current measure
     * @param note
     */
    public void addNote(Note note) {
        notesSum += note.getLength();
        notes.add(note);
    }
    
    /**
     * Returns the list of notes for the measure
     * @return list of notes
     */
    public ArrayList<Note> getNotes() {
        return new ArrayList<Note>(this.notes);
    }
    
    /** Returns the integer number of ticks per beat
     * @return ticks
     */
    public int getTicks() {
        int ticks = 1; 
        int gcd;
        for (int i = 0; i < notes.size(); i++) {
            int noteTicks = notes.get(i).getDenominator();
            /**
             * Computing the gcd of the two will help us compute the LCM.
             */
            gcd = 1;
            if (noteTicks % 2 == 0 && ticks % 2 == 0)
                gcd = 2;
            for (int j = 3; j <= Math.min(noteTicks, ticks); j++) {
                if (noteTicks % j == 0 && ticks % j == 0) {
                    gcd = j;
                }
            }
            /**
             * Compute the least common multiple of ticks and barTicks
             */
            ticks = noteTicks * ticks / gcd;
        }
        return ticks;
    }
    /**
     * Returns hash value of the Bar
     * @return integer hash value
     */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(meter);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + meterDenominator;
		result = prime * result + meterNumerator;
		result = prime * result + ((notes == null) ? 0 : notes.hashCode());
		temp = Double.doubleToLongBits(notesSum);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	/**
	 * Checks if this object is equal to another object
	 * @return boolean value
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bar other = (Bar) obj;
		if (Double.doubleToLongBits(meter) != Double
				.doubleToLongBits(other.meter))
			return false;
		if (meterDenominator != other.meterDenominator)
			return false;
		if (meterNumerator != other.meterNumerator)
			return false;
		if (notes == null) {
			if (other.notes != null)
				return false;
		} else if (!notes.equals(other.notes))
			return false;
		if (Double.doubleToLongBits(notesSum) != Double
				.doubleToLongBits(other.notesSum))
			return false;
		return true;
	}
	/**
	 * Returns String representation of this bar
	 * @return String
	 */
	@Override
	public String toString() {
		return "Bar [meterNumerator=" + meterNumerator + ", meterDenominator="
				+ meterDenominator + ", meter=" + meter + ", notesSum="
				+ notesSum + ", notes=" + notes + "]";
	}

}
