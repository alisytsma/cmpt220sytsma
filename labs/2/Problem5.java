import java.util.Scanner;

public class Problem5 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner input = new Scanner(System.in);
      
      //user enters string
      System.out.print("Enter a string: ");
      
      String uString = input.next();
      
      //prints length of string and first character
      System.out.println("Your string is " + uString.length() + 
            " letters long and the first character is " + uString.charAt(0));
   }

}
