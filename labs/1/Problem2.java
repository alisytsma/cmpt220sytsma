import java.util.Scanner;

public class Problem2 {
  public static void main(String[] args){
	
    Scanner input = new Scanner(System.in);
    //prompt the user to enter the number they'd like to convert
    System.out.print("Enter a degree in Celsius: ");
		
    double num = input.nextDouble();
	  
    //formula to convert Fahrenheit to Celsius
    System.out.println((9. / 5) * num + 32);
    }
}
