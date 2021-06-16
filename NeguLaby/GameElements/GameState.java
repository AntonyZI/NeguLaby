/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negulaby.GameElements;

import java.io.*;
import java.util.ArrayList;

public class GameState implements Serializable{
    private ArrayList<Player> players = new ArrayList<Player>();
    private GameMap gameMap;
    private int gameTime;
    
    public GameState(){
        
    }
    
    public void saveState(String filePath){
        try {
            ObjectOutputStream dOStream = new ObjectOutputStream(new FileOutputStream(filePath));
            dOStream.writeObject(this);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static GameState loadState(String filePath){
        try {
            GameState gameS;
            ObjectInputStream dIStream = new ObjectInputStream(new FileInputStream(filePath));
            gameS = (GameState)dIStream.readObject();
            return gameS;
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }
    
    
    // Getters and Setters by easy access
    
    public GameMapCell getGameMapCell(int x,int y){
        return gameMap.getCells().get(y).get(x);
    }
    
    public void setGameMapCell(int x,int y,GameMapCell cellCtt){
        gameMap.getCells().get(y).set(x,cellCtt);
    }
    
    // Getters and Setters by default
    
    public ArrayList<Player> getPlayers() {
        return players;
    }
    public GameMap getGameMap() {
        return gameMap;
    }
    public int getGameTime() {
        return gameTime;
    }
    
    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }
    public void setGameMap(GameMap gameMap) {
        this.gameMap = gameMap;
    }
    public void setGameTime(int gameTime) {
        this.gameTime = gameTime;
    }
}
