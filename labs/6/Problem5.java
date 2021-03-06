import java.util.Scanner;

public class Problem5 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner input = new Scanner(System.in);
      //enter number of rows and columns
      System.out.print("Enter the number of rows and columns in the array: ");
      int rows = input.nextInt();
      int columns = input.nextInt();
      double[][] array = new double [rows][columns];
      //enter the array
      System.out.print("Enter the array: ");
      for (int i = 0; i < rows; i++){
         for(int j = 0; j < columns; j++){
           array[i][j] = input.nextDouble();
         }
      } 
      //print location
      Location location = Location.locateLargest(array);
      System.out.println(location.toString());
            
   }
   
}

class Location {
   //variables
   int row;
   int column;
   double maxValue;
   //set variables equal to themselves
   Location(int row, int column, double maxValue) {
      this.row = row;
      this.column = column;
      this.maxValue = maxValue;
   }
   //find the largest number and its location
   public static Location locateLargest(double[][] a){
      Location location = new Location(0, 0, a[0][0]);
      for (int r = 0; r < a.length; r++) {
          for (int c = 0; c < a[r].length; c++) {
              if (a[r][c] > location.maxValue)
                  location = new Location(r, c, a[r][c]);
          }
      }
      return location;
   }
   
   public String toString() {
      //print
      return String.format("The location of the largest element is " + maxValue + " at (" + row + ", " +
            column + ").");
  }
   
}
