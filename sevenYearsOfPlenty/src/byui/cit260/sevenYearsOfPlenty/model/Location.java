/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sevenYearsOfPlenty.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author The Whopper
 */
public class Location implements Serializable{
    
    //class instance variable
    private int row;
    private int colummn;
    private String description;
    private String symbol;
    

    public Location() {
    }

    
    
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColummn() {
        return colummn;
    }

    public void setColummn(int colummn) {
        this.colummn = colummn;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.row;
        hash = 37 * hash + this.colummn;
        hash = 37 * hash + Objects.hashCode(this.description);
        hash = 37 * hash + Objects.hashCode(this.symbol);
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
        final Location other = (Location) obj;
        if (this.row != other.row) {
            return false;
        }
        if (this.colummn != other.colummn) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.symbol, other.symbol)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", colummn=" + colummn + ", description=" + description + ", symbol=" + symbol + '}';
    }
    
    
    
}
