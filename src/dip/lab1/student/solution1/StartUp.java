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
public class StartUp {
    public static void main(String[] args) {
    
    
    Employee e1 = new HourlyEmployee(25, 2000);
    Employee e2 = new SalariedEmployee(50000, 10000);
    
    
    
    Employee[] a1 = {e1,e2};
    
    
    HRService h = new HRService();
    
    

    for(int y = 0; y < a1.length; y++) {
            System.out.println("Employee " + (y+1) + " compensation:" +
            h.getYearlyEmployeeWages(a1[y]));
        }
   
}
}