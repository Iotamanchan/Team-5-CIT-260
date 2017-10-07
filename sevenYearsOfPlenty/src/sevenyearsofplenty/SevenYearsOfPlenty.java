package sevenyearsofplenty;


import byui.cit260.sevenYearsOfPlenty.model.Crops;
import byui.cit260.sevenYearsOfPlenty.model.Player;

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
    }
    
}
