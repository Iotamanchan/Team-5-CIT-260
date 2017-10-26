package sevenyearsofplenty;


import byui.cit260.sevenYearsOfPlenty.model.Crops;
import byui.cit260.sevenYearsOfPlenty.model.Location;
import byui.cit260.sevenYearsOfPlenty.model.Player;
import byui.cit260.sevenYearsOfPlenty.model.Map;
import byui.cit260.sevenYearsOfPlenty.model.Inventory;
import byui.cit260.sevenYearsOfPlenty.view.StartProgramView;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ruben
 */
public class SevenYearsOfPlenty {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Bryan");
        
        String playerOneName = playerOne.getName();
        
        System.out.println(playerOne.toString());
        
        Crops crops = new Crops();
        
        crops.setYear(1);
        
        int cropsYear = crops.getYear();
        
        System.out.println(crops.toString());
        
        Location location = new Location();
        
        location.setRow(1);
        
        int locationRow = location.getRow();
        
        System.out.println(location.toString());
        
        Map map = new Map();
        
        map.setRowCount(1);
        
        int mapRowCount = map.rowCount();
        
        System.out.println(map.toString());
        
        Inventory inventory = new Inventory();
        
        inventory.setQuantity(1);
        
//        int inventoryQuantity = inventory.quantity();
        
        System.out.println(inventory.toString());
        
        //riley edits
        StartProgramView startProgramView = new StartProgramView();
        StartProgramView.displayStartProgramView();
    }
    
}
