
import java.util.Scanner;


public class Global {
   //name
   private String name;

   //relationships
   private int marcella;
   private int florence;
   private int jaime;
   private int lucas;
   private int laith;
   
   //act 1 decisions
   private int pack; //hairbrush: 0, lockpick: 1
   private int steal; //stole: 1, didn't 0
   private int invite; //invited: 1, florence told you: 2, eavesdropped: 0
   //act 2 decisions
   private int dance;
   private int court;
   private int blame;
   private int sneak;
   
   
   public void enter(){
      Scanner input = new Scanner(System.in);
      System.out.println("Press enter to continue");
      String start = input.nextLine();
      while(!start.equals("")){
         if(start.equals(""));
               break;
      }  
   }
   
   //get name
   public String getName(){
      return name;
   }
   
   //get relationships
   public int getMarcella(){
      return marcella;
   }
   
   public int getFlorence(){
      return florence;
   }
   
   public int getJaime(){
      return jaime;
   }
   
   public int getLucas(){
      return lucas;
   }
   
   public int getLaith(){
      return laith;
   }
   
   //get act 1 decisions
   public int getPack(){
      return pack;
   }   
   
   public int getSteal(){
      return steal;
   }
   
   //get act 2 decisions
   public int getInvite(){
      return invite;
   }
   
   public int getDance(){
      return dance;
   }
   
   public int getCourt(){
      return court;
   }
   
   public int getBlame(){
      return blame;
   }
   
   public int getSneak(){
      return sneak;
   }
   
   //get name
   public void setName(String name){
      this.name = name;
   }
   
   //set relationships
   public void setMarcella(int marcella){
      this.marcella = marcella;
   }
   
   public void setFlorence(int florence){
      this.florence = florence;
   }
   
   public void setJaime(int jaime){
      this.jaime = jaime;
   }
   
   public void setLucas(int lucas){
      this.lucas = lucas;
   }
   
   public void setLaith(int laith){
      this.laith = laith;
   }
   
   //set act 1 decisions
   public void setPack(int pack){
      this.pack = pack;
   }
   
   public void setSteal(int steal){
      this.steal = steal;
   }
   
   //set act 2 decisions
   public void setInvite(int invite){
      this.invite = invite;
   }
   
   public void setDance(int dance){
      this.dance = dance;
   }
   
   public void setCourt(int court){
      this.court = court;
   }
   
   public void setBlame(int blame){
      this.blame = blame;
   }
   
   public void setSneak(int sneak){
      this.sneak = sneak;
   }
   
   public String getHighestRelationship(){
      if(jaime > lucas){
         if(jaime > laith)
            return "Jaime";
         else if(jaime < laith)
            return "Laith";
         else
            return "Lucas";
      }
      return "";
   }
}
