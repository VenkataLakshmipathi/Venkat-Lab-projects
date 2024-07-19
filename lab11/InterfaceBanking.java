package javafullstack;
import java.util.Scanner;
//Define an interface BankingInterface for common banking operations
interface BankingInterface {
 void deposit(double amount); // Method to deposit money
 void withdraw(double amount); // Method to withdraw money
 double getBalance(); // Method to retrieve current balance
}

//Implementation of SavingsAccount class implementing BankingInterface
class SavingsAccount implements BankingInterface {
 private double balance; // Private member variable to store balance

 // Constructor initializes balance to 1000 for a new savings account
 public SavingsAccount() {
     this.balance = 1000; 
 }
 // Method to deposit money into savings account
 public void deposit(double amount) {
     balance += amount;
     System.out.println("Amount deposited: " + amount);
 }

 // Method to withdraw money from savings account
 public void withdraw(double amount) {
     if (amount <= balance) {
         balance -= amount;
         System.out.println("Amount withdrawn: " + amount);
     } else {
         System.out.println("Insufficient funds!");
     }
 }

 // Method to get current balance of savings account
 public double getBalance() {
     return balance;
 }
}

//Implementation of CurrentAccount class implementing BankingInterface
class CurrentAccount implements BankingInterface {
 private double balance; // Private member variable to store balance

 // Constructor initializes balance to 1000 for a new current account
 public CurrentAccount() {
     this.balance = 1000; 
 }

 // Method to deposit money into current account
 public void deposit(double amount) {
     balance += amount;
     System.out.println("Amount deposited: " + amount);
 }

 // Method to withdraw money from current account
 public void withdraw(double amount) {
     if (amount <= balance) {
         balance -= amount;
         System.out.println("Amount withdrawn: " + amount);
     } else {
         System.out.println("Insufficient funds!");
     }
 }

 // Method to get current balance of current account
 public double getBalance() {
     return balance;
 }
}

//Main class InterfaceBanking to demonstrate banking operations using the interface
public class InterfaceBanking {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
     // Prompt user to select account type
     System.out.println("Select account type: (1) Savings Account (2) Current Account");
     int accountType = scanner.nextInt();
     BankingInterface account; // Interface reference to hold either SavingsAccount or CurrentAccount
     
     // Initialize account based on user input
     switch (accountType) {
         case 1:
             account = new SavingsAccount();
             break;
         case 2:
             account = new CurrentAccount();
             break;
         default:
             System.out.println("Invalid account type selected. Exiting program.");
             scanner.close(); // Close scanner before exiting
             return;
     }
     
     // Prompt user to select operation (Deposit or Withdraw)
     System.out.println("Enter operation: (1) Deposit (2) Withdraw");
     int operation = scanner.nextInt();
     double amount;
     
     // Perform selected operation on the chosen account
     switch (operation) {
         case 1:
             System.out.println("Enter deposit amount:");
             amount = scanner.nextDouble();
             account.deposit(amount); // Call deposit method based on account type
             break;
         case 2:
             System.out.println("Enter withdraw amount:");
             amount = scanner.nextDouble();
             account.withdraw(amount); // Call withdraw method based on account type
             break;
         default:
             System.out.println("Invalid operation selected. Exiting program.");
             scanner.close(); // Close scanner before exiting
             return;
     }
     
     // Display the current balance of the account after operation
     System.out.println("Account Balance: " + account.getBalance());
     
     scanner.close(); // Close scanner at the end of program execution
 }
}
