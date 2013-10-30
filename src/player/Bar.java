package player;

import java.util.ArrayList;
/**
 * Represents a measure as a list of notes, restricted by measureLength and noteSum
 * 
 */
public class Bar {
    private int meterNumerator; // represents measure length
    private int meterDenominator; // represents note value that represents a beat
    private double meter;
    private double notesSum;
    private ArrayList<Note> notes;
    
    /**
     * Constructor for a bar, calculates the meter based off of meterNumerator and meterDenominator
     * @param meterNumerator - represents measure length
     * @param meterDenominator - represents note value that represents a beat
     */
    public Bar(int meterNumerator, int meterDenominator) {
    	// TODO add in some way of determining how many beats are allowed, because right now, noteSum is off in my opinion
        this.meterNumerator = meterNumerator;
        this.meterDenominator = meterDenominator;
        this.meter=(double) this.meterNumerator/this.meterDenominator;
        this.notesSum = 0.0;
        this.notes = new ArrayList<Note>();
    }
    
    /**
     * Constructs a new bar from a passed in bar
     * @param bar
     */
    public Bar(Bar bar) {
        this.meterNumerator = bar.meterNumerator;
        this.meterDenominator = bar.meterDenominator;
        this.meter = bar.meter;
        this.notesSum = bar.notesSum;
        this.notes = new ArrayList<Note>(bar.getNotes());
    }
    
    /**
     * Adds a note to the current measure
     * @param note
     */
    public void addNote(Note note) {
        notesSum += note.getLength();
        notes.add(note);
    }
    
    /**
     * Returns the list of notes for the measure
     * @return list of notes
     */
    public ArrayList<Note> getNotes() {
        return new ArrayList<Note>(this.notes);
    }
    
    /** Returns the integer number of ticks per beat
     * @return ticks
     */
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
            for (int j = 3; j <= Math.min(noteTicks, ticks); j++) {
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
