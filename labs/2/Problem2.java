import java.util.Scanner;

public class Problem2 {
   
   public static void main(String[] args) {
   // TODO Auto-generated method stub
      Scanner input = new Scanner(System.in);
      //user inputs day and elapsed days
      System.out.print("Enter today's day: ");
      int day = input.nextInt();
      
      System.out.print("Enter the number of days elapsed since today: ");
      int eday = input.nextInt();
      
      int day2 = day + eday;
      String date = "";
      String date2 = "";
      
      //if user enters 0, day is set to Sunday
      if (day == 0){
         date = "Sunday";
      }
      
      //if user enters 1, day is set to Monday
      if (day == 1){
         date = "Monday";
      }
      
      //if user enters 2, day is set to Tuesday
      if (day == 2){
         date = "Tuesday";
      }
      
      //if user enters 3, day is set to Wednesday
      if (day == 3){
         date = "Wednesday";
      }
      
      //if user enters 4, day is set to Thursday
      if (day == 4){
         date = "Thursday";
      }
      
      //if user enters 5, day is set to Friday
      if (day == 5){
         date = "Friday";
      }
      
      //if user enters 6, day is set to Saturday
      if (day == 6){
         date = "Saturday";
      }
      
    //if user enters 0, day is set to Sunday
      if (day2 == 0){
         date2 = "Sunday";
      }
      
      //if user enters 1, day is set to Monday
      if (day2 == 1){
         date2 = "Monday";
      }
      
      //if user enters 2, day is set to Tuesday
      if (day2 == 2){
         date2 = "Tuesday";
      }
      
      //if user enters 3, day is set to Wednesday
      if (day2 == 3){
         date2 = "Wednesday";
      }
      
      //if user enters 4, day is set to Thursday
      if (day2 == 4){
         date2 = "Thursday";
      }
      
      //if user enters 5, day is set to Friday
      if (day2 == 5){
         date2 = "Friday";
      }
      
      //if user enters 6, day is set to Saturday
      if (day2 == 6){
         date2 = "Saturday";
      }
      
      //prints day and future day
      System.out.print("Today is " + date + " and the future date is " + date2);
      
   }
}
