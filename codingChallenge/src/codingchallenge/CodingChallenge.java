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
public class CodingChallenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BankAccount myAccount = new BankAccount();
        myAccount.setAccountNumber(1);
        myAccount.setAccountBalance(40.32);
        myAccount.setCustomerName("bala");
        myAccount.setEmail("bala@bala.com");
        myAccount.setPhoneNumber(1571261);
        
        System.out.println("Account Balance: $" + myAccount.getAccountBalance());
        myAccount.depositFunds(3.42);
        System.out.println("Account Balance: $" + myAccount.getAccountBalance());
        myAccount.withdrawFunds(43.74);
        System.out.println("Account Balance: $" + myAccount.getAccountBalance());
    }
    
}
