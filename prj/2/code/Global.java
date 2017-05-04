
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
   private int go;
   private int dance;
   private int court;
   private int blame;
   private int help;
   
   //endings
   private int alive;
   private int remain;
   private int family;
   
   
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
   
   public int getGo(){
      return go;
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
   
   
   public int getHelp(){
      return help;
   }
   
   //endings
   public int getAlive(){
      return alive;
   }
   
   public int getRemain(){
      return remain;
   }
   
   public int getFamily(){
      return family;
   }
   
   //set name
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
   //0 = lockpick, 1 = hairbrush
   public void setPack(int pack){
      this.pack = pack;
   }
   
   //0 = don't steal, 1 = steal
   public void setSteal(int steal){
      this.steal = steal;
   }
   
   //set act 2 decisions
   //0 = don't go, 1 = go
   public void setGo(int go){
      this.go = go;
   }
   
   //0 = not invited, 1 = invited by date, 2 = florence tells
   public void setInvite(int invite){
      this.invite = invite;
   }
   
   //0 = don't dance, 1 = dance
   public void setDance(int dance){
      this.dance = dance;
   }
   //0 = don't court, 1 = Jaime, 2 = Laith, 3 = Lucas
   public void setCourt(int court){
      this.court = court;
   }
   //0 = don't blame, 1 = blame
   public void setBlame(int blame){
      this.blame = blame;
   }
   
   //0 = no one helps, 1 = Florence helps, 2 = Marcella helps, 3 = courting helps
   public void setHelp(int help){
      this.help = help;
   }
   
   //0 = Alive, 1 = Dead
   public void setAlive(int alive){
      this.alive = alive;
   }
   
   //0 = Remain, 1 = don't remain, 2 = dead
   public void setRemain(int remain){
      this.remain = remain;
   }
   
   //0 = Family supported, 1 = not supported
   public int setFamily(int family){
      return family;
   }
   
   public String getHighestRelationship(){
      if(jaime > lucas && jaime > laith)
         return "Jaime";
      else if(laith > jaime && laith > lucas)
         return "Laith";
      else
         return "Lucas";
   }
}
