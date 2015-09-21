/*
 */
package dip.lab2.student.solution1;

/**
 *
 * @author Alyson
 */
public class BaggageServiceTipCalculator implements TipCalculator{

//    private double minBill = 0.00;
//    private double maxBill = 100.00;
//    private static final String BILL_ENTRY_ERR =
//            "Error: bill must be between " + minBill + " and " + maxBill ;
    private double goodRate = 0.20;
    private double fairRate = 0.15;
    private double poorRate = 0.10;
    private final double baseTipPerBag;
    private int bagCount;
    private double tip;
    
    private ServiceQuality serviceQuality;
    
    public BaggageServiceTipCalculator(TipCalculator.ServiceQuality q, int bags){
        this.setServiceRating(q);
        this.setBagCount(bags);
        
        baseTipPerBag = 1.00;
    }
    
    @Override
    public final void setServiceRating(TipCalculator.ServiceQuality q) {
        serviceQuality = q;
    }

    @Override
    public final TipCalculator.ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

    @Override
    public final double getTip() {
        switch (serviceQuality) {
            case POOR:
                tip = baseTipPerBag * bagCount * (1 + poorRate);
                break;
            case FAIR:
                tip = baseTipPerBag * bagCount * (1 + fairRate);
                break;
            case GOOD:
                tip = baseTipPerBag * bagCount * (1 + goodRate);
                break;    
        }
        return tip;
    }

    //helper?
    private final void setBagCount(int bagCount) {
        if(bagCount < 0){
            throw new IllegalArgumentException(
            "Bag must be greater than or equal to zero");
        }
        this.bagCount = bagCount;
    }

//    public double getMinBill() {
//        return minBill;
//    }
//
//    public void setMinBill(double minBill) {
//        this.minBill = minBill;
//    }
//
//    public double getMaxBill() {
//        return maxBill;
//    }
//
//    public void setMaxBill(double maxBill) {
//        this.maxBill = maxBill;
//    }

    public final double getGoodRate() {
        return goodRate;
    }

    public final void setGoodRate(double goodRate) {
        this.goodRate = goodRate;
    }

    public final double getFairRate() {
        return fairRate;
    }

    public final void setFairRate(double fairRate) {
        this.fairRate = fairRate;
    }

    public final double getPoorRate() {
        return poorRate;
    }

    public void setPoorRate(double poorRate) {
        this.poorRate = poorRate;
    }
    
}
