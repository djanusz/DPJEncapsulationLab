/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author David
 */
public class GameBoard {
    private int gameLevel;
    private int numberOfLanes;
    private String header;

    Lane lane1 = new Lane();
    
    public int getGameLevel() {
        return gameLevel;
    }

    public void setGameLevel(int gameLevel) {
        this.gameLevel = gameLevel;
    }

    public int getNumberOfLanes() {
        return numberOfLanes;
    }

    public void setNumberOfLanes(int numberOfLanes) {
        this.numberOfLanes = numberOfLanes;
    }

    public String getHeader() {
        return header;
    }

    public Lane getLane1() {
        return lane1;
    }

    public void setLane1(Lane lane1) {
        this.lane1 = lane1;
    }
    
    
}
