/*
 * StartUp class
 */
package dip.lab1.student.solution1;

import java.text.NumberFormat;

/**
 *
 * @author Alyson
 */
public class StartUp {

    public static void main(String[] args) {
        //accessing hr class
        HRService hr = new HRService();

        // Just utility code to format numbers nice. -copied this from 
        //the example code if you didn't mind.
        NumberFormat nf = NumberFormat.getCurrencyInstance();

        //option one for accessing- this limits some the the ability to tell
        //which employee is which though and call specficially, but will run
        //through all quickly
        Employee[] employees = {
            new HourlyEmployee(10.50, 2020),
            new SalariedEmployee(45000, 1250),
            new SalariedEmployee(90000, 0)
        };
        // i is for employee number just for printout currently
        int i = 1;
        for (Employee e : employees) {
            System.out.println("Employee " + i + "-");
            System.out.println("Annual Wage: " + nf.format(hr.getAnnualWageForEmployee(e)));
            i++;
        }


    }

}
