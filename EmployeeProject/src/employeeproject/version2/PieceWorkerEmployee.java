/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeproject.version2;

import java.util.Date;

/**
 *
 * @author User
 */
public class PieceWorkerEmployee extends EmployeeProto{
    private int totalPiecesFinished;
    private float ratePerPiece;
    
    
    PieceWorkerEmployee(){
        super();
        totalPiecesFinished = 0;
        ratePerPiece = 0;
    }
    
    public PieceWorkerEmployee(int empID, String empName, int totalPiecesFinished, float ratePerPiece){
        super(empID, empName);
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }
    
    public PieceWorkerEmployee(int empID, String empName, Date empDateHired, Date empBirthDate, int totalPiecesFinished, float ratePerPiece) {
        super(empID, empName, empDateHired, empBirthDate);
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
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

    public void setRatePerPiece(float ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }
    
    public double computeSalary(int totalPiecesFinished, float ratePerPiece){
        double salary = totalPiecesFinished * ratePerPiece;
        int bonus = totalPiecesFinished / 100;
        salary += (bonus * (ratePerPiece * 10));
        return salary;
    }
    
    @Override
    public void displayInfo(){
        System.out.println(String.format("%d, %s, %tD %n, %tD %n, %d, %f, ₱%f", getEmpID(), getEmpName(), getEmpDateHired(), getEmpBirthDate(), totalPiecesFinished, ratePerPiece, computeSalary(totalPiecesFinished, ratePerPiece)));
    }
    
    @Override
    public String toString(){
        return String.format("%d, %s, %tD %n, %tD %n, %d, %f, ₱%f", getEmpID(), getEmpName(), getEmpDateHired(), getEmpBirthDate(), totalPiecesFinished, ratePerPiece, computeSalary(totalPiecesFinished, ratePerPiece));
    }
}
