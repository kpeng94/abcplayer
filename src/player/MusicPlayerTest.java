package player;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

import sound.PitchCalculator;

/** 
 * Class to test all the musical pieces in our sample_abc folder
 * @category no_didit
 */
public class MusicPlayerTest {
    
    @Test
    public void testPieceOneTwoThree() {
        String pieceOne = "X: 1\nT:Piece No.1\nM:4/4\nL:1/4\nQ:1/4=140\nK:C\nC C C3/4 D/4 E | E3/4 D/4 E3/4 F/4 G2 | (3c/2c/2c/2 (3G/2G/2G/2 (3B/2B/2B/2 (3C/2C/2C/2 | G3/4 F/4 E3/4 D/4 C2";
        new MusicPlayer().parse(pieceOne, "");
        String pieceTwo = "X:1\nT:Piece No.2\nM:C\nL:1/4\nQ:1/4=200\nK:C\n[^Fe]/2 [Fe]/2 z/2 [Fe]/2 z/2 [Fc]/2 [Fe] | [GBg] z G z | c3/2 G/2 z E | E/2 A B _B/2 A | (3Geg a f/2 g/2 | z/2 e c/2 d/2 B3/4 z3/4";
        new MusicPlayer().parse(pieceTwo,"");
        String pieceThree = "X:3\nT:Sample 3\nC:Me\nQ:1/8=100\nM:3/4\nL:1/8\nK:C\nz4 D2 | G4 BG | B4 A2 | G4 E2 | D4 D2 | G4 BG | B4 A2 | D'6 | D'2 z4 |]\nw: A-ma-zing | grace! How | sweet the | sound That | saved a | wretch like | me.";
        new MusicPlayer().parse(pieceThree, "");
    }
	
    @Test
    public void testPieceOneHeader() {
        String pieceOneHeader = "X: 1\nT:Piece No.1\nM:4/4\nL:1/4\nQ:1/4=140\nK:C\n";
        new MusicPlayer().parse(pieceOneHeader, "header");
    }

    @Test
    public void testPieceOneRead() {
        String pieceOneSrc = "sample_abc/piece1.abc";
        MusicPlayer.play(pieceOneSrc);
    }

    @Test
    public void testPieceTwoRead() {
        String pieceTwoSrc = "sample_abc/piece2.abc";
        MusicPlayer.play(pieceTwoSrc);        
    }
    
    @Test
    public void testPieceThreeRead() {
        String pieceThreeSrc = "sample_abc/piece3.abc";
        MusicPlayer.play(pieceThreeSrc);
    }
    
     @Test
    public void scaleRead() {
        String scale = "sample_abc/scale.abc";
        MusicPlayer.play(scale);
    }

    @Test
    public void lightNightMusicRead() {
        String littleNightMusic = "sample_abc/little_night_music.abc";
        MusicPlayer.play(littleNightMusic);
    }

    @Test
    public void abcMusicRead() {
        String abcMusic = "sample_abc/abc_song.abc";
        MusicPlayer.play(abcMusic);
    }
    
    @Test
    public void furEliseMusicRead() {
        String furEliseMusic = "sample_abc/fur_elise.abc";
        MusicPlayer.play(furEliseMusic);
    }
    
    @Test
    public void waxiesDargleRead() {
        String waxiesDargle = "sample_abc/waxies_dargle.abc";
        MusicPlayer.play(waxiesDargle);
    }
    
    @Test
    public void paddyRead() {
        String paddy = "sample_abc/paddy.abc";
        MusicPlayer.play(paddy);
    }
    
    @Test
    public void inventionRead() {
        String invention = "sample_abc/invention.abc";
        MusicPlayer.play(invention);
    }
    
    @Test
    public void headerParseTest() {
    	String pieceOneHeader = "X:1\nT:Simple scale\nC:Unknown\nM:4/4\nL:1/4\nQ:1/4=120\nK:C\nC D E F | G A B c | c B A G F E D C |";
    	MusicalPiece mp = new MusicPlayer().parse(pieceOneHeader, "");
    	assertTrue(mp.getTitle().equals("Simple scale"));
    	assertTrue(mp.getComposer().equals("Unknown"));
    	assertTrue(mp.getMeterNumerator().equals(4));
    	assertTrue(mp.getMeterDenominator().equals(4));
    	assertTrue(mp.getTempo().equals(120));
    }
    
    @Test
    public void testParseMusic() {
    	String alphabetSongBasic = "X:1\nT:Alphabet Song\nC:Traditional Kid's Song\nM:4/4\nL:1/4\nQ:1/4=100\nK:D\n|D D A A|B B A2|G G F F|E/2E/2E/2E/2 D2|";
    	MusicalPiece mp=new MusicPlayer().parse(alphabetSongBasic, "");
    	ArrayList<MusicalPhrase> phrases = mp.getPhrases();
    	ArrayList<Note> notes=phrases.get(0).getBars().get(2).getNotes();
    	System.out.println(notes.get(0).getNote().toString());
    	assertTrue(notes.get(0).getNote()[0] == (new PitchCalculator().getPitchForKey("D", "B").toMidiNote()));
    	assertTrue(notes.get(1).getNote()[0] == (new PitchCalculator().getPitchForKey("D", "B").toMidiNote()));
    	assertTrue(notes.get(2).getNote()[0] == (new PitchCalculator().getPitchForKey("D", "A").toMidiNote()));
    	
    }
}
