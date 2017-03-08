import java.util.GregorianCalendar;

public class Problem2 {
   public static void main(String[] args) {
      //current date
      GregorianCalendar gregorianCalendar1 = new GregorianCalendar();
      print(gregorianCalendar1);
      
      //elapsed time since Jan 1, 1970
      GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
      //sets time in milliseconds since Jan 1, 1970
      gregorianCalendar2.setTimeInMillis(1234567898765L);
      print(gregorianCalendar2);
   }
   
   //prints stats
   private static void print(GregorianCalendar gregorianCalendar) {
      System.out.printf("Year: ", gregorianCalendar.get(GregorianCalendar.YEAR));
      System.out.printf("Month: ", gregorianCalendar.get(GregorianCalendar.MONTH));
      System.out.printf("Day: ", gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH));
      System.out.println();
   }
    
}