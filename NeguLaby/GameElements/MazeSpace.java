/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negulaby.GameElements;

import java.awt.Color;
import java.io.Serializable;

public class MazeSpace implements Serializable{
    private int xPos;
    private int yPos;
    
    public MazeSpace(){
        
    }
    
    // Getters and Setters
    
    public int getXPos() {
        return xPos;
    }
    public int getYPos() {
        return yPos;
    }
    
    public void setXPos(int xPos) {
        this.xPos = xPos;
    }
    public void setYPos(int yPos) {
        this.yPos = yPos;
    }
    public void setPosition(int y,int x) {
        this.xPos = x;
        this.yPos = y;
    }
    
    // Static methods
    
    public static MazeSpace getRndMazeSpace(){
        int rnd = (int)(Math.random()*3);
        switch(rnd){
            case 0:
                return new MazeVoid();
            case 1:
                return new MazeWall();
            case 2:
                return new MazePath();
            default:
                return new MazeSpace();
        }
    }
    
    // Methods to inherite (dummy methods)
    
    public Color getCellColor() {
        System.out.println("Not color defined for this object MazeSpace");
        return Color.red;
    }

    public void setCellColor(Color cellColor) {
        System.out.println("Cannot define color for this object MazeSpace");
    }
}
