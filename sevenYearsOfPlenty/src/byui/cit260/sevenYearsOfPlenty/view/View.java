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
public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    protected int max;
    
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
        int inputValue;
        Scanner keyboard = new Scanner(System.in);
        do{
           System.out.println("Please enter an option:");
           inputValue = keyboard.nextInt();
           
           if(inputValue < 1 || inputValue > max){
               System.out.println("Invalid Option.");
           }
        }
        while(inputValue < 1 || inputValue > max);
        return inputValue;
    }
}
