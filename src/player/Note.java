package player;

/**
 * An interface requiring the getNumerator, getDenominator, getNote, getLength and getLyric methods
 * Stores lyrics with respected Notes
 */
public interface Note {
	// Default denominator and numerator lengths
    public int denominator = 4;
    public int numerator = 1;

    /**
     * Returns the numerator of the Note
     * @return numerator
     */
    public int getNumerator();
    
    /**
     * Returns the denominator of the Note
     * @return denominator
     */
    public int getDenominator();
    
    /**
     * Returns the Note value as an integer array of MIDI values
     * @return Array of note value
     */
    public int[] getNote();
    
    /**
     * Returns the length the Note will be played
     * @return length of note
     */
    public double getLength();
    
    /**
     * Returns the string of the Lyric associated with the note
     * @return lyric
     */
    public String getLyric();
    
    /**
     * Sets the lyric
     */
    public void setLyric(String lyric);
}
