
abstract class GeometricObject implements Comparable<GeometricObject> {
   //variables
   private String color = "white";
   private boolean filled;
   private java.util.Date dateCreated;
   private double radius;
   
   //no args constructor
   public GeometricObject(){
      dateCreated = new java.util.Date();
   }
   
   //constructor
   public GeometricObject(String color, boolean filled){
      this.color = color;
      this.filled = filled;
   }
   
   //comparable
   public abstract double getArea();

   static GeometricObject Max(GeometricObject o1,GeometricObject o2) throws NullPointerException{
       if (o1 == null || o2 == null) {
           throw new NullPointerException();
       }
       return o1.compareTo(o2) >= 0 ? o1 : o2;
   }

   @Override
   public int compareTo(GeometricObject o) {
       if (getArea() > o.getArea())
           return 1;
       else if (getArea() < o.getArea())
           return -1;
       else
           return 0;
   }
   
   
   //get and set color
   String getColor(){
      return color;
   }
   
   void setColor(String color){
      this.color = color;
   }
   
   //get and set filled
   boolean isFilled(){
      return filled;
   }
   
   void setFilled(boolean filled){
      this.filled = filled;
   }
   
   //get date
   public java.util.Date getDateCreated(){
      return dateCreated;
   }
   
   //to string method
   public String toString(){
      return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
   }
   
   @Override
   public boolean equals(Object o){
       return o instanceof Circle && this.radius == ((Circle) o).getRadius();
   }
   
   public int compareTo(Circle o) {
       if (this.equals(o)) {
           return 0;
       } else if (this.radius > o.getRadius()) {
           return 1;
       } else {
           return -1;
       }
   }
}
