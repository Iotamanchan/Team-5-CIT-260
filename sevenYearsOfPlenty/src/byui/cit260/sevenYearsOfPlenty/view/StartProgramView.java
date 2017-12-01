/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sevenYearsOfPlenty.view;

import byui.cit260.sevenYearsOfPlenty.control.GameControl;
import java.io.*;
import java.util.Scanner;
import sevenyearsofplenty.SevenYearsOfPlenty;

/**
 *
 * @author Ruben
 */
public class StartProgramView {

    protected final static BufferedReader keyboard = SevenYearsOfPlenty.getInFile();
    protected final static PrintWriter console = SevenYearsOfPlenty.getOutFile();
    
    public static void displayStartProgramView() throws IOException {
        String playerName = getPlayerName();
        GameControl.createPlayer(playerName);
        
        GameControl.createCrops();
        
        console.println("\n\n\n"
                + playerName + ", you have been appointed overseer for your"
                + "\nvillage. Tread carefully. If your people are not fed well"
                + "\nyou may lose your head.");
        displayNextView();
    }
    
    public static void displayNextView(){
        MainMenuView mainMenuView = new MainMenuView();//need to create MainMenuView class.
        mainMenuView.display();
        console.println("Goodbye! Thanks for playing!");
    }

    private static String getPlayerName() throws IOException {
        String playerName = "";
        //Scanner keyboard = new Scanner(System.in);
        do{
            console.println("Please enter your name: ");
            playerName = keyboard.readLine();
            playerName = playerName.trim();
            if(playerName.length()<2)
                console.println("Invalid input: Name must be at least 2 characters.");
            
        }
        while(playerName.length()<2);
        return playerName;
    }
    private String promptMessage;
    
    public StartProgramView(){
        this.promptMessage = "\nPlease enter your name: ";
        
        //display banner when view created 
        this.displayBanner();
        
    }

    private void displayBanner() {
        console.println(
                  "\n***********************************************************"
                + "\nWelcome to Pharaph's court. You have been summoned here"
                + "\nto assume your new rola as Agricoltural Overseer. You"
                + "\nreport directly to Joseph, Pharaoh's Vizier. Your respon-"
                + "\nsability is to gather the grain from the harvest, provide"
                + "\nenough food to the people so they do not go hungry, and "
                + "\reserve the rest in Pharaoh's granary in preparation for the "
                + "\npropheseised famine that is to come in seven years."
                + "\n"
                + "\nYou need to know how to plant crops, develop land, feed the "
                + "\npeople and store the excess. If you fail to provide enough"
                + "\nfood for the people, the people will starve. Some people"
                + "\nwill die. Your workforce will be deminished, and you will"
                + "\nnot have enough workers to plant and harvest crops. Pharaoh"
                + "\nis not pleased with those who fail him. Those who fail are"
                + "\nthrown in prision. He's not very nice to prisioners --"
                + "\njust ask the Royal Baker. "
                + "\n"
                + "\nOh, you can't because he's not around anymore. "
                + "\n"
                + "\n"
                + "\nRIP"
                + "\n"
                + "\nBe wise and you will be successful."
                + "\n***********************************************************"
        );
    }
}
