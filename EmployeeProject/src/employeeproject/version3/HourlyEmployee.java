/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeproject.version3;
import java.util.Date;
/**weak relationship = declared outside the object
 * strong relationship = declared inside the object
 *
 * @author User
 */
public class HourlyEmployee {
    private int empID;
    private Name empName;
    private Date empDateHired;
    private Date empBirthDate;
    private double ratePerHour;
    private doubkle totalHoursWorked;
    
    public HourlyEmployee(){
        empID = 0;
        empName = null;
        empDateHired = null;
        empBirthDate = null;
    }
    
    public HourlyEmployee(int empID, Name empName, double ratePerHour, double totalHoursWorked){
        this.empID = empID;
        this.empName = empName;
        this.ratePerHour = ratePerHour;
        this.totalHoursWorked = totalHoursWorked;
    }
    
    public HourlyEmployee(int empID, Name empName, Date empDateHired, Date empBirthDate) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
    }

    public HourlyEmployee(int empID, Name empName, Date empDateHired, Date empBirthDate, double ratePerHour, double totalHoursWorked) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.ratePerHour = ratePerHour;
        this.totalHoursWorked = totalHoursWorked;
    }
    
    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName.toString();
    }

    public void setEmpName(Name empName) {
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

    public double getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    public double getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public void setTotalHoursWorked(double totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }
    
    public double computeSalary(double ratePerHour, double totalHoursWorked){
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
        System.out.println(String.format("%d, %s, %tD %n, %tD %n, %f, %f, ₱%f", getEmpID(), getEmpName(), getEmpDateHired(), getEmpBirthDate(), totalHoursWorked, ratePerHour, computeSalary(totalHoursWorked, ratePerHour)));
    }
    
    @Override
    public String toString(){
        return String.format("%d, %s, %tD %n, %tD %n, %f, %f, ₱%f", getEmpID(), getEmpName(), getEmpDateHired(), getEmpBirthDate(), totalHoursWorked, ratePerHour, computeSalary(totalHoursWorked, ratePerHour));
    }
}
