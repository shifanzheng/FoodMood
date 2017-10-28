/*
 */
package MoodModel;

/**
 *
 * @author Shifan
 */
public class MoodModel {
    private String mood;
    private String food;
    private int moodEffect;

    /**
     * Default constructor for MoodModel class
     * @param foodName
     * @param moodName
     * @param moodEffect
     */
    public MoodModel(String foodName, String moodName, int moodEffect){
        this.food = foodName;
        this.mood = moodName;
        this.moodEffect = moodEffect;
        
    }
    /**
     * @return the mood
     */
    public String getMood() {
        return mood;
    }
    
     public String getFood() {
        return food;
    }

    /**
     * @param mood the mood to set
     */
    public void setMood(String mood) {
        this.mood = mood;
    }
    
    public void setFood(String food) {
        this.food = food;
    }

    /**
     * @return the moodEffect
     */
    public int getMoodEffect() {
        return moodEffect;
    }

    /**
     * @param moodEffect the moodEffect to set
     */
    public void setMoodEffect(int moodEffect) {
        this.moodEffect = moodEffect;
    }
}
