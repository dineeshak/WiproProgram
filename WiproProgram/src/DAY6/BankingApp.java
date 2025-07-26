package DAY6;


interface BankAccount {
 
 void deposit(double amount);
 void withdraw(double amount);
 void showBalance();

 // default method - can be used directly by object
 default void accountType() {
     System.out.println("Account type: Saving Account ");
 }

 // static method - belongs to interface
 static boolean isAmountValid(double amount) {
     return amount > 0;
 }
}

//Class implementing the interface
class SimpleAccount implements BankAccount {
 double balance;  
 
 // Implement abstract methods
 public void deposit(double amount) {
     if(BankAccount.isAmountValid(amount)) {
         balance += amount;
         System.out.println(" Deposited: $" + amount);
     } else {
         System.out.println(" Invalid deposit amount!");
     }
 }

 public void withdraw(double amount) {
     if(BankAccount.isAmountValid(amount) && amount <= balance) {
         balance -= amount;
         System.out.println("Withdrawn: $" + amount);
     } else {
         System.out.println("Invalid amount or insufficient balance!");
     }
 }

 public void showBalance() {
     System.out.println("Current balance: $" + balance);
 }

}


public class BankingApp {
 public static void main(String[] args) {
     SimpleAccount myAccount = new SimpleAccount();

     // Call default method
     myAccount.accountType();

     // Use abstract methods
     myAccount.deposit(5000);
     myAccount.withdraw(2000);
     myAccount.showBalance();

     
     System.out.println(" Balance accessed directly: $" + myAccount.balance);

     // Call static method to check an amount
     boolean valid = BankAccount.isAmountValid(100);
     System.out.println(" Is 100 a valid amount? " + valid);
 }
}
