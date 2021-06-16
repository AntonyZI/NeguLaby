/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negulaby.GameElements;

import java.io.Serializable;

public class GameMapCell implements Serializable{
    private CellContent content;
    private MazeSpace spaceType;
    
    // Getters and Setters
    
    public CellContent getContent() {
        return content;
    }
    public MazeSpace getSpaceType() {
        return spaceType;
    }
    
    public void setContent(CellContent content) {
        this.content = content;
    }
    public void setSpaceType(MazeSpace spaceType) {
        this.spaceType = spaceType;
    }
}
