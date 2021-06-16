/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negulaby.GameElements;

import java.io.Serializable;

public class Player extends CellContent implements Serializable{
    private String name;
    private String id;
    
    // Getters and Setters
    
    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public void setId(String id) {
        this.id = id;
    }
}
