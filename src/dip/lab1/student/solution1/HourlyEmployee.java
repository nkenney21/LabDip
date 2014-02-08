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
public class HourlyEmployee implements Employee{
    
    private double hourlyWage;
    private double yearlyHours;
    
    public HourlyEmployee(double hourlyWage, double yearlyHours){
        setHourlyWage(hourlyWage);
        setYearlyHours(yearlyHours);
    }
    
     @Override
    public double getAnnualWages() {
        return hourlyWage * yearlyHours;
    }

    public final double getHourlyWage() {
        return hourlyWage;
    }

    public final void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public final double getYearlyHours() {
        return yearlyHours;
    }

    public final void setYearlyHours(double yearlyHours) {
        this.yearlyHours = yearlyHours;
    }

   
    
    
    
    
}
