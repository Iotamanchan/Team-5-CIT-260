/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sevenYearsOfPlenty.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import sevenyearsofplenty.SevenYearsOfPlenty;

/**
 *
 * @author Ruben
 */
class HelpMenuView extends View{
    protected final static BufferedReader keyboard = SevenYearsOfPlenty.getInFile();
    protected final static PrintWriter console = SevenYearsOfPlenty.getOutFile();
    
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
                console.println("The game objective is to maintain a villiage in Egypt during"
                        + "\nthe seven years of plenty, in prepartion for the seven years of"
                        + "\nfamine from the bible.  You need to set aside enough food to both"
                        + "\nfeed your people and give to Pharaoh per year.");
                break;
            case 2: 
                console.println("Joseph is pharaoh over Egypt, son of Jacob sold into "
                        + "\nbondage by his jealous brothers.  He rose from slavery to "
                        + "\npharaoh of Egypt.");
                break;
            case 3: 
                console.println("To view the Map, simply select the View Map option"
                        + "\nunder the Game Menu. It will be option 2."
                        + "\nFrom there, you may select to view specific coordinates"
                        + "\nor you might return to the main menu.");
                break;
            case 4:
                console.println("Under the Game Menu select option 3 to move to a "
                        + "\nnew location.");
                break;
            case 5:
                console.println("There are currently no tools or inventory implemented."
                        + "\nPlease stay tuned as it will be implemented Soon™.");
                break;
            case 6:
                console.println("Returning to previous Menu.");
                break;
            default:
                //console.println("Invalid Selection. Please try again");
                ErrorView.display("HelpMenuView", "Invalid selection. Please try again.");
                break;
        }
        return option;
    }
    
}