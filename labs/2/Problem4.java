import java.util.Scanner;

public class Problem4 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter a character: ");
      char ch = input.next().charAt(0);
      
      //if character is a capital letter or a lowercase letter, see if it's a vowel
      if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z'){
         //check if it's an uppercase vowel
         if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            System.out.println(ch + " is a vowel.");
         //check if it's a lowercase vowel
         } else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println(ch + " is a vowel.");
         } else {
            //if it's neither, it's a consonant
            System.out.println(ch + " is a consonant.");
         }
      } 
      
      //if it's not a letter, the input is invalid
      else {
          System.out.println(ch + " is an invalid input");
      }
   }

}
