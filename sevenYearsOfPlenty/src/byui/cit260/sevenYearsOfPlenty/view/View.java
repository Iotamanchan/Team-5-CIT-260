/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sevenYearsOfPlenty.view;

import java.util.Scanner;

/**
 *
 * @author rileyhein
 */
public abstract class View implements viewInterface {
    
    protected String displayMessage;
    
    public View(){  
    }
    
    public View(String message){
        this.displayMessage = message;
    }
    
    @Override
        public void displayMenu() {
        System.out.println("displayMenu in GameMenuView called");
        
        int option;
        do
        {
            System.out.println(menu);
            option = getMenuOption();
            doAction(option);
        }while(option < MAX);
        
        System.out.println("displayMainMenu called.");
    }
    @Override
         private int getMenuOption(){
        int inputValue = 0;
        Scanner keyboard = new Scanner(System.in);
        do{
            System.out.println("Please enter an option:");
            inputValue = keyboard.nextInt();
            
            if(inputValue < 1 || inputValue > MAX){
                System.out.println("Invalid Option.");
            }
        }
        while(inputValue < 1 || inputValue > MAX);
        return inputValue;
        
    }
         
    @Override
        private int doAction(int option) {

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
}
