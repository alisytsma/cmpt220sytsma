import java.util.Date;

class Account {
   //variables
   private int id;
   private double balance;
   private static double annualInterestRate;
   private Date dateCreated = new Date();
   
   //empty Account
   Account() {

   }
   
   //account with variables specified
   Account(int id, double balance) {
      this.id = id;
      this.balance = balance;
   }
   
   //set and get ID
   void setId(int id) {
      this.id = id;
   }
   
   double getId() {
      return id;
   }
   
   //set and get Balance
   void setBalance(double balance) {
      this.balance = balance;
   }
   
   double getBalance() {
      return balance;
   }
   
   //set and get annual interest rate
   static double getAnnualInterestRate() {
      return annualInterestRate;
   }

   static void setAnnualInterestRate(double annualInterestRate) {
      Account.annualInterestRate = annualInterestRate;
   }
   
   //get date
   Date getDateCreated() {
      return dateCreated;
   }
   //calculate monthly interest
   double getMonthlyInterest() {
      return balance * (getMonthlyInterestRate() / 100.0);
   }
   //calculate monthly interest rate
   double getMonthlyInterestRate() {
      return annualInterestRate / 12;
   }
   
   //calculate withdraw interactions
   void withdraw(double amount) {
      balance -= amount;
   }
   
   //calculate deposit interactions
   void deposit(double amount) {
      balance += amount;
   }
   
   public String toString(){
      return "Regular Account: " + balance;
   }
    
}
