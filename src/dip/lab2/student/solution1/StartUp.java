

package dip.lab2.student.solution1;

import dip.lab2.student.solution1.BaggageServiceTipCalculator.ServiceQuality;
/**
 *
 * @author neilkenney
 */
public class StartUp {
    

    public static void main(String[] args) {
        
        
        
        TipCalculator tip1 = new BaggageServiceTipCalculator(ServiceQuality.GOOD,4);
        
        
        TipCalculator [] tips = {tip1};
        RetrieveTip rt = new RetrieveTip();
        
        for(int i = 0; i < tips.length; i++){
            System.out.println("The tip should be " + rt.getTotalTip(tips[i]));
        }
        
        
        
    }

    }

    
        
    

    