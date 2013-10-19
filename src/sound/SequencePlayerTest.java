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
			player = new SequencePlayer(140, 4, listener);
			// C C C3/4 D/4 E | E3/4 D/4 E3/4 F/4 G2 | (3ccc (3GGG (3BBB (3DDD | G3/4 A/4 B3/4 C/4 D2
			player.addNote(new Pitch('C').toMidiNote(), 0, 4); // C
			player.addNote(new Pitch('C').toMidiNote(), 4, 4); // C
			player.addNote(new Pitch('C').toMidiNote(), 8, 3); // C3/4
			player.addNote(new Pitch('D').toMidiNote(), 11, 1); // D/4
			player.addNote(new Pitch('E').toMidiNote(), 12, 4); // E |
			
			player.addNote(new Pitch('E').toMidiNote(), 16, 3); // E3/4
			player.addNote(new Pitch('D').toMidiNote(), 19, 1); // D/4
			player.addNote(new Pitch('E').toMidiNote(), 20, 3); // E3/4
			player.addNote(new Pitch('F').toMidiNote(), 23, 1); // F/4
			player.addNote(new Pitch('G').toMidiNote(), 24, 1); // G2 |
			
			player.addNote(new Pitch('C').transpose(Pitch.OCTAVE).toMidiNote(), 25, 1); // 3ccc
			player.addNote(new Pitch('F').toMidiNote(), 11, 1); // 3GGG
			player.addNote(new Pitch('E').toMidiNote(), 12, 1); // 3BBB
			player.addNote(new Pitch('D').toMidiNote(), 13, 1); // 3DDD |
			
			player.addNote(new Pitch('G').toMidiNote(), 48, 3); // G3/4
			player.addNote(new Pitch('A').toMidiNote(), 51, 1); // A/4
			player.addNote(new Pitch('B').toMidiNote(), 52, 3); // B3/4
			player.addNote(new Pitch('C').toMidiNote(), 55, 1); // C/4
			player.addNote(new Pitch('D').toMidiNote(), 56, 4); // D2
			player.addNote(new Pitch('D').toMidiNote(), 60, 4); // D2

			
			
			
			
			
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
