/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negulaby.GameElements;

import java.awt.Color;
import java.io.Serializable;

public class MazeVoid extends MazeSpace implements Serializable{
    private static Color cellColor;
    
    public MazeVoid(){
        if(cellColor == null)
            cellColor = new Color(0,0,0);
    }
    
    public Color getCellColor() {
        return MazeVoid.cellColor;
    }
    public static Color sGetCellColor() { // static
        return MazeVoid.cellColor;
    }
    
    public void setCellColor(Color cellColor) {
        MazeVoid.cellColor = cellColor;
    }
    public static void sSetCellColor(Color cellColor) { // static
        MazeVoid.cellColor = cellColor;
    }
}
