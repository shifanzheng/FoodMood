/*
 */
package UserProfile;

/**
 *
 * @author Shifan
 */
public class UserProfileModel {

    private String userName = "user";
    private String password = "pass";
    private String favoriteFood = "N/A";
    private String currentMood = "N/A";
//    
//        public static String userName;
//    public static String password;
//    public static String favoriteFood = "N/A";
//    public static String currentMood = "N/A";

    public UserProfileModel() {

    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the favoriteFood
     */
    public String getFavoriteFood() {
        return favoriteFood;
    }

    /**
     * @param favoriteFood the favoriteFood to set
     */
    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    /**
     * @return the currentMood
     */
    public String getCurrentMood() {
        return currentMood;
    }

    /**
     * @param currentMood the currentMood to set
     */
    public void setCurrentMood(String currentMood) {
        this.currentMood = currentMood;
    }
}
