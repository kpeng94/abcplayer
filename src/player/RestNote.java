package player;
/**
 * Implements Note and represents all musical rests
 * 
 *
 */
public class RestNote implements Note{
    private int numerator;
    private int denominator;
    private String lyric;
    
    public RestNote(int numerator, int denominator, String lyric) {
        this.numerator = numerator;
        this.denominator = denominator;
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
    public int getNote() {
        return 0;
    }
    
    @Override
    public double getLength() {
        return this.numerator * 1.0 / this.denominator;
    }
    
    @Override
    public String getLyric() {
        return this.lyric;
    }   
}
