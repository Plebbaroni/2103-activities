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
public class CommissionEmployee extends EmployeeProto{
    private double totalSales;
    
    public CommissionEmployee(){
        super();
        this.totalSales = 0;
    }
    
    public CommissionEmployee(int empID, Name empName, double totalSales){
        super(empID, empName);
        this.totalSales = totalSales;
    }
    
    public CommissionEmployee(int empID, Name empName, Date empDateHired, Date empBirthDate, double totalSales) {
        super(empID, empName, empDateHired, empBirthDate);
        this.totalSales = totalSales;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }
    
    public double computeSalary(double totalSales){
        double salary = 0;
        
        if(totalSales < 50000){
            salary = totalSales*0.05;
        }
        if(totalSales >= 50000 && totalSales < 100000){
            salary = totalSales*0.2;
        }
        if(totalSales >=100000 && totalSales < 500000){
            salary = totalSales*0.3;
        }
        if(totalSales > 500000){
            salary = totalSales*0.5;
        }
        return salary;
    }
    
    @Override
    public void displayInfo(){
        System.out.println(String.format("%d, %s, %tD %n, %tD %n, %f, ₱%f", getEmpID(), getEmpName(), getEmpDateHired(), getEmpBirthDate(), totalSales, computeSalary(totalSales)));
    }
    
    @Override
    public String toString(){
        return String.format("%d, %s, %tD %n, %tD %n, %f, ₱%f", getEmpID(), getEmpName(), getEmpDateHired(), getEmpBirthDate(), totalSales, computeSalary(totalSales));
    }
}
