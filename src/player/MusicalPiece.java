package player;

import java.util.ArrayList;

import javax.sound.midi.MidiUnavailableException;

import sound.LyricListener;
import sound.Pitch;
import sound.SequencePlayer;
/**
 * Represents an ABC file after being parsed, made up of a list of MusicalPhrases
 * Also stores header information, like title, composer, meter, and tempo
 *
 */
public class MusicalPiece {
    private String title;
    private String composer;
    private int meterNumerator, meterDenominator;
    private int tempoSpeed, tempoNumerator, tempoDenominator;
    private ArrayList<MusicalPhrase> phrases;
    /**
     * Constructor for MusicalPiece
     * @param title - String representation of the title of the piece 
     * @param composer - String value of the composer
     * @param meterNumerator - integer representing number of beats in a measure
     * @param meterDenominator - integer representing the note value that represents one beat
     * @param tempoSpeed - integer representing tempo
     * @param tempoNumerator - integer representing the numerator of the tempo
     * @param tempoDenominator - integer representing the denominator of the tempo
     * @param phrases - ArrayList of MusicalPhrases
     */
    public MusicalPiece(String title, String composer, int meterNumerator, Integer meterDenominator, 
                                            int tempoSpeed, int tempoNumerator, int tempoDenominator, ArrayList<MusicalPhrase> phrases) {
        this.title = title;
        this.composer = composer;
        this.meterNumerator = meterNumerator;
        this.meterDenominator = meterDenominator;
        this.tempoSpeed = tempoSpeed;
        this.tempoNumerator = tempoNumerator;
        this.tempoDenominator = tempoDenominator;
        this.phrases = phrases;
    }
    
    /** Returns the integer number of ticks per beat
     * @return ticks
     */
    public Integer getTicksPerBeat() {
        int ticks = 1;
        int gcd;
        for (int i = 0; i < phrases.size(); i++) {
            int phraseTicks = phrases.get(i).getTicks();
            /**
             * Computing the gcd of the two will help us compute the LCM.
             */
            gcd = 1;
            if (phraseTicks % 2 == 0 && ticks % 2 == 0)
                gcd = 2;
            for (int j = 3; j <= Math.min(phraseTicks, ticks); j++) {
                if (phraseTicks % j == 0 && ticks % j == 0) {
                    gcd = j;
                }
            }
            /**
             * Compute the least common multiple of ticks and phraseTicks
             */
            ticks = phraseTicks * ticks / gcd;
        }
        return ticks;
    }
    
    /**
     *  Queues the notes and lyrics to be played by the Sequence Player
     * 
     */
    public void playPiece() {
    	
        System.out.println("Title: " + this.title);
        System.out.println("Composer: " + this.composer);
        System.out.println("Played in " + this.meterNumerator + "/" + this.meterDenominator + " time @ " + this.tempoSpeed + " BPM.");
        SequencePlayer player;
        try {
        	
        	// Create an instance of LyricListener and add a processLyricEvent to print out lyrics
            LyricListener listener = new LyricListener() {
                public void processLyricEvent(String text) {
                    System.out.println(text);
                }
            };
            
            // Iterates through each MusicalPhrase and queues the notes to be played by the SequencePlayer
            player = new SequencePlayer(this.getTempo(), this.getTicksPerBeat(), listener);
            for (MusicalPhrase phrase : this.phrases) {
                int tickCount = 0;
                for (Bar bar : phrase.getBars()) {
                    for (Note note : bar.getNotes()) {
                        int ticksPerNote = this.getTicksPerBeat() * this.tempoDenominator * note.getNumerator() / this.tempoNumerator / note.getDenominator();
                        if (note instanceof PitchNote) {
                            for(int i=0; i<note.getNote().length; i++) {                                
                                // getTicksPerBeat gives you the default amount for a note = tempoNum/tempoDen
                                // We want ticks for a note that is noteNum / noteDen
                            	player.addNote(note.getNote()[i], tickCount, ticksPerNote);
                            }
                        }
                        if (!(note.getLyric().equals(""))) {
                            player.addLyricEvent(note.getLyric(), tickCount);
                        }
                        tickCount += ticksPerNote;
                    }
                }
            }
            player.play();
        }
        catch (Exception e) {
            e.printStackTrace();
        }  
    }

    /**
     * Returns the title of the MusicalPiece
     * @return the title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Returns the composer of the MusicalPiece
     * @return the composer
     */
    public String getComposer() {
        return this.composer;
    }

    /**
     * Returns the number of beats in a measure 
     * @return meterNumerator
     */
    public Integer getMeterNumerator() {
        return this.meterNumerator;
    }

    /**
     * Returns the note value that represents a beat of the MusicalPiece
     * @return meterDenominator
     */
    public Integer getMeterDenominator() {
        return this.meterDenominator;
    }

    /**
     * Returns the tempo of the MusicalPiece
     * @return tempo
     */
    public Integer getTempo() {
        return this.tempoSpeed;
    }
    
    /**
     * Returns a copy of the ArrayList of MusicalPhrases that make up the MusicalPiece
     * @return phrases 
     */
    // TODO MAKE THIS NOT HAVE REP EXPOSURE
    public ArrayList<MusicalPhrase> getPhrases() {
        return this.phrases;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((composer == null) ? 0 : composer.hashCode());
		result = prime * result + meterDenominator;
		result = prime * result + meterNumerator;
		result = prime * result + ((phrases == null) ? 0 : phrases.hashCode());
		result = prime * result + tempoDenominator;
		result = prime * result + tempoNumerator;
		result = prime * result + tempoSpeed;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MusicalPiece other = (MusicalPiece) obj;
		if (composer == null) {
			if (other.composer != null)
				return false;
		} else if (!composer.equals(other.composer))
			return false;
		if (meterDenominator != other.meterDenominator)
			return false;
		if (meterNumerator != other.meterNumerator)
			return false;
		if (phrases == null) {
			if (other.phrases != null)
				return false;
		} else if (!phrases.equals(other.phrases))
			return false;
		if (tempoDenominator != other.tempoDenominator)
			return false;
		if (tempoNumerator != other.tempoNumerator)
			return false;
		if (tempoSpeed != other.tempoSpeed)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MusicalPiece [title=" + title + ", composer=" + composer
				+ ", meterNumerator=" + meterNumerator + ", meterDenominator="
				+ meterDenominator + ", tempoSpeed=" + tempoSpeed
				+ ", tempoNumerator=" + tempoNumerator + ", tempoDenominator="
				+ tempoDenominator + ", phrases=" + phrases + "]";
	}
}
