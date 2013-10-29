package player;

/**
 * Implements notes and represents all musical notes which have a Pitch
 *
 */
public class PitchNote implements Note{
	private int numerator;
	private int denominator;
	private int[] note;
	private String lyric;

	public PitchNote(int numerator, int denominator, int[] note, String lyric) {
		if ((numerator <= 0) || (denominator <= 0)){
			throw new IllegalArgumentException("Illegal argument for numerator or denominator");
		}
		this.numerator = numerator;
		this.denominator = denominator;
		this.note = note;
		this.lyric = lyric;
	}

	@Override
	public int getNumerator() {
		return this.numerator;
	}

	@Override
	public int getDenominator() {
		return this.denominator;
	}

	@Override
	public int[] getNote() {
		return this.note;
	}

	@Override
	public double getLength() {
		return this.numerator * 1.0 / this.denominator;
	}

	@Override
	public String getLyric() {
		return this.lyric;
	}   
	
//	@Override 
//	public Note copy() {
//	    return new PitchNote(this.numerator, this.denominator, this.note.clone(), this.lyric);
//	}
}
