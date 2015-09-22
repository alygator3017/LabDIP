/**
 * HourlyEmployee class implementing Employee interface
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
        setHourlyRate(salary);
        setTotalAnnualHours(totalAnnualHours);
    }

    /**
     *
     * @param salary double setting the property
     */
    public final void setHourlyRate(double salary) {
        this.hourlyRate = salary;
    }

    /**
     *
     * @return hourlyRate
     */
    public final double getHourlyRate() {
        return hourlyRate;
    }

    @Override
    public final double getAnnualWages() {
        annualWages = hourlyRate*annualHours;
        return annualWages;
    }
    
    /**annual hours setter
     * 
     * @param totalAnnualHours 
     */
    private final void setTotalAnnualHours(double totalAnnualHours) {
        this.annualHours = totalAnnualHours;
    }
    
    //annual hours getter
    private final double getTotalAnnualHours(){
        return annualHours;
    }
    
    
    
}
