/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dip.lab2.student.solution1;

import dip.lab2.student.solution1.BaggageServiceTipCalculator.ServiceQuality;
/**
 *
 * @author neilkenney
 */
public class StartUp {
    

    public static void main(String[] args) {
        
        
        
        TipStructure tip1 = new BaggageServiceTipCalculator(ServiceQuality.GOOD,4);
        
        
        TipStructure [] tips = {tip1};
        RetrieveTip rt = new RetrieveTip();
        
        for(int i = 0; i < tips.length; i++){
            System.out.println("The tip should be " + rt.getTotalTip(tips[i]));
        }
        
        
        
    }

    }

    
        
    

    