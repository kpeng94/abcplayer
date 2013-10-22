package player;

public class PitchNote implements Note{
    private int numerator;
    private int denominator;
    private int note;
    private String lyric;
    
    public PitchNote(int numerator, int denominator, int note, String lyric) {
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
    public int getNote() {
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
}
