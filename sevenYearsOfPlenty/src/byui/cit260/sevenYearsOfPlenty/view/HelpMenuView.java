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
class HelpMenuView extends View{
    private static final String menu = "\n"
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
    private static final int MAX = 6;
   
    public HelpMenuView(){
        super(MAX, menu);
    }
  /*  
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
*/
    
    @Override
    public int doAction(int option) {
        switch (option){
            case 1:
                System.out.println("The game objective is to maintain a villiage in Egypt during"
                        + "the seven years of plenty, in prepartion for the seven years of"
                        + "famine from the bible.  You need to set aside enough food to both"
                        + "feed your people and give to Pharaoh per year.");
                break;
            case 2: 
                System.out.println("Joseph is pharaoh over Egypt, son of Jacob sold into "
                        + "bondage by his jealous brothers.  He rose from slavery to "
                        + "pharaoh of Egypt.");
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
                System.out.println("Invalid Selection. Please try again");
                break;
        }
        return option;
    }
    
}