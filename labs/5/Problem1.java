import java.util.Scanner;

public class Problem1 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner input = new Scanner(System.in);
      
      double[] list = new double[10];
      
      //user enters 10 numbers and they're added to the list
      System.out.print("Enter 10 numbers: ");
      for(int i = 0; i < list.length; i++){  
         list[i] = input.nextDouble();
      }
      
      //print results
      System.out.println("The smallest index is " + indexOfSmallestElement(list));
      
   }
   public static int indexOfSmallestElement(double[] numbers){
      int index = 0;
      for(int i = 1; i < numbers.length; i++){
         //if number is smaller than current smallest, replace
         if (numbers[i] < numbers[index]){
            index = i;
         }
      }
      //return index of smallest number
      return index;
   }
  

}
