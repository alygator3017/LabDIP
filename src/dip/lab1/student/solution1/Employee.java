/*
 * 
 */
package dip.lab1.student.solution1;

/**
 *
 * @author Alyson
 */
public interface Employee {

    /**
     * getter and setter for salaries of employees. In this case the employee
     * can have either an annual salary or an hourly salary, which is why I went
     * with the word salary to represent both lower level classes
     *
     * @param salary double 
     */
    public abstract void setSalary(double salary);

    /**
     * 
     * @return salary
     */
    public abstract double getSalary();

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
