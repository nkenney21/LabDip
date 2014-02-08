/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dip.lab1.student.solution1;

/**
 *
 * @author neilkenney
 */
public class SalariedEmployee implements Employee {
    private double yearlySalary;
    private double yearlyBonus;

    public SalariedEmployee(double yearlySalary, double yearlyBonus){
        
        setYearlySalary(yearlySalary);
        setYearlyBonus(yearlyBonus);
    }
    
    @Override
    public double getAnnualWages() {
        return yearlySalary + yearlyBonus;
    }

    public final double getYearlySalary() {
        return yearlySalary;
    }

    public final void setYearlySalary(double yearlySalary) {
        this.yearlySalary = yearlySalary;
    }

    public final double getYearlyBonus() {
        return yearlyBonus;
    }

    public final void setYearlyBonus(double yearlyBonus) {
        this.yearlyBonus = yearlyBonus;
    }
    
    
}
