import java.util.Scanner;

public class BinaryDecimal {

   public static void main(String[] args) throws NumberFormatException {

      Scanner input = new Scanner(System.in);
      //prompt user for num
      System.out.print("Enter a binary number: ");
      String num = input.next();
      
      //initalize decimal
      int decNum = 0;
      char biNum;
      for (int i = num.length() - 1, pow = 0; i >= 0; i--, pow++) {
         biNum = num.charAt(i);
         if (biNum == '0' || biNum == '1') {
            decNum += (Math.pow(2, pow) * (biNum - '0'));
         } else {
            throw new NumberFormatException("Not a binary number: " + num);
         }
      }
      System.out.println(decNum);
   }
}
