import java.util.Scanner;

public class Problem4 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner input = new Scanner(System.in);
      System.out.print("Please enter a: ");
      double a = input.nextDouble();
      System.out.print("Please enter b: ");
      double b = input.nextDouble();
      System.out.print("Please enter c: ");
      double c = input.nextDouble();
      System.out.print("Please enter d: ");
      double d = input.nextDouble();
      System.out.print("Please enter e: ");
      double e = input.nextDouble();
      System.out.print("Please enter f: ");
      double f = input.nextDouble();
      
      LinearEquation linearEquation = new LinearEquation(a, b, c, d, e, f);
      System.out.println("x = " + linearEquation.getX());
      System.out.println("y = " + linearEquation.getY());
   }

}

class LinearEquation {
   private double a;
   private double b;
   private double c;
   private double d;
   private double e;
   private double f;
    
   LinearEquation(double a, double b, double c, double d, double e, double f) {
      this.a = a;
      this.b = b;
      this.c = c;
      this.d = d;
      this.e = e;
      this.f = f;
  }

   double getA() {
      return a;
   }

   double getB() {
      return b;
   }

   double getC() {
      return c;
   }

   double getD() {
      return d;
   }

   double getE() {
      return e;
   }

   double getF() {
      return f;
   }
   
   boolean isSolvable(){
      if (a * d - b * c == 0){
         return false;
      } else {
         return true;
      }
   }
   
   double getX() {
      return (e * d - b * f) / (a * d - b * c);
   }

   double getY() {
      return (a * f - e * c) / (a * d - b * c);
   }
}