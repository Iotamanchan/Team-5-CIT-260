/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sevenYearsOfPlenty.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;
import sevenyearsofplenty.SevenYearsOfPlenty;

/**
 *
 * @author rileyhein
 */
public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    protected int max;
    protected final static BufferedReader keyboard = SevenYearsOfPlenty.getInFile();
    protected final static PrintWriter console = SevenYearsOfPlenty.getOutFile();
    
    public View(){ 
     
    }
    public View(int MAX, String message){
        this.max = MAX;
        this.displayMessage = message;
    }
    
    @Override 
    public void display(){
    int option;
       do
       {
            System.out.println(displayMessage);
            option = getInput();
            doAction(option);
        }while(option != max);

        //System.out.println("displayMainMenu called.");
    }
    
    public int getInput() {
        int inputValue = 0;
        Scanner keyboard = new Scanner(System.in);
        do{
            try{
                while(!keyboard.hasNextInt()){
                    System.out.println("There's been an error. Only numbers are accepted."
                            + "\nPlease try again.");
                    keyboard.next();
                }
           console.println("Please enter an option: ");
           inputValue = keyboard.nextInt();
           
           if(inputValue < 1 || inputValue > max){
               ErrorView.display("View", "Invalid Option.");
           }
        }catch(InputMismatchException ime){
            ErrorView.display("View", "Error reading input:" + ime.getMessage());
        }
        }
        while(inputValue < 1 || inputValue > max);
        return inputValue;
    }
}
