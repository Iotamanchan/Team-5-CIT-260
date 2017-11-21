package byui.cit260.seveYearsOfPlenty.exceptions;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rileyhein
 */
public class CropsControlExeption extends Exception{

    public CropsControlExeption() {
    }

    public CropsControlExeption(String message) {
        super(message);
    }

    public CropsControlExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public CropsControlExeption(Throwable cause) {
        super(cause);
    }

    public CropsControlExeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
