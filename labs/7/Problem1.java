
public class Problem1 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      //create integers
      MyInteger myInteger = new MyInteger(3);
      MyInteger myInteger2 = new MyInteger(6);
      //print value, if even, if odd, if prime
      System.out.println("The value of myInteger is " + myInteger.getInt());
      System.out.println("myInteger is even: " + myInteger.isEven());
      System.out.println("myInteger is odd: " + myInteger.isOdd());
      System.out.println("myInteger is prime: " + myInteger.isPrime());
      //print if equal to itself and another number
      System.out.println("Equals itself: " + myInteger.equals(3));
      System.out.println("Equals another integer: " + myInteger.equals(6));
      //parse int
      System.out.println("Parse int string: " + MyInteger.parseInt("123"));
      System.out.println("Parse int char: " + MyInteger.parseInt(new char[]{'1', '2', '3'}));
   }

}

class MyInteger{
   int value;
   
   MyInteger(){
      value = 0;
   }
   
   MyInteger(int value){
      this.value = value;
   }
   
   int getInt(){
      return value;
   }
   
   boolean isEven(){
      return value % 2 == 0;
   }
   
   boolean isOdd(){
      return value % 2 != 0;
   }
   
   boolean isPrime(){
      for (int divisor = 2; divisor <= value / 2; divisor++) {
         if (value % divisor == 0) { // If true, value is not prime
             return false; // Value is not a prime
         }
     }
     return true;
   }
   
   //static
   static boolean isEven(int value){
      return value % 2 == 0;
   }
   
   static boolean isOdd(int value){
      return value % 2 != 0;
   }
   
   static boolean isPrime(int value){
      for (int divisor = 2; divisor <= value / 2; divisor++) {
         if (value % divisor == 0) { // If true, value is not prime
             return false; // Value is not a prime
         }
     }
     return true; //otherwise, prime
   }
   
   static boolean isEven(MyInteger value){
      return isEven(value);
   }
   
   static boolean isOdd(MyInteger value){
      return isOdd(value);
   }
   
   static boolean isPrime(MyInteger value){
      return isPrime(value);
   }
   
   boolean equals(int value) {
      return this.value == value;
   }

   boolean equals(MyInteger value) {
      return equals(value);
   }
   
   static int parseInt(char[] array) {
      int value = 0;
      for (int i = 0; i < array.length; i++) {
         value += (array[i] - '0') * Math.pow(10, array.length - i - 1);
      }
      return value;
   }

   static int parseInt(String value) {
      return Integer.parseInt(value);
   }
}
