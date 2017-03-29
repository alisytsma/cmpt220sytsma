
public class Problem2 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
         SavingsAccount savings = new SavingsAccount(1500);
         CheckingAccount checking = new CheckingAccount(200);

         //set interest
         Account.setAnnualInterestRate(4.5);
         
         //create account with ID of 1122 and funds of $20,000
         Account account = new Account(1122,20000);
                  
         //withdraw $2500 and $200
         account.withdraw(2500);
         savings.withdraw(200);
         //deposit $3000
         account.deposit(3000);
         //print
         System.out.println(account.toString());
         System.out.println(savings.toString());
         System.out.println(checking.toString());
   }

}
