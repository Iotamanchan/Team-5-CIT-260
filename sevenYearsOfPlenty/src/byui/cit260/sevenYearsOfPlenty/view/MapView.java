/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sevenYearsOfPlenty.view;

import byui.cit260.seveYearsOfPlenty.exceptions.CropsControlException;
import byui.cit260.seveYearsOfPlenty.exceptions.MapControlException;
import byui.cit260.sevenYearsOfPlenty.model.Game;
import byui.cit260.sevenYearsOfPlenty.model.Location;
import byui.cit260.sevenYearsOfPlenty.model.Map;
import static byui.cit260.sevenYearsOfPlenty.view.GameMenuView.console;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import sevenyearsofplenty.SevenYearsOfPlenty;

/**
 *
 * @author Ruben
 */
public class MapView extends View{

    public static Game theGame = Game.getGame();
    public static Map theMap = Game.getMap();
    
    protected final BufferedReader keyboard = SevenYearsOfPlenty.getInFile();
    protected final PrintWriter console = SevenYearsOfPlenty.getOutFile();
    
    private static final int MAX = 2;
    
    private static final String menu = "\n1 - If you'd like to input X/Y coordinates:"
                + "\n2 - To return to the Main Menu";
    
     Location[][] locations = theMap.getLocations();
    
    public MapView(){
        super(MAX,menu);
    }
    public void displayMap(){
        
        console.println("Bellow you will find a handy map to help you navigate"
                + "\n\tthis wonderful land of Egypt.");
       
        showLocationArray(locations);
        selectArray();
    }
    
    public void showLocationArray(Location [][] locations){
            console.println("X Coordinates are written horizontally. Y Coordinates are vertical."
                    + "\n\t\t\tMap as follows:"
                    + "\n\t 0 \t 1 \t 2 \t 3 \t 4"
                    + "\n\t|*******|*******|*******|*******|*******|");  
            for(int i=0; i<locations.length; i++){
                    console.printf("%d\t|", i);
                for(int j=0; j<locations[i].length; j++){
                    console.printf(locations[i][j].getSymbol() + "\t|");  
                }
                 console.println();
                 console.println("\t|*******|*******|*******|*******|*******|");
            }
   
    }
     
    public void selectArray() {
        boolean fail = true;//I still have no idea how to do this one correctly
        int option;
        //int inputValue = 0;
        do{
            fail = false;
            System.out.println(menu);
            option = getInput();
            doAction(option);
        } while(fail = false);        
    }
 
@Override
    public int doAction(int option) {
        
        switch(option){
            case 1:
                printDescription(locations);
                break;
            case 2:
                gameMenu();
                break;
            default:
                console.println("\nInvalid Selection. Please try again.");
                break;
        }
        return option;
    }
    
   
    private void printDescription(Location[][] locations) {
        
        console.println("Select your X coordinate");
        Scanner keyboard = new Scanner(System.in);
        int xCoordinate = keyboard.nextInt();
        console.println("Select your Y coordinate");
        int yCoordinate = keyboard.nextInt();
        
        String description = locations[xCoordinate][yCoordinate].getDescription();
        console.println(description);
    }


    private void gameMenu() {
        console.println("Returning to Game menu");
    }
    
}