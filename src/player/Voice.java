package player;

import java.util.ArrayList;
/**
 * Class that stores a record for each voice including the bars that are repeated, it's voicebars, and boolean objects
 * to determine when to add to repeatBars
 *
 */
public class Voice {
    private boolean isRepeatOn;
    private boolean isOneTwoRepeat;
    private Bar currentRepeatBar;
    private ArrayList<Bar> repeatBars;    
    private ArrayList<Bar> voiceBars;
    
    /**
     * Constructor for voice
     * @param isRepeatOn - boolean which represents if we are in a declared repeat segment and should store all Notes we're currently adding
     * @param isOneTwoRepeat - boolean representing if we saw the token "[1" and should stop adding to repeatBars
     * @param currentRepeatBar - Bar representing the current repeatBar we're adding notes to
     * @param repeatBars - ArrayList of Bars which represent all the Bars that may need to be repeated for the current voice
     */
    public Voice(boolean isRepeatOn, boolean isOneTwoRepeat, Bar currentRepeatBar, ArrayList<Bar> repeatBars) {
        if (currentRepeatBar == null)
        	throw new IllegalArgumentException("Current Repeat Bar can't be null");
    	this.isRepeatOn = isRepeatOn;
        this.isOneTwoRepeat = isOneTwoRepeat;
        this.currentRepeatBar = currentRepeatBar;
        this.repeatBars = repeatBars;
        this.voiceBars = new ArrayList<Bar>();
    }
    
    /**
     * Returns boolean of if we are storing bars to be repeated for the current voice
     * @return isRepeatOn
     */
    public boolean getRepeatOn() {
        return this.isRepeatOn;
    }
    
    /**
     * Setter method for isRepeatOn, used if we ever see a "|:" token
     * @param isRepeatOn
     */
    public void setRepeatOn(boolean isRepeatOn) {
        this.isRepeatOn = isRepeatOn;
    }
    
    /**
     * Returns boolean of if we have seen a "[1" token and are no longer storing repeats
     * @return isOneTwoRepeat
     */
    public boolean getOneTwoRepeat() {
        return this.isOneTwoRepeat;
    }
    
    /**
     * Setter method for isOneTwoRepeat, set to true if we have seen a "[1" token
     * @param isOneTwoRepeat
     */
    public void setOneTwoRepeat(boolean isOneTwoRepeat) {
        this.isOneTwoRepeat = isOneTwoRepeat;
    }
    
    /**
     * Returns the Bar currentRepeatBar for the current voice
     * @return currentRepeatbar
     */
    public Bar getCurrentRepeatBar() {
        return this.currentRepeatBar;
    }
    
    /**
     * Setter method for currentRepeatBar
     * @param currentRepeatBar
     */
    public void setCurrentRepeatBar(Bar currentRepeatBar) {
        this.currentRepeatBar = currentRepeatBar;
    }
    
    /**
     * Returns the ArrayList of Bars that represent all the Bars to be repeated currently for the voice
     * @return repeatBars
     */
    public ArrayList<Bar> getRepeatBars() {
        return this.repeatBars;
    }
    
    /**
     * Setter method for the repeatBars for the current voice. Gets reset after a repeat is finished.
     * @param repeatBars
     */
    public void setRepeatBars(ArrayList<Bar> repeatBars) {
        this.repeatBars = repeatBars;
    }
    
    /**
     * Adds an ArrayList of Bars to the Voice's total Bars
     * @param bars
     */
    public void addBars(ArrayList<Bar> bars) {
        for (int i = 0; i < bars.size(); i++) {
            this.voiceBars.add(bars.get(i));
        }
    }
    
    /**
     * Returns all the Bars associated with the voice 
     * @return ArrayList of Bars
     */
    public ArrayList<Bar> getVoiceBars() {
        return this.voiceBars;
    }

    /**
     * Create a hash value for this Voice
     * @return integer hash value
     */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((currentRepeatBar == null) ? 0 : currentRepeatBar.hashCode());
		result = prime * result + (isOneTwoRepeat ? 1231 : 1237);
		result = prime * result + (isRepeatOn ? 1231 : 1237);
		result = prime * result
				+ ((repeatBars == null) ? 0 : repeatBars.hashCode());
		result = prime * result
				+ ((voiceBars == null) ? 0 : voiceBars.hashCode());
		return result;
	}

	/**
	 * Method to check equality of this object with another object
	 * @return boolean value representing if two objects are equal
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Voice other = (Voice) obj;
		if (currentRepeatBar == null) {
			if (other.currentRepeatBar != null)
				return false;
		} else if (!currentRepeatBar.equals(other.currentRepeatBar))
			return false;
		if (isOneTwoRepeat != other.isOneTwoRepeat)
			return false;
		if (isRepeatOn != other.isRepeatOn)
			return false;
		if (repeatBars == null) {
			if (other.repeatBars != null)
				return false;
		} else if (!repeatBars.equals(other.repeatBars))
			return false;
		if (voiceBars == null) {
			if (other.voiceBars != null)
				return false;
		} else if (!voiceBars.equals(other.voiceBars))
			return false;
		return true;
	}
	
	/**
	 * Creates a string representation of Voice
	 * @return string representing the voice
	 */
	@Override
	public String toString() {
		return "Voice [isRepeatOn=" + isRepeatOn + ", isOneTwoRepeat="
				+ isOneTwoRepeat + ", currentRepeatBar=" + currentRepeatBar
				+ ", repeatBars=" + repeatBars + ", voiceBars=" + voiceBars
				+ "]";
	}
}
