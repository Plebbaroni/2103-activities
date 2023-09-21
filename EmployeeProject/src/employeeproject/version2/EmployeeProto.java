/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeproject.version2;
import java.util.Date;
/**weak relationship = declared outside the object
 * strong relationship = declared inside the object
 *
 * @author User
 */
public class EmployeeProto {
    private int empID;
    private String empName;
    private Date empDateHired;
    private Date empBirthDate;

    
    public EmployeeProto(){
        empID = 0;
        empName = "xxx";
        empDateHired = null;
        empBirthDate = null;
    }
    
    public EmployeeProto(int empID, String empName){
        this.empID = empID;
        this.empName = empName;
    }
    
    public EmployeeProto(int empID, String empName, Date empDateHired, Date empBirthDate) {
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
    
    public void computeSalary(){
        System.out.println("computing salary...");
    }
    
    public void displayInfo(){
        System.out.println(String.format("%d, %s, %tD %n, %tD %n", empID, empName, empDateHired, empBirthDate));
    }
    
    @Override
    public String toString(){
        return String.format("%d, %s, %tD %n, %tD %n", empID, empName, empDateHired, empBirthDate);
    }
}
