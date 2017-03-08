public class Problem1 {

    public static void main(String[] args) {
       // Create a rectangle with height set to 40 and width set to 4
       Rectangle rectangle1 = new Rectangle(4,40);
       print(rectangle1);
       
       // Create a rectangle with height set to 35.9 and width set to 3.5
       Rectangle rectangle2 = new Rectangle(3.5,35.9);
       print(rectangle2);

    }
    
    //prints stats
    public static void print(Rectangle rectangle) {
       System.out.println("Width:    " + rectangle.width);
       System.out.println("Height:   " + rectangle.height);
       System.out.println("Area:     " + rectangle.getArea());
       System.out.println("Perimeter " + rectangle.getPerimeter());
       System.out.println();
    }

}

class Rectangle {
   double width;
   double height;
    
   //default rectangle
   Rectangle() {
      width = 1;
      height = 1;
   }
    
   //if values entered
   Rectangle(double newWidth, double newHeight) {
      width = newWidth;
      height = newHeight;
   }
    
   //return area of the rectangle
   double getArea() {
      return width * height;
   }
    
    //return the perimeter of the rectangle
   double getPerimeter() {
      return width + width + height + height;
   }
    
   //sets new width and height if entered
   void setStats(double newWidth, double newHeight) {
      width = newWidth;
      height = newHeight;
   }
}
