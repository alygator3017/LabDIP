/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

import dip.lab2.student.solution1.TipCalculator.ServiceQuality;
import java.text.NumberFormat;

/**
 *
 * @author Alyson
 */
public class StartUp {

    public static void main(String[] args) {
        Tip tip = new Tip();

        // Just utility code to format numbers nice. -copied this from 
        //the example code if you didn't mind.
        NumberFormat nf = NumberFormat.getCurrencyInstance();

        TipCalculator fsTip = new FoodServiceTipCalculator(ServiceQuality.GOOD, 32.56);
        TipCalculator bsTip = new BaggageServiceTipCalculator(ServiceQuality.POOR, 5);

        System.out.println(nf.format(fsTip.getTip()));
        System.out.println(nf.format(bsTip.getTip()));

        //using array to grab tips
        TipCalculator[] tips = {
            new FoodServiceTipCalculator(ServiceQuality.FAIR, 89.99),
            new BaggageServiceTipCalculator(ServiceQuality.GOOD, 2)
        };
        
        for(TipCalculator t : tips){
            System.out.println(nf.format(t.getTip()));
        }
    }
}
