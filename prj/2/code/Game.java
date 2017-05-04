
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Game {

   public static void main(String[] args) throws IOException {
      // TODO Auto-generated method stub
      Scanner input = new Scanner(System.in);
      Global global = new Global();
      
      //run chapters
      chapter1act1(global, input);
      chapter2act1(global, input);
      chapter3act1(global,input);

      chapter1act2(global,input);
      chapter2act2(global,input);
      chapter3act2(global,input);
      
      //print stats
      printStats(global,input);
   }
   

   public static void chapter1act1(Global global, Scanner input){
      
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
      
      //tutorial
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
      int response = 0;
      
      boolean continueInput = true;
      
      do { 
         try {
            System.out.print(">> ");
            response = input.nextInt();
            if(response > 4 || response < 1){
               System.out.println();
               System.out.println("Not a valid response");
               System.out.println();
            }
            else
               continueInput = false;
            
         } catch (InputMismatchException ex){
            System.out.println();
            System.out.println("You need to respond!");
            System.out.println();
            input.nextLine();
         }
         
      } while (continueInput);
      
      //response
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
      //response
      System.out.println("1. Thanks, mama. I appreciate it.");
      System.out.println("2. I suppose.");
      System.out.println("3. I doubt it.");
      int response2 = 0;
      boolean continueInput2 = true;
      
      do { 
         try {
            System.out.print(">> ");
            response2 = input.nextInt();
            if(response2 > 4 || response2 < 1){
               System.out.println();
               System.out.println("Not a valid response");
               System.out.println();
            }
            else
               continueInput2 = false;
            
         } catch (InputMismatchException ex){
            System.out.println();
            System.out.println("You need to respond!");
            System.out.println();
            input.nextLine();
         }
         
      } while (continueInput2);
            
      
      System.out.println();
      //response
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
      //first choice
      System.out.println("Which do you bring?");
      System.out.print(">> ");
      boolean choose = false;
      int choice = 0;
      
      while(choose == false){
         String bring = new String(input.next());
         
         if (bring.equals("take hairbrush") || bring.equals("hairbrush")){
            global.setMarcella(global.getMarcella() + 1);
            global.setFlorence(global.getFlorence() + 1);
            global.setLaith(global.getLaith() + 1);
            global.setJaime(global.getJaime() + 1);
            global.setLucas(global.getLucas() + 1);
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
   }
   //chapter 2
   public static void chapter2act1(Global global, Scanner input){
      
      System.out.println("~Chapter 2~");
      System.out.println();
      
      System.out.println("You've been sitting silently in the carriage for a few hours now, watching the trees and villages pass you by. That is\n"
            + "until your uncle decides to break the silence.");
      System.out.println("\"Court truly is marvelous. I just know you'll love it.\"");
      System.out.println();
      //response
      System.out.println("1. I know so too.");
      System.out.println("2. I suppose I'll keep an open mind.");
      System.out.println("3. I doubt it.");
      
      int response1 = 0;
      boolean continueInput = true;
      
      do { 
         try {
            System.out.print(">> ");
            response1 = input.nextInt();
            if(response1 > 4 || response1 < 1){
               System.out.println();
               System.out.println("Not a valid response");
               System.out.println();
            }
            else
               continueInput = false;
            
         } catch (InputMismatchException ex){
            System.out.println();
            System.out.println("You need to respond!");
            System.out.println();
            input.nextLine();
         }
         
      } while (continueInput);
      
      switch (response1 - 1) {
      case 0:
         System.out.println();
         System.out.print("\"There's endless opportunities there. Not to mention all the dances and\n"
               + "dresses and romance. ");
         break;
      case 1:
         System.out.println();
         System.out.print("\"That's always good to do. After all, there's so much to do. I'm sure you'll\n"
               + "have the time of your life. ");
         break;
      case 2:
         System.out.println();
         System.out.print("\"Well, not with that attitude. I'm sure you'll have fun if you keep an open mind\n"
               + "about it all. ");
         break;
      case 100:
         break;
      
      }
      
      System.out.println("And who knows, maybe we'll be able to find you a decent match.\"");
      System.out.println();
      //response
      System.out.println("1. Maybe if I'm lucky");
      System.out.println("2. Perhaps, depending on who it is");
      System.out.println("3. I hope you don't expect me to marry");
      
      int response2 = 0;
      boolean continueInput2 = true;
      
      do { 
         try {
            System.out.print(">> ");
            response2 = input.nextInt();
            if(response2 > 4 || response2 < 1){
               System.out.println();
               System.out.println("Not a valid response");
               System.out.println();
            }
            else
               continueInput2 = false;
            
         } catch (InputMismatchException ex){
            System.out.println();
            System.out.println("You need to respond!");
            System.out.println();
            input.nextLine();
         }
         
      } while (continueInput2);
      //response
      switch (response2 - 1) {
      case 0:
         System.out.println();
         System.out.print("\"Don't worry, you'll have no trouble. You're a very charming young girl.");
         break;
      case 1:
         System.out.println();
         System.out.print("\"Don't worry, I'll make sure you find a proper suitor.");
         break;
      case 2:
         System.out.println();
         System.out.print("\"It could benefit your family. You need to put them first.");
         break;
      case 100:
         break;
      }
      
      System.out.println(" But anyway, are you\nfamiliar with the lady you'll be serving at court? Her name"
            + " is Lady Marcella, she's very kind.\"");
      System.out.println();
      //response
      System.out.println("1. No, I don't believe I have");
      System.out.println("2. I don't remember");
      System.out.println("3. I don't know and I don't care");
      
      int response3 = 0;
      boolean continueInput3 = true;
      
      do { 
         try {
            System.out.print(">> ");
            response3 = input.nextInt();
            if(response3 > 4 || response3 < 1){
               System.out.println();
               System.out.println("Not a valid response");
               System.out.println();
            }
            else
               continueInput3 = false;
            
         } catch (InputMismatchException ex){
            System.out.println();
            System.out.println("You need to respond!");
            System.out.println();
            input.nextLine();
         }
         
      } while (continueInput3);
      //response
      switch (response3 - 1) {
      case 0:
         System.out.println();
         System.out.print("\"I'm sure you two will get along very nicely. ");
         break;
      case 1:
         System.out.println();
         System.out.print("\"Better get used to that. You'll meet so many people you won't be able to\n\""
               + "keep them all straight. ");
         break;
      case 2:
         System.out.println();
         System.out.print("\"There's no need for that. ");
         break;
      case 100:
         break;
      }
      //response depending on how convo went
      if ((response1 + response2 + response3) < 5)
         System.out.println("I'm so glad you're excited.\"");
      else if ((response1 + response2 + response3) > 7)
         System.out.println("I hope you'll change your mind about this situation when we get there\"");
      else 
         System.out.println("Oh look, we're almost there.\"");
      
      //arrive at court
      System.out.println();
      System.out.println("You look outside the carriage window and see the castle in the distance growing\n"
            + "by the second. Your stomach begins to fill with equal parts nerves and excitment. Who knows\n"
            + "what life at court will have in store for you? Eventually, you come to a hault and are greeted\n"
            + "by guards. After identifying yourselves, you are escorted into what you can only assume is the\n"
            + "courtyard. It's unlike anything you've ever seen. Beautiful decorative fountains, green freshly-kept\n"
            + "grass, and people conversing all around you.");
      System.out.println();
      //people descriptions
      System.out.println("There's three people in particular your uncle points out to you. He brings your attention\n"
            + "first to a young looking man leaning on a fountain and laughing. His name is Jaime, a renowned bard.\n"
            + "However, it's a well known fact that bards don't exactly have the biggest income. He may have fame, but\n"
            + "he most likely lacks money. The next man your uncle points out is an older looking man by the name of\n"
            + "Lucas. While not the most attractive or age appropriate, he is very well off and could most likely\n"
            + "provide financial assistance to your family. Lastly, your attention is brought to a man named Laith.\n"
            + "He apparently is the son of a merchant. While attractive, he holds no title and lacks power.\n");
      System.out.println("Who do you want to talk to?");
      System.out.print(">>");
      boolean choose = false;
      input.nextLine();
      int interact = 0;
      //choose who to talk to
      while(choose == false){
         String talk = new String(input.next());
         
         if (talk.equals("Jaime") || talk.equals("jaime")){
            choose = true;
            global.setJaime(global.getJaime() + 1);
            interact = 0;
         }
         
         else if (talk.equals("Lucas") || talk.equals("lucas")){
            choose = true;
            global.setLucas(global.getLucas() + 1);
            interact = 1;
         }
         
         else if (talk.equals("Laith") || talk.equals("laith")){
            choose = true;
            global.setLaith(global.getLaith() + 1);
            interact = 2;
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
      
      System.out.println();
      System.out.println("You nervously walk over and introduce yourself.");
      int response4 = 0;
      
      switch (interact) {
      //if Jaime
      case 0:
         System.out.println("\"Hello, my name's Jaime. It's a pleasure to meet you, Miss...\"");
         System.out.println();
         //response
         System.out.println("1. " + global.getName() + ", the pleasure's all mine.");
         System.out.println("2. " + global.getName());
         System.out.println("3. Wouldn't you like to know");
         
         boolean continueInput4 = true;
         
         do { 
            try {
               System.out.print(">> ");
               response4 = input.nextInt();
               if(response4 > 4 || response4 < 1){
                  System.out.println();
                  System.out.println("Not a valid response");
                  System.out.println();
               }
               else
                  continueInput4 = false;
               
            } catch (InputMismatchException ex){
               System.out.println();
               System.out.println("You need to respond!");
               System.out.println();
               input.nextLine();
            }
            
         } while (continueInput4);
         switch (response4 - 1) {
         case 0:
            System.out.println();
            System.out.print("\"Charmed. Well, Miss " + global.getName() + ". I hope I'm fortunate enough\n"
               + "to see you around.");
            global.setJaime(global.getJaime() + 1);
            break;
         case 1:
            System.out.println();
            System.out.print("\"Lovely to meet you.");
            break;
         case 2:
            System.out.println();
            System.out.print("\"That is why I asked, isn't it?");
            global.setJaime(global.getJaime() - 1);;
            break;
         case 100:
            break;
         }
         break;
      //if Lucas
      case 1:
         System.out.println("\"Ah, hello. I don't believe I caught your name.\"");
         System.out.println();
         //response
         System.out.println("1. " + global.getName() + ", it's a pleasure to meet you.");
         System.out.println("2. " + global.getName());
         System.out.println("3. I don't believe I'm going to tell you");
         
         boolean continueInput5 = true;
         
         do { 
            try {
               System.out.print(">> ");
               response4 = input.nextInt();
               if(response4 > 4 || response4 < 1){
                  System.out.println();
                  System.out.println("Not a valid response");
                  System.out.println();
               }
               else
                  continueInput5 = false;
               
            } catch (InputMismatchException ex){
               System.out.println();
               System.out.println("You need to respond!");
               System.out.println();
               input.nextLine();
            }
            
         } while (continueInput5);
         //response
         switch (response4 - 1) {
         case 0:
            System.out.println();
            System.out.print("\"You as well, " + global.getName() + ". I'm Lucas.\"");
            global.setLucas(global.getLucas() + 1);
            break;
         case 1:
            System.out.println();
            System.out.print("\"Lucas.");
            break;
         case 2:
            System.out.println();
            System.out.print("\"Well, then.");
            global.setLucas(global.getLucas() - 1);
            break;
         case 100:
            break;
         }
         break;
      //if Laith
      case 2:
         System.out.println("\"How do you do? My name's Laith.\"");
         System.out.println();
         //response
         System.out.println("1. I'm " + global.getName() + ". Pleasure to meet you");
         System.out.println("2. " + global.getName());
         System.out.println("3. That's nice, I don't remember asking");
         
         boolean continueInput6 = true;
         
         do { 
            try {
               System.out.print(">> ");
               response4 = input.nextInt();
               if(response4 > 4 || response4 < 1){
                  System.out.println();
                  System.out.println("Not a valid response");
                  System.out.println();
               }
               else
                  continueInput6 = false;
               
            } catch (InputMismatchException ex){
               System.out.println();
               System.out.println("You need to respond!");
               System.out.println();
               input.nextLine();
            }
            
         } while (continueInput6);
         //response
         switch (response4 - 1) {
         case 0:
            System.out.println();
            System.out.print("\"You as well.");
            global.setLaith(global.getLaith() + 1);
            break;
         case 1:
            System.out.println();
            System.out.print("\"Charmed.");
            break;
         case 2:
            System.out.println();
            System.out.print("\"You're clearly one for conversation.");
            global.setLaith(global.getLaith() - 1);
            break;
         case 100:
            break;
         }
         break;
         case 100:
            break;
      }
      System.out.println(" I must, however, be going. Good day, my lady.\"");
      System.out.println();
      //Lady Marcella intro
      System.out.println("Almost as soon as he walks away, you are approached by a lady. She appears to be\n"
            + "very high in station by the way she is dressed.");
      System.out.println();
      System.out.println("\"Miss " + global.getName() + " I presume?\"");
      System.out.println();
      //response
      System.out.println("1. Yes, my lady, it's an honor to make your acquaintance");
      System.out.println("2. Yes");
      System.out.println("3. That would be me");
      
      int response5 = 0;
      boolean continueInput7 = true;
      
      do { 
         try {
            System.out.print(">> ");
            response5 = input.nextInt();
            if(response5 > 4 || response5 < 1){
               System.out.println();
               System.out.println("Not a valid response");
               System.out.println();
            }
            else
               continueInput7 = false;
            
         } catch (InputMismatchException ex){
            System.out.println();
            System.out.println("You need to respond!");
            System.out.println();
            input.nextLine();
         }
         
      } while (continueInput7);
      //response 
      switch (response5 - 1) {
      case 0:
         System.out.println();
         System.out.print("\"The girl knows her manners, how refreshing. ");
         global.setMarcella(global.getMarcella() + 1);
         break;
      case 1:
         System.out.println();
         System.out.println("\"Hmm, to the point I suppose. ");
         break;
      case 2:
         System.out.println();
         System.out.println("\"Is that any way to talk to your Lady?");
         global.setMarcella(global.getMarcella() - 1);
         break;
      case 100:
         break;
      
      }
      
      System.out.println("I just thought it would be best to\nintroduce myself when I learned of your arrival."
            + " I trust your travels went well?\"");
      System.out.println();
      //response
      System.out.println("1. Very well, thank you");
      System.out.println("2. It was alright");
      System.out.println("3. It was the worst experience of my life");
      
      int response6 = 0;
      boolean continueInput8 = true;
      
      do { 
         try {
            System.out.print(">> ");
            response6 = input.nextInt();
            if(response6 > 4 || response6 < 1){
               System.out.println();
               System.out.println("Not a valid response");
               System.out.println();
            }
            else
               continueInput8 = false;
            
         } catch (InputMismatchException ex){
            System.out.println();
            System.out.println("You need to respond!");
            System.out.println();
            input.nextLine();
         }
         
      } while (continueInput8);
      
      switch (response6 - 1) {
      case 0:
         System.out.println();
         System.out.println("\"Good, I'm glad to hear it. When you have a chance, you should head to\n"
               + "your room, it has just finished being prepared for you.\"");
         global.setMarcella(global.getMarcella() + 1);
         break;
      case 1:
         System.out.println();
         System.out.println("\"I see. In any case, your room is ready. Feel free to head upstairs when\n"
               + "you wish.\"");
         break;
      case 2:
         System.out.println();
         System.out.println("\"How unfortunate. Anyway, your room is ready. I trust you can find your way.\"");
         global.setMarcella(global.getMarcella() - 1);
         break;
      case 100:
         break;
      }
      //go back to room
      System.out.println();
      System.out.println("You soon find your way up the proper staircase and to your room. As soon as you open\n"
            + "the door, you are stunned. It's almost the size of your entire living room back home, let alone\n"
            + "your bedroom. There's an ornate bed, a gigantic engraved dresser, and even a desk for you to send\n"
            + "letters back home. Upon closer inspection, however, you see what appears to be your Lady's seal sitting\n"
            + "atop your papers. You assume she left it by mistake after inspecting your room to make sure everything\n"
            + "was in order. It could definitely prove useful, but your Lady would be very upset if she found out.");
      System.out.println();
      //steal?
      System.out.println("Do you take it?");
      System.out.print(">>");
      
      boolean choose2 = false;
      input.nextLine();
      
      while(choose2 == false){
         String take = new String(input.next());
         
         if (take.equals("Yes") || take.equals("yes")){
            System.out.println();
            System.out.println("You take the seal"); 
            choose2 = true;
            global.setSteal(1);;
         }
         
         else if (take.equals("No") || take.equals("no")){
            System.out.println();
            System.out.println("You don't take the seal"); 
            choose2 = true;
            global.setSteal(0);;
         }
         
         //if wrong thing is entered, reprompt
         else {
            System.out.println();
            System.out.println("You need to decide"); 
            System.out.println();
         }
         
         if(choose2 == false)
            System.out.print(">> ");
      }
      System.out.println();
      System.out.println("Before long, the sun begins to sink and so do your eyelids. You fall onto your bed\n"
            + "with a big plop and, before you know it, you are fast asleep. It's only been a day, but court\n"
            + "has definetly proved interesting."); 
      System.out.println();
      System.out.println("~End of Chapter 2~");
      System.out.println();
      global.enter();
   }
   //chapter 3
   public static void chapter3act1(Global global, Scanner input){
      System.out.println("~Chapter 3~");
      System.out.println();
      
      System.out.println("Before you know it, the sun is shining through the window above your bed. You are\n"
            + "awakened by a knock.");
      System.out.println();
      boolean open = false;
      
      System.out.print(">> ");
      input.nextLine();
      
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
      System.out.println("It's a servant delivering a letter from Lady Marcella. She requests your presence\n"
            + "at your earliest convienence.");
      boolean go = false;
      System.out.print(">> ");
      //leave room
      while(go == false){
         String room = new String(input.nextLine());
         
         if (room.equals("leave room") || room.equals("leave") || room.equals("go")){
            go = true;
            System.out.println();
            System.out.println("You leave to go find Lady Marcella");
         }
         //skip for debugging
         else if (room.equals("skip")){
            break; 
         }
         //if wrong thing is entered, reprompt
         else {
            System.out.println();
            System.out.println("You need to go to Lady Marcella, " + global.getName() + "!"); 
            System.out.println();
         }
         if(go == false)
            System.out.print(">> ");
      }
      
      System.out.println();
      System.out.println("\"Hello, " + global.getName() + ", sleep well?\"");
      System.out.println();
      //response
      System.out.println("1. Very well, thank you. My room is wonderful");
      System.out.println("2. I slept alright, thanks.");
      System.out.println("3. Horribly, actually");
      
      int response1 = 0;
      boolean continueInput = true;
      
      do { 
         try {
            System.out.print(">> ");
            response1 = input.nextInt();
            if(response1 > 4 || response1 < 1){
               System.out.println();
               System.out.println("Not a valid response");
               System.out.println();
            }
            else
               continueInput = false;
            
         } catch (InputMismatchException ex){
            System.out.println();
            System.out.println("You need to respond!");
            System.out.println();
            input.nextLine();
         }
         
      } while (continueInput);
      //response
      switch (response1 - 1) {
      case 0:
         System.out.println();
         System.out.print("\"I'm very glad to hear that. ");
         global.setMarcella(global.getMarcella() + 1);
         break;
      case 1:
         System.out.println();
         System.out.print("\"Good. ");
         break;
      case 2:
         System.out.println();
         System.out.print("\"Rather unpleasant, aren't we? ");
         global.setMarcella(global.getMarcella() - 1);
         break;
      case 100:
         break;
      }
      
      System.out.println("Anyway, I summoned you for brunch so you can meet your fellow handmaiden.\"");
      System.out.println();
      //response
      System.out.println("1. That sounds wonderful, lead the way!");
      System.out.println("2. Okay");
      System.out.println("3. Do I have to?");
      
      int response2 = 0;
      boolean continueInput2 = true;
      
      do { 
         try {
            System.out.print(">> ");
            response2 = input.nextInt();
            if(response2 > 4 || response2 < 1){
               System.out.println();
               System.out.println("Not a valid response");
               System.out.println();
            }
            else
               continueInput2 = false;
            
         } catch (InputMismatchException ex){
            System.out.println();
            System.out.println("You need to respond!");
            System.out.println();
            input.nextLine();
         }
         
      } while (continueInput2);
    //response
      switch (response2 - 1) {
      case 0:
         System.out.println();
         System.out.println("\"Of course, follow me.\"");
         System.out.println();
         global.setMarcella(global.getMarcella() + 1);
         break;
      case 1:
         System.out.println();
         System.out.println("\"Right this way.\"");
         System.out.println();
         break;
      case 2:
         System.out.println();
         System.out.println("\"Yes, you do. Follow me.\"");
         System.out.println();
         global.setMarcella(global.getMarcella() - 1);
         break;
      case 100:
         break;
      }
      
      System.out.println("You follow Lady Marcella into a big room down the hall. Laid before you is a bigger\n"
            + "assortment of food than you've seen in your entire life. Seated is a young girl about your age.\n"
            + "You assume this is the other handmaiden Lady Marcella was telling you about.");
      
      System.out.println();
      System.out.println("\"" + global.getName() + ", this is Florence\" Lady Marcella says.");
      System.out.println();
    //response
      System.out.println("1. Pleasure to meet you, I'm " + global.getName());
      System.out.println("2. " + global.getName());
      System.out.println("3. Hi, can I eat now?");
      
      int response3 = 0;
      boolean continueInput3 = true;
      
      do { 
         try {
            System.out.print(">> ");
            response3 = input.nextInt();
            if(response3 > 4 || response3 < 1){
               System.out.println();
               System.out.println("Not a valid response");
               System.out.println();
            }
            else
               continueInput3 = false;
            
         } catch (InputMismatchException ex){
            System.out.println();
            System.out.println("You need to respond!");
            System.out.println();
            input.nextLine();
         }
         
      } while (continueInput3);
    //response
      switch (response3 - 1) {
      case 0:
         System.out.println();
         System.out.print("\"You too! ");
         global.setFlorence(global.getFlorence() + 1);
         break;
      case 1:
         System.out.println();
         System.out.print("\"Nice to meet you. ");
         break;
      case 2:
         System.out.println();
         System.out.print("\"Oh, um, I suppose? ");
         global.setFlorence(global.getFlorence() - 1);
         break;
      case 100:
         break;
      }
      
      System.out.println("I'm glad to have someone else working with me. It can be a little scary being here alone\"");
      System.out.println();
    //response
      System.out.println("1. Me too!");
      System.out.println("2. Yeah");
      System.out.println("3. Whatever you say...");
      
      int response4 = 0;
      boolean continueInput4 = true;
      
      do { 
         try {
            System.out.print(">> ");
            response4 = input.nextInt();
            if(response4 > 4 || response4 < 1){
               System.out.println();
               System.out.println("Not a valid response");
               System.out.println();
            }
            else
               continueInput4 = false;
            
         } catch (InputMismatchException ex){
            System.out.println();
            System.out.println("You need to respond!");
            System.out.println();
            input.nextLine();
         }
         
      } while (continueInput4);
    //response
      switch (response4 - 1) {
      case 0:
         System.out.println();
         System.out.print("\"Glad I have a friend.\"");
         global.setFlorence(global.getFlorence() + 1);
         break;
      case 1:
         System.out.println();
         System.out.print("\"Hopefully we can be friends.\"");
         break;
      case 2:
         System.out.println();
         System.out.print("\"I see...\"");
         global.setFlorence(global.getFlorence() - 1);
         break;
      case 100:
         break;
      }
      
      System.out.println();
      System.out.println("Lady Marcella began to speak, \"" + global.getName() + ", where are you from again?\"");
      System.out.println();
    //response
      System.out.println("1. A small town called Loterdam, my lady");
      System.out.println("2. You probably haven't heard of it");
      System.out.println("3. Why do you want to know?");
      
      int response5 = 0;
      boolean continueInput5 = true;
      
      do { 
         try {
            System.out.print(">> ");
            response5 = input.nextInt();
            if(response5 > 4 || response5 < 1){
               System.out.println();
               System.out.println("Not a valid response");
               System.out.println();
            }
            else
               continueInput5 = false;
            
         } catch (InputMismatchException ex){
            System.out.println();
            System.out.println("You need to respond!");
            System.out.println();
            input.nextLine();
         }
         
      } while (continueInput5);
    //response
      switch (response5 - 1) {
      case 0:
         System.out.println();
         System.out.println("\"My grandparents are from near there!\" said Florence.");
         global.setFlorence(global.getFlorence() + 1);
         global.setMarcella(global.getMarcella() + 1);
         break;
      case 1:
         System.out.println();
         System.out.println("\"If you insist that's the case.\" she responded.");
         break;
      case 2:
         System.out.println();
         System.out.println("\"Just trying to learn more about my handmaidens.\" Marcella responded.");
         global.setFlorence(global.getFlorence() - 1);
         global.setMarcella(global.getMarcella() - 1);
         break;
      case 100:
         break;
      }
      
      System.out.println();
      System.out.println("\"You're here because of your family, is that right " + global.getName() + "? You seem to\n"
            + "value them above everything.\"");
      System.out.println();
    //response
      System.out.println("1. No, my lady, my duty comes first");
      System.out.println("2. Yes, they are everything to me");
      System.out.println("3. No, I value my friends more");
      
      int response6 = 0;
      boolean continueInput6 = true;
      
      do { 
         try {
            System.out.print(">> ");
            response6 = input.nextInt();
            if(response6 > 4 || response6 < 1){
               System.out.println();
               System.out.println("Not a valid response");
               System.out.println();
            }
            else
               continueInput6 = false;
            
         } catch (InputMismatchException ex){
            System.out.println();
            System.out.println("You need to respond!");
            System.out.println();
            input.nextLine();
         }
         
      } while (continueInput6);
    //response
      switch (response6 - 1) {
      case 0:
         System.out.println();
         System.out.print("\"How honorable.\" Marcella responds. ");
         global.setFlorence(global.getFlorence() - 1);
         global.setMarcella(global.getMarcella() + 1);
         break;
      case 1:
         System.out.println();
         System.out.print("\"I see.\" Marcella responds. ");
         break;
      case 2:
         System.out.println();
         System.out.print("\"I like that answer.\" Florence responds. ");
         global.setFlorence(global.getFlorence() + 1);
         global.setMarcella(global.getMarcella() - 1);
         break;
      case 100:
         break;
      }
      
      System.out.println();
      System.out.println("\"In any case,\" Marcella began, \"You two should probably head to your rooms.\n"
            + "your duties begin early tomorrow.\"");
      
      //if relationship high, invite to party
      if(global.getJaime() > 1 || global.getLucas() > 1 || global.getLaith() > 1){
         global.setInvite(1);
         System.out.println();
         System.out.println("You head back to your room and as soon as you open the door, your attention\n"
               + "is drawn to a letter on your desk. You could've sworn it wasn't there before. Perhaps you\n"
               + "should open it.");
         boolean open2 = false;
         System.out.print(">> ");
         input.nextLine();
         
         while(open2 == false){
            String letter = new String(input.nextLine());
            //open letter
            if (letter.equals("open letter") || letter.equals("open")){
               open2 = true;
               System.out.println();
               System.out.println("You nervously open the strange letter. It appears to be an invitation from "
                     + global.getHighestRelationship() + "\nto the masquerade tomorrow. This is a tremedonous opportunity to make connections\n"
                     + "and get your name out there. It will also give you the chance to get to know " + global.getHighestRelationship() + "\n"
                     + "a little better. Plus, if you decide he's not for you, everyone who's anyone will be there. It's the perfect place to\n"
                     + "find someone to help your family. Your farm might still be in trouble, but maybe you can change that.");
            }
            
            else if (letter.equals("skip")){
               break;
            }
            //if wrong thing is entered, reprompt
            else {
               System.out.println();
               System.out.println("You should open the letter and see what it says"); 
               System.out.println();
            }
            if(open2 == false)
               System.out.print(">> ");
         }
      //if not invited and relationship high with Florence, told about party            
      } else if (global.getFlorence() > 0){
         global.setInvite(2);
         System.out.println();
         System.out.println("You head back to your room, and as soon as you are settled, you hear a quiet knock at your door");
         boolean open3 = false;
         System.out.print(">> ");
         
         while(open3 == false){
            String door = new String(input.next());
            
            if (door.equals("open door") || door.equals("open")){
               open = true;
               System.out.println();
               System.out.println("You open the door");
               break;
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
            if(open3 == false)
               System.out.print(">> ");
         }
         System.out.println();
         System.out.println("Florence stands outside your door excitedly. You let her in, and she begins to tell you about the masquerade happening tomorrow\n"
               + "This is a tremedonous opportunity to make connections and get your name out there. Plus, everyone who's anyone will be there. It's the perfect place to\n"
               + "find someone to help your family. The only problem is, you're not invited. But maybe you can change that.");
         System.out.println();
       //response
         System.out.println("1. Thank you so much for telling me, Florence. But I don't have an invite");
         System.out.println("2. But I'm not invited, what am I gonna do?");
         System.out.println("3. Gee thanks Florence, that's kind of useless information without an invite");
         
         int response7 = 0;
         boolean continueInput7 = true;
         
         do { 
            try {
               System.out.print(">> ");
               response7 = input.nextInt();
               if(response7 > 4 || response7 < 1){
                  System.out.println();
                  System.out.println("Not a valid response");
                  System.out.println();
               }
               else
                  continueInput7 = false;
               
            } catch (InputMismatchException ex){
               System.out.println();
               System.out.println("You need to respond!");
               System.out.println();
               input.nextLine();
            }
            
         } while (continueInput7);
       //response
         switch (response7 - 1) {
         case 0:
            System.out.println();
            System.out.println("\"Of course! What are friends for? And I know you're not, but you could always sneak in. I should go before anyone sees me, bye.\"");
            global.setFlorence(global.getFlorence() + 1);
            break;
         case 1:
            System.out.println();
            System.out.println("\"I know you're not, but you could always sneak in. I should go before anyone sees me, bye.\"");
            break;
         case 2:
            System.out.println();
            System.out.println("\"I know you don't have one, but you could always sneak in. I should go before anyone sees me, bye.\"");
            global.setFlorence(global.getFlorence() - 1);
            break;
         case 100:
            break;
         }
      //if no relationships high enough, overhear guards
      } else {
         System.out.println();
         System.out.println("You head back to your room, and as soon as you are settled, you hear quiet mumbling outside your door");
         boolean listen = false;
         System.out.print(">> ");
         input.nextLine();
         
         while(listen == false){
            String door = new String(input.next());
            
            if (door.equals("listen") || door.equals("eavesdrop")){
               open = true;
               System.out.println();
               System.out.println("You move in to listen. You hear two guard talking about the masquerade happening tomorrow\n"
               + "That would be a tremedonous opportunity to make connections and get your name out there.\nPlus, everyone who's anyone will be there. \n"
               + "It's the perfect place to find someone to help your family.\nThe only problem is, you're not invited. But maybe you can change that.");
               break; 
            }
            
            else if (door.equals("skip")){
               break; 
            }
            //if wrong thing is entered, reprompt
            else {
               System.out.println();
               System.out.println("You should listen to see if you can learn anything"); 
               int response7 = input.nextInt();
            }
            if(listen == false)
               System.out.print(">> ");
         }
         
      }
      
      System.out.println();
      System.out.println();
      System.out.println("~End of Chapter 3~");
      System.out.println();
      
      //player stats
      System.out.println("Stats:");
      
      System.out.println("  Marcella: " + global.getMarcella()); 
      System.out.println("  Florence: " + global.getFlorence()); 
      System.out.println("  Jaime: " + global.getJaime()); 
      System.out.println("  Lucas: " + global.getLucas()); 
      System.out.println("  Laith: " + global.getLaith()); 
      
      global.enter();
   }
   
   //chapter 1 act 2
   public static void chapter1act2(Global global, Scanner input){
      
      System.out.println("ACT 2");
      System.out.println("~Chapter 1~");
      System.out.println();
      
      System.out.print("The party of the century is happening tonight, and you could really gain "
            + "some influence and \nknowledge by going. ");
      if (global.getInvite() == 0){
         System.out.println("You heard the guards talking about it, so you know all the details. \n"
               + "It wouldn't be hard to sneak in. But you know Lady Marcella would be very upset. It's even a fireable offense.");
      } else if (global.getInvite() == 1){
         System.out.println("You were invited by " + global.getHighestRelationship() + " so you have a "
               + "ticket in. ");
      } else {
         System.out.println("Florence told you all about it, so you know how to get in. But you know \n"
               + "Lady Marcella would be very upset. It's even a fireable offense.");
      }
      
      System.out.println();
      //go?
      System.out.println("Do you go?");
      System.out.print(">>");
      boolean answered = false;
      
      while(answered == false){
         String go = new String(input.next());
         
         if (go.equals("Yes") || go.equals("yes")){
            System.out.println();
            System.out.println("You decide to go"); 
            answered = true;
            global.setGo(1);;
         }
         
         else if (go.equals("No") || go.equals("no")){
            System.out.println();
            System.out.println("You decide not to go"); 
            answered = true;
            global.setGo(0);;
         }
         
         //if wrong thing is entered, reprompt
         else {
            System.out.println();
            System.out.println("You need to decide"); 
            System.out.println();
         }
         
         if(answered == false)
            System.out.print(">> ");
      }
      
      System.out.println();
      
      //if not at party
      if (global.getGo() == 0){
         if (global.getInvite() == 0){
            System.out.println("You don't want to ruin your relationship with Lady Marcella, so\n"
                  + "you decide it's best to stay in for the night. Even if you gained influence\n"
                  + "and knowledge, it wouldn't be worth it if you got sent home.");
         } else if (global.getInvite() == 1){
            System.out.println("You decide to turn down " + global.getHighestRelationship() + "'s invitation.\n"
                  + "Despite all that you'd gain by going, you just don't feel up to it. You sit down and write\n"
                  + "out a very polite letter to decline.");
         } else {
            System.out.print("You go to find Florence to tell her that you've decided not to go.");
            System.out.print("\"What do you mean you're not going? This could really help you out!\" she says.");
            System.out.println();
          //response
            System.out.println("1. I know, and I really appreciate you telling me, but I can't risk upsetting Lady\n"
                  + "  Marcella.");
            System.out.println("2. It won't help if I get sent home for breaking the rules.");
            System.out.println("3. Mind your own business.");
            
            int response5 = 0;
            boolean continueInput = true;
            
            do { 
               try {
                  System.out.print(">> ");
                  response5 = input.nextInt();
                  if(response5 > 4 || response5 < 1){
                     System.out.println();
                     System.out.println("Not a valid response");
                     System.out.println();
                  }
                  else
                     continueInput = false;
                  
               } catch (InputMismatchException ex){
                  System.out.println();
                  System.out.println("You need to respond!");
                  System.out.println();
                  input.nextLine();
               }
               
            } while (continueInput);
          //response
            switch (response5 - 1) {
            case 0:
               System.out.println();
               System.out.println("\"I understand, and what are friends for? How about we hang out instead? \n"
                     + "We can still have a fun night!\" She says.\n"
                     + "You spend a few hours there, having fun until you both became too tired and went to sleep.");
               break;
            case 1:
               System.out.println();
               System.out.println("\"Yeah I guess you're right. Hey, how about we hang here instead?\" She says.\n"
                     + "You spend a few hours there, having fun until you both became too tired and went to sleep.");
               break;
            case 2:
               System.out.println();
               System.out.println("\"Fine, I was just trying to help.\" With that, she left and you went back \n"
                     + "to your room to sleep.");
               break;
            case 100:
               break;
            }
         }
         
      //if at party
      } else {
         System.out.println("You walk over to Florence's room to get her option on your dress.\n"
               + "\"What do you think?\" You ask her. \n"
               + "\"I love it! You look beautiful!\" She responds.");
         System.out.println();
       //response
         System.out.println("1. Thanks Florence, glad I can count on you!");
         System.out.println("2. Thanks");
         System.out.println("3. I know");
         
         int response4 = 0;
         boolean continueInput4 = true;
         
         do { 
            try {
               System.out.print(">> ");
               response4 = input.nextInt();
               if(response4 > 4 || response4 < 1){
                  System.out.println();
                  System.out.println("Not a valid response");
                  System.out.println();
               }
               else
                  continueInput4 = false;
               
            } catch (InputMismatchException ex){
               System.out.println();
               System.out.println("You need to respond!");
               System.out.println();
               input.nextLine();
            }
            
         } while (continueInput4);
       //response
         switch (response4 - 1) {
         case 0:
            System.out.println();
            System.out.println("\"Of course, " + global.getName() + "!\"");
            break;
         case 1:
            System.out.println();
            System.out.println("\"No problem.\"");
            break;
         case 2:
            System.out.println();
            System.out.println("\"I'm sure you do.\"");
            break;
         case 100:
            break;
         }
         
         System.out.println();
         System.out.println("You walk into the party. It's the most extravigant thing you've ever seen. There\n"
               + "are tapestries hanging across the walls, table's adorn with beautiful centerpieces, and dresses\n"
               + "that look like they cost more money than you'll ever see in your life.");
         System.out.println("You're snapped from your thoughts when you see " + global.getHighestRelationship()
            + " approaching you");
         System.out.println("\"May I have this dance?\" He says.");
         System.out.println();
         //dance?
         System.out.println("Do you dance with " + global.getHighestRelationship() + "?");
         
         System.out.print(">>");
         boolean answered2 = false;
         input.nextLine();
         
         while(answered2 == false){
            String go = new String(input.next());
            
            if (go.equals("Yes") || go.equals("yes")){
               System.out.println();
               System.out.println("You decide to dance with " + global.getHighestRelationship()); 
               System.out.println();
               System.out.println("\"Thank you, right this way. ");
               answered2 = true;
               global.setDance(1);;
            }
            
            else if (go.equals("No") || go.equals("no")){
               System.out.println();
               System.out.println("You decide not to dance with " + global.getHighestRelationship()); 
               System.out.println();
               System.out.print("\"Alright, but still ");
               answered2 = true;
               global.setDance(0);;
            }
            
            //if wrong thing is entered, reprompt
            else {
               System.out.println();
               System.out.println("You need to decide"); 
               System.out.println();
            }
            
            if(answered2 == false)
               System.out.print(">> ");
         }
         
         
         //dance dialogue
         System.out.println("I'm very glad you came.\" He began.");
         System.out.println();
         System.out.println("1. Me too, this place is gorgeous!");
         System.out.println("2. Same here");
         System.out.println("3. Eh, I was on the fence about it");
         System.out.println();
         
         int response1 = 0;
         boolean continueInput1 = true;
         
         do { 
            try {
               System.out.print(">> ");
               response1 = input.nextInt();
               if(response1 > 4 || response1 < 1){
                  System.out.println();
                  System.out.println("Not a valid response");
                  System.out.println();
               }
               else
                  continueInput1 = false;
               
            } catch (InputMismatchException ex){
               System.out.println();
               System.out.println("You need to respond!");
               System.out.println();
               input.nextLine();
            }
            
         } while (continueInput1);
         
         switch (response1 - 1) {
         case 0:
            System.out.println();
            System.out.print("\"There's a far lovelier sight in front of me. ");
            break;
         case 1:
            System.out.println();
            System.out.print("\"I'm glad. ");
            break;
         case 2:
            System.out.println();
            System.out.print("\"Well, I'm glad you decided to come. ");
            break;
         case 100:
            break;
         
         }
         
         System.out.println("You should know something, though.\"");
         System.out.println();
         System.out.println("1. Is something the matter?");
         System.out.println("2. What is it?");
         System.out.println("3. Spit it out");
         
         int response2 = 0;
         boolean continueInput2 = true;
         
         do { 
            try {
               System.out.print(">> ");
               response2 = input.nextInt();
               if(response2 > 4 || response2 < 1){
                  System.out.println();
                  System.out.println("Not a valid response");
                  System.out.println();
               }
               else
                  continueInput2 = false;
               
            } catch (InputMismatchException ex){
               System.out.println();
               System.out.println("You need to respond!");
               System.out.println();
               input.nextLine();
            }
            
         } while (continueInput2);
         
         switch (response2 - 1) {
         case 0:
            System.out.println();
            System.out.print("\"I'm afraid so. You see ");
            break;
         case 1:
            System.out.println();
            System.out.print("\"Well, ");
            break;
         case 2:
            System.out.println();
            System.out.print("\"I'm getting to it. You see ");
            break;
         case 100:
            break;
         }
         
         System.out.println("I overheard some nobels talking. They don't want you here because they\n"
               + "think you're too low of a class and that you're undeserving. I just want to warn\n"
               + "you, because I know how ruthless these people can be. They'll stop at nothing to\n"
               + "get what they want.\"");
         System.out.println();
         System.out.println("1. Thank you for telling me");
         System.out.println("2. This is so unfair");
         System.out.println("3. I don't need your help");
         
         int response3 = 0;
         boolean continueInput3 = true;
         
         do { 
            try {
               System.out.print(">> ");
               response3 = input.nextInt();
               if(response3 > 4 || response3 < 1){
                  System.out.println();
                  System.out.println("Not a valid response");
                  System.out.println();
               }
               else
                  continueInput3 = false;
               
            } catch (InputMismatchException ex){
               System.out.println();
               System.out.println("You need to respond!");
               System.out.println();
               input.nextLine();
            }
            
         } while (continueInput3);
         
         switch (response3 - 1) {
         case 0:
            System.out.println();
            System.out.print("\"Of course. Your well being matters to me. ");
            break;
         case 1:
            System.out.println();
            System.out.print("\"I know it is. ");
            break;
         case 2:
            System.out.println();
            System.out.print("\"Fine, be that way. ");
            break;
         case 100:
            break;
         }
         //happy response
         if ((response1 + response2 + response3) < 5){
            System.out.println("Regardless, thank you again for coming. I hope to see more of you.\"");
            if(global.getHighestRelationship().equals("Jaime")){
               global.setJaime(global.getJaime() + 1);
            } else if(global.getHighestRelationship().equals("Laith")){
               global.setLaith(global.getLaith() + 1);
            } else {
               global.setLucas(global.getLucas() + 1);
            }
         //mad response
         }
         else if ((response1 + response2 + response3) > 7){
            System.out.println("You are as terrible and uncooth as you are beautiful.\"");
            if(global.getHighestRelationship().equals("Jaime")){
               global.setJaime(global.getJaime() - 1);
            } else if(global.getHighestRelationship().equals("Laith")){
               global.setLaith(global.getLaith() - 1);
            } else {
               global.setLucas(global.getLucas() - 1);
            }
         }
         //neutral response
         else 
            System.out.println("On a happier note, thank you again for coming.\"");
         
         System.out.println("With that, he kissed your hand and left. You decided it was also time for you to \n"
               + "leave. You were left to think about his words as you headed back to your room.\n"
               + "What did he mean by nothing? Surely there were some levels they wouldn't stoop to. Right?");
         System.out.println();
         }
      
      
      global.enter();
      
   }
   //chapter 2 act 2
   public static void chapter2act2(Global global, Scanner input){
      
      System.out.println("~Chapter 2~");
      
      System.out.println();
      boolean open = false;
      
      System.out.println("You were awoken, yet again, by a knock on your door.");
      System.out.print(">> ");
      input.nextLine();
      while(open == false){
         String door = new String(input.nextLine());
         //open door
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
      //if not invited but still went, Marcella confronts
      if(global.getGo() == 1 && global.getInvite() != 1){
         System.out.println("It's Lady Marcella. Without even asking, she pushes her way into the room and shuts \n"
               + "the door behind her.");
         System.out.println("\"Care to explain to me what you were doing at the ball last night? Do you have any idea\n"
               + "how you've made me look? You've broken a very serious rule and have rebelled against your superiors.\n"
               + "What do you have to say for yourself?");
         
         System.out.println();
         //blame?
         System.out.println("1. [Lie and blame Florence] Florence threatened me, my lady. She said I had to find her a potential husband since\n"
               + "   I have more influence than her, and if I didn't she would spread lies and get me kicked from court! I\n"
               + "   was scared, my lady.");
         System.out.println("2. [Take the blame] Nothing, my lady. It was my fault. I'm sorry.");
         
         int response3 = 0;
         boolean continueInput3 = true;
         
         do { 
            try {
               System.out.print(">> ");
               response3 = input.nextInt();
               if(response3 > 4 || response3 < 1){
                  System.out.println();
                  System.out.println("Not a valid response");
                  System.out.println();
               }
               else
                  continueInput3 = false;
               
            } catch (InputMismatchException ex){
               System.out.println();
               System.out.println("You need to respond!");
               System.out.println();
               input.nextLine();
            }
            
         } while (continueInput3);
         
         switch (response3 - 1) {
         case 0:
            System.out.println();
            System.out.println("\"I see, but you should not have gone regardless. You should have come straight to me.\n"
                  + "However, the blame falls on her, so she will suffer the consequences. She'll be dismissed \n"
                  + "immediately.\"");
            global.setBlame(1);
            break;
         case 1:
            System.out.println();
            System.out.print("\"Do you have any idea what kind of situation you've put me in? ");
            global.setBlame(0);
            //if relationship high enough, remain
            if (global.getMarcella() >= 4){
               global.setRemain(0);
               System.out.println("I should send you home for this. But you've been loyal to me, so I'll give you\n"
                     + "one last chance. Don't make me regret this.\"");
            //else kicked from court
            } else {
               global.setRemain(1);
               System.out.println("I have no choice. Pack your things, " + global.getName() + ". You're going home.\"");
            }
            break;
         case 100:
            break;
         }
         
         System.out.println("She turned to leave, but paused in your doorway. \n"
               + "\"Oh, and " + global.getHighestRelationship() + " wants to see you. Be careful.\"");
         
      } else{
         System.out.println("It's a servent letting you know that " + global.getHighestRelationship() + " requests your presence.");
      }
      
      System.out.println("You make your way downstairs to where " + global.getHighestRelationship() + " wanted to meet you.\n"
            + "you see him sitting at a table alone");
      System.out.println();
      
      //court dialogue
      System.out.println("\"Ah, my dearest " + global.getName() + ". How are we today?\"");
      System.out.println();
      System.out.println("1. Marvelous, thank you");
      System.out.println("2. Alright, I suppose");
      System.out.println("3. Not good now");
      
      int response1 = 0;
      boolean continueInput1 = true;
      
      do { 
         try {
            System.out.print(">> ");
            response1 = input.nextInt();
            if(response1 > 4 || response1 < 1){
               System.out.println();
               System.out.println("Not a valid response");
               System.out.println();
            }
            else
               continueInput1 = false;
            
         } catch (InputMismatchException ex){
            System.out.println();
            System.out.println("You need to respond!");
            System.out.println();
            input.nextLine();
         }
         
      } while (continueInput1);
      
      switch (response1 - 1) {
      case 0:
         System.out.println();
         System.out.print("\"I'm glad to hear it, my dear. ");
         break;
      case 1:
         System.out.println();
         System.out.print("\"Hopefully we can change that, yes? ");
         break;
      case 2:
         System.out.println();
         System.out.print("\"I see. ");
         break;
      case 100:
         break;
      
      }
      
      System.out.println("In any case, I had a question for you.\"");
      System.out.println();
      System.out.println("1. What about?");
      System.out.println("2. Oh?");
      System.out.println("3. This should be good");
      
      int response2 = 0;
      boolean continueInput2 = true;
      
      do { 
         try {
            System.out.print(">> ");
            response2 = input.nextInt();
            if(response2 > 4 || response2 < 1){
               System.out.println();
               System.out.println("Not a valid response");
               System.out.println();
            }
            else
               continueInput2 = false;
            
         } catch (InputMismatchException ex){
            System.out.println();
            System.out.println("You need to respond!");
            System.out.println();
            input.nextLine();
         }
         
      } while (continueInput2);
      
      switch (response2 - 1) {
      case 0:
         System.out.println();
         System.out.print("\"Well, ");
         break;
      case 1:
         System.out.println();
         System.out.print("\"Yes, ");
         break;
      case 2:
         System.out.println();
         System.out.print("\"Quite. ");
         break;
      case 100:
         break;
      }
      
      System.out.println(" I was wondering what you'd say to the prospect of officially courting me?\"");
      System.out.println();
      System.out.println("1. Wow");
      System.out.println("2. You and me both");
      System.out.println("3. HA");
      
      int response3 = 0;
      boolean continueInput3 = true;
      
      do { 
         try {
            System.out.print(">> ");
            response3 = input.nextInt();
            if(response3 > 4 || response3 < 1){
               System.out.println();
               System.out.println("Not a valid response");
               System.out.println();
            }
            else
               continueInput3 = false;
            
         } catch (InputMismatchException ex){
            System.out.println();
            System.out.println("You need to respond!");
            System.out.println();
            input.nextLine();
         }
         
      } while (continueInput3);
      
      switch (response3 - 1) {
      case 0:
         System.out.println();
         System.out.print("\"I know. ");
         break;
      case 1:
         System.out.println();
         System.out.print("\"Oh, um, well. ");
         break;
      case 2:
         System.out.println();
         System.out.print("\"I see. ");
         break;
      case 100:
         break;
      }
      //happy response
      if ((response1 + response2 + response3) < 5){
         System.out.println("You're already such a delight, and we seem to get along so well. It would also\n"
               + "really help your family, as I could provide some support.\"");
         if(global.getHighestRelationship().equals("Jaime")){
            global.setJaime(global.getJaime() + 1);
         } else if(global.getHighestRelationship().equals("Laith")){
            global.setLaith(global.getLaith() + 1);
         } else {
            global.setLucas(global.getLucas() + 1);
         }
      //mad response
      }
      else if ((response1 + response2 + response3) > 7){
         System.out.println("Despite how we can bicker, I think you should keep your family in mind while you \n"
               + "consider my proposal. We both know I can help.\"");
         if(global.getHighestRelationship().equals("Jaime")){
            global.setJaime(global.getJaime() - 1);
         } else if(global.getHighestRelationship().equals("Laith")){
            global.setLaith(global.getLaith() - 1);
         } else {
            global.setLucas(global.getLucas() - 1);
         }
      } //neutral response
      else 
         System.out.println("What do you say?.\"");
     
      
      System.out.println("Do you court " + global.getHighestRelationship() + "?");
      
      System.out.print(">>");
      boolean answered2 = false;
      input.nextLine();
      
      while(answered2 == false){
         String go = new String(input.next());
         //if court, set other relationships to 0 and set court to 100
         //family supported
         if (go.equals("Yes") || go.equals("yes")){
            System.out.println();
            System.out.println("You decide to court " + global.getHighestRelationship()); 
            if(global.getHighestRelationship().equals("Jaime")){
               global.setJaime(100);
               global.setLaith(0);
               global.setLucas(0);
               global.setCourt(1);
               global.setFamily(0);
            } else if(global.getHighestRelationship().equals("Laith")){
               global.setJaime(0);
               global.setLaith(100);
               global.setLucas(0);
               global.setCourt(2);
               global.setFamily(1);
            } else {
               global.setJaime(0);
               global.setLaith(0);
               global.setLucas(100);
               global.setCourt(3);
               global.setFamily(0);
            }
            answered2 = true;
         }
         
         else if (go.equals("No") || go.equals("no")){
            System.out.println();
            global.setCourt(0);
            global.setFamily(1);
            System.out.println("You decide not to court " + global.getHighestRelationship()); 
            if(global.getHighestRelationship().equals("Jaime")){
               global.setJaime(0);
            } else if(global.getHighestRelationship().equals("Laith")){
               global.setLaith(0);
            } else {
               global.setLucas(0);
            }
            answered2 = true;
         }
         
         //if wrong thing is entered, reprompt
         else {
            System.out.println();
            System.out.println("You need to decide"); 
            System.out.println();
         }
         
         if(answered2 == false)
            System.out.print(">> ");
      }
      
      System.out.println();
      System.out.println("They turn to leave. Hopefully you made the right call.");
      System.out.println();
      global.enter();
      
   }
   
   public static void chapter3act2(Global global, Scanner input){
      System.out.println("~Chapter 3~");
      System.out.println();
      System.out.println("You are awoken by the sound of shuffling in your room. When you look around, you don't see\n"
            + "anyone, but there is an unmarked letter on your desk.");
      boolean open = false;
      System.out.print(">> ");
      input.nextLine();
      
      while(open == false){
         String letter = new String(input.nextLine());
         
         if (letter.equals("open letter") || letter.equals("open")){
            open = true;
            System.out.println();
            System.out.println("You nervously open the strange letter.");
         }
         
         else if (letter.equals("skip")){
            break;
         }
         //if wrong thing is entered, reprompt
         else {
            System.out.println();
            System.out.println("You should open the letter and see what it says"); 
            System.out.println();
         }
         if(open == false)
            System.out.print(">> ");
      } 
         System.out.println("After reading the letter, you freeze. You don't know who it's from, but you do know \n"
               + "someone is threatening you. It simply reads: \"Your time is almost up, vermin.\" You decide you \n"
               + "have to get help from someone, but as you leave your room you hear people talking. They're talking \n"
               + "about evidence that just came out about one of Lady Marcella's handmaidens. They said that apparently,\n"
               + "she's guilty of stealing from the Crown to send funds back to her peasant family. Whoever wrote this\n"
               + "letter must've forged evidence about you that you commited treason. You definietly need help now.");
         //if you danced you get extra knowledge
         if(global.getDance() == 1){
            System.out.println("You think back to what " + global.getHighestRelationship() + " said, about the nobles\n"
                  + "being prepared to do anything to get rid of you. Apparently, he was right.");
         }
         System.out.println();
         System.out.println("Who do you go to?");
         //who to go to?
         System.out.println();
         System.out.println("1. Florence");
         System.out.println("2. Lady Marcella");
         System.out.println("3. " + global.getHighestRelationship());
         
         int response1 = 0;
         boolean continueInput1 = true;
         
         do { 
            try {
               System.out.print(">> ");
               response1 = input.nextInt();
               if(response1 > 4 || response1 < 1){
                  System.out.println();
                  System.out.println("Not a valid choice");
                  System.out.println();
               }
               else
                  continueInput1 = false;
               
            } catch (InputMismatchException ex){
               System.out.println();
               System.out.println("You need to choose!");
               System.out.println();
               input.nextLine();
            }
            
         } while (continueInput1);
         
         switch (response1 - 1) {
         case 0:
            System.out.println();
            System.out.print("You decide to go to Florence.");
            //if you have a high relationship and you didn't blame her, she helps
            if(global.getFlorence() >= 4 && global.getBlame() == 0){
               System.out.println("\"I can't believe someone would do this to you. I don't have much power here,\n"
                     + "but I'll do everything I can to help. I won't let my best friend die for something she didn't do/");
               global.setHelp(1);
            //if you blamed her, she's gone
            } else if (global.getBlame() == 1){
               System.out.println("You knock on her door, but no one's there. A servant sees you knocking and explains that \n"
                     + "she was dismissed for poor behavior.");
            //if your relationship is too low, she doesn't help
            } else {
               System.out.println("\"As horrible as this is, there's not much I can do. I'm sorry, " + global.getName() + "but you're on your own.");
               global.setHelp(0);
            } break;
         case 1:
            System.out.println();
            System.out.print("You decide to go to Lady Marcella. You show her the letter and tell her what happened.");
            //if you blamed florence and have a high relationship, she helps
            if(global.getMarcella() >= 4 && global.getBlame() == 1){
               System.out.println("\"Don't worry, I won't let anything happen to you. I know you're innocent. I'll send word\n"
                     + "to the Crown Judge and this whole situation will be fine. Then, we'll find out who did this and they'll suffer for it.\"");
               global.setHelp(2);
            //if you weren't invited and didn't blame florence, she doesn't help
            } else if (global.getInvite() != 1 && global.getBlame() == 0){
               System.out.println("\"You betray me and then you ask me for help? You're on your own.\"");
            //if relationship is too low, she doesn't help
            } else {
               System.out.println("\"I'm sorry, my hands are tied. There's nothing I can do.\"");
               global.setHelp(0);
            } break;
         case 2:
            System.out.println();
            System.out.println("You decide to go to " + global.getHighestRelationship() + ". You explain what's going on and show him the letter.");
            //if you're courting whoever, they help
            if(global.getCourt() != 0){
               System.out.println("\"This is awful!\"");
               global.setHelp(3);
               if(global.getHighestRelationship().equals("Jaime")){
                  
                  System.out.println("Not to worry, we'll find out. I know lot's of people who will keep you safe.\"");
                  System.out.println();
                  
                  
               } else if(global.getHighestRelationship().equals("Laith")){
                  //Laith proposes to run away
                  System.out.println("\"Listen, I'm not the richest man or the most powerful, but I know how to keep you safe.\n"
                        + "We can run away and then they can't get you. It's the only way. I know your family won't be able\n"
                        + "to last, but it's them or you at this point.\"");
                  System.out.println();
                  System.out.println("1. I know");
                  System.out.println("2. In that case, it's me");
                  System.out.println("3. That's stupid");
                  
                  int response = 0;
                  boolean continueInput = true;
                  
                  do { 
                     try {
                        System.out.print(">> ");
                        response = input.nextInt();
                        if(response > 4 || response < 1){
                           System.out.println();
                           System.out.println("Not a valid response");
                           System.out.println();
                        }
                        else
                           continueInput = false;
                        
                     } catch (InputMismatchException ex){
                        System.out.println();
                        System.out.println("You need to respond!");
                        System.out.println();
                        input.nextLine();
                     }
                     
                  } while (continueInput);;
                  
                  switch (response - 1) {
                  case 0:
                     System.out.println();
                     System.out.print("\"I know it's not ideal, but it's the right choice.\"");
                     break;
                  case 1:
                     System.out.println();
                     System.out.print("\"Don't be like that. They'd want you to live.\"");
                     break;
                  case 2:
                     System.out.println();
                     System.out.print("\"I'm just trying to help\"");
                     break;
                  case 100:
                     break;
                  
                  }
                  
                  boolean choose = false;
                  //run away?
                  System.out.println("Do you do it?");
                  System.out.print(">>");
                  String run = new String(input.next());
                  
                  if (run.equals("Yes") || run.equals("yes")){
                     System.out.println();
                     System.out.println("You decide to run away"); 
                     System.out.println();
                     System.out.println("\"Okay, I'll go gather my things.\" You tell him.");
                     choose = true;
                  }
                  
                  else if (run.equals("No") || run.equals("no")){
                     System.out.println();
                     System.out.println("You decide not to run away"); 
                     System.out.println();
                     System.out.println("\"I can't do it, Laith.\" You say. \"Not if it means my family will die. I'm\n"
                           + "sorry. If things go wrong, look out for them, please?\"");
                     System.out.println("\"Of course. I'd do anything for you.\" With that, you kiss him goodbye and leave."); 
                     //he helps family but doesn't help you
                     global.setHelp(0);
                     global.setFamily(0);
                     choose = true;
                  }
                  //if wrong thing is entered, reprompt
                  
                  else{
                     System.out.println();
                     System.out.println("You need to decide.");
                     System.out.println();
                  }
                  
                  if(choose == false)
                     System.out.print(">> ");
                  
                  
               } else {
                  System.out.println("\"I can help, don't worry. I have lots of money. I can buy them off if need be\" He says.");
               }
            //if not courting, doesn't help   
            } else {
               System.out.println("\"I'm sorry, but there's nothing I can do. Good luck.\"");
               global.setHelp(0);
               
            }   
         
      }
         System.out.println();
         //if stole seal, save self but can't remain
         if(global.getHelp() == 0 && global.getSteal() == 1){
            System.out.println("There's no one to help you. But you remember the seal you stole from Marcella. You could address\n"
                  + "a letter to the Crown Judge from her and stamp it so it's offical. Then your life would be spared. You'd have\n"
                  + "to leave court though, before anyone found out what you did. It's your only chance, so you do it. You run to\n"
                  + "pack your bags after dropping off the letter with a servant.");
            global.setAlive(0);
            global.setRemain(1);
         //if no help and no seal, die
         } else if (global.getHelp() == 0){
            System.out.println("There's no one to help you, and there are no other options. The case goes to trial, and you're\n"
                  + "found guilty.");
            global.setAlive(1);
            global.setRemain(2);
         //if help, live
         } else {
            System.out.println("Thankfully you found help, and the case was dropped.");
            global.setAlive(0);
         }
         //if not courting, family not supported
         if(global.getCourt() == 0){
            global.setFamily(1);
         }
         
         System.out.println();
       //ending
         global.enter();
         System.out.println("~Epilogue~");
         System.out.println();
         //if alive
         if(global.getAlive() == 0){
            System.out.print(global.getName() + " was lucky to make it out with her life. ");
         //if dead
         } else {
            System.out.print("Despite her best efforts, " + global.getName() + " couldn't escape with her life. ");
         }
         //if remain
         if(global.getRemain() == 0){
            System.out.print("She was even able to remain at court");
            //if courting
            if (global.getCourt() != 0){
               System.out.print(", \nwhere she married her love, " + global.getHighestRelationship() + ". ");
            //if not courting
            } else
               System.out.print(". \n");
         //if dead
         } else if (global.getRemain() == 2){
         //if kicked from court   
         } else {
            System.out.print("However, she was unable to remain at court because of her actions. ");
         }
         //if family supported
         if(global.getFamily() == 0){
            //if dead
            if(global.getAlive() == 1)
               System.out.println("She knew it was either her life or theirs, and she wasn't prepared to lose them. She\n"
                     + "made sure to secure support for them before she died. ");
            //if alive
            else
               System.out.println("She made her family her top priority and managed to secure a marriage that would help\n"
                     + "provide for them. ");
         //if family not supported
         } else {
            System.out.println("She couldn't, however, find a way to support her family. Because of this, they eventually\n"
                  + "lost the farm and became beggars. While they struggled, they still loved each other and managed\n"
                  + "to survive.");
         }
         
         System.out.println();
         System.out.println("~THE END~");
         System.out.println();
         System.out.println("Thanks for playing!");
         System.out.println();
         //stats
         System.out.println("Stats:");
         
         System.out.println("  Marcella: " + global.getMarcella()); 
         System.out.println("  Florence: " + global.getFlorence()); 
         System.out.println("  Jaime: " + global.getJaime()); 
         System.out.println("  Lucas: " + global.getLucas()); 
         System.out.println("  Laith: " + global.getLaith()); 
   }   
   
   //print stats
   public static void printStats(Global global, Scanner input) throws java.io.IOException {
      java.io.File file = new java.io.File("scores.txt");
      if(file.exists()){
         System.out.println("File already exists");
         System.exit(0);
      }
      
      java.io.PrintWriter output = new java.io.PrintWriter(file);
      
      output.println("Stats:");
      output.println("  Marcella: " + global.getMarcella());
      output.println("  Florence: " + global.getFlorence());
      output.println("  Jaime: " + global.getJaime()); 
      output.println("  Lucas: " + global.getLucas()); 
      output.println("  Laith: " + global.getLaith()); 
      
      output.println();
      output.println("Ending: ");
      output.print("  Alive: " );
      if(global.getAlive() == 0){
         output.println("Yes");
      } else {
         output.println("No");
      }
      
      output.print("  Family supported: " );
      if(global.getFamily() == 0){
         output.println("Yes");
      } else {
         output.println("No");
      }
      
      output.print("  Remain at court: " );
      if(global.getRemain() == 0){
         output.println("Yes");
      } else if (global.getRemain() == 2){
         output.println("N/A");
      } else {
         output.println("No");
      }
      
      output.close();
      
   }

   

}
