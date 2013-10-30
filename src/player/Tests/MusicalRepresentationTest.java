package player.Tests;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

import player.Bar;
import player.MusicalPhrase;
import player.MusicalPiece;
import player.PitchNote;
import player.RestNote;
import player.Voice;

/**
 * This is the test suite for our ADT
 * Testing Strategy:
 * 	1) PitchNotes:
 * 		a) Test that we get an error if we try to create a PitchNote with length 0 or negative length
 * 		b) Testing creation of a chord, with one note being a sharp and other two being regular notes
 * 		c) Testing that a PitchNote of length 1/4 and a lyric associated with it gets stored properly
 * 
 * 	2) RestNotes:
 * 		a) Create a rest smaller than a measure
 * 		b) Create a rest that is length of a measure
 * 		c) Creating a rest that is the length of multiple measures
 * 
 * 	3) Bars:
 * 		a) Create a bar with enough PitchNotes to represent a measure
 * 		b) Create a bar with enough RestNotes to represent a measure
 * 		c) Create a bar with more RestNotes/PitchNotes than length of measure which should return an error
 * 
 * 	4) MusicalPhrases:
 * 		a) Creating a musical phrase with no bars in it, which should return an error
 * 		b) Create a musical phrase with one bar
 * 		c) Create a musical phrase with multiple bars
 *
 */
public class MusicalRepresentationTest {

	@Test(expected=IllegalArgumentException.class)
	public void pitchNoteZeroLengthTest() {
		new PitchNote(0, 0, new int[] {9}, "");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void pitchNoteNegativeLengthTest() {
		new PitchNote(-1, 1,new int[] {9}, "");
	}
	
	@Test
	public void pitchNoteChordTest() {
		new PitchNote(1, 4, new int[]{3,4,5}, "");
	}
	
	@Test
	public void pitchNoteBasicTest() {
		new PitchNote(1,4, new int[] {9}, "Hi");
	}
	
	@Test
	public void restNoteBasicTest() {
		new RestNote(1,4);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void illegalRestNoteTest(){
		new RestNote(-1, 4);
	}
	
	@Test
	public void restNoteMeasureTest() {
		new RestNote(8,4);
	}
	
	@Test
	public void restNoteMultipleMeasureTest() {
		new RestNote(16,4);
	}
	
	@Test
	public void barPitchNoteTest() {
		Bar bar=new Bar(4,4);
		for (int i=0; i< 4; i++)
			bar.addNote(new PitchNote(1,4,new int[] {9},"Test!"));
	}
	
	@Test
	public void barRestNoteTest() {
		Bar bar = new Bar(4,4);
		for (int i=0; i<4; i++)
			bar.addNote(new RestNote(1,4));
	}
	
	@Test
	public void barTooManyNotesTest() {
		Bar bar=new Bar(4,4);
		for (int i=0; i<2; i++)
		{
			bar.addNote(new PitchNote(1,4,new int[]{9},"Testing for an error!"));
			bar.addNote(new RestNote(2,4));
		}
	}
	
	@Test
	public void basicMusicalPhraseTest() {
		ArrayList<Bar> barArray=new ArrayList<Bar>();
		Bar bar=new Bar(4,4);
		for (int i=0; i<4; i++)
			bar.addNote(new RestNote(1,4));
		barArray.add(bar);
		new MusicalPhrase(barArray);
	}
	
	@Test
	public void multipleBarsMusicalPhraseTest() {
		ArrayList<Bar> barArray=new ArrayList<Bar>();
		Bar bar=new Bar(4,4);
		Bar bar2=new Bar(4,4);
		for (int i=0; i<4; i++)
			bar.addNote(new RestNote(1,4));
		for (int k=0; k<4; k++)
			bar2.addNote(new PitchNote(1,4,new int[] {9}, "Hi"));
		barArray.add(bar);
		barArray.add(bar2);
		new MusicalPhrase(barArray);
	}
	
	@Test
	public void basicMusicalPieceTest() {
		String title = "Test Title";
		String composer = "Test Composer";
		int meterNumerator = 1, meterDenominator =4;
		int tempoSpeed=100;
		int tempoNumerator = 1;
		int tempoDenominator = 4;
		ArrayList<MusicalPhrase> phrases = new ArrayList<MusicalPhrase>();
		new MusicalPiece(title, composer, meterNumerator, meterDenominator, tempoSpeed, tempoNumerator, tempoDenominator, phrases);
	}
	
	@Test
	public void musicalPieceMethodTest() {
		String title = "Test Title";
		String composer = "Test Composer";
		int meterNumerator = 1, meterDenominator =4;
		int tempoSpeed=100;
		int tempoNumerator = 1;
		int tempoDenominator = 4;
		ArrayList<MusicalPhrase> phrases = new ArrayList<MusicalPhrase>();
		MusicalPiece mp = new MusicalPiece(title, composer, meterNumerator, meterDenominator, tempoSpeed, tempoNumerator, tempoDenominator, phrases);
		assertTrue(mp.getTitle().equals(title));
		assertTrue(mp.getComposer().equals(composer));
		assertTrue(mp.getMeterDenominator().equals(meterDenominator));
		assertTrue(mp.getMeterNumerator().equals(meterNumerator));
		assertTrue(mp.getTempo().equals(tempoSpeed));
		}
	
	@Test(expected=IllegalArgumentException.class)
	public void nullPitchNoteTest() {
		new PitchNote(1, 4, null, null);
	}
	
	@Test(expected=NullPointerException.class)
	public void addNoteNullBarTest() {
		Bar bar=new Bar(1,4);
		bar.addNote(null);
	}
	
	@Test
	public void basicVoiceTest() {
		boolean isRepeatOn = true;
        boolean isOneTwoRepeat = true;
        Bar currentRepeatBar = new Bar(1,4);
        ArrayList<Bar> repeatBars = new ArrayList<Bar>();
        ArrayList<Bar> voiceBars = new ArrayList<Bar>();
		new Voice(isRepeatOn, isOneTwoRepeat, currentRepeatBar, repeatBars);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void nullVoiceTest() {
		boolean isRepeatOn = true;
        boolean isOneTwoRepeat = true;
        Bar currentRepeatBar = null;
        ArrayList<Bar> repeatBars = new ArrayList<Bar>();
        ArrayList<Bar> voiceBars = new ArrayList<Bar>();
		new Voice(isRepeatOn, isOneTwoRepeat, currentRepeatBar, repeatBars);
	}
	
	@Test
	public void voiceGetRepeatReturnTest() {
		boolean isRepeatOn = true;
        boolean isOneTwoRepeat = true;
        Bar currentRepeatBar = new Bar(1,4);
        ArrayList<Bar> repeatBars = new ArrayList<Bar>();
        ArrayList<Bar> voiceBars = new ArrayList<Bar>();
		Voice voice = new Voice(isRepeatOn, isOneTwoRepeat, currentRepeatBar, repeatBars);
		assertTrue(voice.getRepeatOn() == isRepeatOn);
	}
	
	@Test
	public void voiceGetIsOneTwoRepeatReturnTest() {
		boolean isRepeatOn = true;
        boolean isOneTwoRepeat = true;
        Bar currentRepeatBar = new Bar(1,4);
        ArrayList<Bar> repeatBars = new ArrayList<Bar>();
        ArrayList<Bar> voiceBars = new ArrayList<Bar>();
		Voice voice = new Voice(isRepeatOn, isOneTwoRepeat, currentRepeatBar, repeatBars);
		assertTrue(voice.getOneTwoRepeat() == isRepeatOn);
	}
	
	@Test
	public void voiceEqualityTest() {
		// Voice 1
		boolean isRepeatOn = true;
        boolean isOneTwoRepeat = true;
        Bar currentRepeatBar = new Bar(1,4);
        ArrayList<Bar> repeatBars = new ArrayList<Bar>();
        ArrayList<Bar> voiceBars = new ArrayList<Bar>();
		Voice voice = new Voice(isRepeatOn, isOneTwoRepeat, currentRepeatBar, repeatBars);
		
		// Voice 2
		boolean isRepeatOn1 = true;
        boolean isOneTwoRepeat1 = true;
        Bar currentRepeatBar1 = new Bar(1,4);
        ArrayList<Bar> repeatBars1 = new ArrayList<Bar>();
        ArrayList<Bar> voiceBars1 = new ArrayList<Bar>();
		Voice voice1 = new Voice(isRepeatOn1, isOneTwoRepeat1, currentRepeatBar1, repeatBars1);
		
		assertTrue(voice.equals(voice1));
	}
	

}
