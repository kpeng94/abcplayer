package sound;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import org.junit.Test;

/**
 * Test file for the 3 Pieces we Transcribed
 * @category no_didit
 *
 */
public class SequencePlayerTest {
	@Test
	public void pieceOneTest() {
		SequencePlayer player;
		try {

			// Create a new player, with 140 beats per minute, 4 ticks per beat
			// and a LyricListener that prints each lyric that it sees.
			LyricListener listener = new LyricListener() {
				public void processLyricEvent(String text) {
					System.out.println(text);
				}
			};
			player = new SequencePlayer(140, 48, listener);
			// C C C3/4 D/4 E | E3/4 D/4 E3/4 F/4 G2 | (3ccc (3GGG (3BBB (3DDD | G3/4 A/4 B3/4 C/4 D2
			player.addNote(new Pitch('C').toMidiNote(), 0, 12); // C
			player.addNote(new Pitch('C').toMidiNote(), 12, 12); // C
			player.addNote(new Pitch('C').toMidiNote(), 24, 9); // C3/4
			player.addNote(new Pitch('D').toMidiNote(), 33, 3); // D/4
			player.addNote(new Pitch('E').toMidiNote(), 36, 12); // E |
			
			player.addNote(new Pitch('E').toMidiNote(), 48, 9); // E3/4
			player.addNote(new Pitch('D').toMidiNote(), 57, 3); // D/4
			player.addNote(new Pitch('E').toMidiNote(), 60, 9); // E3/4
			player.addNote(new Pitch('F').toMidiNote(), 69, 3); // F/4
			player.addNote(new Pitch('G').toMidiNote(), 72, 12); // G2 
			player.addNote(new Pitch('G').toMidiNote(), 84, 12); // G2 |
			
			player.addNote(new Pitch('C').transpose(Pitch.OCTAVE).toMidiNote(), 96, 4); // 3ccc
			player.addNote(new Pitch('C').transpose(Pitch.OCTAVE).toMidiNote(), 100, 4); // 3ccc
			player.addNote(new Pitch('C').transpose(Pitch.OCTAVE).toMidiNote(), 104, 4); // 3ccc
			
			player.addNote(new Pitch('G').toMidiNote(), 108, 4); // 3GGG
			player.addNote(new Pitch('G').toMidiNote(), 112, 4); // 3GGG
			player.addNote(new Pitch('G').toMidiNote(), 116, 4); // 3GGG
			
			player.addNote(new Pitch('B').toMidiNote(), 120, 4); // 3BBB
			player.addNote(new Pitch('B').toMidiNote(), 124, 4); // 3BBB
			player.addNote(new Pitch('B').toMidiNote(), 128, 4); // 3BBB
			
			player.addNote(new Pitch('D').toMidiNote(), 132, 4); // 3DDD |
			player.addNote(new Pitch('D').toMidiNote(), 136, 4); // 3DDD |
			player.addNote(new Pitch('D').toMidiNote(), 140, 4); // 3DDD |
			
			
			player.addNote(new Pitch('G').toMidiNote(), 144, 9); // G3/4
			player.addNote(new Pitch('A').toMidiNote(), 153, 3); // A/4
			player.addNote(new Pitch('B').toMidiNote(), 156, 9); // B3/4
			player.addNote(new Pitch('C').toMidiNote(), 165, 3); // C/4
			player.addNote(new Pitch('D').toMidiNote(), 168, 12); // D2
			player.addNote(new Pitch('D').toMidiNote(), 180, 12); // D2
			
						
			System.out.println(player);

			// play!
			player.play();

			/*
			 * Note: A possible weird behavior of the Java sequencer: Even if the
			 * sequencer has finished playing all of the scheduled notes and is
			 * manually closed, the program may not terminate. This is likely
			 * due to daemon threads that are spawned when the sequencer is
			 * opened but keep on running even after the sequencer is killed. In
			 * this case, you need to explicitly exit the program with
			 * System.exit(0).
			 */
			// System.exit(0);

		} catch (MidiUnavailableException e) {
			e.printStackTrace();
		} catch (InvalidMidiDataException e) {
			e.printStackTrace();
		}
	}
}
