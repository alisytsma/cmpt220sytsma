import java.util.Date;

public class Problem3 {

    public static void main(String[] args) {
       Account.setAnnualInterestRate(4.5);
       Account account = new Account(1122,20000);
       account.withdraw(2500);
       account.deposit(3000);
       System.out.println("Account: " + account.getId());
       System.out.println("Balance: " + account.getBalance());
       System.out.println("Monthly interest: " + account.getMonthlyInterest());
       System.out.println("Date Created: " + account.getDateCreated().toString());
   }

}

class Account {
   private int id;
   private double balance;
   private static double annualInterestRate;
   private Date dateCreated = new Date();
    
   Account() {

   }
    
   Account(int id, double balance) {
      this.id = id;
      this.balance = balance;
   }
    
   void setId(int id) {
      this.id = id;
   }
   
   double getId() {
      return id;
   }
   
   void setBalance(double balance) {
      this.balance = balance;
   }
   
   double getBalance() {
      return balance;
   }
   
   static double getAnnualInterestRate() {
      return annualInterestRate;
   }

   static void setAnnualInterestRate(double annualInterestRate) {
      Account.annualInterestRate = annualInterestRate;
   }
   
   Date getDateCreated() {
      return dateCreated;
   }
    
   double getMonthlyInterest() {
      return balance * (getMonthlyInterestRate() / 100.0);
  }

  double getMonthlyInterestRate() {
      return annualInterestRate / 12;
  }
   
   void withdraw(double amount) {
      balance -= amount;
   }
   
   void deposit(double amount) {
      balance += amount;
   
   }
    
}
