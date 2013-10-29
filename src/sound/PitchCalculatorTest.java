package sound;

import static org.junit.Assert.*;

import org.junit.Test;

import player.PitchNote;

public class PitchCalculatorTest {

	@Test
	public void basicPitchCalculatorTest() {
		// C in Key A minor and C in Key C major is 
		Pitch AmC=new PitchCalculator().getPitchForKey("Am", "C");
		Pitch CC = new PitchCalculator().getPitchForKey("C", "C");
		assertEquals(AmC.toMidiNote(), CC.toMidiNote());
	}
	
	@Test
	public void twoPitchEqualityTest() {
		// key G major and E minor have F sharp as a normal F
		Pitch GF= new PitchCalculator().getPitchForKey("G", "F");
		Pitch EmF = new PitchCalculator().getPitchForKey("Em", "F");
		assertEquals(GF.toMidiNote(), EmF.toMidiNote());
		Pitch Fsharp= new Pitch('F').transpose(1);
		assertEquals(Fsharp.toMidiNote(), GF.toMidiNote());
	}
	
}
