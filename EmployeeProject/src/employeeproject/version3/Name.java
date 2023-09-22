/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeproject.version3;

/**
 *
 * @author User
 */
public class Name {
    private String fName;
    private String mName;
    private String lName;
    
   public Name() {
       this.fName = null;
       this.mName = null;
       this.lName = null;
   }

    public Name(String fName) {
        this.fName = fName;
    }

    public Name(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }

    public Name(String fName, String mName, String lName) {
        this.fName = fName;
        this.mName = mName;
        this.lName = lName;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    @Override
    public String toString() {
        return "Name{" + "fName=" + fName + ", mName=" + mName + ", lName=" + lName + '}';
    }
   
}
