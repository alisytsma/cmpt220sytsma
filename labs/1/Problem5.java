import java.util.Scanner;

public class Problem5 {

  public static void main(String[] args){
		
    Scanner input = new Scanner(System.in);
    //prompt the user to enter the numbers they'd like to use
    System.out.print("Enter v0, v1, and t: ");
			
    double v0 = input.nextDouble();
    double v1 = input.nextDouble();
    double t = input.nextDouble();
    
    //acceleration formula 
    double calc = (v1 - v0) / t;
		  
    //print average acceleration
    System.out.println("The average acceleration is " + calc);
	   
	}

}

