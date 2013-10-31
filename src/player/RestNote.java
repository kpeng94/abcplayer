package player;
/**
 * Implements Note and represents all musical rests
 *
 */
public class RestNote implements Note{
    private int numerator;
    private int denominator;
    
    /**
     * Constructor for RestNote
     * @param numerator - integer representing numerator of rest's length
     * @param denominator - integer representing denominator of rest's length
     */
    public RestNote(int numerator, int denominator) {
    	if (numerator <= 0 || denominator <= 0)
    		throw new IllegalArgumentException("Numerator or Denominator can't be negative");
        this.numerator = numerator;
        this.denominator = denominator;
    }
            
    /**
     * Returns the numerator of the note's length
     * @return numerator
     */
    @Override
    public int getNumerator() {
        return this.numerator;
    }

    /**
     * Returns the denominator of the note's length
     * @return denominator
     */
    @Override
    public int getDenominator() {
        return this.denominator;
    }
    
    /**
     * Returns an empty integer array because rests don't have any pitch values
     * @return new empty integer array
     */
    @Override
    public int[] getNote() {
        return new int[] {};
    }
    
    /**
     * Returns the length of the rest as a double
     * @return length
     */
    @Override
    public double getLength() {
        return this.numerator * 1.0 / this.denominator;
    }

    /**
     * Returns null because rests don't have lyrics associated with them
     * @return null
     */
	@Override
	public String getLyric() {
		return null;
	}
	
	/**
	 * Returns an integer hash code value for the RestNote
	 * @return integer reprsenting hash value
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + denominator;
		result = prime * result + numerator;
		return result;
	}

	/**
	 * Equals method to compare this RestNote with another one
	 * @return boolean representing if two objects are equal
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RestNote other = (RestNote) obj;
		if (denominator != other.denominator)
			return false;
		if (numerator != other.numerator)
			return false;
		return true;
	}
	
	/**
	 * Creates a string representation of the RestNote
	 * @return String representing RestNote
	 */
	@Override
	public String toString() {
		return "RestNote [numerator=" + numerator + ", denominator="
				+ denominator + "]";
	}
    
	/**
	 * Method to setLyric with the RestNote but just returns because
	 * RestNotes don't have lyrics associated with them
	 */
    @Override
    public void setLyric(String lyric) {
        return;
    }
}
