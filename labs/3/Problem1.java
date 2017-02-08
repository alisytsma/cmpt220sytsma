import java.util.Scanner;

public class Problem1 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner input = new Scanner(System.in);
      
      //read inital data
      System.out.print("Enter an integer, the input ends if it is 0: ");
      int data = input.nextInt();
      
      //keep reading data until the input is 0
      int sum = 0;
      int pos = 0;
      int neg = 0;
      int total = 0;
      while(data != 0){
         sum += data;
         
         //counts total entered
         total ++;
         
         //counts total positive
         if (data > 0) {
            pos ++;
         }
         
         //counts total negative
         if (data < 0) {
            neg ++;
         }
         
         //read the next data
         System.out.print("Enter an integer (the input ends if it is 0): ");
         data = input.nextInt();
      }
      
      //finds average
      int average = sum / total;
     
      //prints data
      System.out.println("The number of positives is " + pos);
      System.out.println("The number of negatives is " + neg);
      System.out.println("The total is " + sum);
      System.out.println("The average is " + average);
   }

}
