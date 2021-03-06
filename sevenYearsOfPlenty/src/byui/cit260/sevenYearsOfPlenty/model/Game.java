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
    
    private static Player player;
    
    private static Crops theCrops = null;
    private static Game theGame = null;
    private static Map theMap = null;
    
    public Game() {
    }

    public static Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        Game.player = player;
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

    public static Game getGame() {
        return theGame;
    }

    public static void setGame(Game _gameRef) {
        Game.theGame = theGame;
    }

    public static Map getMap() {
        return theMap;
    }

    public static void setMap(Map _mapRef) {
        theMap = _mapRef;
    }
    
}
