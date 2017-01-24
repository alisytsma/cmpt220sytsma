import java.util.Scanner;

public class Problem4 {
	
  public static void main(String[] args){
		
    Scanner input = new Scanner(System.in);
    //prompt the user to enter their number
    System.out.print("Enter a number between 1 and 1000: ");
	    
    double num = input.nextDouble();
	//if number meets requirements, run calculation    
    if (num < 1000 && num > 0){
	    
      double mod1 = num % 10;
      num = num / 10;
      double mod2 = num % 10;
      num = num / 10;
      double mod3 = num % 10;
	  //round numbers down then add them  
      double calc = Math.floor(mod1) + Math.floor(mod2) + Math.floor(mod3);
	    
      //print sum of digits	  
      System.out.println("The sum of the digits is " + calc);
    } 
    
    else {
    	//if number doesn't meet requirements, let user know
    	System.out.println("Not a valid number.");
    }
  }
}
