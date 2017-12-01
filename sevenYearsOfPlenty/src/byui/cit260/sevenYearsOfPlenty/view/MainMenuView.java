/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sevenYearsOfPlenty.view;

import byui.cit260.seveYearsOfPlenty.exceptions.GameControlException;
import byui.cit260.sevenYearsOfPlenty.control.GameControl;
import byui.cit260.sevenYearsOfPlenty.model.Game;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import sevenyearsofplenty.SevenYearsOfPlenty;

/**
 *
 * @author Ruben
 */
public class MainMenuView extends View{
    protected final static BufferedReader keyboard= SevenYearsOfPlenty.getInFile();
    protected final static PrintWriter console = SevenYearsOfPlenty.getOutFile();
    
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
        {
            try {
                saveGame();
            } catch (GameControlException ex) {
                Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                break;
            case 5:
                quitGame();
                break;
            default:
                console.println("\nInvalid Selection. Please try again");
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
        //System.out.println("startExistingGame called");
        this.console.println("\n\nEnter the file path for gile where the game is to be saved");
        try{
            String filePath = this.keyboard.readLine();
            GameControl.getSavedGame(filePath);
        }catch (Exception ex){
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void displayHelpMenu() {
        HelpMenuView displayHelpMenu = new HelpMenuView();
        displayHelpMenu.display();
        
        //System.out.println("displayHelpMenu called");
    }

    private void saveGame() throws GameControlException {
        //System.out.println("saveGame called");
        this.console.println("\n\nEnter the file path for file where the game is to be saved");
        try {
            String filePath = this.keyboard.readLine();
            GameControl.saveGame(SevenYearsOfPlenty.getCurrentGame(), filePath);
        } catch (IOException ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        
    }

    private void quitGame() {
        System.out.println("quitGame called");
    }
    
}
