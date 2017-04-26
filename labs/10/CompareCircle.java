public class CompareCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(5);
        
        if(circle1.compareTo(circle2) == -1){
           System.out.println("Circle 2 is the bigger circle");
        } else if(circle1.compareTo(circle2) == 1){
           System.out.println("Circle 1 is the bigger circle");
        } else{
           System.out.println("They are equal");
        }
        
        System.out.println("Circle1: ");
        System.out.println("Area: " + circle1.getArea());
        System.out.println("Perimeter: " + circle1.getPerimeter());
        System.out.println("Diameter: " + circle1.getDiameter());
        
        System.out.println("Circle2: ");
        System.out.println("Area: " + circle2.getArea());
        System.out.println("Perimeter: " + circle2.getPerimeter());
        System.out.println("Diameter: " + circle2.getDiameter());
    }
}

abstract class GeometricObject2 {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    /** Construct a default geometric object */
    protected GeometricObject2() {
        dateCreated = new java.util.Date();
    }

    /** Construct a geometric object with color and filled value */
    protected GeometricObject2(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    /** Return color */
    public String getColor() {
        return color;
    }

    /** Set a new color */
    public void setColor(String color) {
        this.color = color;
    }

    /** Return filled. Since filled is boolean,
     *  the get method is named isFilled */
    public boolean isFilled() {
        return filled;
    }

    /** Set a new filled */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /** Get dateCreated */
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    /** Return a string representation of this object */
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color +
                " and filled: " + filled;
    }

    /** Abstract method getArea */
    public abstract double getArea();

    /** Abstract method getPerimeter */
    public abstract double getPerimeter();
}

class Circle extends GeometricObject2 implements Comparable<Circle>{
    private static double radius;

    public Circle() {
    }

    public Circle(double radius) {
        Circle.radius = radius;
    }

    /** Return radius */
    public double getRadius() {
        return radius;
    }

    /** Set a new radius */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /** Return area */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /** Return diameter */
    public double getDiameter() {
        return 2 * radius;
    }

    /** Return perimeter */
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    /* Print the circle info */
    public void printCircle() {
        System.out.println("The circle is created " + getDateCreated() +
                " and the radius is " + radius);
    }

    @Override
    public int compareTo(Circle o) {
        if (this.equals(o)) {
            return 0;
        } else if (this.radius > o.radius) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public boolean equals(Object o){
        return o instanceof Circle && this.radius == ((Circle) o).radius;
    }
}