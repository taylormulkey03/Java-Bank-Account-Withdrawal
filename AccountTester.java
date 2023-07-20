/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package withdraw.java;

/**
 *
 * @author taymu
 */
public class AccountTester {
    public static void main(String[] args) {
        // Make instance of Account
        Account account = new Account("Taylor M", 1000.0);
        
        // Test getName() method
        System.out.println("Account holder name: " + account.getName());
        
        // Test getBalance() method
        System.out.println("Initial balance: " + account.getBalance());
        
        // Test withdraw() method
        account.withdraw(500.0);
        System.out.println("Balance after withdrawal: " + account.getBalance());
        
        // Test withdrawing an invalid amount
        account.withdraw(-100.0); // Invalid amount
        System.out.println("Balance after invalid withdrawal: " + account.getBalance());
        
        // Test withdrawing more than the balance
        account.withdraw(2000.0); // Withdrawal amount exceeds balance
        System.out.println("Balance after excessive withdrawal: " + account.getBalance());
    }
}
