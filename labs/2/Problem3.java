import java.util.Scanner;

public class Problem3 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      
      Scanner input = new Scanner(System.in);
      
      //user enters character
      System.out.print("Enter a character: ");
      char ch = input.next().charAt(0);
      
      //prints unicode for the character
      System.out.println("The Unicode for character " + ch + " is " + (int)(ch));
   }

}
