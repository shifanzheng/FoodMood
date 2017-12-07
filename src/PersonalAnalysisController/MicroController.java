/*
 */
package PersonalAnalysisController;

import FoodController.FoodDataType;
import FoodModel.FoodModel;
import PersonalAnalysisView.MicroView;
import javafx.scene.control.ToolBar;
import javafx.stage.Stage;

/**
 *
 * @author Shifan
 */
public class MicroController {

    private MicroView view;
    private FoodModel model;

    /**
     * Default constructor for MicroController class
     */
    public MicroController(FoodModel model, MicroView view, Stage primaryStage) {
        this.model = model;
        this.view = view;

        setButtonBehavior();
    }

    public MicroView getView() {
        return view;
    }

    public void setToolBar(ToolBar toolBar) {
        view.setToolBar(toolBar);
    }

    public void setButtonBehavior() {
        view.getAnalysisBt().setOnAction(e -> {

            int totalCalories = 0;
            int totalProtein = 0;
            int totalCarbs = 0;
            int totalFat = 0;

            for (FoodDataType foodData : model.getFoodList()) {
                totalCalories += foodData.getCalories();
                totalProtein += foodData.getProtein();
                totalCarbs += foodData.getCarbs();
                totalFat += foodData.getFat();
            }

            view.getAnalysisInfo().setText("You have consumsed a total of " + totalCalories + " calories, " + " " + totalProtein + " grams of protein,\n"
                    + " " + totalCarbs + " grams of carbohydrates, and " + totalFat + " grams of fat.");

            if (totalProtein > totalCarbs && totalProtein > totalFat) {
                view.getNutrientInfo().setText("Your favorite macronutrient is Protein");
            }
            if (totalCarbs > totalFat && totalCarbs > totalProtein) {
                view.getNutrientInfo().setText("Your favorite macronutrient is Carbohydrates");
            }
            if (totalFat > totalCarbs && totalFat > totalProtein) {
                view.getNutrientInfo().setText("Your favorite macronutrient is Fat");
            }
            if (totalProtein > totalCarbs && totalProtein == totalFat) {
                view.getNutrientInfo().setText("Your favorite macronutrient are Fat and Protein");
            }
            if (totalProtein == totalCarbs && totalProtein > totalFat) {
                view.getNutrientInfo().setText("Your favorite macronutrient are Protein and Carbohydrates");
            }
            if (totalFat == totalCarbs && totalCarbs > totalProtein) {
                view.getNutrientInfo().setText("Your favorite macronutrient are Fat and Carbohydrates");
            }
            if (totalProtein == totalCarbs && totalProtein == totalFat) {
                view.getNutrientInfo().setText("You like all of your nutrients equally!");
            }

        });
    }
}
