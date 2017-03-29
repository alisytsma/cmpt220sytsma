import java.util.Scanner;

public class testingTriangle {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner input = new Scanner(System.in);
      
      Triangle triangle = new Triangle();
      //user enters sides
      System.out.print("Enter 3 sides: ");
      triangle.setSide1(input.nextDouble());
      triangle.setSide2(input.nextDouble());
      triangle.setSide3(input.nextDouble());
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
