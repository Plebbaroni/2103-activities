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
public class PieceWorkerEmployee {
    private int empID;
    private String empName;
    private Date empDateHired;
    private Date empBirthDate;
    private int totalPiecesFinished;
    private float ratePerPiece;
    
    public PieceWorkerEmployee(){
        empID = 0;
        empName = "xxx";
        empDateHired = null;
        empBirthDate = null;
        totalPiecesFinished = 0;
        ratePerPiece = 0;
    }

    public PieceWorkerEmployee(int empID, String empName, Date empDateHired, Date empBirthDate, int totalPiecesFinished, float ratePerPiece) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public PieceWorkerEmployee(int empID, String empName, int totalPiecesFinished, float ratePerPiece) {
        this.empID = empID;
        this.empName = empName;
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
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

    public int getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public void setTotalPiecesFinished(int totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public float getRatePerPiece() {
        return ratePerPiece;
    }

    public void setRatePerPiece(float ratePerHour) {
        this.ratePerPiece = ratePerHour;
    }
    
    public double computeSalary(int totalPiecesFinished, float ratePerPiece){
        double salary = totalPiecesFinished * ratePerPiece;
        int bonus = totalPiecesFinished / 100;
        salary += (bonus * (ratePerPiece * 10));
        return salary;
    }
    
    public void displayInfo(){
        System.out.println(String.format("%d, %s, %tD %n, %tD %n, %d, %f, ₱%f", empID, empName, empDateHired, empBirthDate, totalPiecesFinished, ratePerPiece, computeSalary(totalPiecesFinished, ratePerPiece)));
    }
    
    @Override
    public String toString(){
        return String.format("%d, %s, %tD %n, %tD %n, %d, %f, ₱%f", empID, empName, empDateHired, empBirthDate, totalPiecesFinished, ratePerPiece, computeSalary(totalPiecesFinished, ratePerPiece));
    }
}
