import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class OutOfBounds {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner input = new Scanner(System.in);
      //create array
      int array[] = new int[100];
      //fill with random numbers
      for(int i = 0; i < 100; i++){
         array[i] = (int)(Math.random() * 100);
      }
      //loop until input correctly entered
      boolean continueInput = true;
      
      do { 
         try {
            System.out.print("Enter index: ");
            int user = input.nextInt();
            //display
            System.out.println("The number of the index entered is " + array[user]);
            continueInput = false;
         //if exception, print out of bounds
         } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Out of bounds");
            input.nextLine();
         }
         
      } while (continueInput);
   }

}
