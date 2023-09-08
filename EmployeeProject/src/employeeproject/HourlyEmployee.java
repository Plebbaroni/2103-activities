/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeproject;
import java.util.Date;
/**
 *
 * @author User
 */
public class HourlyEmployee {
    private int empID;
    private String empName;
    private Date empDateHired;
    private Date empBirthDate;
    private float totalHoursWorked;
    private float ratePerHour;
    
    public HourlyEmployee(){
        empID = 0;
        empName = "xxx";
        empDateHired = null;
        empBirthDate = null;
        totalHoursWorked = 0;
        ratePerHour = 0;
    }

    public HourlyEmployee(int empID, String empName, Date empDateHired, Date empBirthDate, float totalHoursWorked, float ratePerHour) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public HourlyEmployee(int empID, String empName, float totalHoursWorked, float ratePerHour) {
        this.empID = empID;
        this.empName = empName;
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Date getEmpDateHired() {
        return empDateHired;
    }

    public void setEmpDateHired(Date empDateHired) {
        this.empDateHired = empDateHired;
    }

    public Date getEmpBirthDate() {
        return empBirthDate;
    }

    public void setEmpBirthDate(Date empBirthDate) {
        this.empBirthDate = empBirthDate;
    }

    public float getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public void setTotalHoursWorked(float totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }

    public float getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(float ratePerHour) {
        this.ratePerHour = ratePerHour;
    }
    
    public double computeSalary(float totalHoursWorked, float ratePerHour){
        double salary = 0;
        
        if(totalHoursWorked > 40){
            float overtimeHours = totalHoursWorked-40;
            salary += ((ratePerHour * 1.5)*overtimeHours);
            totalHoursWorked -= overtimeHours;
        }
        
        salary += (ratePerHour * totalHoursWorked);
        
        return salary;
    }
    
    public void displayInfo(){
        System.out.println(String.format("%d, %s, %tD %n, %tD %n, %f, %f, ₱%f", empID, empName, empDateHired, empBirthDate, totalHoursWorked, ratePerHour, computeSalary(totalHoursWorked, ratePerHour)));
    }
    
    @Override
    public String toString(){
        return String.format("%d, %s, %tD %n, %tD %n, %f, %f, ₱%f", empID, empName, empDateHired, empBirthDate, totalHoursWorked, ratePerHour, computeSalary(totalHoursWorked, ratePerHour));
    }
}
