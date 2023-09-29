/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version4;

/**
 *
 * @author User
 */
public class EmpList {
    EmployeeProto[] empRoster;
    int count;
    int max;

    public EmpList(EmployeeProto[] empRoster, int count, int max) {
        this.empRoster = empRoster;
        this.count = count;
        this.max = max;
    }

    public EmpList() {
    }

    public EmpList(int max) {
        this.count = 0;
        this.max = max;
    }

    public EmployeeProto[] getEmpRoster() {
        return empRoster;
    }

    public void setEmpRoster(EmployeeProto[] empRoster) {
        this.empRoster = empRoster;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
    
    public void displayAllEmployees(){
        for(int i = 0; i < this.count; i++){
            if(empRoster[i] instanceof HourlyEmployee){
                HourlyEmployee empMask = (HourlyEmployee)empRoster[i];
                System.out.println(String.format("%d, %s, %s, ₱%f", empMask.getEmpID(), empMask.getEmpName(), empMask.getClass(), empMask.computeSalary(empMask.getTotalHoursWorked(), empMask.getRatePerHour())));
            }
            if(empRoster[i] instanceof PieceWorkerEmployee){
                PieceWorkerEmployee empMask = (PieceWorkerEmployee)empRoster[i];
                System.out.println(String.format("%d, %s, %s, ₱%f", empMask.getEmpID(), empMask.getEmpName(), empMask.getClass(), empMask.computeSalary(empMask.getTotalPiecesFinished(), empMask.getRatePerPiece())));
            }
            if(empRoster[i] instanceof CommissionEmployee){
                CommissionEmployee empMask = (CommissionEmployee)empRoster[i];
                System.out.println(String.format("%d, %s, %s, ₱%f", empMask.getEmpID(), empMask.getEmpName(), empMask.getClass(), empMask.computeSalary(empMask.getTotalSales())));
            }
             if(empRoster[i] instanceof BasePlusCommissionEmployee){
                BasePlusCommissionEmployee empMask = (BasePlusCommissionEmployee)empRoster[i];
                System.out.println(String.format("%d, %s, %s, ₱%f", empMask.getEmpID(), empMask.getEmpName(), empMask.getClass(), empMask.computeSalary(empMask.getBaseSalary())));
            }
        }
    }
    
    public int countEmpType(String empType){
        int typeCount = 0;
        for(int i = 0; i < this.count; i++){
            if(empRoster[i].getClass().toString().equals(empType)){
                typeCount++;
            }
        }
        return typeCount;
    }
    
    public void displayEmployeeType(String empType){
        for(int i = 0; i < this.count; i++){
            if(empRoster[i].getClass().toString().equals(empType)){
                if(empType.equals("HourlyEmployee")){
                    HourlyEmployee empMask = (HourlyEmployee)empRoster[i];
                    System.out.println(String.format("%d, %s, %s, ₱%f", empMask.getEmpID(), empMask.getEmpName(), empMask.getClass(), empMask.computeSalary(empMask.getTotalHoursWorked(), empMask.getRatePerHour())));
                }
                if(empType.equals("PieceWorkerEmployee")){
                    PieceWorkerEmployee empMask = (PieceWorkerEmployee)empRoster[i];
                    System.out.println(String.format("%d, %s, %s, ₱%f", empMask.getEmpID(), empMask.getEmpName(), empMask.getClass(), empMask.computeSalary(empMask.getTotalPiecesFinished(), empMask.getRatePerPiece())));
                }
                if(empType.equals("CommissionEmployee")){
                    CommissionEmployee empMask = (CommissionEmployee)empRoster[i];
                    System.out.println(String.format("%d, %s, %s, ₱%f", empMask.getEmpID(), empMask.getEmpName(), empMask.getClass(), empMask.computeSalary(empMask.getTotalSales())));
                }
                if(empType.equals("BasePlusCommissionEmployee")){
                    BasePlusCommissionEmployee empMask = (BasePlusCommissionEmployee)empRoster[i];
                    System.out.println(String.format("%d, %s, %s, ₱%f", empMask.getEmpID(), empMask.getEmpName(), empMask.getClass(), empMask.computeSalary(empMask.getBaseSalary())));
                }
            }
        }
    }
    
    public boolean addEmp(EmployeeProto e){
        boolean x = false;
        if(this.count < this.max){
            empRoster[count+1] = e;
            this.count++;
            x = true;
        }
        return x;
    }
    
    public boolean removeEmp(int ID){
        boolean x = false, deleteFound = false;
        int i = 0;
        for(i = 0; i < count && deleteFound == false; i++){
            if(ID == empRoster[i].getEmpID()){
                deleteFound = true;
            }
        }
        if(deleteFound == true){
            x = true;
            for(; i < count; i++){
                empRoster[i] = empRoster[i+1];
            }
            this.count--;
        }
       return x;
    }
    
    public void updateEmp(int ID, Name name, EmployeeProto e){
        int i;
        for(i = 0; i < count && empRoster[i] != e; i++){}
        if(i < count){
            empRoster[i].setEmpID(ID);
            empRoster[i].setEmpName(name);
        }
    }
    
    public EmployeeProto searchEmp(Name name){
        int i;
        EmployeeProto dummy = null;
        for(i = 0; i < count; i++){
            if(empRoster[i].getEmpName().equals(name.toString())){
                dummy = empRoster[i];
            }
        }
        return dummy;
    }
}