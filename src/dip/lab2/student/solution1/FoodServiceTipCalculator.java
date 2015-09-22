/*
 */
package dip.lab2.student.solution1;

/**
 *
 * @author Alyson
 */
public class FoodServiceTipCalculator implements TipCalculator {

    private double minBill = 0.00;
//    private static final String BILL_ENTRY_ERR
//            = "Error: bill must be greater than or equal to " + minBill;
    private double goodRate = 0.20;
    private double fairRate = 0.15;
    private double poorRate = 0.10;
    private double bill;

    private double tip;

    private ServiceQuality serviceQuality;

    public FoodServiceTipCalculator(ServiceQuality q, double billAmt) {
        this.setServiceRating(q);
        this.setBill(billAmt);
    }


    @Override
    public final void setServiceRating(ServiceQuality q) {
        serviceQuality = q;
    }

    @Override
    public final ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

    public final void setBill(double billAmt) {
        if (billAmt < minBill) {
            throw new IllegalArgumentException("Error");
        }
        bill = billAmt;
    }

    @Override
    public final double getTip() {
        switch (serviceQuality) {
            case POOR:
                tip = bill * poorRate;
                break;
            case FAIR:
                tip = bill * fairRate;
                break;
            case GOOD:
                tip = bill * goodRate;
                break;
        }
        return tip;
    }
    
    
    public final double getMinBill() {
        return minBill;
    }

    public final void setMinBill(double minBill) {
        this.minBill = minBill;
    }

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

    public final void setPoorRate(double poorRate) {
        this.poorRate = poorRate;
    }

}
