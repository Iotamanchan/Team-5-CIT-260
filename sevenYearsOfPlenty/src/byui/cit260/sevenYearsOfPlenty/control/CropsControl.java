/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sevenYearsOfPlenty.control;

import java.util.Random;
import byui.cit260.sevenYearsOfPlenty.model.Crops;

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

}
          

