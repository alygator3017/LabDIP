/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 *
 * @author Alyson
 */
public interface TipCalculator {
    public enum ServiceQuality {
        GOOD(0.20), FAIR(0.15), POOR(0.10);
        
        private final double value;
        
        private ServiceQuality(double value){
            this.value = value;
        }
        
        public double getValue(){
            return value;
        }
        
        
    }
    //service
    public abstract void setServiceRating(ServiceQuality q);
    public abstract ServiceQuality getServiceQuality();
    //getTip
    public abstract double getTip();
    
    
    
}
