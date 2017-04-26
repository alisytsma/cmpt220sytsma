import java.util.ArrayList;
import java.util.Random;

public class Sort {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      ArrayList<Number> list = new ArrayList<>();
      Random random = new Random();
      for (int i = 0; i < 10; i++) {
          list.add((int)(Math.random() * 10));
      }
      System.out.println("Before sorting: " + list);
      sort(list);
      System.out.println("After sorting: " + list);
   }
   
   public static void sort(ArrayList<Number> list){
      //find smallest index
      boolean sorted;
      Number temp;
      do {
         sorted = true;
         for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).doubleValue() > list.get(i + 1).doubleValue()) {
               temp = list.remove(i);
               list.add(i + 1, temp);
               sorted = false;
            }
         }
      } while (!sorted);
   }
}
