import java.util.Scanner;

public class Problem4 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner input = new Scanner(System.in);
      
      //adds users number to array
      System.out.print("Enter list: ");
      int length = input.nextInt();
      int[] list = new int[length];
      
      for(int i = 1; i < list.length; i++){  
         list[i] = input.nextInt();
      }
      
      //if true, print is sorted, if false, print is not sorted
      if (isSorted(list) == true){
         System.out.print("The list is sorted");
      } else {
         System.out.print("The list is not sorted");
      }
   }
   

   public static boolean isSorted(int[] list){
      boolean sort = false;
      for(int i = 0; i <= list.length; i++){
         for(int j = 1; j + i < list.length; j++){
            //if the list doesn't need to be rearranged, sort is true
            if(list[i] < list[i + j]){ // JA: This should be <= to account for repeated numbers
               sort = true;
            //if it does, sort is false
            } else {
               sort = false;
               return false;
            }
         }
      } 
      if(sort == true){
         return true;
      } else {
         return false;
      }
   }
}
