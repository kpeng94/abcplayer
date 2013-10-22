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
	public void pieceTwoTest() {
		SequencePlayer player;
		try {

			// Create a new player, with 140 beats per minute, 12 ticks per beat
			// and a LyricListener that prints each lyric that it sees.
			LyricListener listener = new 
			        LyricListener() {
				public void processLyricEvent(String text) {
					System.out.println(text);
				}
			};
			player = new SequencePlayer(200, 12, listener);
		    // [^Fe]/2 [Fe]/2 z/2 [Fe]/2 z/2 [Fc]/2 [Fe] | 
			// [GBg] z G z | c3/2 G/2 z E | E/2 A B _B/2 A | 
			// (3Geg a f/2 g/2 | z/2 e c/2 d/2 B3/4 z3/4
			player.addNote(new Pitch('F').transpose(1).toMidiNote(), 0, 6); // [^Fe]/2
            player.addNote(new Pitch('E').transpose(Pitch.OCTAVE).toMidiNote(), 0, 6); // [^Fe]/2
            player.addNote(new Pitch('F').transpose(1).toMidiNote(), 6, 6); // [Fe]/2
            player.addNote(new Pitch('E').transpose(Pitch.OCTAVE).toMidiNote(), 6, 6); // [Fe]/2
            // half rest 12, 6
            player.addNote(new Pitch('F').transpose(1).toMidiNote(), 18, 6); // [Fe]/2
            player.addNote(new Pitch('E').transpose(Pitch.OCTAVE).toMidiNote(), 18, 6); // [Fe]/2
            // half rest
            player.addNote(new Pitch('F').transpose(1).toMidiNote(), 30, 6); // [Fc]/2
            player.addNote(new Pitch('C').transpose(Pitch.OCTAVE).toMidiNote(), 30, 6); // [Fc]/2
            player.addNote(new Pitch('F').transpose(1).toMidiNote(), 36, 12); // [Fe]
            player.addNote(new Pitch('E').transpose(Pitch.OCTAVE).toMidiNote(), 36, 12); // [Fe]
            
            player.addNote(new Pitch('G').toMidiNote(), 48, 12); // [GBg]
			player.addNote(new Pitch('B').toMidiNote(), 48, 12); // [GBg]
			player.addNote(new Pitch('G').transpose(Pitch.OCTAVE).toMidiNote(), 48, 12); // [GBg]
			//rest
            player.addNote(new Pitch('G').toMidiNote(), 72, 12); // [GBg]
            //rest
			
			player.addNote(new Pitch('C').transpose(Pitch.OCTAVE).toMidiNote(), 96, 18); // c3/2
			player.addNote(new Pitch('G').toMidiNote(), 114, 6); // G/2
			//rest
			player.addNote(new Pitch('E').toMidiNote(), 132, 12); // E

			player.addNote(new Pitch('E').toMidiNote(), 144, 6); // E/2
            player.addNote(new Pitch('A').toMidiNote(), 150, 12); // A
            player.addNote(new Pitch('B').toMidiNote(), 162, 12); // B
            player.addNote(new Pitch('B').transpose(-1).toMidiNote(), 174, 6); // B flat
            player.addNote(new Pitch('A').toMidiNote(), 180, 12); // A

            // (3Geg a f/2 g/2 | z/2 e c/2 d/2 B3/4 z3/4
            player.addNote(new Pitch('G').toMidiNote(), 192, 8); // (3G
			player.addNote(new Pitch('E').transpose(Pitch.OCTAVE).toMidiNote(), 200, 8); // e
            player.addNote(new Pitch('G').transpose(Pitch.OCTAVE).toMidiNote(), 208, 8); // g
            player.addNote(new Pitch('A').transpose(Pitch.OCTAVE).toMidiNote(), 216, 12); // a
            player.addNote(new Pitch('F').transpose(Pitch.OCTAVE).toMidiNote(), 228, 6); // f/2
            player.addNote(new Pitch('G').transpose(Pitch.OCTAVE).toMidiNote(), 234, 6); // g/2

            // half rest
            player.addNote(new Pitch('E').transpose(Pitch.OCTAVE).toMidiNote(), 246, 12); // e
            player.addNote(new Pitch('C').transpose(Pitch.OCTAVE).toMidiNote(), 258, 6); // c/2
            player.addNote(new Pitch('D').transpose(Pitch.OCTAVE).toMidiNote(), 264, 6); // d/2
            player.addNote(new Pitch('B').toMidiNote(), 270, 9); // B3/4
            // 3/4 rest			
						
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

    @Test
    public void pieceOneTest() {
        SequencePlayer player;
        try {

            // Create a new player, with 140 beats per minute, 12 ticks per beat
            // and a LyricListener that prints each lyric that it sees.
            LyricListener listener = new LyricListener() {
                public void processLyricEvent(String text) {
                    System.out.println(text);
                }
            };
            player = new SequencePlayer(140, 12, listener);
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
            player.addNote(new Pitch('G').toMidiNote(), 72, 24); // G2 |
            
            player.addNote(new Pitch('C').transpose(Pitch.OCTAVE).toMidiNote(), 96, 4); // 3ccc
            player.addNote(new Pitch('C').transpose(Pitch.OCTAVE).toMidiNote(), 100, 4); // 3ccc
            player.addNote(new Pitch('C').transpose(Pitch.OCTAVE).toMidiNote(), 104, 4); // 3ccc
            
            player.addNote(new Pitch('G').toMidiNote(), 108, 4); // 3GGG
            player.addNote(new Pitch('G').toMidiNote(), 112, 4); // 3GGG
            player.addNote(new Pitch('G').toMidiNote(), 116, 4); // 3GGG
            
            player.addNote(new Pitch('E').toMidiNote(), 120, 4); // 3EEE
            player.addNote(new Pitch('E').toMidiNote(), 124, 4); // 3EEE
            player.addNote(new Pitch('E').toMidiNote(), 128, 4); // 3EEE
            
            player.addNote(new Pitch('C').toMidiNote(), 132, 4); // 3DDD |
            player.addNote(new Pitch('C').toMidiNote(), 136, 4); // 3DDD |
            player.addNote(new Pitch('C').toMidiNote(), 140, 4); // 3DDD |
            
            
            player.addNote(new Pitch('G').toMidiNote(), 144, 9); // G3/4
            player.addNote(new Pitch('F').toMidiNote(), 153, 3); // F/4
            player.addNote(new Pitch('E').toMidiNote(), 156, 9); // E3/4
            player.addNote(new Pitch('D').toMidiNote(), 165, 3); // D/4
            player.addNote(new Pitch('C').toMidiNote(), 168, 24); // C2
            
                        
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
	
	
	@Test
	public void pieceThreeTest() {
		SequencePlayer player;
		try {

			// Create a new player, with 100 beats per minute, 4 ticks per beat
			// and a LyricListener that prints each lyric that it sees.
			LyricListener listener = new LyricListener() {
				public void processLyricEvent(String text) {
					System.out.println(text);
				}
			};
			player = new SequencePlayer(100, 4, listener);
			// z4 D2 | G4 BG | B4 A2 | G4 E2 | D4 D2 | G4 BG | B4 A2 | (D'6 | D'2) z4 |]

			// z4 = rest for 8 ticks
			player.addNote(new Pitch('D').toMidiNote(), 8, 4); // D2 |
			player.addLyricEvent("A", 8);
			
			player.addNote(new Pitch('G').toMidiNote(), 12, 8); // G4
			player.addLyricEvent("ma", 12);
			player.addNote(new Pitch('B').toMidiNote(), 20, 2); // B
			player.addLyricEvent("zing", 20);
			player.addNote(new Pitch('G').toMidiNote(), 22, 2); // G |
			
			player.addNote(new Pitch('B').toMidiNote(), 24, 8); // B4
			player.addLyricEvent("grace!", 24);
			player.addNote(new Pitch('A').toMidiNote(), 32, 4); // A2 |
			player.addLyricEvent("How", 32);
			
			player.addNote(new Pitch('G').toMidiNote(), 36, 8); // G4
			player.addLyricEvent("sweet", 36);
			player.addNote(new Pitch('E').toMidiNote(), 44, 4); // E2 |
			player.addLyricEvent("the", 44);
			
			player.addNote(new Pitch('D').toMidiNote(), 48, 8); // D4
			player.addLyricEvent("sound", 48);
			player.addNote(new Pitch('D').toMidiNote(), 56, 4); // D2 |
			player.addLyricEvent("That", 56);
			
			player.addNote(new Pitch('G').toMidiNote(), 60, 8); // G4
			player.addLyricEvent("saved", 60);
			player.addNote(new Pitch('B').toMidiNote(), 68, 2); // B
			player.addLyricEvent("a", 68);
			player.addNote(new Pitch('G').toMidiNote(), 70, 2); // G |
			
			player.addNote(new Pitch('B').toMidiNote(), 72, 8); // B4
			player.addLyricEvent("wretch", 72);
			player.addNote(new Pitch('A').toMidiNote(), 80, 4); // A2 |
			player.addLyricEvent("like", 80);
			
			player.addNote(new Pitch('D').transpose(Pitch.OCTAVE).toMidiNote(), 84, 16); // D'6 |
			player.addLyricEvent("me.", 84);
			
						
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
