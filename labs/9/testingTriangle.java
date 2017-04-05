import java.util.Scanner;

public class testingTriangle {

   public static void main(String[] args) throws IllegalTriangleException{
      // TODO Auto-generated method stub
      Scanner input = new Scanner(System.in);

      // create triangle
      Triangle triangle = new Triangle();
      boolean entered = false;

      System.out.println("Enter three sides: ");
      
      //while not entered, loop
      while (!entered) {
          try {
              double side1 = input.nextDouble();
              double side2 = input.nextDouble();
              double side3 = input.nextDouble();
              triangle = new Triangle(side1, side2, side3);
              entered = true;
          }
          //catch exception
          catch (IllegalTriangleException ex) {
              System.out.println(ex.getMessage());
              System.out.print("Enter three sides:  ");
              input.nextLine();
          }
      }
      
      //enter color
      System.out.print("Enter the color: ");
      triangle.setColor(input.next());
      //enter filled or not
      System.out.print("Filled? True or False ");
      triangle.setFilled(input.nextBoolean());
      //print
      System.out.println(triangle.toString());
      System.out.println("The color is " + triangle.getColor());
      System.out.println("The perimeter is " + triangle.getPerimeter());
      System.out.println("The area is " + triangle.getArea());
      System.out.println("Filled? " + triangle.isFilled());
             
  }

}
