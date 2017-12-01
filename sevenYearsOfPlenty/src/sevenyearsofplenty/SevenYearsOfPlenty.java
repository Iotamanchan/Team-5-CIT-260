package sevenyearsofplenty;


import byui.cit260.sevenYearsOfPlenty.model.Crops;
import byui.cit260.sevenYearsOfPlenty.model.Location;
import byui.cit260.sevenYearsOfPlenty.model.Player;
import byui.cit260.sevenYearsOfPlenty.model.Map;
import byui.cit260.sevenYearsOfPlenty.model.Inventory;
import byui.cit260.sevenYearsOfPlenty.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ruben
 */
public class SevenYearsOfPlenty {

    /**
     * @param args the command line arguments
     */
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;
    
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Bryan");
        
        String playerOneName = playerOne.getName();
        
        System.out.println(playerOne.toString());
        
        Crops crops = new Crops();
        
        crops.setYear(1);
        
        int cropsYear = crops.getYear();
        
        System.out.println(crops.toString());
        
        Location location = new Location();
        
        location.setRow(1);
        
        int locationRow = location.getRow();
        
        System.out.println(location.toString());
        
        Map map = new Map();
        
        map.setRowCount(1);
        
        int mapRowCount = map.rowCount();
        
        System.out.println(map.toString());
        
        Inventory inventory = new Inventory();
        
        inventory.setQuantity(1);
        
//        int inventoryQuantity = inventory.quantity();
        
        System.out.println(inventory.toString());
        
        //riley edits
        try{
            //Open character Stream files for end user I/O
            SevenYearsOfPlenty.inFile = new BufferedReader(new InputStreamReader(System.in));
            SevenYearsOfPlenty.outFile = new PrintWriter(System.out, true);
            //Open Log File
            String filePath = "log.txt";
            SevenYearsOfPlenty.logFile = new PrintWriter(filePath);
            //Start the program
            StartProgramView startProgramView = new StartProgramView();
            startProgramView.displayStartProgramView();
       
        }catch (Throwable e){
            System.out.println("Exception: " + e.toString() + 
                                "\nCause: " + e.getCause() +
                                "\nMessage: " + e.getMessage());
            e.printStackTrace();
        }
        
        finally {
            try {
                
                if (SevenYearsOfPlenty.inFile != null)
                    SevenYearsOfPlenty.inFile.close();
                
                if (SevenYearsOfPlenty.outFile != null)
                    SevenYearsOfPlenty.outFile.close();
                
                if (SevenYearsOfPlenty.logFile != null)
                    SevenYearsOfPlenty.logFile.close();
                
            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }
            
        }
        
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        SevenYearsOfPlenty.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        SevenYearsOfPlenty.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        SevenYearsOfPlenty.logFile = logFile;
    }
    
}
