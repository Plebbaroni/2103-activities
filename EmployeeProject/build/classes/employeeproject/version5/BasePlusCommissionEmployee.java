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
public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double totalSales;
    private double baseSalary;
    public BasePlusCommissionEmployee(){
        super();
        this.totalSales = 0;
        this.baseSalary = 0;
    }
    
    public BasePlusCommissionEmployee(int empID, Name empName, double totalSales, double baseSalary){
        super(empID, empName, totalSales);
        this.baseSalary = baseSalary;
    }
    
    public BasePlusCommissionEmployee(int empID, Name empName, Date empDateHired, Date empBirthDate, double totalSales, double joe) {
        super(empID, empName, empDateHired, empBirthDate, totalSales);
        this.baseSalary = joe;
    }
    

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    
    @Override
    public double computeSalary(double baseSalary){
        totalSales = super.getTotalSales();
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
        salary += baseSalary;
        return salary;
    }
    
    @Override
    public void displayInfo(){
        System.out.println(String.format("%d, %s, %tD %n, %tD %n, ₱%f, ₱%f, ₱%f", getEmpID(), getEmpName(), getEmpDateHired(), getEmpBirthDate(), totalSales, baseSalary, computeSalary(totalSales)));
    }
    
    @Override
    public String toString(){
        return String.format("%d, %s, %tD %n, %tD %n, ₱%f, ₱%f, ₱%f", getEmpID(), getEmpName(), getEmpDateHired(), getEmpBirthDate(), totalSales, baseSalary, computeSalary(totalSales));
    }
}
