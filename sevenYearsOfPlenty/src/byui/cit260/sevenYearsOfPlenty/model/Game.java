/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sevenYearsOfPlenty.model;

import java.io.Serializable;

/**
 *
 * @author Ruben
 */
public class Game implements Serializable{
    
    private Player player;
    
    private static Crops theCrops = null;
    
    public Game() {
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
    //getCrops Method
    //Gets a reference to the crop Object
    //No parameters
    //Returns a reference to teh crop Object
    
    public static Crops getCrop() {
        return theCrops;
    }
    //setCrops Method
    //Stores a reference to the crop Object
    //A reference to a crop object, parameter
    //returns: none
    public static void setCrop(Crops _cropRef) {
        theCrops = _cropRef;
    }
    
}
