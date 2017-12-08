/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sevenYearsOfPlenty.view;

import byui.cit260.seveYearsOfPlenty.exceptions.CropsControlException;
import byui.cit260.sevenYearsOfPlenty.control.MapControl;
import byui.cit260.sevenYearsOfPlenty.model.Map;
import java.util.Scanner;
import byui.cit260.sevenYearsOfPlenty.control.CropsControl;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import sevenyearsofplenty.SevenYearsOfPlenty;

/**
 *
 * @author Riley Hein
 */
class GameMenuView extends View{
    protected final static BufferedReader keyboard = SevenYearsOfPlenty.getInFile();
    protected final static PrintWriter console = SevenYearsOfPlenty.getOutFile();
    private static final String menu = "\n"
                +"\n******************************"
                +"\n**********Game  Menu**********"
                + "\n******************************"
                +"\n1 - View Map"
                +"\n2 - View a List"
                +"\n3 - Move to a New Location"
                +"\n4 - Manage the Crops"
                +"\n5 - End the Turn"
                +"\n6 - Back to Main Menu"
                +"\n******************************";
    private static final int MAX = 6;

    public GameMenuView(){
      super(MAX, menu);
    }
    
    
    @Override
    public int doAction(int option) {
        
        switch(option){
            case 1:
                this.viewMap();
                break;
            case 2:
                this.viewList();
                break;
            case 3:
                this.moveLocation();
                break;
            case 4:
        {
            try {
                this.manageCrops();
            } catch (CropsControlException ex) {
                ErrorView.display("GameMenuView", ex.getMessage());
            }
        }
                break;
            case 5:
                this.endTheTurn();
                break;
            case 6:
                this.returnToMainMenu();
                break;
            default:
                console.println("\nInvalid Selection. Please try again.");
                break;
        }
        return option;
    }
    
    private void viewMap(){
        //System.out.println("viwMap");
        MapView map = new MapView();
        map.displayMap();
        
    }
    
    private void viewList(){
        System.out.println("viewList called");
        
    }
        
    private void moveLocation(){
        System.out.println("moveLocation");
        
    }
    
    private static void manageCrops() throws CropsControlException{
        //System.out.println("manageCrops");
        //CropsView cropsView = new CropsView();
        CropsView.buyLandView();
        CropsView.sellLandView();
        CropsView.calcHarvest();

        try {
            CropsView.ListAnimals();
            //CropsView.fedView();
        } catch (Exception ex) {
            Logger.getLogger(GameMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void endTheTurn(){
        //CropsControl.endTheTurn();
        //create function for ending the turn in crops control
    }
    
    
    private void returnToMainMenu(){
        console.println("returnToMainMenu");
        
    }
}
