import java.util.Scanner;

public class Problem2 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner input = new Scanner(System.in);
      //enter positive integer
      System.out.print("Enter a positive integer: ");
      int num = input.nextInt();
      //send num to factors
      factors(num);
      
   }
   
   public static void factors(int number){
      StackOfIntegers stack = new StackOfIntegers();
      for (int i = 2; i <= number; i++) {
         //if num is a factor, push
         while (number % i == 0) {
            stack.push(i);
            number /= i;
         }
      }
      //while stack isn't empty, pop
      while(!stack.empty()){
         System.out.print(stack.pop() + " ");
      }
   }
}   