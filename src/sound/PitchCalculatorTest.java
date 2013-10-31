package sound;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * This will allow us to test the workings of the PitchCalculator.
 * Testing Strategy: We test multiple different keys and check that 
 * the Pitchs being returned are equivalent and correct keys based on
 * http://en.wikipedia.org/wiki/key_signature
 *
 */

public class PitchCalculatorTest {
	
	// Basic pitch calculator test to make sure it's working properly
	@Test
	public void basicPitchCalculatorTest() {
		// C in Key A minor and C in Key C major is 
		Pitch AmC=new PitchCalculator().getPitchForKey("Am", "C");
		Pitch CC = new PitchCalculator().getPitchForKey("C", "C");
		assertEquals(AmC.toMidiNote(), CC.toMidiNote());
	}
	
	// Test two pitches returned are equivalent to each other and to the 
	// original pitch transposed properly
	@Test
	public void twoPitchEqualityTest() {
		// key G major and E minor have F sharp as a normal F
		Pitch GF= new PitchCalculator().getPitchForKey("G", "F");
		Pitch EmF = new PitchCalculator().getPitchForKey("Em", "F");
		assertEquals(GF.toMidiNote(), EmF.toMidiNote());
		Pitch Fsharp= new Pitch('F').transpose(1);
		assertEquals(Fsharp.toMidiNote(), GF.toMidiNote());
	}
	
	@Test
    public void twoPitchEqualityTestTwo() {
        // key Bb major and G minor have B flat as a normal F
        Pitch GF= new PitchCalculator().getPitchForKey("Bb", "B");
        Pitch EmF = new PitchCalculator().getPitchForKey("Gm", "B");
        assertEquals(GF.toMidiNote(), EmF.toMidiNote());
        Pitch Fsharp= new Pitch('B').transpose(-1);
        assertEquals(Fsharp.toMidiNote(), GF.toMidiNote());
    }
	
    @Test
    public void twoPitchEqualityTestThree() {
        // key D major and B minor have C sharp as a normal C
        Pitch GF= new PitchCalculator().getPitchForKey("D", "C");
        Pitch EmF = new PitchCalculator().getPitchForKey("Bm", "C");
        assertEquals(GF.toMidiNote(), EmF.toMidiNote());
        Pitch Fsharp= new Pitch('C').transpose(1);
        assertEquals(Fsharp.toMidiNote(), GF.toMidiNote());
    }
	
	// Tests three pitches to be equal to each other
	@Test
	public void threePitchEqualityTest() {
		// key G sharp and B major are the same
		Pitch GsharpC=new PitchCalculator().getPitchForKey("G#m", "C");
		Pitch BC = new PitchCalculator().getPitchForKey("B", "C");
		assertEquals(GsharpC.toMidiNote(), BC.toMidiNote());
		
		Pitch GsharpG = new PitchCalculator().getPitchForKey("G#m", "G");
		Pitch BG = new PitchCalculator().getPitchForKey("B",  "G");
		assertEquals(GsharpG.toMidiNote(), BG.toMidiNote());
	}
	
}
