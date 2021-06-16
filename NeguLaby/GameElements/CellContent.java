/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negulaby.GameElements;

import java.io.Serializable;

public class CellContent implements Serializable{
    private int xPos;
    private int yPos;
    
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
}
