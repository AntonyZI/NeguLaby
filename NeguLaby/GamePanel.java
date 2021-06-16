/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negulaby;

import java.util.ArrayList;
import java.awt.*;
import javax.swing.*;
import negulaby.GameElements.*;

public class GamePanel extends JPanel{
    // Pre-game vars
    public final int SCREEN_WIDTH = 600; // pixels
    public final int SCREEN_HEIGHT = 600; // pixels
    private Color bgGameColor = Color.green.darker().darker().darker().darker();
    private int unitSize; // pixels
    private GameState gameState;
    
    // In-game vars
    private int[] gameStateSPosition = new int[2];
    private int[] gameStateFPosition = new int[2];
    private ArrayList<ArrayList<GameMapCell>> gameMapCells;
    
    public GamePanel(){
        this.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_HEIGHT));
        this.setBackground(bgGameColor);
        this.setFocusable(true);
    }
    public void initializeInGameVars(){
        
        gameMapCells = gameState.getGameMap().getCells();
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawLine(0, 0, 100, 200);
        paintGameMap(g);
    }
    public void paintGameMap(Graphics g){
        calculateGameMapPos();
        
        paintGridGameMap(g);
        g.setColor(Color.red);
        g.drawLine(gameStateSPosition[0], gameStateSPosition[1], gameStateSPosition[0]+unitSize, gameStateSPosition[1]+unitSize);
        paintSpacesGameMap(g);
        
    }
    public void paintGridGameMap(Graphics g){
        g.setColor(Color.gray.brighter());
        g.fillRect(
            gameStateSPosition[0], 
            gameStateSPosition[1], 
            gameStateFPosition[0] - gameStateSPosition[0], 
            gameStateFPosition[1] - gameStateSPosition[1]
        );
        //g.drawLine(gameStateSPosition[0], gameStateSPosition[1], gameStateFPosition[0], gameStateFPosition[1]);
        
    }
    public void paintSpacesGameMap(Graphics g){
        MazeVoid.sSetCellColor(bgGameColor);
        
        g.setColor(gameMapCells.get(0).get(0).getSpaceType().getCellColor());
        g.fillRect(gameStateSPosition[0], gameStateSPosition[1], unitSize, unitSize);
        for(int j=0;j<gameMapCells.size();j++){
            gameMapCells.get(j);
            for(int i=0;i<gameMapCells.get(j).size();i++){
                g.setColor(gameMapCells.get(j).get(i).getSpaceType().getCellColor());
                g.fillRect(gameStateSPosition[0]+i*(unitSize), gameStateSPosition[1]+j*(unitSize), unitSize, unitSize);
            }
        }
    }
    
    // In-game methods
    public void calculateGameMapPos(){
        gameStateSPosition[0] = (SCREEN_WIDTH - (unitSize * getGameState().getGameMap().getCells().get(0).size())) / 2;
        gameStateSPosition[1] = (SCREEN_HEIGHT - (unitSize * getGameState().getGameMap().getCells().size())) / 2;
        gameStateFPosition[0] = SCREEN_WIDTH - gameStateSPosition[0];
        gameStateFPosition[1] = SCREEN_HEIGHT - gameStateSPosition[1];
        
        //System.out.println(SCREEN_WIDTH - gameStateSPosition[0]);
        //System.out.println((unitSize * getGameState().getGameMap().getCells().get(0).size()) + gameStateSPosition[0]);
    }
    
    // Getters and Setters
    
    public int getUnitSize() {
        return unitSize;
    }
    public GameState getGameState() {
        return gameState;
    }
    
    public void setUnitSize(int unitSize) {
        this.unitSize = unitSize;
    }
    public void autoSetUnitSize() {
        /*System.out.println(SCREEN_HEIGHT);
        System.out.println(SCREEN_WIDTH);
        System.out.println(gameMapCells);
        System.out.println(gameState.getGameMap());*/
        /*for(ArrayList<GameMapCell> cell: gameState.getGameMap().getCells()){
            System.out.println(cell);
        }*/
        this.unitSize = Math.min(SCREEN_HEIGHT/gameMapCells.size(),SCREEN_WIDTH/gameMapCells.get(0).size());
        //this.unitSize = Math.min(SCREEN_HEIGHT/gameState.getGameMap().getCells().size(),SCREEN_WIDTH/gameState.getGameMap().getCells().get(0).size());
        //System.out.println(unitSize);
    }
    public void setGameState(GameState gameState){
        this.gameState = gameState;
    }

    public Color getBgGameColor() {
        return bgGameColor;
    }

    public void setBgGameColor(Color bgGameColor) {
        this.bgGameColor = bgGameColor;
        this.setBackground(bgGameColor);
    }
}
