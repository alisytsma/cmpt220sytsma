import java.util.Scanner;

public class Problem5 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner input = new Scanner(System.in);
      
      double[][] matrix = new double[3][4];
      
      //user enters matrix
      System.out.print("Enter a 3-by-4 matrix row by row: ");
      for(int i = 0; i < 3; i++){  
         for(int j = 0; j < 4; j++){
            matrix[i][j] = input.nextDouble();
         }
      }
      //print sum of each column
      for (int i = 0; i < matrix[0].length; i++) {
         System.out.println("Sum of the elements at column " + i + " is " + sumColumn(matrix, i));
      }
      
      
   }
   

   public static double sumColumn(double[][] m, int columnIndex){
      double sum = 0;
      //add column
      for (double[] m2 : m) {
          sum += m2[columnIndex];
      }
      return sum;
   }


}
