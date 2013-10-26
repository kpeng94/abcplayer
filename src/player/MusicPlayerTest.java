package player;

import static org.junit.Assert.*;

import java.awt.Window.Type;
import org.junit.Test;

public class MusicPlayerTest {
    
    @Test
    public void testPieceOne() {
        String pieceOne = "X: 1\nT:Piece No.1\nM:4/4\nL:1/4\nQ:1/4=140\nK:C\nC C C3/4 D/4 E | E3/4 D/4 E3/4 F/4 G2 | (3c/2c/2c/2 (3G/2G/2G/2 (3B/2B/2B/2 (3C/2C/2C/2 | G3/4 F/4 E3/4 D/4 C2";
//        MusicalPiece parsedPiece = 
        new MusicPlayer().parse(pieceOne);
        
    }
}
