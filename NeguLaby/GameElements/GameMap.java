/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negulaby.GameElements;

import java.io.Serializable;
import java.util.ArrayList;

public class GameMap implements Serializable{
    private ArrayList<ArrayList<GameMapCell>> cells = new ArrayList<ArrayList<GameMapCell>>();
    
    public GameMap(){
        // Nothing yet
    }
    
    // Getters and Setters
    
    public ArrayList<ArrayList<GameMapCell>> getCells() {
        return cells;
    }

    public void setCells(ArrayList<ArrayList<GameMapCell>> cells) {
        this.cells = cells;
    }
    
    // Static methods
    
    public static GameMap autogenGameMap(int width,int height){
        GameMap gameMap = new GameMap();
        ArrayList<ArrayList<GameMapCell>> cells = gameMap.getCells();
        for(int j=0;j<height;j++){
            cells.add(new ArrayList<GameMapCell>());
            for(int i=0;i<width;i++){
                GameMapCell aCell = new GameMapCell();
                aCell.setSpaceType(MazeSpace.getRndMazeSpace());
                
                cells.get(j).add(aCell);
            }
        }
        return gameMap;
    }
    
    public static void main(String [] args){
        GameMap gameMap = GameMap.autogenGameMap(3,4);
        for(int j=0;j<gameMap.getCells().size();j++){
            System.out.println(gameMap.getCells().get(j));
        }
    }
}
