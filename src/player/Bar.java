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
        }
        notesSum += note.getLength();
        notes.add(note);
    }
    
    public Integer getTicks() {
        //TODO: (kpeng94) Implement this using phrases
          return 0;
      }
}
