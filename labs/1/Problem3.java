import java.util.Scanner;

public class Problem3 {
	  
  public static void main(String[] args){
		
    Scanner input = new Scanner(System.in);
    //prompt the user to enter their numbers
    System.out.print("Enter subtotal and gratuity rate: ");
			
    double subtotal = input.nextDouble();
    double gratuity = input.nextDouble();
    
    //determine gratuity
    double grat = subtotal * (gratuity / 100);
    //add it to total
    double total = grat + subtotal;
		  
    //print out gratuity and total
    System.out.println("The gratuity is $" + grat + " and the total is $" + total);
	   
    }

}
