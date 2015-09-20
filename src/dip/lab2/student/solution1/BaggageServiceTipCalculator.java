/*
 */
package dip.lab2.student.solution1;

/**
 *
 * @author Alyson
 */
public class BaggageServiceTipCalculator implements TipCalculator{

    private static final double MIN_BILL = 0.00;
    private static final double MAX_BILL = 100.00;
    private static final String BILL_ENTRY_ERR =
            "Error: bill must be between " + MIN_BILL + " and " + MAX_BILL ;
    
    private final double baseTipPerBag;
    private int bagCount;
    private double tip;
    
    private ServiceQuality serviceQuality;
    
    public BaggageServiceTipCalculator(ServiceQuality q, int bags){
        this.setServiceRating(q);
        this.setBagCount(bags);
        
        baseTipPerBag = 1.00;
    }
    
    @Override
    public final void setServiceRating(ServiceQuality q) {
        serviceQuality = q;
    }

    @Override
    public ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

    @Override
    public double getTip() {
        switch (serviceQuality) {
            case POOR:
                tip = baseTipPerBag * bagCount * (1 + serviceQuality.getValue());
                break;
            case FAIR:
                tip = baseTipPerBag * bagCount * (1 + serviceQuality.getValue());
                break;
            case GOOD:
                tip = baseTipPerBag * bagCount * (1 + serviceQuality.getValue());
                break;    
        }
        return tip;
    }

    private void setBagCount(int bagCount) {
        if(bagCount < 0){
            throw new IllegalArgumentException(
            "Bag must be greater than or equal to zero");
        }
        this.bagCount = bagCount;
    }
    
}
