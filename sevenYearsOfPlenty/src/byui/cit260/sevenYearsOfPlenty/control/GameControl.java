/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sevenYearsOfPlenty.control;

import byui.cit260.sevenYearsOfPlenty.model.Crops;
import byui.cit260.sevenYearsOfPlenty.model.Game;
import byui.cit260.sevenYearsOfPlenty.model.Player;

/**
 *
 * @author The Whopper
 */
public class GameControl {
    public static void createPlayer(String playerName){
        Player player = new Player();
        player.setName(playerName);
    }
    //createCrops Method
    public static void createCrops(){
        Crops theCrops = new Crops();
        
        //data initialization
        theCrops.setYear(0);
        theCrops.setPopulation(95);
        theCrops.setNewPeople(5);
        theCrops.setCropYield(3);
        theCrops.setNumberWhoDied(0);
        theCrops.setPharaohsShare(200);
        theCrops.setWheatInStore(2800);
        theCrops.setAcres(1000);
        theCrops.setHarvest(0);
        theCrops.setPlanted(1000);
        theCrops.setFed(0);
        
        Game.setCrop(theCrops);
    }
    public static void createNewGame(Player player) {
        System.out.println("createNewGame(Player player) called");
    }
}
