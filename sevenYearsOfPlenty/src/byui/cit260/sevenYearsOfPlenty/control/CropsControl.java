/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sevenYearsOfPlenty.control;

import java.util.Random;
import byui.cit260.sevenYearsOfPlenty.model.Crops;
import java.io.IOException;
import static java.lang.Math.random;
import static jdk.nashorn.internal.codegen.OptimisticTypesPersistence.store;
import java.util.Scanner;
/**
 *
 * @author The Whopper
 */
// buyLand method
    // Purpose: Buy land - adds to acres owned
    // Parameters: The game object and the number of acres to buy
    // Pre-conditions: 0 < toBuy and wheatInStore > buy * landPrice
    // Returns: amount of wheat in store after buying the land

public class CropsControl {
    
    private static final int LAND_BASE = 17;
    private static final int LAND_RANGE = 10;
    
    private static Random random = new Random();
    
    public static int calcLandCost(){
        int landPrice = random.nextInt(LAND_RANGE) + LAND_BASE;
        return landPrice;
    }
    
    public int buyLand(Crops theCrops, int toBuy, int landCost){ 
    if(toBuy < 0)
              return -1;
        
         //if (acresToBuy x landPrice) > wheatInStore, return -1
        int wheat = theCrops.getWheatInStore();
        if(wheat < toBuy * landCost)
            return -1;
    //acresOwned = acresOwned + acresToBuy
        int acres = theCrops.getAcres();
        acres += toBuy;
        theCrops.setAcres(acres);

                //wheatInStore = wheatInStore – (acresToBuy x landPrice)
        wheat -= (toBuy * landCost);
        theCrops.setWheatInStore(wheat);

        //return wheatInStore
        return wheat;}
    
     public static double calcHarvest(double acresPlanted, double store){
        double harvest = (new Random().nextInt(5) + 1) * acresPlanted;
        if (new Random().nextInt(2) > 0.5) {
        double rats = harvest * (new Random().nextInt(6) + 85) / 100;
        System.out.println("Rats ate " + rats + " grain.");
        harvest = harvest - rats;
        }
    harvest = calcPharaohsShare(harvest);
    store = store + harvest;
    System.out.println("You have " + store + " in store." );
    return store;
} 
    
     // calcPharaohsShare method
    // Purpose: Calculate Pharaoh's share - subtract from wheat harvested
    // Parameters: The amount of wheat harvested
    // Pre-conditions: harvest >= 0
    // Returns: amount of wheat harvested after removing pharaoh's share
       public static double calcPharaohsShare(double harvest){
      //if harvest < 0, return -1
      if (harvest < 0)
         return -1;

      //pharaohShare = harvest x .08
      double pharaohShare = harvest * .08;

      //harvest = harvest - pharaohShare
      harvest = harvest - pharaohShare;

      //return pharaohShare
      return harvest;
    }  
    
  public static double calcFed(double store) {
double fed = -1;
Scanner scanner = new Scanner (System.in);
do {
     System.out.println("You have " + store + " grain stored. How much do you want to feed?");
        fed = scanner.nextDouble();
        } while ((fed < 0) || (fed > store));
 scanner.close();
 return fed;
} 
}
          

