package player;

import java.util.ArrayList;

public class Bar {
    private Integer measureLength;
    private Double notesSum;
    private ArrayList<Note> notes;
    
    public Bar(Integer measureLength) {
        this.measureLength = measureLength;
        this.notesSum = 0.0;
        this.notes = new ArrayList<Note>();
    }

    public void addNote(Note note) {
        if ((notesSum + note.getLength()) > measureLength) {
            //TODO: (kpeng94) Throw some sort of exception
            throw new RuntimeException();
        }
        notesSum += note.getLength();
        notes.add(note);
    }
    
    public int getTicks() {
        int ticks = 1; 
        int gcd;
        for (int i = 0; i < notes.size(); i++) {
            /** 
             * TODO (kpeng94): Later factor this gcd code out by writing a class with a static method.
             */
            int noteTicks = notes.get(i).getDenominator();
            /**
             * Computing the gcd of the two will help us compute the LCM.
             */
            gcd = 1;
            if (noteTicks % 2 == 0 && ticks % 2 == 0)
                gcd = 2;
            for (int j = 3; j < Math.min(noteTicks, ticks); j += 2) {
                if (noteTicks % j == 0 && ticks % j == 0) {
                    gcd = j;
                }
            }
            /**
             * Compute the least common multiple of ticks and barTicks
             */
            ticks = noteTicks * ticks / gcd;
        }
        return ticks;
    }
}
