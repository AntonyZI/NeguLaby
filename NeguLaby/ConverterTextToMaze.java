/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negulaby;

import java.util.ArrayList;
import java.util.Scanner;
import negulaby.GameElements.*;

public class ConverterTextToMaze {
    public static void main(String [] args){
        GameState theGame = new GameState();
        
        GameMap theGameMap = new GameMap();
        Scanner sc = new Scanner(System.in);
        while(true){
        //for(int j=0;j<162;j++){
            String strIn = sc.next();
            if(strIn.equalsIgnoreCase("Q")){
                break;
            }
            theGameMap.getCells().add(new ArrayList<GameMapCell>());
            for(int i=0;i<strIn.length();i++){
                GameMapCell aCell = new GameMapCell();
                //System.out.print(strIn.charAt(i)+": ");
                switch(strIn.charAt(i)){
                    case '#':
                        //System.out.print("O");
                        aCell.setSpaceType(new MazeWall());
                        break;
                    case '_':
                        //System.out.print("I");
                        aCell.setSpaceType(new MazePath());
                        break;
                    default:
                        //System.out.print("n");
                        aCell.setSpaceType(new MazeVoid());
                        break;
                }
                theGameMap.getCells().get(theGameMap.getCells().size()-1).add(aCell);
                //System.out.println(theGameMap.getCells().get(theGameMap.getCells().size()).get(i));
            }
        }
        
        theGame.setGameMap(theGameMap);
        
        theGame.saveState("hola.dat");
    }
}
