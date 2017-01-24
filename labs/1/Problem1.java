public class Problem1 {
  public static void main(String[] args){
    //create table with 5 lines
    final Object[][] table = new String[5][];
    //each line has 3 items
    table[0] = new String[] { "a", "a^2", "a^3" };
    table[1] = new String[] { "1", "1", "1" };
    table[2] = new String[] { "2", "4", "8" };
    table[3] = new String[] { "3", "9", "27" };
    table[4] = new String[] { "4", "16", "64" };
    
    for (final Object[] row : table) {
      //print out each row with proper spacing
      System.out.format("%15s%15s%15s\n", row);
	}
  }
}
