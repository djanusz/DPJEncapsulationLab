/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author David
 */
public class GUI {
    private String gameOverAnnouncement;
    private String levelCompletionAnnouncement;
    private String highScoreAnnouncement;
  
    GameBoard gb = new GameBoard();
        
    public String getGameOverAnnouncement() {
        return gameOverAnnouncement = "GAME OVER";
    }

    public String getHighScoreAnnouncement() {
        return highScoreAnnouncement = "New Highest Score";
    }

    public String getLevelCompletionAnnouncement() {
        return levelCompletionAnnouncement = "Level " + gb.getGameLevel() 
                + " Completed";
    }
    
}
