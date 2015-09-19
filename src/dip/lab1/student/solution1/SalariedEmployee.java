/*
 * 
 */
package dip.lab1.student.solution1;

/**
 *
 * @author Alyson
 */
public final class SalariedEmployee implements Employee{
    private double annualBonus;
    private double annualSalary;
    private double annualWage;

    //constructor
    public SalariedEmployee(double salary, double bonus){
        setSalary(salary);
        setAnnualBonus(bonus);
        
    }
    @Override
    public void setSalary(double salary) {
        this.annualSalary = salary;
    }

    @Override
    public double getSalary() {
        return annualSalary;
    }

    @Override
    public double getAnnualWages() {
        annualWage = annualSalary + annualBonus;
        return annualWage;
    }
    
    //Annual bonus setter?
    public final void setAnnualBonus(double annualBonus){
        this.annualBonus = annualBonus;
    }
    
    //annual bonus getter?
    public double getAnnualBonus(){
        return annualBonus;
    }
}
