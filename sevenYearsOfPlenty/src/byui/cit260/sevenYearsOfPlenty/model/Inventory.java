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
 * @author rileyhein//rileyhein
 */
public class Inventory implements Serializable {
    
    private String description ;
    private int quantity;
    
    
    public Inventory(){
    }
        
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String name) {
        this.description = description;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public void setQuantity(int name) {
    this.quantity = quantity;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.description);
        hash = 31 * hash + this.quantity;
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
        final Inventory other = (Inventory) obj;
        if (this.quantity != other.quantity) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Inventory{" + "description=" + description + ", quantity=" + quantity + '}';
    }
/*
    public int quantity() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
*/
    
    }
     
    
    

