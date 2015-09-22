/**
 * 
 */
package dip.lab1.student.solution1;

/**
 *
 * @author Alyson
 */
public interface Employee {

    //getting and annual salary is specifically used for hourly employees
    //in the (bad) example, but could be used for both regardless. Since 
    //even though an salaried workers wages are annnual, getting the actual
    //annual wage for an hourly employee is important
    /**
     *
     * @return annualWage
     */
    public abstract double getAnnualWages();

}
