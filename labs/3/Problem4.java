
public class Problem4 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      
      //do equation 100 times
      for(int num = 0; num < 100;num ++){
         //10 per line
         for (int i = 0; i < 10; i++){
            System.out.print(num * ((3 * num) - 1) / 2 + " ");
         }
        System.out.print("\n");
      }
      
   }

}
