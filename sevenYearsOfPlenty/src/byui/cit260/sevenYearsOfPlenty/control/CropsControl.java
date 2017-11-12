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
    
    public static int buyLand(Crops theCrops, int toBuy, int landCost){ 
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
  

//Purpose:How many people starved in a year
//Parameter: current pop, fed
//Pre-condition: must have more harvest than population
//Returns: number of people who died
public static int calcNumberWhoDied(Crops theCrops, int fed){
    theCrops.getFed(); 
    int population = theCrops.getPopulation();
//currentPopulation - fed = numberWhoDied

        int numberWhoDied = population - fed;

        theCrops.setPopulation(population - numberWhoDied); 
//return number who died
    return theCrops.getPopulation();
}
    
  
//Purpose: calculate the number of people in the population who were born
//Parameter: current population, year
//Pre-conditions: currentPopulation > 1
//Returns: Number of new people born in a year
public static int calcNewPeople(Crops theCrops){
    int population = theCrops.getPopulation();
//if currentPopulation is < 1, return -1
    if(population < 1) {
        return -1;
        } else {

//calculate new people  
        int newPeople = random.nextInt(10) + 1;
        theCrops.setPopulation(newPeople + population);
        
//return the updated population
    return theCrops.getPopulation();
    }
  }


//Purpose: Calculate wheatInStore
//Parameter: Harvest, fed, pharaoh's share
//Pre-Conditions: harvest >= fed && pharaoh's share
//Returns: How much wheat was stored that year
public static int calcWheatInStore(Crops theCrops, int harvest, int fed, int pharaohsShare){
        int wheatInStore = theCrops.getWheatInStore();
//if harvest < fed || harvest - fed - pharoahsShare <= 0 return -1
    if(harvest < fed){
        return -1;
    }else if(harvest - fed - pharaohsShare <= 0){
        return -1;
    }else if(harvest - fed - pharaohsShare >= 1){
        
 //calculate the new amount of wheat in store
        theCrops.setWheatInStore (harvest - fed - pharaohsShare + wheatInStore);
    }
    return theCrops.getWheatInStore();
}


    public static void sellLand(Crops theCrop, int toSell, int price) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
          

