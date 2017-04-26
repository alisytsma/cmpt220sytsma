public class Square extends GeometricObject4 implements Colorable {
   public static void main(String[] args) {
      GeometricObject4[] shapes = generateShapesArray(5);
      displayShapeInfo(shapes);
   }

   private static void displayShapeInfo( GeometricObject4[] shapes) {
      for ( GeometricObject4 shape : shapes) {
         System.out.println(shape.getClass() + "\n   Area: " + shape.getArea());
         if (shape instanceof  Colorable) {
            System.out.print("   ");
            (( Colorable) shape).howToColor();
         }
      }
   }

   private static  GeometricObject4[] generateShapesArray(int size) {
      GeometricObject4[] shapes = new  GeometricObject4[size];
      for (int i = 0; i <shapes.length ; i++) {
         if ((int) (Math.random() * 2) == 0) {
            shapes[i] = new Square(i + 1);
         } else {
            shapes[i] = new Circle2(i + 1);
         }
      }
      return shapes;
   }
   
   private double side;

   public Square(double side) {
      this.side = side;
   }

   @Override
   public void howToColor() {
      System.out.println("Color all four sides.");
   }

   @Override
   public double getArea() {
      return side * side;
   }
   
}

interface Colorable{
   void howToColor();
}

abstract class GeometricObject4{
   public abstract double getArea();
}

class Circle2 extends GeometricObject4{
      private double radius;

      public  Circle2(double radius) {
         this.radius = radius;
      }

      public double getArea() {
         return Math.PI * radius * radius;
      }
}