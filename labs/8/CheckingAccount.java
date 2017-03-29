
public class CheckingAccount extends Account {
   double overdraftlimit = 0;
   
   //no args constructor
   CheckingAccount(){
      
   }
   
   //constructor
   CheckingAccount(double balance){
      setBalance(balance);
   }

   //withdraw
   public void withdraw (double w) {
       if (getBalance() - w < overdraftlimit)
               System.out.println("Insufficient Funds");
       else
          setBalance(getBalance() - w);
   }
   
   //to string method
   public String toString(){
      return "Checking Account: " + getBalance();
   }
}
