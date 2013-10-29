package sound;

import java.util.HashMap;


/**
 * PitchCalculator calculates the frequency of a musical note based on its key.
 * Standard music notation represents pitches by letters: A, B, C, ..., G.
 * Pitches can be sharp or flat, or whole octaves up or down from these
 * primitive generators and can also change based on the key.
 */

public class PitchCalculator {
    private HashMap<String,HashMap<String,Pitch>> outerMap;
    
    /** Constructs a new PitchCalculator object. This only needs to be done once.
     */
    public PitchCalculator() {
        outerMap = new HashMap<String,HashMap<String,Pitch>>();
        
        /*
            Scales with sharp key signatures
        */
        
        // C Major & A Minor
        for (String key : new String[]{"C", "Am"}) {
            addPitchForKey(key,"A", new Pitch('A'));
            addPitchForKey(key,"B", new Pitch('B'));
            addPitchForKey(key,"C", new Pitch('C'));
            addPitchForKey(key,"D", new Pitch('D'));
            addPitchForKey(key,"E", new Pitch('E'));
            addPitchForKey(key,"F", new Pitch('F'));
            addPitchForKey(key,"G", new Pitch('G'));
        }
        
        // G Major & E Minor
        for (String key : new String[]{"G", "Em"}) {
            addPitchForKey(key,"A", new Pitch('A'));
            addPitchForKey(key,"B", new Pitch('B'));
            addPitchForKey(key,"C", new Pitch('C'));
            addPitchForKey(key,"D", new Pitch('D'));
            addPitchForKey(key,"E", new Pitch('E'));
            addPitchForKey(key,"F", new Pitch('F').transpose(1));
            addPitchForKey(key,"G", new Pitch('G'));
        }
        
        // D Major & B Minor
        for (String key : new String[]{"D", "Bm"}) {
            addPitchForKey(key,"A", new Pitch('A'));
            addPitchForKey(key,"B", new Pitch('B'));
            addPitchForKey(key,"C", new Pitch('C').transpose(1));
            addPitchForKey(key,"D", new Pitch('D'));
            addPitchForKey(key,"E", new Pitch('E'));
            addPitchForKey(key,"F", new Pitch('F').transpose(1));
            addPitchForKey(key,"G", new Pitch('G'));
        }
        
        // A Major & F# Minor
        for (String key : new String[]{"A", "F#m"}) {
            addPitchForKey(key,"A", new Pitch('A'));
            addPitchForKey(key,"B", new Pitch('B'));
            addPitchForKey(key,"C", new Pitch('C').transpose(1));
            addPitchForKey(key,"D", new Pitch('D'));
            addPitchForKey(key,"E", new Pitch('E'));
            addPitchForKey(key,"F", new Pitch('F').transpose(1));
            addPitchForKey(key,"G", new Pitch('G').transpose(1));
        }
        
        // E Major & C# Minor
        for (String key : new String[]{"E", "C#m"}) {
            addPitchForKey(key,"A", new Pitch('A'));
            addPitchForKey(key,"B", new Pitch('B'));
            addPitchForKey(key,"C", new Pitch('C').transpose(1));
            addPitchForKey(key,"D", new Pitch('D').transpose(1));
            addPitchForKey(key,"E", new Pitch('E'));
            addPitchForKey(key,"F", new Pitch('F').transpose(1));
            addPitchForKey(key,"G", new Pitch('G').transpose(1));
        }
        
        // B Major & G# Minor & Cb Major & Ab Minor
        for (String key : new String[]{"B", "G#m", "Cb", "Abm"}) {
            addPitchForKey(key,"A", new Pitch('A').transpose(1));
            addPitchForKey(key,"B", new Pitch('B'));
            addPitchForKey(key,"C", new Pitch('C').transpose(1));
            addPitchForKey(key,"D", new Pitch('D').transpose(1));
            addPitchForKey(key,"E", new Pitch('E'));
            addPitchForKey(key,"F", new Pitch('F').transpose(1));
            addPitchForKey(key,"G", new Pitch('G').transpose(1));
        }
        
        // F# Major & D# Minor & Gb Major & Eb Minor
        for (String key : new String[]{"F#", "D#m", "Gb", "Ebm"}) {
            addPitchForKey(key,"A", new Pitch('A').transpose(1));
            addPitchForKey(key,"B", new Pitch('B'));
            addPitchForKey(key,"C", new Pitch('C').transpose(1));
            addPitchForKey(key,"D", new Pitch('D').transpose(1));
            addPitchForKey(key,"E", new Pitch('E').transpose(1));
            addPitchForKey(key,"F", new Pitch('F').transpose(1));
            addPitchForKey(key,"G", new Pitch('G').transpose(1));
        }
        
        // C# Major & A# Minor & Db Major & Bb Minor
        for (String key : new String[]{"C#", "A#m", "Db", "Bbm"}) {
            addPitchForKey(key,"A", new Pitch('A').transpose(1));
            addPitchForKey(key,"B", new Pitch('B').transpose(1));
            addPitchForKey(key,"C", new Pitch('C').transpose(1));
            addPitchForKey(key,"D", new Pitch('D').transpose(1));
            addPitchForKey(key,"E", new Pitch('E').transpose(1));
            addPitchForKey(key,"F", new Pitch('F').transpose(1));
            addPitchForKey(key,"G", new Pitch('G').transpose(1));
        }
        
        /*
            Scales with flat key signatures
        */
        
        // F Major & D Minor
        for (String key : new String[]{"F", "Dm"}) {
            addPitchForKey(key,"A", new Pitch('A'));
            addPitchForKey(key,"B", new Pitch('B').transpose(-1));
            addPitchForKey(key,"C", new Pitch('C'));
            addPitchForKey(key,"D", new Pitch('D'));
            addPitchForKey(key,"E", new Pitch('E'));
            addPitchForKey(key,"F", new Pitch('F'));
            addPitchForKey(key,"G", new Pitch('G'));
        }
        
        // Bb Major & G Minor
        for (String key : new String[]{"Bb", "Gm"}) {
            addPitchForKey(key,"A", new Pitch('A'));
            addPitchForKey(key,"B", new Pitch('B').transpose(-1));
            addPitchForKey(key,"C", new Pitch('C'));
            addPitchForKey(key,"D", new Pitch('D'));
            addPitchForKey(key,"E", new Pitch('E').transpose(-1));
            addPitchForKey(key,"F", new Pitch('F'));
            addPitchForKey(key,"G", new Pitch('G'));
        }
        
        // Eb Major & C Minor
        for (String key : new String[]{"Eb", "Cm"}) {
            addPitchForKey(key,"A", new Pitch('A').transpose(-1));
            addPitchForKey(key,"B", new Pitch('B').transpose(-1));
            addPitchForKey(key,"C", new Pitch('C'));
            addPitchForKey(key,"D", new Pitch('D'));
            addPitchForKey(key,"E", new Pitch('E').transpose(-1));
            addPitchForKey(key,"F", new Pitch('F'));
            addPitchForKey(key,"G", new Pitch('G'));
        }
        
        // Ab Major & F Minor
        for (String key : new String[]{"Ab", "Fm"}) {
            addPitchForKey(key,"A", new Pitch('A').transpose(-1));
            addPitchForKey(key,"B", new Pitch('B').transpose(-1));
            addPitchForKey(key,"C", new Pitch('C'));
            addPitchForKey(key,"D", new Pitch('D').transpose(-1));
            addPitchForKey(key,"E", new Pitch('E').transpose(-1));
            addPitchForKey(key,"F", new Pitch('F'));
            addPitchForKey(key,"G", new Pitch('G'));
        }
        
        // Db Major & Bb Minor & C# Major & A# Minor
        for (String key : new String[]{"Db", "Bbm", "C#", "A#m"}) {
            addPitchForKey(key,"A", new Pitch('A').transpose(-1));
            addPitchForKey(key,"B", new Pitch('B').transpose(-1));
            addPitchForKey(key,"C", new Pitch('C'));
            addPitchForKey(key,"D", new Pitch('D').transpose(-1));
            addPitchForKey(key,"E", new Pitch('E').transpose(-1));
            addPitchForKey(key,"F", new Pitch('F'));
            addPitchForKey(key,"G", new Pitch('G').transpose(-1));
        }
        
        // Gb Major & Eb Minor & F# Major & D# Minor
        for (String key : new String[]{"Gb", "Ebm", "F#", "D#m"}) {
            addPitchForKey(key,"A", new Pitch('A').transpose(-1));
            addPitchForKey(key,"B", new Pitch('B').transpose(-1));
            addPitchForKey(key,"C", new Pitch('C').transpose(-1));
            addPitchForKey(key,"D", new Pitch('D').transpose(-1));
            addPitchForKey(key,"E", new Pitch('E').transpose(-1));
            addPitchForKey(key,"F", new Pitch('F'));
            addPitchForKey(key,"G", new Pitch('G').transpose(-1));
        }
        
        // Cb Major & Ab Minor & B Major & G# Minor
        for (String key : new String[]{"Cb", "Abm", "B", "G#m"}) {
            addPitchForKey(key,"A", new Pitch('A').transpose(-1));
            addPitchForKey(key,"B", new Pitch('B').transpose(-1));
            addPitchForKey(key,"C", new Pitch('C').transpose(-1));
            addPitchForKey(key,"D", new Pitch('D').transpose(-1));
            addPitchForKey(key,"E", new Pitch('E').transpose(-1));
            addPitchForKey(key,"F", new Pitch('F').transpose(-1));
            addPitchForKey(key,"G", new Pitch('G').transpose(-1));
        }
    }

    /** Uses the map constructed to determine what note is correct for this key
     * and returns a Pitch object.
     * @param key The key of the current piece
     * @param note The note to get the pitch of based on the key
     * @return A Pitch object with the the correct pitch for the note and key given
     */
    public Pitch getPitchForKey(String key, String note) {
        HashMap<String,Pitch> innerMap = outerMap.get(key);
        if (innerMap == null) {
            return null;
        }
        if (note.toLowerCase().equals(note)) {
            return innerMap.get(note.toUpperCase()).transpose(Pitch.OCTAVE);
        }
        return innerMap.get(note);
    }
    
    private void addPitchForKey(String key, String note, Pitch pitch) {
        HashMap<String,Pitch> innerMap = outerMap.get(key);
        if (innerMap == null) {
            innerMap = new HashMap<String,Pitch>();
            outerMap.put(key,innerMap);
        }
        innerMap.put(note,pitch);
    }
}
