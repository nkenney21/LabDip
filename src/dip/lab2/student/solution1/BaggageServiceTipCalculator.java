/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dip.lab2.student.solution1;

/**
 *
 * @author neilkenney
 */
public final class BaggageServiceTipCalculator implements TipStructure{
    private static final double MIN_BILL = 0.00;
    private static final double MAX_BILL = 100.00;
    private static final String BILL_ENTRY_ERR =
            "Error: bill must be between " + MIN_BILL + " and "
            + MAX_BILL;
    private static final double GOOD_RATE = 0.20;
    private static final double FAIR_RATE = 0.15;
    private static final double POOR_RATE = 0.10;

    private double baseTipPerBag;
    private int bagCount;
    
    public enum ServiceQuality {
        GOOD, FAIR, POOR
    }
    
    private ServiceQuality serviceQuality;
    
    public BaggageServiceTipCalculator(ServiceQuality q, int bags) {
        setServiceQuality(q);
        setBagCount(bags);

        baseTipPerBag = 1.00; // set default value
    }
    
    public BaggageServiceTipCalculator(ServiceQuality q, int bags, double baseTip) {
        setServiceQuality(q);
        setBagCount(bags);
        setBaseTipPerBag(baseTip);
    }

    public final double getBaseTipPerBag() {
        return baseTipPerBag;
    }

    public final void setBaseTipPerBag(double baseTipPerBag) {
        if(baseTipPerBag < 0) {
            throw new IllegalArgumentException(
                    "error: base tip must be greater than or equal to zero");
        }
        this.baseTipPerBag = baseTipPerBag;
    }

    public final int getBagCount() {
        return bagCount;
    }

    public final void setBagCount(int bagCount) {
        if(bagCount < 0) {
            throw new IllegalArgumentException(
                    "bag count must be greater than or equal to zero");
        }
        this.bagCount = bagCount;
    }

    public final ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

    public final void setServiceQuality(ServiceQuality q) {
        
        serviceQuality = q;
    }
    
    
    

    @Override
    public double getTip() {
        double tip = 0.00; // always initialize local variables

        switch(serviceQuality) {
            case GOOD:
                tip = baseTipPerBag * bagCount * (1 + GOOD_RATE);
                break;
            case FAIR:
                tip = baseTipPerBag * bagCount * (1 + FAIR_RATE);
                break;
            case POOR:
                tip = baseTipPerBag * bagCount * (1 + POOR_RATE);
                break;
        }

        return tip;
    }
    
}
