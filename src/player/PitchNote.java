package player;

/**
 * Implements notes and represents all musical notes which have a Pitch
 * Store notes in an integer array to allow for chords be scheduled properly
 */
public class PitchNote implements Note{
	private int numerator;
	private int denominator;
	private int[] note;
	private String lyric;
	
	/**
	 * Constructor for PitchNote
	 * @param numerator - integer representing numerator of note's length
	 * @param denominator - integer representing denominator of note's length
	 * @param note - integer array representing the pitch values corresponding to every note that is a part of this PitchNote, allowing for Chords
	 * @param lyric - String representing the lyric associated with the note
	 */
	public PitchNote(int numerator, int denominator, int[] note, String lyric) {
		if ((numerator <= 0) || (denominator <= 0)){
			throw new IllegalArgumentException("Illegal argument for numerator or denominator");
		}
		if (note == null)
			throw new IllegalArgumentException("Note integer array can't be null");
		this.numerator = numerator;
		this.denominator = denominator;
		this.note = note;
		this.lyric = lyric;
	}
	
	/**
	 * Returns the numerator of the note length
	 * @return numerator
	 */
	@Override
	public int getNumerator() {
		return this.numerator;
	}
	
	/**
	 * Returns the denominator of the note length
	 * @return denominator
	 */
	@Override
	public int getDenominator() {
		return this.denominator;
	}
	
	/**
	 * Returns the integer array of note values as MIDI values
	 * @return note
	 */
	@Override
	public int[] getNote() {
		return this.note;
	}
	
	/**
	 * Returns the length of the note as a double
	 * @return note length
	 */
	@Override
	public double getLength() {
		return this.numerator * 1.0 / this.denominator;
	}
	
	/**
	 * Returns the lyric associated with the note
	 * @return lyric
	 */
	@Override
	public String getLyric() {
		return this.lyric;
	}   
	
	@Override
	public void setLyric(String lyric) {
	    this.lyric = lyric;
	}
//	@Override 
//	public Note copy() {
//	    return new PitchNote(this.numerator, this.denominator, this.note.clone(), this.lyric);
//	}
}
