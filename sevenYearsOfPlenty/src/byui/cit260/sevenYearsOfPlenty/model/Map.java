/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sevenYearsOfPlenty.model;

import java.io.Serializable;

/**
 *
 * @author rileyhein//riley hein
 */
public class Map implements Serializable {

    
    private int rowCount;
    private int colCount;
    private int mapIndex;
    private Location[][] locations;
    //private ArrayList<Location> locations = new ArrayList<Location>();

    public Map(){
        
    }

    public Map(int row, int column) {
        locations = new Location[row][column];
        //Location location = new Location();
        //locations[][] = new Location;
        
        String description = "Describing map locations";
        
        locations[0][0] = new Location();
        locations[0][0].setDescription(description);
        locations[0][0].setSymbol("DESCR");
        locations[0][1] = new Location();
        locations[0][1].setDescription(description);
        locations[0][1].setSymbol("DESCR");
        locations[0][2] = new Location();
        locations[0][2].setDescription(description);
        locations[0][2].setSymbol("DESCR");
        locations[0][3] = new Location();
        locations[0][3].setDescription(description);
        locations[0][3].setSymbol("DESCR");
        locations[0][4] = new Location();
        locations[0][4].setDescription(description);
        locations[0][4].setSymbol("DESCR");
        locations[1][0] = new Location();
        locations[1][0].setDescription(description);
        locations[1][0].setSymbol("DESCR");
        locations[1][1] = new Location();
        locations[1][1].setDescription(description);
        locations[1][1].setSymbol("DESCR");
        locations[1][2] = new Location();
        locations[1][2].setDescription(description);
        locations[1][2].setSymbol("DESCR");
        locations[1][3] = new Location();
        locations[1][3].setDescription(description);
        locations[1][3].setSymbol("DESCR");
        locations[1][4] = new Location();
        locations[1][4].setDescription(description);
        locations[1][4].setSymbol("DESCR");
        locations[2][0] = new Location();
        locations[2][0].setDescription(description);
        locations[2][0].setSymbol("DESCR");
        locations[2][1] = new Location();
        locations[2][1].setDescription(description);
        locations[2][1].setSymbol("DESCR");
        locations[2][2] = new Location();
        locations[2][2].setDescription(description);
        locations[2][2].setSymbol("DESCR");
        locations[2][3] = new Location();
        locations[2][3].setDescription(description);
        locations[2][3].setSymbol("DESCR");
        locations[2][4] = new Location();
        locations[2][4].setDescription(description);
        locations[2][4].setSymbol("DESCR");
        locations[3][0] = new Location();
        locations[3][0].setDescription(description);
        locations[3][0].setSymbol("DESCR");
        locations[3][1] = new Location();
        locations[3][1].setDescription(description);
        locations[3][1].setSymbol("DESCR");
        locations[3][2] = new Location();
        locations[3][2].setDescription(description);
        locations[3][2].setSymbol("DESCR");
        locations[3][3] = new Location();
        locations[3][3].setDescription(description);
        locations[3][3].setSymbol("DESCR");
        locations[3][4] = new Location();
        locations[3][4].setDescription(description);
        locations[3][4].setSymbol("DESCR");
        locations[4][0] = new Location();
        locations[4][0].setDescription(description);
        locations[4][0].setSymbol("DESCR");
        locations[4][1] = new Location();
        locations[4][1].setDescription(description);
        locations[4][1].setSymbol("DESCR");
        locations[4][2] = new Location();
        locations[4][2].setDescription(description);
        locations[4][2].setSymbol("DESCR");
        locations[4][3] = new Location();
        locations[4][3].setDescription(description);
        locations[4][3].setSymbol("DESCR");
        locations[4][4] = new Location();
        locations[4][4].setDescription(description);
        locations[4][4].setSymbol("DESCR");
    }
 
    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }
   

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getColCount() {
        return colCount;
    }

    public void setColCount(int colCount) {
        this.colCount = colCount;
    }

    public int getMapIndex() {
        return mapIndex;
    }

    public void setMapIndex(int mapIndex) {
        this.mapIndex = mapIndex;
    }
}