/*
 * 
 */
package dip.lab1.student.solution1;

/**
 *
 * @author Alyson
 */
public class HourlyEmployee implements Employee {
    private double annualHours;
    private double hourlyRate;
    private double annualWages;
    
    //constructor
    public HourlyEmployee(double salary, double totalAnnualHours){
        setSalary(salary);
        setTotalAnnualHours(totalAnnualHours);
    }

    @Override
    public final void setSalary(double salary) {
        this.hourlyRate = salary;
    }

    @Override
    public final double getSalary() {
        return hourlyRate;
    }

    @Override
    public final double getAnnualWages() {
        annualWages = hourlyRate*annualHours;
        return annualWages;
    }
    
    //annual hours setter
    private final void setTotalAnnualHours(double totalAnnualHours) {
        this.annualHours = totalAnnualHours;
    }
    
    //annual hours getter
    private final double getTotalAnnualHours(){
        return annualHours;
    }
    
    
    
}
