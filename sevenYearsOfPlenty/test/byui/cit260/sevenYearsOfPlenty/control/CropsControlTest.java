/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sevenYearsOfPlenty.control;

import byui.cit260.seveYearsOfPlenty.exceptions.CropsControlException;
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
        public void testBuyLand1() throws CropsControlException
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

    /**
     * Test of calcLandCost method, of class CropsControl.
     */
    @Test
    public void testCalcLandCost() {
        System.out.println("calcLandCost");
        int expResult = 0;
        int result = CropsControl.calcLandCost();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buyLand method, of class CropsControl.
     */
    @Test
    public void testBuyLand() throws CropsControlException {
        System.out.println("buyLand");
        Crops theCrops = null;
        int toBuy = 0;
        int landCost = 0;
        CropsControl instance = new CropsControl();
        int expResult = 0;
        int result = instance.buyLand(theCrops, toBuy, landCost);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcHarvest method, of class CropsControl.
     */
    @Test
    public void testCalcHarvest() throws CropsControlException {
        System.out.println("calcHarvest");
        double acresPlanted = 0.0;
        double store = 0.0;
        double expResult = 0.0;
        double result = CropsControl.calcHarvest(acresPlanted, store);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcPharaohsShare method, of class CropsControl.
     */
    @Test
     public void testCalcPharaohsShare() throws CropsControlException {
        System.out.println("calcPharaohsShare");
        double harvest = 1;
        double expResult = 0.92;
        double result = CropsControl.calcPharaohsShare(harvest);
        assertEquals(expResult, result, 0.0);
    harvest = 0;
    expResult = 0;
        result = CropsControl.calcPharaohsShare(harvest);
        assertEquals(expResult, result, 0.0);
    harvest = -4;
    expResult = -1;
        result = CropsControl.calcPharaohsShare(harvest);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of calcFed method, of class CropsControl.
     */
    @Test
    public void testCalcFed() throws CropsControlException {
        System.out.println("calcFed");
        double store = 0.0;
        double expResult = 0.0;
        double result = CropsControl.calcFed(store);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
