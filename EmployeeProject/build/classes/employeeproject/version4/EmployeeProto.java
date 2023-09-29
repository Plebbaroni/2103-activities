/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version4;

/**
 *
 * @author User
 */
import java.util.Date;
/**weak relationship = declared outside the object
 * strong relationship = declared inside the object
 *
 * @author User
 */
public class EmployeeProto {
    private int empID;
    private Name empName;
    private Date empDateHired;
    private Date empBirthDate;
    
    public EmployeeProto(int empID, Name empName){
        this.empID = empID;
        this.empName = empName;
    }
    
    public EmployeeProto(){
        empID = 0;
        empName = null;
        empDateHired = null;
        empBirthDate = null;
    }
    
    public EmployeeProto(int empID, Name empName, Date empDateHired, Date empBirthDate) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
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
    
    public void computeSalary(){
        System.out.println("computing salary...");
    }
    
    public void displayInfo(){
        System.out.println(String.format("%d, %s, %tD %n, %tD %n", empID, getEmpName(), empDateHired, empBirthDate));
    }
    
    public String toString(){
        return String.format("%d, %s, %tD %n, %tD %n", empID, getEmpName(), empDateHired, empBirthDate);
    }
}
