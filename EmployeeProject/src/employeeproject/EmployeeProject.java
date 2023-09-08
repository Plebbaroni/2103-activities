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
public class EmployeeProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HourlyEmployee hour = new HourlyEmployee(1, "Joe", 43, 10);
        hour.computeSalary(hour.getTotalHoursWorked(), hour.getRatePerHour());
        hour.displayInfo();
        
        PieceWorkerEmployee piece = new PieceWorkerEmployee(1, "Joe", 103, 1);
        piece.computeSalary(piece.getTotalPiecesFinished(), piece.getRatePerPiece());
        piece.displayInfo();
    }
    
}
