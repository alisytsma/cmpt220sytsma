import java.util.Arrays;
import java.util.Scanner;

public class Problem6 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner input = new Scanner(System.in);
      
      //user enters matrix 1
      double[][] matrix1 = new double[3][3];
      System.out.print("Enter matrix 1: ");
      for(int i = 0; i < 3; i++){  
         for(int j = 0; j < 3; j++){
            matrix1[i][j] = input.nextDouble();
         }
      }
      
      //user enters matrix 2
      double[][] matrix2 = new double[3][3];
      System.out.print("Enter matrix 2: ");
      for(int i = 0; i < 3; i++){  
         for(int j = 0; j < 3; j++){
            matrix2[i][j] = input.nextDouble();
         }
      }
      
      //print matrix1, matrix 2, and their sum
      for(int i = 0; i < 3; i++){
         for(int j = 0; j < 3; j++){ 
            System.out.print(matrix1[i][j] + " ");
         }
         //if second line, add a +
         if(i == 1){
            System.out.print(" +  ");
         //else just add space
         } else {
         System.out.print("    ");
         }
         for(int j = 0; j < 3; j++){ 
            System.out.print(matrix2[i][j] + " ");
         }
         //else just add equal sign
         if(i == 1){
            System.out.print(" =  ");
         //else just add space
         } else {
         System.out.print("    ");
         }
         for(int j = 0; j < 3; j++){ 
            System.out.print(addMatrix(matrix1, matrix2)[i][j] + " ");
         }
         System.out.print("\n");
      }
      
   }

   public static double[][] addMatrix(double[][] a, double[][] b){
      double[][] sum = new double[3][3];
      for(int i = 0; i < 3; i++){
         for(int j = 0; j < 3; j++){
            //add matrix 1 and matrix 2
            sum [i][j] = a[i][j] + b[i][j]; 
         }
      }
      //return sum
      return sum;
   }


}
