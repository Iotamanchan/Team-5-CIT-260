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
public class CropsControlException extends Exception{

    public CropsControlException() {
    }

    public CropsControlException(String message) {
        super(message);
    }

    public CropsControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public CropsControlException(Throwable cause) {
        super(cause);
    }

    public CropsControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
