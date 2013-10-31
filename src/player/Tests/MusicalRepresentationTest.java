package player.Tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import player.Bar;
import player.MusicalPhrase;
import player.MusicalPiece;
import player.Note;
import player.PitchNote;
import player.RestNote;
import player.Voice;

/**
 * This is the test suite for our ADT
 * Testing Strategy:
 * 	1) PitchNotes:
 * 		a) Test that we get an exception if we try to create a PitchNote with length 0 or negative length
 * 		b) Testing creation of a chord, with one note being a sharp and other two being regular notes
 * 		c) Testing that a PitchNote of length 1/4 and a lyric associated with it gets stored properly
 *      d) Testing that passing null arguments into a PitchNote throws an exception
 * 
 * 	2) RestNotes:
 * 		a) Create a rest smaller than a measure
 * 		b) Create a rest that is length of a measure
 * 		c) Creating a rest that is the length of multiple measures
 * 
 * 	3) Bars:
 * 		a) Create a bar with enough PitchNotes to represent a measure
 * 		b) Create a bar with enough RestNotes to represent a measure
 * 		c) Create a bar with more RestNotes/PitchNotes than length of measure
 *      d) Adding a null note to a bar throws an exception
 *      e) Ensures that there is no representation exposure in Bar
 * 
 * 	4) MusicalPhrases:
 * 		a) Create a musical phrase with one bar
 * 		b) Create a musical phrase with multiple bars
 *      e) Ensures that there is no representation exposure in MusicalPhrases
 *  
 *  5) MusicalPiece:
 *      a) Create a basic MusicalPiece datatype
 *      b) Test that each getter of MusicalPiece works from a constructor
 *      e) Ensures that there is no representation exposure in MusicalPiece
 *      
 *  6) Voices:
 *      a) Creation of a Voice object with constructor
 *      b) Passing in null arguments into the constructor throws an exception
 *      c) Ensure that Voice stores whether or not repeat is stored correctly
 *      d) Ensure that Voice stores whether or not one two repeat is stored correctly
 *      e) Ensure that Voice equality comparison works properly
 *
 */
public class MusicalRepresentationTest {

    /* Pitch Note Tests */
    
	@Test(expected=IllegalArgumentException.class)
	public void pitchNoteZeroLengthTest() {
	    // We get an exception if we try to create a PitchNote with length 0
		new PitchNote(0, 0, new int[] {9}, "");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void pitchNoteNegativeLengthTest() {
	 // We get an exception if we try to create a PitchNote with negative length
		new PitchNote(-1, 1,new int[] {9}, "");
	}
	
	@Test
	public void pitchNoteChordTest() {
	    // Creation of a chord
		new PitchNote(1, 4, new int[]{3,4,5}, "");
	}
	
	@Test
	public void pitchNoteBasicTest() {
	    // Create a basic PitchNote with lyric associated with it gets stored properly
		PitchNote p = new PitchNote(1,4, new int[] {9}, "Hi");
		assertEquals("Hi", p.getLyric());
	}
	
    @Test(expected=IllegalArgumentException.class)
    public void nullPitchNoteTest() {
        // We get an exception if we try to create PitchNote with null notes array
        new PitchNote(1, 4, null, null);
    }	
	
	 /* Rest Note Tests */
	
	@Test
	public void restNoteBasicTest() {
	 // Creation of a basic rest note
		new RestNote(1,4);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void illegalRestNoteTest() {
	 // We should get an exception if the rest note length is less than zero
		new RestNote(-1, 4);
	}
	
	@Test
	public void restNoteMeasureTest() {
	 // Creation of a basic rest note of different length measure
		new RestNote(8,4);
	}
	
	/* Bar Tests */
	
	@Test
	public void barPitchNoteTest() {
	    // Create a bar with enough PitchNotes to represent a measure
		Bar bar=new Bar(4,4);
		for (int i=0; i< 4; i++)
			bar.addNote(new PitchNote(1,4,new int[] {9},"Test!"));
	}
	
	@Test
	public void barRestNoteTest() {
	 // Create a bar with enough RestNotes to represent a measure
		Bar bar = new Bar(4,4);
		for (int i=0; i<4; i++)
			bar.addNote(new RestNote(1,4));
	}
	
	@Test
	public void barTooManyNotesTest() {
	 // Create a bar with too many notes for the measure is okay
		Bar bar=new Bar(4,4);
		for (int i=0; i<2; i++)
		{
			bar.addNote(new PitchNote(1,4,new int[]{9},"Testing for an error!"));
			bar.addNote(new RestNote(2,4));
		}
	}

    @Test(expected=NullPointerException.class)
    public void addNoteNullBarTest() {
     // Adding a null Note throws an exception
        Bar bar=new Bar(1,4);
        bar.addNote(null);
    }
    
    @Test
    public void barRepresentationTest() {
     // Ensures that there is no representation exposure in Bar with the getNotes() method
        Bar bar = new Bar(4,4);
        ArrayList<Note> modifiedNotes = bar.getNotes();
        assertFalse(modifiedNotes == bar.getNotes());
        
        modifiedNotes.add(new RestNote(1,4));
        
        assertFalse(modifiedNotes.equals(bar.getNotes()));
    }
	
	/* MusicalPhrase Tests */
    
    @Test
	public void basicMusicalPhraseTest() {
        // Create a musical phrase with one bar
		ArrayList<Bar> barArray=new ArrayList<Bar>();
		Bar bar=new Bar(4,4);
		for (int i=0; i<4; i++)
			bar.addNote(new RestNote(1,4));
		barArray.add(bar);
		new MusicalPhrase(barArray);
	}
	
	@Test
	public void multipleBarsMusicalPhraseTest() {
	    // Create a musical phrase with multiple bars
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
    public void musicalPhraseRepresentationTest() {
        // Ensure there is no representation exposure on MusicalRepresenatino with getBats() method
        ArrayList<Bar> bars = new ArrayList<Bar>();
        MusicalPhrase mp = new MusicalPhrase(bars);
        
        assertFalse(mp.getBars() == bars);
    }	
	
	/* MusicalPiece Tests */
	
	@Test
	public void basicMusicalPieceTest() {
	    // Create a basic MusicalPiece datatype
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
	    // Test that each getter of MusicalPiece works from a constructor
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
	
	@Test
    public void musicalPieceRepresentationTest() {
	    // Ensure there is no representation exposure
        String title = "Test Title";
        String composer = "Test Composer";
        int meterNumerator = 1, meterDenominator = 4;
        int tempoSpeed=100;
        int tempoNumerator = 1;
        int tempoDenominator = 4;
        ArrayList<MusicalPhrase> phrases = new ArrayList<MusicalPhrase>();
        MusicalPiece mp = new MusicalPiece(title, composer, meterNumerator, meterDenominator, tempoSpeed, tempoNumerator, tempoDenominator, phrases);
        
        assertFalse(mp.getPhrases() == phrases);
    }
	
	/* Voice Tests */

	
	@Test
	public void basicVoiceTest() {
	    // Creation of a Voice object with constructor
		boolean isRepeatOn = true;
        boolean isOneTwoRepeat = true;
        Bar currentRepeatBar = new Bar(1,4);
        ArrayList<Bar> repeatBars = new ArrayList<Bar>();
        ArrayList<Bar> voiceBars = new ArrayList<Bar>();
		new Voice(isRepeatOn, isOneTwoRepeat, currentRepeatBar, repeatBars);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void nullVoiceTest() {
	  // Passing in null arguments into the constructor throws an exception
		boolean isRepeatOn = true;
        boolean isOneTwoRepeat = true;
        Bar currentRepeatBar = null;
        ArrayList<Bar> repeatBars = new ArrayList<Bar>();
        ArrayList<Bar> voiceBars = new ArrayList<Bar>();
		new Voice(isRepeatOn, isOneTwoRepeat, currentRepeatBar, repeatBars);
	}
	
	@Test
	public void voiceGetRepeatReturnTest() {
	 // Ensure that Voice stores whether or not repeat is stored correctly
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
	    // Ensure that Voice stores whether or not one two repeat is stored correctly
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
	    // Ensure that Voice equality comparison works properly
	    
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
