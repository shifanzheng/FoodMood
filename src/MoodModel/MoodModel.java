/*
 */
package MoodModel;

import java.sql.Timestamp;

/**
 *
 * @author Shifan
 */
public class MoodModel {
    
    private String mood;
    private int intensity;
    private Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    
    
    public MoodModel(){
    
    }

    /**
     * @return the mood
     */
    public String getMood() {
        return mood;
    }

    /**
     * @param mood the mood to set
     */
    public void setMood(String mood) {
        this.mood = mood;
    }

    /**
     * @return the intensity
     */
    public int getIntensity() {
        return intensity;
    }

    /**
     * @param intensity the intensity to set
     */
    public void setIntensity(int intensity) {
        this.intensity = intensity;
    }

    /**
     * @return the timestamp
     */
    public Timestamp getTimestamp() {
        return timestamp;
    }
    
    
    
}
