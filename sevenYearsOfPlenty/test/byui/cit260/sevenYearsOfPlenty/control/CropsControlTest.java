/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sevenYearsOfPlenty.control;

import byui.cit260.sevenYearsOfPlenty.model.Crops;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author The Whopper
 */
public class CropsControlTest {
    
    public CropsControlTest() {
    }

    /**
     * Test of buyLand method, of class CropsControl.
     */
    @Test
        public void testBuyLand1()
    {
        System.out.println("** buyLand test case 1 **");
        Crops theCrops = new Crops();
        theCrops.setWheatInStore(2800);
        theCrops.setAcres(0);

        int toBuy = 10;
        int landCost = 20;
        CropsControl instance = new CropsControl();
        int expResult = 2600;
        int result = instance.buyLand(theCrops, toBuy, landCost);
        assertEquals(expResult, result);

    }
    
}
