/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sevenYearsOfPlenty.view;

import byui.cit260.sevenYearsOfPlenty.control.MapControl;
import java.util.Scanner;

/**
 *
 * @author Riley Hein
 */
class GameMenuView extends View{
    private final String menu = "\n"
                +"\n******************************"
                +"\n**********Game  Menu**********"
                + "\n******************************"
                +"\n1 - View Map"
                +"\n2 - View a List"
                +"\n3 - Move to a New Location"
                +"\n4 - Manage the Crops"
                +"\n5 - Back to Main Menu"
                +"\n******************************";
    private static final int MAX = 5;

    public GameMenuView(){
      
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
                this.manageCrops();
                break;
            case 5:
                this.returnToMainMenu();
                break;
            default:
                System.out.println("\nInvalid Selection. Please try again.");
                break;
        }
        return option;
    }
    
    private void viewMap(){
        System.out.println("viwMap");
    }
    
    private void viewList(){
        System.out.println("viewList called");
        
    }
        
    private void moveLocation(){
        System.out.println("moveLocation");
        
    }
    
    private void manageCrops(){
        System.out.println("manageCrops");
    }
    
    private void returnToMainMenu(){
        System.out.println("returnToMainMenu");
        
    }
}
