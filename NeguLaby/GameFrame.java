/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negulaby;

import javax.swing.JFrame;
import negulaby.GameElements.*;

public class GameFrame extends JFrame{
    
    public GameFrame(){
        this.setTitle("Negu Laby");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        
        GamePanel theGamePanel = new GamePanel();
        
        GameState theGame = new GameState();
        theGame.setGameMap(GameMap.autogenGameMap(10,12));
        
        //theGamePanel.setGameState(theGame);
        theGamePanel.setGameState(GameState.loadState("hola.dat"));
        theGamePanel.initializeInGameVars();
        //theGamePanel.setUnitSize(40);
        theGamePanel.autoSetUnitSize();
        
        this.add(theGamePanel);
        
        //theGame.saveState("hola.dat");
        
        this.pack();
        this.setLocationRelativeTo(null);
    }
}
