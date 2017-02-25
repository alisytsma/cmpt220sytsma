
public class Problem8 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      int[][] list = new int[4][4];
      for(int i = 0; i < 4; i++){  
         for(int j = 0, num = -3; j < 4; j++, num++){
            //randomly generate matrix
            list[i][j] = (int)(Math.random() + .5);
            System.out.print(list[i][j]);
            if(num % 4 == 0){
               System.out.print("\n");
            }
         }
      }
      
      int row = 0;
      int rHighest = 0;
      int rowIndex = 0;
      for(int i = 0; i < 4; i++){  
         //add row
         for(int j = 0; j < 4; j++){
            row += list[i][j];
         }
         //if row is higher than previous highest, replace
         if(row > rHighest){
            rHighest = row;
            rowIndex = i;
         }
         //set row back to 0
         row = 0;
      }

      int column = 0;
      int cHighest = 0;
      int columnIndex = 0;
      for(int i = 0; i < 4; i++){  
         //add column
         for(int j = 0; j < 4; j++){
            column += list[j][i];
         }
         //if column is higher than previous highest, replace
         if(column > cHighest){
            cHighest = row; // JA: This should be column
            columnIndex = i; // JA: This should be j
         }
         //set back to 0
         column = 0;
      }
      //print results
      System.out.println("The largest row index: " + rowIndex);
      System.out.println("The largest column index: " + columnIndex);
    
      
   }

}
