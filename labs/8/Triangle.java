
public class Triangle extends GeometricObject {
   
   private double side1;
   private double side2;
   private double side3;
   
   //no args constructor
   Triangle(){
      side1 = 1.0;
      side2 = 1.0;
      side3 = 1.0; 
   }
   //constructor
   Triangle(double side1, double side2, double side3){
      this.side1 = side1;
      this.side2 = side2;
      this.side3 = side3;
   }
   //get sides
   double getSide1(){
      return side1;
   }
   
   double getSide2(){
      return side2;
   }
   double getSide3(){
      return side3;
   }
   //set sides
   void setSide1(double side1){
      this.side1 = side1;
   }
   
   void setSide2(double side2){
      this.side2 = side2;
   }
   
   void setSide3(double side3){
      this.side3 = side3;
   }
   //get area
   double getArea(){
      double s = (side1 + side2 + side3) / 2;
      return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
   }
   //get perimeter
   double getPerimeter(){
      return side1 + side2 + side3;
   }
   //to string
   public String toString(){
      return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
   }
}
