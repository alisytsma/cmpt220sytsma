import java.util.Scanner;
import java.util.ArrayList;

public class List {

   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
      //user enters 5 numbers
      System.out.print("Enter 5 numbers: ");
      ArrayList<Integer> list = new ArrayList<>();
      //adds them to list
      for (int i = 0; i < 5; i++) 
         list.add(input.nextInt());
      //sort
      sort(list);
      System.out.println(list);

   }

   public static void sort(ArrayList<Integer> list) {
      //find current min and index
      for (int i = 0; i < list.size() - 1; i++) {
         int currentMin = list.get(i);
         int currentIndex = i;
         
         for (int j = i + 1; j < list.size(); j++) {
            if (currentMin > list.get(j)) {
               currentMin = list.get(j);
               currentIndex = j;
            }
         }
         //set smallest index and number as currentMin and i
         if (currentIndex != i) {
            list.set(currentIndex, list.get(i));
            list.set(i, currentMin);
         }
      }
   }
}