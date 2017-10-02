/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testharness;

import FoodController.EnterFoodControllerIT;
import FoodController.FoodStatsControllerIT;
import FoodModel.FoodModelIT;
import FoodView.EnterFoodViewIT;
import FoodView.FoodStatsViewIT;
import MoodController.EnterMoodControllerIT;
import MoodController.MoodStatsController;
import MoodModel.MoodModelIT;
import MoodView.EnterMoodViewIT;
import MoodView.MoodStatsViewIT;
import NutritionSuggestionView.SuggestionViewIT;
import NutritionSuggestionsController.SuggestionControllerIT;
import NutritionSuggestionsModel.SuggestionModelIT;
import PersonalAnalysisController.MicroController;
import PersonalAnalysisModel.MicroModelIT;
import PersonalAnalysisView.MicroViewIT;
import java.util.ArrayList;
import java.util.List;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 *
 * @author JonYa
 */
public class Testharness {
    
    public static void main(String[] args){
        List<Class<?>> tests = new ArrayList<Class<?>>();
        
        tests.add(EnterFoodControllerIT.class);
        tests.add(FoodStatsControllerIT.class);
        
        tests.add(FoodModelIT.class);
        
        tests.add(EnterFoodViewIT.class);
        tests.add(FoodStatsViewIT.class);
        
        tests.add(EnterMoodControllerIT.class);
        tests.add(MoodStatsController.class);
        
        tests.add(MoodModelIT.class);
        
        tests.add(EnterMoodViewIT.class);
        tests.add(MoodStatsViewIT.class);
        
        tests.add(SuggestionViewIT.class);
        
        tests.add(SuggestionControllerIT.class);
        
        tests.add(SuggestionModelIT.class);
        
        tests.add(MicroController.class);
        
        tests.add(MicroModelIT.class);
        
        tests.add(MicroViewIT.class);

        for(int i = 0; i < tests.size(); i++){
            runTests(tests.get(i));
        }
    }

    private static void runTests(Class test){
        System.out.println("CLASS NAME: " + test.getSimpleName() + "\n");
        System.out.println("TESTS EXECUTED...");
        Result result = JUnitCore.runClasses(test);
        
        System.out.println("\nFAILURES (" + result.getFailureCount() + ")");
        
        for (Failure failure : result.getFailures()){
            System.out.println(failure.toString());
        }
        System.out.println("--------------------------------------\n");
    }
}
