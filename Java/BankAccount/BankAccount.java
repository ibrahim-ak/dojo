import java.util.Random;

public class BankAccount {
     // MEMBER VARIABLES
     private double checkingBalance;
     private double savingsBalance;
     private int accountNumber;
     private static int accounts;
     private static double totalMoney; // refers to the sum of all bank account checking and savings balances


     public int randAcountnum(){
          Random rand = new Random();
          accountNumber = rand.nextInt(10);
          return accountNumber;
     }
     public void displayAccountNum(){
          System.out.println(accountNumber);
     }
     public double getCheckingBalance() {
          return checkingBalance;
     }

     public double getSavingsBalance() {
          return savingsBalance;
     }

     public static int getAccounts() {
          return accounts;
     }

     public static double getTotalMoney() {
          return totalMoney;
     }

     // CONSTRUCTOR
     public BankAccount() {
          accounts++;
          this.checkingBalance = 0;
          this.savingsBalance = 0;
          randAcountnum();
     }

     public void deposit(double amountToDeposite, String Account) {
          if (Account == "checking") {
               this.checkingBalance += amountToDeposite;
          } else if (Account == "Saving") {
               this.savingsBalance += amountToDeposite;
          }
          totalMoney = totalMoney + amountToDeposite;

     }

     public void withdraw(double withdrawAmount, String Account) {
          if (Account == "checking") {
               if (this.checkingBalance >= withdrawAmount) {
                    checkingBalance -= withdrawAmount;
                    totalMoney-=withdrawAmount;
                    System.out.println("withDrwal amount was: " + withdrawAmount);
               }
               else{
                    System.out.println("insufficient funds ,, your balance is " + checkingBalance);
               }  
               } 
               else if (Account == "Saving") {
                    if (this.savingsBalance >= withdrawAmount ) {
                         savingsBalance -= withdrawAmount;
                         totalMoney-=withdrawAmount;
                         System.out.println("withDrwal amount was:");
                    }
                    else{
                         System.out.println("insufficient funds ,, your balance is " + savingsBalance);
                    }  
               }
          }
          public void display(){
               // System.out.println("the balance of your total account in bank is  $ "+ totalMoney);
               System.out.println("your saving account balance is $ "+ savingsBalance );
               System.out.println("your checking account balance is $ "+ checkingBalance);

          }
          public static void BankacountAndtotal(){
               System.out.println("number of accounts "+accounts);
               System.out.println("total money for all accounts in your bank is  $"+totalMoney);
          }
     }
     // Be sure to increment the number of accounts
     // GETTERS
     // for checking, savings, accounts, and totalMoney
     // METHODS
     // deposit
     // - users should be able to deposit money into their checking or savings
     // account
     // withdraw
     // - users should be able to withdraw money from their checking or savings
     // account
     // - do not allow them to withdraw money if there are insufficient funds
     // - all deposits and withdrawals should affect totalMoney
     // getBalance
     // - display total balance for checking and savings of a particular bank account

