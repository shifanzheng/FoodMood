/*
 */
package MoodModel;

import MoodController.MoodDataType;
import java.sql.Timestamp;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Shifan
 */
public class MoodModel {
    
    private int mood;
    private int intensity;
    private String food;
    private Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    private ObservableList<MoodDataType> moodList = FXCollections.observableArrayList();
    
    
    public MoodModel(){
    
    }

    /**
     * @return the mood
     */
    public int getMood() {
        return mood;
    }
    public String getFood(){
        return food;
    }
    public void setFood(String food){
        this.food=food;
    }

    /**
     * @param mood the mood to set
     */
    public void setMood(int mood) {
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
    public ObservableList<MoodDataType> getMoodList(){
        return moodList;
    }
    public void addMoodList(MoodDataType moodData){
        this.moodList.add(moodData);
    }
    
    
}
