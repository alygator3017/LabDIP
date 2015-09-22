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
     * @param salary double -seAnnualSalary
     * @param bonus double -setAnnualBonus
     */
    public SalariedEmployee(double salary, double bonus) {
        seAnnualSalary(salary);
        setAnnualBonus(bonus);

    }

    /**
     *
     * @param salary double
     */
    public final void seAnnualSalary(double salary) {
        this.annualSalary = salary;
    }


    public final double getAnnualSalary() {
        return annualSalary;
    }

    @Override
    public final double getAnnualWages() {
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

    public final double getAnnualBonus() {
        return annualBonus;
    }
}
