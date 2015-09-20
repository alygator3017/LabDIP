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
public class FoodServiceTipCalculator implements TipCalculator{

    private static final double MIN_BILL = 0.00;
    private static final String BILL_ENTRY_ERR =
            "Error: bill must be greater than or equal to " + MIN_BILL;

    private double bill;
    
    public FoodServiceTipCalculator(ServiceQuality q, double billAmt) {
        this.setServiceRating(q);
        this.setBill(billAmt);
    }
    
    @Override
    public void setServiceRating(ServiceQuality q) {
        
    }

    @Override
    public ServiceQuality getServiceQuality() {
        
    }
    
    public void setBill(double billAmt){
        if(billAmt < MIN_BILL){
            throw new IllegalArgumentException(BILL_ENTRY_ERR);
        }
        bill = billAmt;
    }

    @Override
    public double getTip() {
        
    }
   
    
}
