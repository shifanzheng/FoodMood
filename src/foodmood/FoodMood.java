
package foodmood;

import FoodController.EnterFoodController;
import FoodController.FoodStatsController;
import FoodModel.FoodModel;
import FoodView.EnterFoodView;
import FoodView.FoodStatsView;
import MoodController.EnterMoodController;
import MoodController.MoodStatsController;
import MoodModel.MoodModel;
import MoodView.EnterMoodView;
import MoodView.MoodStatsView;
import javafx.application.Application;
import javafx.stage.Stage;


/**
 *
 * @author Shifan
 */
public class FoodMood extends Application{

    
    Stage primaryStage = new Stage();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        
        //FoodModel model = new FoodModel();
        //EnterFoodView view = new EnterFoodView();
        //EnterFoodController foodcntl = new EnterFoodController(model, view);
        //view.displayView();
        //view.setVisible(true);
        
        launch(args);
        
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        this.primaryStage = primaryStage;
        
        moodStats();
        //view.setVisible();
        
        /*
        BorderPane root = new BorderPane();
        
        Scene scene = new Scene(root, 500, 700);
        primaryStage.setScene(scene);
        primaryStage.show();
        */
        
    }
    
    public void enterFood(){
        FoodModel model = new FoodModel();
        EnterFoodView view = new EnterFoodView(primaryStage);
        EnterFoodController foodcntl = new EnterFoodController(model, view, primaryStage);
        view.displayView();
    }
    
    public void foodStats(){
        FoodModel model = new FoodModel();
        FoodStatsView view = new FoodStatsView(primaryStage);
        FoodStatsController foodStatsController = new FoodStatsController(model, view, primaryStage);
        view.displayView();
    }
    
    public void enterMood(){
        MoodModel model = new MoodModel();
        EnterMoodView view = new EnterMoodView(primaryStage);
        EnterMoodController foodStatsController = new EnterMoodController(model, view, primaryStage);
        view.displayView();
    }
    
    public void moodStats(){
        MoodModel model = new MoodModel();
        MoodStatsView view = new MoodStatsView(primaryStage);
        MoodStatsController foodStatsController = new MoodStatsController(model, view, primaryStage);
        view.displayView();
    }
    
    public void analysis(){
        
    }
    
    public void suggestion(){
        
    } 
   
}
