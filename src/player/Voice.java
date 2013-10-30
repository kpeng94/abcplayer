package player;

import java.util.ArrayList;

public class Voice {
    private boolean isRepeatOn;
    private boolean isOneTwoRepeat;
    private Bar currentRepeatBar;
    private ArrayList<Bar> repeatBars;    
    private ArrayList<Bar> voiceBars;
    
    public Voice(boolean isRepeatOn, boolean isOneTwoRepeat, Bar currentRepeatBar, ArrayList<Bar> repeatBars) {
        this.isRepeatOn = isRepeatOn;
        this.isOneTwoRepeat = isOneTwoRepeat;
        this.currentRepeatBar = currentRepeatBar;
        this.repeatBars = repeatBars;
        this.voiceBars = new ArrayList<Bar>();
    }
    
    public boolean getRepeatOn() {
        return this.isRepeatOn;
    }
    
    public void setRepeatOn(boolean isRepeatOn) {
        this.isRepeatOn = isRepeatOn;
    }
    
    public boolean getOneTwoRepeat() {
        return this.isOneTwoRepeat;
    }
    
    public void setOneTwoRepeat(boolean isOneTwoRepeat) {
        this.isOneTwoRepeat = isOneTwoRepeat;
    }
    
    public Bar getCurrentRepeatBar() {
        return this.currentRepeatBar;
    }

    public void setCurrentRepeatBar(Bar currentRepeatBar) {
        this.currentRepeatBar = currentRepeatBar;
    }
    
    public ArrayList<Bar> getRepeatBars() {
        return this.repeatBars;
    }
    
    public void setRepeatBars(ArrayList<Bar> repeatBars) {
        this.repeatBars = repeatBars;
    }
    
    public void addBars(ArrayList<Bar> bars) {
        for (int i = 0; i < bars.size(); i++) {
            this.voiceBars.add(bars.get(i));
        }
    }
    
    public ArrayList<Bar> getVoiceBars() {
        return this.voiceBars;
    }
}
