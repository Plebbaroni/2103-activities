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
public class CommissionEmployee {
    private int empID;
    private String empName;
    private Date empDateHired;
    private Date empBirthDate;
    private double totalSales;
    
    public CommissionEmployee(){
        empID = 0;
        empName = "xxx";
        empDateHired = null;
        empBirthDate = null;
        totalSales = 0;
    }

    public CommissionEmployee(int empID, String empName, Date empDateHired, Date empBirthDate, double totalSales) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalSales = totalSales;
    }

    public CommissionEmployee(int empID, String empName, double totalSales) {
        this.empID = empID;
        this.empName = empName;
        this.totalSales = totalSales;
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
    
    public void displayInfo(){
        System.out.println(String.format("%d, %s, %tD %n, %tD %n, %f, ₱%f", empID, empName, empDateHired, empBirthDate, totalSales, computeSalary(totalSales)));
    }
    
    @Override
    public String toString(){
        return String.format("%d, %s, %tD %n, %tD %n, %f, ₱%f", empID, empName, empDateHired, empBirthDate, totalSales, computeSalary(totalSales));
    }
}
