import java.util.Scanner;


public class Chapter1 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner input = new Scanner(System.in);
      Global global = new Global();
      
      System.out.println("A Rose By Any Other Name");
      global.enter();
      
      //character name
      System.out.println("Please enter your character's name: ");
      System.out.print(">> ");
      String username = input.nextLine();
      global.setName(username);
      System.out.println();
            
      System.out.println("ACT 1");
      System.out.println("~Chapter 1~");
      System.out.println();
      
      System.out.println("You wake up from your short rest. After all, life on a farm doesn't\n"
            + "exactly come with luxurious deep sleep. After yawning and stretching out your\n" 
            + "now unstiff arms, you make your way to your shabby mirror. It comes at no surprise,\n"
            + "but your hair is a mess. Caked with dried mud, animal feed, and something that smells rather\n"
            + "unpleasant, you don't exactly look like nobility. You let out a frustrated sigh as\n"
            + "you attempt to comb it through with your fingers and wash the grime off your face\n"
            + "once you deem yourself presentable, you make your way downstairs. After all, there's\n"
            + "always work to be done on a farm");
      System.out.println();
      
      //chore variables
      boolean hay = false;
      boolean pick = false;
      boolean water = false;
      
      System.out.println("\"" + global.getName() + ", time to do your chores!\"");
      System.out.println("With a sigh, you respond, \"Alright mama, what needs to be done?\"");
      System.out.println("\"Spread the hay, pick the crops, and water the plants for me, darling.\"");
      System.out.print(">> ");
      
      //while fields aren't complete, keep looping
      while(hay == false || pick == false || water == false){
         String chores = new String(input.nextLine());
         
         //if user types spread, mark as true
         if (chores.equals("spread hay") || chores.equals("spread the hay") || chores.equals("spread")){
            hay = true;
            System.out.println();
            System.out.println("You spread the hay");
         }
         //if user types pick, mark as true
         else if (chores.equals("pick crops") || chores.equals("pick the crops") || chores.equals("pick")){
            pick = true;
            System.out.println();
            System.out.println("You picked the crops"); 
         }
         //if user types water, mark as true
         else if (chores.equals("water plants") || chores.equals("water the plants") || chores.equals("water")){
            water = true;
            System.out.println();
            System.out.println("You watered the plants"); 
         }
         //skip for debugging
         else if (chores.equals("skip")){
            break; 
         }
         //if wrong thing is entered, reprompt
         else {
            System.out.println();
            System.out.println("You need to do your chores, " + global.getName() + "!"); 
            System.out.println();
         }
         if(hay == false || pick == false || water == false)
            System.out.print(">> ");
         
      } 
      System.out.println();
      System.out.println("You did the chores");
      System.out.println();
      
      System.out.println("\"" + global.getName() + "! Come here for a second?\"");
      System.out.println("You make your way to her. \"Yes, mama?\"");
      System.out.println("\"I have wonderful news! Your uncle here is taking you to court.\"");
      System.out.println("You paused for a moment, surprised. After all, you were nothing more\n" 
            + "than a farm girl. Court was never in the plan.");
      System.out.println();
      System.out.println("\"What?\" you ask.");
      System.out.println("\"You heard your mother right, " + global.getName() + ". I made some\n"
            + "connections at court, called in some favors, and was able to secure you a position\n"
            + "as a handmaiden. It's not exactly the most esteemed title, but perhaps you'll still\n"
            + "make a name for yourself and gain some influence. Goodness knows we could use it.\"");
      System.out.println("\"Your uncle's right. If you can gain the ear of anyone with influence\n"
            + "we might be able to save our farm.\"");
      //responses
      System.out.println();
      System.out.println("1. I've always wanted to go to court!");
      System.out.println("2. If this is what you need me to do, I'll do it.");
      System.out.println("3. I don't want to go.");
      System.out.print(">> ");
      int response = input.nextInt();
      
      switch (response - 1) {
      case 0:
         System.out.println();
         System.out.println("\"I'm so glad, honey, even though we'll miss you terribly\" Your mother says");
         break;
      case 1:
         System.out.println();
         System.out.println("\"I'm sorry we have to ask this of you, but it's what's best for our family\" says your mother");
         break;
      case 2:
         System.out.println();
         System.out.println("\"We don't want to have to send you, either. But we have no other choice\"");
         break;
      case 100:
         break;
      
      }
      
      boolean gotoroom = false;
      System.out.println();
      System.out.println("\"Why don't you go to your room and pack? Your uncle wants to get going in an hour.\"");
      System.out.print(">> ");
      input.nextLine();
      
      while(gotoroom == false){
         String room = new String(input.nextLine());
         
         if (room.equals("go to room") || room.equals("room")){
            gotoroom = true;
            System.out.println();
            System.out.println("You head to your room");
         }
         //skip for debugging
         else if (room.equals("skip")){
            break; 
         }
         //if wrong thing is entered, reprompt
         else {
            System.out.println();
            System.out.println("You need to go to your room, " + global.getName() + "!"); 
            System.out.println();
         }
         if(gotoroom == false)
            System.out.print(">> ");
      }
      System.out.println();
      System.out.println("You enter your room. Calling it modest would be an exaggeration. Your family\n"
            + "was not exactly well off, after all. You had a simple, hand-crafted bed with a make-shift\n"
            + "mattress, a cracked, dusty mirror on the wall, and a poor excuse for a chest laying at the\n"
            + "foot of your bed. The only thing of value in the entire room was your mother's hairbrush.\n"
            + "She gave it to you on your sixteenth birthday, and it was your most prized possession.");
      System.out.println();
      System.out.println("You hear a knock at your door.");
      
      boolean open = false;
      
      System.out.print(">> ");
      
      
      while(open == false){
         String door = new String(input.nextLine());
         
         if (door.equals("open door") || door.equals("open")){
            open = true;
            System.out.println();
            System.out.println("You open the door");
         }
         
         else if (door.equals("skip")){
            break; 
         }
         //if wrong thing is entered, reprompt
         else {
            System.out.println();
            System.out.println("You should open the door and see who's there"); 
            System.out.println();
         }
         if(open == false)
            System.out.print(">> ");
      }
      
      System.out.println();
      System.out.println("You see your mother standing there. She wraps you in a hug before handing you what appears\n"
            + "to be a small box wrapped in a cloth. You open it to reveal an assortment of strange metal instruments.\n"
            + "After looking at her inquisitively, she goes on to explain that it was your father's old lockpicking set\n"
            + "back when he worked as a locksmith.");
      System.out.println("\"You never know,\" she says, \"They might come in handy.\"");
      System.out.println();
      System.out.println("1. Thanks, mama. I appreciate it.");
      System.out.println("2. I suppose.");
      System.out.println("3. I doubt it.");
      System.out.print(">> ");
      
      int response2 = input.nextInt();
      
      switch (response2 - 1) {
      case 0:
         System.out.println("\"Of course, my dear " + global.getName()+ ". I'm going to miss you so much.\"");
         break;
      case 1:
         System.out.println("\"I hope so. Anyway, I should leave you to gather your things\"");
         break;
      case 2:
         System.out.println("\"I'm sorry," + global.getName() + "I'm just trying to help.\"");
         break;
      case 100:
         break;
      }
      
      System.out.println();
      System.out.println("With that, your mother turns and leaves.");
      System.out.println("Your attention is brought to the hairbrush on the chest. You only have room\n"
            + "for one more thing. The hairbrush your mother gave you is the most important thing you\n"
            + "own. The lockpicking set, however, could prove useful.");
      System.out.println("Which do you bring?");
      System.out.print(">> ");
      boolean choose = false;
      int choice = 0;
      
      while(choose == false){
         String bring = new String(input.next());
         
         if (bring.equals("take hairbrush") || bring.equals("hairbrush")){
            choose = true;
            choice = 0;
         }
         
         else if (bring.equals("take lockpick") || bring.equals("lockpick")){
            choose = true;
            choice = 1;
         }
         //if wrong thing is entered, reprompt
         else {
            System.out.println();
            System.out.println("You need to pick one"); 
            System.out.println();
         }
         if(choose == false)
            System.out.print(">> ");
      }
      
      switch (choice) {
      case 0:
         System.out.println();
         System.out.println("You grab the hairbrush and shove it into your bag. As if on cue, your name is called.");
         global.setPack(0);
         break;
      case 1:
         System.out.println();
         System.out.println("You grab the lockpick and shove it into your bag. As if on cue, your name is called.");
         global.setPack(1);
         break;
      }
      
      System.out.println("You make your way downstairs and hand your uncle your bag. He secures it in the carriage\n"
            + "and let's you know he's ready to go. You hug your mother one last time before climbing into the\n"
            + "carriage and saying goodbye to the only world you have ever known.");
      System.out.println();
      System.out.println("~End of Chapter 1~");
      System.out.println();
      global.enter();
      //launch chapter 2
      String[] x = {};
      Chapter2.main(x);
   }
}
