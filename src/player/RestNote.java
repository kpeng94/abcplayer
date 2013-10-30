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
        this.numerator = numerator;
        this.denominator = denominator;
    }
    
//    @Override
//    public Note copy() {
//        return new RestNote(this.numerator, this.denominator, this.lyric);
//    }
    
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
    
}
