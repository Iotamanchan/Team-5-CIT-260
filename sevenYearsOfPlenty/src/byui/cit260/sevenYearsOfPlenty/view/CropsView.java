/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sevenYearsOfPlenty.view;

import byui.cit260.sevenYearsOfPlenty.control.CropsControl;
import byui.cit260.sevenYearsOfPlenty.model.Crops;
import byui.cit260.sevenYearsOfPlenty.model.Game;
import java.util.Scanner;

/**
 *
 * @author Ruben
 */
public class CropsView {
    private static final Scanner keyboard = new Scanner(System.in);
    
    private static Game theGame = Game.getGame();
    private static Crops theCrop = Game.getCrop();
    
    public static void buyLandView()
{
     int toBuy = 0;
     int price = CropsControl.calcLandCost();
     System.out.format("Land is selling for %d bushels per acre.%n",price);

     int wheat = theCrop.getWheatInStore(); 
     int population = theCrop.getPopulation();
    do
    {
       System.out.print("\nHow many acres of land do you wish to buy? ");      
       toBuy = keyboard.nextInt();
       if(toBuy < 0)
       {
             System.out.println("I am sorry master, I cannot do this.");
             System.out.println("You cannot buy a negative amount of land.");
        }
        else if(toBuy * price > wheat)
        {
              System.out.println("I am sorry master, I cannot do this.");
              System.out.println("You do not have enough wheat to buy this much land.");
         }
    } while(toBuy < 0 || toBuy * price > wheat);
CropsControl.buyLand(theCrop, toBuy, price);
}
    public String getInput() {
    Scanner keyboard = new Scanner(System.in);
    boolean valid = false;
    String selection = null;
    
    while (!valid) {
        selection = keyboard.nextLine();
        selection = selection.trim();
        
        if (selection.length() < 1) {
            System.out.println("\n*** Invalid Selection *** Try again");
            continue;
        }
        
        break;
    }
    
    return selection;
}
    public static void sellLandView()
{
     int toSell = 0;
     int price = CropsControl.calcLandCost();
     System.out.format("Land is selling for %d bushels per acre.%n",price);

     int wheat = theCrop.getWheatInStore(); 
     int population = theCrop.getPopulation();
    do
    {
       System.out.print("\nHow many acres of land do you wish to sell? ");      
       toSell = keyboard.nextInt();
       if(toSell < 0)
       {
             System.out.println("I am sorry master, I cannot do this.");
             System.out.println("You cannot buy a negative amount of land.");
        }
        else if(toSell * price > wheat)
        {
              System.out.println("I am sorry master, I cannot do this.");
              System.out.println("You do not have enough wheat to buy this much land.");
         }
    } while(toSell < 0 || toSell * price > wheat);
CropsControl.sellLand(theCrop, toSell, price);
}
    public static double fedView(){
        double fed = -1;
Scanner scanner = new Scanner (System.in);
        double store = 0;
do {
      
     System.out.println("You have " + store + " grain stored. How much do you want to feed?");
        fed = scanner.nextDouble();
        } while ((fed < 0) || (fed > store));
 scanner.close();
 return fed;
    }
    
    }
    
   


