/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sevenYearsOfPlenty.view;

import byui.cit260.sevenYearsOfPlenty.control.GameControl;
import byui.cit260.sevenYearsOfPlenty.model.Game;
import java.util.Scanner;
import sevenyearsofplenty.SevenYearsOfPlenty;

/**
 *
 * @author Ruben
 */
class MainMenuView {
    private String menu;
    private static final int MAX = 5;
    public MainMenuView(){
        this.menu = "MainMenuView items here";
    }
    public void displayMainMenuView() {
        
        int option;
        do
        {
            System.out.println(menu);
            option = getMenuOption();
            doAction(option);
        }while(option < MAX);

        System.out.println("displayMainMenu called.");
    }
    
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

    private int doAction(int option) {
        
        
        switch (option){
            case 1:
                this.startNewGame();
                break;
            case 2: 
                this.startExistingGame();
                break;
            case 3: 
                this.displayHelpMenu();
                break;
            case 4:
                this.saveGame();
                break;
            case 5:
                this.quitGame();
                break;
            default:
                System.out.println("\nInvalid Selection. Please try again");
                break;
        }
        return option;
    }

    private void startNewGame() {
        GameControl.createNewGame(Game.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void startExistingGame() {
        System.out.println("startExistingGame called");
    }

    private void displayHelpMenu() {
        System.out.println("displayHelpMenu called");
    }

    private void saveGame() {
        System.out.println("saveGame called");
    }

    private void quitGame() {
        System.out.println("quitGame called");
    }
    
}
