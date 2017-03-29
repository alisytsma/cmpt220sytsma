
public class SavingsAccount extends Account {
   //variables
   double overdraft = -1000;
   double overd = 0;
   //no args constructor
   SavingsAccount(){
      
   }
   //constructor
   SavingsAccount(double balance){
      setBalance(balance);
   }
   //checking method
   public void checking(double withdraw) {
      if (getBalance() - withdraw < overdraft){
         System.out.println("Failure: Can't overdraft more than $1,000. A $25 overdraft fee will be issued to your account.");
         setBalance(getBalance() - 25); 
         overd += 25;
      }
      else
         setBalance(getBalance() - withdraw);
      }
   //to string
   public String toString(){
      return "Savings Account: " + getBalance() + "\n Overdraft Fees: " + overd;
   }
}
