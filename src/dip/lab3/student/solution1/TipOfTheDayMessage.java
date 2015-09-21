/*
 */
package dip.lab3.student.solution1;

import java.util.Random;

/**
 *
 * @author Alyson
 */
public class TipOfTheDayMessage implements InputMessage {
    private static final String[] tips = {"Don't commit a crime while wearing a Fitbit.",
    "Tomatoes are fruit. They do not belong in fruit salad.", "One seventh"
            + " of your life is speant on monday.", "You never truly understand"
            + " something until you can explain it to your Grandmother.", 
    "Stay out of the fire."};
    
    @Override
    public String getMessage(){
        //get random tip
        int index = new Random().nextInt(tips.length);
        String ranTipOfDay = (tips[index]);
        //return random tip
        return ranTipOfDay;
    }
    
}
