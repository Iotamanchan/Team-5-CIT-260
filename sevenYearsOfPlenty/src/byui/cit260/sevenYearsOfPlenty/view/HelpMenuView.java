/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sevenYearsOfPlenty.view;

import java.util.Scanner;

/**
 *
 * @author Ruben
 */
class HelpMenuView {
    private String menu;
    private static final int MAX = 6;
   
    public HelpMenuView(){
        this.menu = "\n"
                + "\n******************************"
                + "\n**********Help  Menu**********"
                + "\n******************************"
                + "\n1 - What are the Goals of the Game?"
                + "\n2 - Who is Joseph of Egypt?"
                + "\n3 - How do I view the Map?"
                + "\n4 - How do I move to another location?"
                + "\n5 - How to display provisions & tools?"
                + "\n6 - Return to Main Menu"
                + "\n******************************";
    }
    
    void displayHelpMenuView() {
         int option;
        do
        {
            System.out.println(menu);
            option = getMenuOption();
            doAction(option);
        }while(option < MAX);

        System.out.println("displayMainMenu called.");
    }

    private int getMenuOption() {
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
                System.out.println("Goals placeholder");
                break;
            case 2: 
                System.out.println("Joseph placeholder");
                break;
            case 3: 
                System.out.println("View Map placeholder");
                break;
            case 4:
                System.out.println("Move placeholder");
                break;
            case 5:
                System.out.println("Display placeholder");
                break;
            case 6:
                System.out.println("Quitting! placeholder");
                break;
            default:
                System.out.println("\nInvalid Selection. Please try again");
                break;
        }
        return option;
    }
    
}