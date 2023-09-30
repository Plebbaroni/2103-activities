/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version5;
import java.util.Date;
/**
 *
 * @author User
 */
public class HourlyEmployee extends EmployeeProto{
    
    private float totalHoursWorked;
    private float ratePerHour;
    
    public HourlyEmployee(){
        super();
        totalHoursWorked = 0;
        ratePerHour = 0;
    }
    
    public HourlyEmployee(int empID, Name empName, float totalHoursWorked, float ratePerHour){
        super(empID, empName);
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }
    
    public HourlyEmployee(int empID, Name empName, Date empDateHired, Date empBirthDate, float totalHoursWorked, float ratePerHour) {
        super(empID, empName, empDateHired, empBirthDate);
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
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
    
    @Override
    public void displayInfo(){
        System.out.println(String.format("%d, %s, %tD %n, %tD %n, %f, %f, ₱%f", getEmpID(), getEmpName(), getEmpDateHired(), getEmpBirthDate(), totalHoursWorked, ratePerHour, computeSalary(totalHoursWorked, ratePerHour)));
    }
    
    @Override
    public String toString(){
        return String.format("%d, %s, %tD %n, %tD %n, %f, %f, ₱%f", getEmpID(), getEmpName(), getEmpDateHired(), getEmpBirthDate(), totalHoursWorked, ratePerHour, computeSalary(totalHoursWorked, ratePerHour));
    }
}
