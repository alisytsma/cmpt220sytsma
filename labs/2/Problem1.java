import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		//Create a Scanner
		Scanner input = new Scanner(System.in);
		
		//user enters 3 numbers
		System.out.print("Enter 3 numbers: ");
		
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		
		//asks user the sum of their numbers
		System.out.print("What is " + num1 + " + " + num2 + " + " + num3 + "? ");
	
		int answer = input.nextInt();
		
		//says if their answer is true or false
		System.out.print(num1 + " + " + num2 + " + " + num3 + " = " + answer
				+ " is " + (num1 + num2 + num3 == answer));
	}

}
