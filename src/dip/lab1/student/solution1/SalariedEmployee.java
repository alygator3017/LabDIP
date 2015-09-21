/**
 * Class for SalariedEmployee implementing the Employee interface
 * deals with an annual salary and bonus
 *
 */
package dip.lab1.student.solution1;

/**
 *
 * @author Alyson
 */
public final class SalariedEmployee implements Employee {

    private double annualBonus;
    private double annualSalary;
    private double annualWage;

    /**
     * constructor
     *
     * @param salary double -setSalary
     * @param bonus double -setAnnualBonus
     */
    public SalariedEmployee(double salary, double bonus) {
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

    /**
     *
     * @param annualBonus double sets to annualBonus property
     */
    public final void setAnnualBonus(double annualBonus) {
        this.annualBonus = annualBonus;
    }

    public double getAnnualBonus() {
        return annualBonus;
    }
}
