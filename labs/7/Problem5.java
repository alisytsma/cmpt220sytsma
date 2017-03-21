//import
import java.math.BigInteger;

public class Problem5 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      //create bigInteger
      BigInteger bigInteger = new BigInteger(Long.toString(Long.MAX_VALUE));
      System.out.println(Long.MAX_VALUE + "\n");

      int count = 0;
      //create integers 5 and 6
      BigInteger five = new BigInteger("5");
      BigInteger six = new BigInteger("6");
      while (count < 10) {
          //if bigInteger modulus 5 equals 0 or bigInteger modulus 6 equals 0, print and increase count
          if (bigInteger.mod(five).equals(BigInteger.ZERO) || bigInteger.mod(six).equals(BigInteger.ZERO)) {
              System.out.println(bigInteger.toString());
              count++;
          }
          //add 1
          bigInteger = bigInteger.add(BigInteger.ONE);
      }
  }
}
