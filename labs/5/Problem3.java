import java.util.Scanner;

public class Problem3 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner input = new Scanner(System.in);
      
      //adds users number to array
      int[] list = new int[5];
      System.out.print("Enter 5 numbers: ");
      for(int i = 0; i < list.length; i++){  
         list[i] = input.nextInt();
      }
      System.out.print("The GCD is " + gcd(list));
   }
   

   public static int gcd(int... numbers){
      //find lowest number
      for (int i = 0; i < numbers.length; i++){
         //find the minimum in the list[i..length-1]
         int currentMin = numbers[i];
         int currentMinIndex = i;
         for (int j = i + 1; j < numbers.length; j++){
            if(currentMin > numbers[j]){
               currentMin = numbers[j];
               currentMinIndex = j;
            }
         }

         //swap list[i] with list[currentMinIndex] if necessary
         if (currentMinIndex != i){
            numbers[currentMinIndex] = numbers[i];
            numbers[i] = currentMin;
         }
         
         //find gcd
         for (int p = currentMin; p > 0; p--) {
            boolean gcd = true;
            for (int number : numbers) {
                //see if number is divisible by p
                gcd = gcd && (number % p == 0);
            }
            //if evenly divisible by p, return p
            if (gcd){
               return p;
            }            
        } 
        
      }
      return 0;
   }
}
