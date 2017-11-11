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
public class MainMenuView extends View{
    private static final String menu = "\n"
                + "\n******************************"
                + "\n**********Main  Menu**********"
                + "\n******************************"
                + "\n1 - Start New Game"
                + "\n2 - Get & Start a Save Game"
                + "\n3 - Get Help on How to Play"
                + "\n4 - Save Game"
                + "\n5 - Quit"
                + "\n******************************";
    private static final int MAX = 5;
    
    public MainMenuView(){
        super(MAX, menu);
    }
    
 /*   public void displayMainMenuView() {
        
        int option;
        do
        {
            System.out.println(menu);
            option = getMenuOption();
            doAction(option);
        }while(option < MAX);

        System.out.println("displayMainMenu called.");
    }
    */
    /*  private int getMenuOption(){
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
    */
    @Override
    public int doAction(int option) {
        
        
        switch (option){
            case 1:
                startNewGame();
                break;
            case 2: 
                startExistingGame();
                break;
            case 3: 
                displayHelpMenu();
                break;
            case 4:
                saveGame();
                break;
            case 5:
                quitGame();
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
        gameMenu.display();
    }

    private void startExistingGame() {
        System.out.println("startExistingGame called");
    }

    private void displayHelpMenu() {
        HelpMenuView displayHelpMenu = new HelpMenuView();
        displayHelpMenu.display();
        
        //System.out.println("displayHelpMenu called");
    }

    private void saveGame() {
        System.out.println("saveGame called");
    }

    private void quitGame() {
        System.out.println("quitGame called");
    }
    
}
