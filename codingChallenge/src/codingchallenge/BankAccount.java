/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingchallenge;

/**
 *
 * @author User
 */
public class BankAccount {
     private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private int phoneNumber;
    
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }
    
    public void withdrawFunds(double amount){
        if((accountBalance-amount) >= 0 && amount > 0){
            accountBalance = accountBalance-amount;
        }
    }
    
    public void depositFunds(double amount){
        accountBalance = accountBalance+amount;
    }
}
