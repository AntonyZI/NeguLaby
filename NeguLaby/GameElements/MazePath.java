/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negulaby.GameElements;

import java.awt.Color;
import java.io.Serializable;

public class MazePath extends MazeSpace implements Serializable{
    private static Color cellColor;
    
    public MazePath(){
        if(cellColor == null)
            cellColor = new Color(100,100,100);
    }
    
    public Color getCellColor() {
        return MazePath.cellColor;
    }
    public static Color sGetCellColor() { // static
        return MazePath.cellColor;
    }

    public void setCellColor(Color cellColor) {
        MazePath.cellColor = cellColor;
    }
    public static void sSetCellColor(Color cellColor) { // static
        MazePath.cellColor = cellColor;
    }
}
