import java.util.Scanner;

public class Problem5 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner input = new Scanner(System.in);
      
      //user enters number
      System.out.print("Please enter a number: ");
      int number = input.nextInt();
      
      System.out.println(number + " is a Palindrome is " + isPalindrome(number));

   }
   
   //flips number
   public static int reverse(int number){
      int result = 0;
      
      for (int i = number; i > 0; i = i / 10){
         result = result * 10 + i % 10;
      }
      return result;
   }
      
   //checks if reverse is same as regular
   public static boolean isPalindrome(int number){
      int result = 0;
      
      for (int i = number; i > 0; i = i / 10){
         result = result * 10 + i % 10;
      }
      
      //return true or false
      if (result == number){
         return true;
      } else {
         return false;
      }
   }
   

}
