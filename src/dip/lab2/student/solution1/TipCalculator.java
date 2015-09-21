/*
 *Interface for a Tip Calculator
 */
package dip.lab2.student.solution1;

/**
 *
 * @author Alyson
 */
public interface TipCalculator {

    /**
     * Enum for ServiceQuality, provides the basic tip rates for the different 
     * ratings.
     */
    public enum ServiceQuality {
        GOOD, FAIR, POOR;        
    }
    
    /**
     * abstract setServiceRating method
     * @param q serviceQuality to be passed
     * 
     */
    public abstract void setServiceRating(ServiceQuality q);

    /**
     * abstract getServiceQuality method
     * @return
     */
    public abstract ServiceQuality getServiceQuality();
    
    /**
     *
     * @return
     */
    public abstract double getTip();
    
    
    
}
