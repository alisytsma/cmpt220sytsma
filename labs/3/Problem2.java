public class Problem2 {
  public static void main(String[] args){
    //create table with 6 lines
    final Object[][] table = new String[6][];
    //each line has 5 items
    table[0] = new String[] { "Kilograms", "Pounds", "|", "Pounds", "Kilograms" };
    table[1] = new String[] { "1", "2.2 ", "|", "20", "9.09" };
    table[2] = new String[] { "3", "6.6 ", "|", "25", "11.36" };
    table[3] = new String[] { "...", " ", " ", " ", " " };
    table[4] = new String[] { "197", "433.4 ", "|", "510", "231.82" };
    table[5] = new String[] { "199", "437.8 ", "|", "515", "234.09" };
    
    for (final Object[] row : table) {
      //print out each row with proper spacing
      System.out.format("%15s%15s%15s%15s%15s\n", row);
    }
  }
}
