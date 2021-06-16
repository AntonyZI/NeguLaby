/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negulaby.GameElements;

import java.awt.Color;
import java.io.Serializable;

public class MazeWall extends MazeSpace implements Serializable{
    private static Color cellColor;
    
    public MazeWall(){
        if(cellColor == null)
            cellColor = new Color(50,50,50);
    }
    
    public Color getCellColor() {
        return MazeWall.cellColor;
    }
    public static Color sGetCellColor() { // static
        return MazeWall.cellColor;
    }

    public void setCellColor(Color cellColor) {
        MazeWall.cellColor = cellColor;
    }
    public static void sSetCellColor(Color cellColor) { // static
        MazeWall.cellColor = cellColor;
    }
}
