/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sevenYearsOfPlenty.view;

import byui.cit260.seveYearsOfPlenty.exceptions.CropsControlException;
import byui.cit260.sevenYearsOfPlenty.control.CropsControl;
import byui.cit260.sevenYearsOfPlenty.model.Crops;
import byui.cit260.sevenYearsOfPlenty.model.Game;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import sevenyearsofplenty.SevenYearsOfPlenty;
import java.io.FileWriter;
import java.util.InputMismatchException;

/**
 *
 * @author Ruben
 */
public class CropsView {
    private static final Scanner keyboard = new Scanner(System.in);
    protected final static BufferedReader keyboard1 = SevenYearsOfPlenty.getInFile();
    protected final static PrintWriter console = SevenYearsOfPlenty.getOutFile();
    
    private static Game theGame = Game.getGame();
    private static Crops theCrop = Game.getCrop();
     
    
    public static void buyLandView()
            
{
    boolean fail;
     int toBuy = 0;
     int price = CropsControl.calcLandCost();
     //System.out.format("Land is selling for %d bushels per acre.%n",price);
     int wheat = theCrop.getWheatInStore(); 
     console.println("There is  " + wheat + " wheat in store.");
     int population = theCrop.getPopulation();
     console.println("The population is " + population + " people."); 
     
     console.println("Land is selling for " + price + " per acre.");
     console.println("\nHow many acres of land do you wish to buy?");  
     
    do
    {
        fail = false;
       //toBuy = keyboard.nextInt();
       try{
           while(!keyboard.hasNextInt()){
               console.println("There's been an error. Only numbers are accepted."
                       + "\nPlease try again.");
               keyboard.next();
           }
           toBuy = keyboard.nextInt();
           CropsControl.buyLand(theCrop, toBuy, price);
       }
       catch(CropsControlException e){
           //System.out.println("I am sorry master, I cannot do this.");
           //System.out.println(e.getMessage());
           ErrorView.display("CropsView", "Error reading input: " + e.getMessage());
           fail = true;
       }catch(InputMismatchException ime){
           ErrorView.display("CropsView", "Error reading input:" + ime.getMessage());
       }
       //if(toBuy < 0)
       //{
       //      System.out.println("I am sorry master, I cannot do this.");
       //      //System.out.println("You cannot buy a negative amount of land.");
       // }
       // else if(toBuy * price > wheat)
       // {
       //       System.out.println("I am sorry master, I cannot do this.");
       //       //System.out.println("You do not have enough wheat to buy this much land.");
      //   }
    } while(fail);
        //try {
       //     CropsControl.buyLand(theCrop, toBuy, price);
       // } catch (CropsControlException ex) {
        //    Logger.getLogger(CropsView.class.getName()).log(Level.SEVERE, null, ex);
       // }
}
    public String getInput() {
    Scanner keyboard = new Scanner(System.in);
    boolean valid = false;
    String selection = null;
    
    while (!valid) {
        selection = keyboard.nextLine();
        selection = selection.trim();
        
        if (selection.length() < 1) {
            //System.out.println("\n*** Invalid Selection *** Try again");
            ErrorView.display(this.getClass().getName(), "Error reading input");
            continue;
        }
        
        break;
    }
    
    return selection;
}
    
    
        public static void calcHarvest(){
            
            
        }
        
        public static void calcFed(){
            
        }
    
        public static void calcPharaohsShare(){
            
        }
    

        
       public static void calcWheatInStore()
           {

               try{
                   CropsControl.calcWheatInStore(theCrop, 0, 0, 0);//fill in these values
               }
               catch(CropsControlException e){
                   //System.out.println("Sorry not enough wheat.");
                   //System.out.println(e.getMessage());
                   ErrorView.display("CropsView", "Error reading input: " + e.getMessage());
               }
               

       }       


       
       
       
    public static void sellLandView() throws CropsControlException
    {
        boolean fail;
     int toSell = 0;
     int price = CropsControl.calcLandCost();
     //console.format("Land is selling for %d bushels per acre.%n",price);
     console.println("Land is selling for " + price + " per acre.");
     //int wheat = theCrop.getWheatInStore(); 
     //int population = theCrop.getPopulation();
     console.println("\nHow many acres of land do you wish to sell? "); 
    do
    {
        fail = false;
       
       try{
           while(!keyboard.hasNextInt()){
               console.println("There's been an error. Only numbers are accepted."
                       + "\nPlease try again.");
               keyboard.next();
           }
           toSell = keyboard.nextInt();
           CropsControl.sellLand(theCrop, toSell, price);
       }
       catch(CropsControlException e){
           ErrorView.display("CropsView", "Error reading input: " + e.getMessage());
           fail = true;
       }catch(InputMismatchException ime){
           ErrorView.display("CropsView", "Error reading input:" + ime.getMessage());
       }
      // if(toSell < 0)
      // {
      //       System.out.println("I am sorry master, I cannot do this.");
      //       System.out.println("You cannot buy a negative amount of land.");
      //  }
     //   else if(toSell * price > wheat)
     //   {
      //        System.out.println("I am sorry master, I cannot do this.");
     //         System.out.println("You do not have enough wheat to buy this much land.");
      //   }
      //NOTE: All of this code was redundant and I removed it. The method in the
      //CropsControl already managed all of this.
      
    } while(fail);
    


}//Riley Hein
    
    public static void createCrops() throws Exception{
    FileWriter fw = new FileWriter("crops.txt");
    
    
        String census = "Year(" +  Game.getCrop().getYear() + ";\n" +
                        "Population(" +  Game.getCrop().getPopulation() + ";\n" +
                        "NewPeople(" +  Game.getCrop().getNewPeople() + ";\n" +
                        "CropYield(" +  Game.getCrop().getCropYield() + ";\n" +
                        "NumberWhoDied(" +  Game.getCrop().getNumberWhoDied() + ";\n" +
                        "PharaohsShare(" +  Game.getCrop().getPharaohsShare() + ";\n" +
                        "WheatInStore(" +  Game.getCrop().getWheatInStore() + ";\n" +
                        "Acres(" +  Game.getCrop().getAcres() + ";\n" +
                        "Harvest(" +  Game.getCrop().getHarvest() + ";\n" +
                        "Planted(" +  Game.getCrop().getPlanted() + ";\n" +
                        "Fed(" +  Game.getCrop().getFed() + ";";
    
    fw.write(census);
     
    System.out.println(census);
    
    fw.close();
}
    /*public static double fedView(){
        double fed = -1;
Scanner scanner = new Scanner (System.in);
        double store = 0;
do {
      
     System.out.println("You have " + store + " grain stored. How much do you want to feed?");
        fed = scanner.nextDouble();
        } while ((fed < 0) || (fed > store));
// scanner.close();
 return fed;
    }*/
   
//Author James
public static void ListAnimals() throws Exception {
    FileWriter fw = new FileWriter("animals.txt");

    fw.write("15 cows\n" + "23 oxen\n" + "29 pigs\n" + "38 chickens\n" + "84 Llama" );
    System.out.println("15 cows\n" + "23 oxen\n" + "29 pigs\n" + "38 chickens\n" + "84 Llama");
    fw.close();
}

} 
    
    
    
   


