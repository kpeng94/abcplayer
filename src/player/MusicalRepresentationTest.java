package player;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

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
	
	@Test(expected=IllegalArgumentException.class)
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
}
