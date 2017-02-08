import java.util.Scanner;

public class Problem3 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      
      Scanner input = new Scanner(System.in);
      
      //user enters number
      System.out.print("Please enter a number: ");
      int number = input.nextInt();
      String result = "";
      
      //while the number is greater than 1, divide starting at 2 and increasing
      while(number > 1){
         for(int i = 2; i <= number; i++){
            //check if it's a number
            if(number % i == 0){
               number = number / i;
               result = result + " " + i;
               i = number;
            }
         }
      }
      //print results
      System.out.println(result);
   }

}
