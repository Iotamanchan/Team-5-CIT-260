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
    
    private int rowCount = 5;
    private int colCount = 5;
    private Location[][] locations;
    
    public Map(){
        
    }
    public Map(int row, int col){
        row = rowCount;
        col = colCount;
   
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
    
    public void setColCount(int colCount){
        this.colCount = colCount;
    }

    public int rowCount() {
        return rowCount;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.rowCount;
        hash = 29 * hash + this.colCount;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Map other = (Map) obj;
        if (this.rowCount != other.rowCount) {
            return false;
        }
        if (this.colCount != other.colCount) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", colCount=" + colCount + '}';
    }

    public Location[][] getLocations() {
        return locations;
    }
   
    }
