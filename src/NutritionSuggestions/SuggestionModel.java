/*
 */
package NutritionSuggestions;

/**
 *
 * @author Shifan
 */
public class SuggestionModel {
    private int calories;
    private int protein;
    private int sodium;
    
    /**
     * Default constructor for SuggestionModel class.
     */
    public SuggestionModel(){
        
    }

    /**
     * @return the calories
     */
    public int getCalories() {
        return calories;
    }

    /**
     * @param calories the calories to set
     */
    public void setCalories(int calories) {
        this.calories = calories;
    }

    /**
     * @return the protein
     */
    public int getProtein() {
        return protein;
    }

    /**
     * @param protein the protein to set
     */
    public void setProtein(int protein) {
        this.protein = protein;
    }

    /**
     * @return the sodium
     */
    public int getSodium() {
        return sodium;
    }

    /**
     * @param sodium the sodium to set
     */
    public void setSodium(int sodium) {
        this.sodium = sodium;
    }
    
    
}
