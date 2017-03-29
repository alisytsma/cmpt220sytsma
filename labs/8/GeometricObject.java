
public class GeometricObject {
   //variables
   private String color = "white";
   private boolean filled;
   private java.util.Date dateCreated;
   
   //no args constructor
   public GeometricObject(){
      dateCreated = new java.util.Date();
   }
   
   //constructor
   public GeometricObject(String color, boolean filled){
      this.color = color;
      this.filled = filled;
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
}
