/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author David
 */
public class Game {
    public static int highScore;
    private int score;
    
   
    GameBoard gb = new GameBoard();
    GameCharacter gc = new GameCharacter();

    public static int getHighScore() {
        return highScore;
    }

    public static void setHighScore(int highScore) {
        Game.highScore = highScore;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    
}
