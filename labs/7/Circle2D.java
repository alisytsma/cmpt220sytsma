public class Circle2D {
   //variables
   double x;
   double y;
   double radius;
   //no args constructor
   Circle2D() {
      x = 0;
      y = 0;
      radius = 1;
   }
   //constructor
   Circle2D(double x, double y, double radius) {
      this.x = x;
      this.y = y;
      this.radius = radius;
   }
   //get x, y and radius
   double getX() {
      return x;
   }

   double getY() {
      return y;
   }

   double getRadius() {
      return radius;
   }
   //get area and perimeter
   double getArea() {
      return Math.PI * radius * radius;
   }

   double getPerimeter() {
      return 2 * Math.PI * radius;
   }
   //see if it contains a point
   boolean contains(double x, double y) {
      return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2)) < radius;
   }
   //see if it contains a circle
   boolean contains(Circle2D circle) {
      return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2)) <= Math.abs(radius - circle.radius);
   }
   //see if it overlaps with a circle
   boolean overlaps(Circle2D circle) {
      return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2)) <= radius + circle.radius && !contains(circle);
   }
}

