import java.util.ArrayList;
import java.util.Scanner;

public class Duplicates {

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      //user enters numbers
      System.out.print("Enter 10 integers: ");
      //create array list
      ArrayList<Integer> list = new ArrayList<>();
      //add input to array
      for (int i = 0; i < 10; i++) 
         list.add(input.nextInt());
      //remove duplicates
      removeDuplicate(list);
      //print
      System.out.println(list);
   }

   public static void removeDuplicate(ArrayList<Integer> list) {
      //temp array
      ArrayList<Integer> temp = new ArrayList<>();
      for (int i = 0; i < list.size(); i++) {
         //if temp doesn't contain, get i and add it to temp list
         if (!temp.contains(list.get(i))) {
            temp.add(list.get(i));
         }
      }
      //clear list
      list.clear();
      //add temp to list
      list.addAll(temp);
    }
}