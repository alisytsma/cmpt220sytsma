import java.util.Scanner;

public class Problem2 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      
      Scanner input = new Scanner(System.in);
      
      //adds users number to array
      double[] list = new double[10];
      System.out.print("Enter 10 numbers: ");
      for(int i = 0; i < list.length; i++){  
         list[i] = input.nextDouble();
      }
      
      //print out mean and standard deviation
      System.out.print("The mean is " + mean(list));
      System.out.print("The standard deviation is " + deviation(list));
   }

   /** Compute the deviation of double values */
   public static double deviation(double[] x){ 
      double average = mean(x);
      double store = 0;
      //subtract mean and square result
      for(int i = 0; i < x.length; i++){
         double step1 = x[i] - average;
         double step2 = step1 * step1;
         store = step2 + store;
      }
      //mean of rest
      double avg = store / x.length; // JA: The denominator should be (x.length - 1)
      
      //square root
      double square = java.lang.Math.sqrt(avg);
      
      //return answer
      return square;
   } 
   
   /** Compute the mean of an array of double values */
   public static double mean(double[] x){
      double result = 0;
      for(int i = 0; i < x.length; i++){
         result = x[i] + result;
      }
   //return sum divided by length of array
   return result / x.length;
   }
}
