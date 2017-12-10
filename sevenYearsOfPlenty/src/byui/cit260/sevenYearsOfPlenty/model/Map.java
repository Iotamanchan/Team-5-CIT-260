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
        

        String description1 = "Pharaoh's Court";
        String description2 = "Pharaoh's Granary and Storehouse";
        String description3 = "Wheat Field";
        String description4 = "Corn Field";
        String description5 = "Barley Field";
        String description6 = "Undeveloped Land";
        String description7 = "Desert";
        String description8 = "Village";
        String description9 = "Cattle Field";
        String description10 = "Stables";
        String description11 = "Livestock Pastures";
        String description12 = "Pig Sty";
        String description13 = "Tool Workshop";
        String description14 = "Nile River";
        String description15= "Joseph's Office";
        String description16 = "Overseer's Office";
        String description17 = "Overseer's Home";
        String description18 = "Pyramids of Giza";
        String description19 = "King's Treasury";
        String description20 = "Marshes";
        String description21 = "Library";
        String description22 = "Temple";
        String description23 = "Jeweler's Shop";
        String description24 = "Armory";
        String description25 = "Pest Control Shop";

        
        locations[0][0] = new Location();
        locations[0][0].setDescription(description1);
        locations[0][0].setSymbol("CORT");
        locations[0][1] = new Location();
        locations[0][1].setDescription(description2);
        locations[0][1].setSymbol("STRG");
        locations[0][2] = new Location();
        locations[0][2].setDescription(description3);
        locations[0][2].setSymbol("WHEAT");
        locations[0][3] = new Location();
        locations[0][3].setDescription(description4);
        locations[0][3].setSymbol("CORN");
        locations[0][4] = new Location();
        locations[0][4].setDescription(description5);
        locations[0][4].setSymbol("BARLEY");
        locations[1][0] = new Location();
        locations[1][0].setDescription(description6);
        locations[1][0].setSymbol("LAND");
        locations[1][1] = new Location();
        locations[1][1].setDescription(description7);
        locations[1][1].setSymbol("DSRT");
        locations[1][2] = new Location();
        locations[1][2].setDescription(description8);
        locations[1][2].setSymbol("VLLG");
        locations[1][3] = new Location();
        locations[1][3].setDescription(description9);
        locations[1][3].setSymbol("CTTL");
        locations[1][4] = new Location();
        locations[1][4].setDescription(description10);
        locations[1][4].setSymbol("STBLS");
        locations[2][0] = new Location();
        locations[2][0].setDescription(description11);
        locations[2][0].setSymbol("FIELD");
        locations[2][1] = new Location();
        locations[2][1].setDescription(description12);
        locations[2][1].setSymbol("PIGS");
        locations[2][2] = new Location();
        locations[2][2].setDescription(description13);
        locations[2][2].setSymbol("TOOLS");
        locations[2][3] = new Location();
        locations[2][3].setDescription(description14);
        locations[2][3].setSymbol("NILE");
        locations[2][4] = new Location();
        locations[2][4].setDescription(description15);
        locations[2][4].setSymbol("JSPH");
        locations[3][0] = new Location();
        locations[3][0].setDescription(description16);
        locations[3][0].setSymbol("OVRSR");
        locations[3][1] = new Location();
        locations[3][1].setDescription(description17);
        locations[3][1].setSymbol("OVRSR");
        locations[3][2] = new Location();
        locations[3][2].setDescription(description18);
        locations[3][2].setSymbol("PRMDS");
        locations[3][3] = new Location();
        locations[3][3].setDescription(description19);
        locations[3][3].setSymbol("TRSUR");
        locations[3][4] = new Location();
        locations[3][4].setDescription(description20);
        locations[3][4].setSymbol("MARSH");
        locations[4][0] = new Location();
        locations[4][0].setDescription(description21);
        locations[4][0].setSymbol("LIBRY");
        locations[4][1] = new Location();
        locations[4][1].setDescription(description22);
        locations[4][1].setSymbol("TMPLE");
        locations[4][2] = new Location();
        locations[4][2].setDescription(description23);
        locations[4][2].setSymbol("JEWEL");
        locations[4][3] = new Location();
        locations[4][3].setDescription(description24);
        locations[4][3].setSymbol("ARMRY");
        locations[4][4] = new Location();
        locations[4][4].setDescription(description25);
        locations[4][4].setSymbol("PSTCO");
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