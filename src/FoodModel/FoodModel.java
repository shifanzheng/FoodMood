
package FoodModel;

import FoodController.FoodDataType;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Shifan
 */
public class FoodModel {
    private String name;
    private String type;
    private double price;
    private int quantity;
    
    private String foodName;
    private int calories;
    private int protein;
    private int carbs;
    private int fats;
    
    private ObservableList<FoodDataType> foodList = FXCollections.observableArrayList();


    
    /**
     * Default constructor for FoodModel class
     */
    public FoodModel(){
        
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getProtein() {
        return protein;
    }

    public void setProtein(int protein) {
        this.protein = protein;
    }

    public int getCarbs() {
        return carbs;
    }

    public void setCarbs(int carbs) {
        this.carbs = carbs;
    }

    public int getFats() {
        return fats;
    }

    public void setFats(int fats) {
        this.fats = fats;
    }

    public ObservableList<FoodDataType> getFoodList() {
        return foodList;
    }

    public void addFoodList(FoodDataType foodData) {
        this.foodList.add(foodData);
    }
}
