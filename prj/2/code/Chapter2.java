import java.util.Scanner;

public class Chapter2 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner input = new Scanner(System.in);
      Global global = new Global();
      
      System.out.println("~Chapter 2~");
      System.out.println();
      
      System.out.println("You've been sitting silently in the carriage for a few hours now, watching the trees and villages pass you by. That is\n"
            + "until your uncle decides to break the silence.");
      System.out.println("\"Court truly is marvelous. I just know you'll love it.\"");
      System.out.println();
      System.out.println("1. I know so too.");
      System.out.println("2. I suppose I'll keep an open mind.");
      System.out.println("3. I doubt it.");
      System.out.print(">> ");
      int response1 = input.nextInt();
      
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
      System.out.println("1. Maybe if I'm lucky");
      System.out.println("2. Perhaps, depending on who it is");
      System.out.println("3. I hope you don't expect me to marry");
      System.out.print(">> ");
      int response2 = input.nextInt();
      
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
      System.out.println("1. No, I don't believe I have");
      System.out.println("2. I don't remember");
      System.out.println("3. I don't know and I don't care");
      System.out.print(">> ");
      int response3 = input.nextInt();
      
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
      
      if ((response1 + response2 + response3) < 5)
         System.out.println("I'm so glad you're excited.\"");
      else if ((response1 + response2 + response3) > 7)
         System.out.println("I hope you'll change your mind about this situation when we get there\"");
      else 
         System.out.println("Oh look, we're almost there.\"");
      
      System.out.println();
      System.out.println("You look outside the carriage window and see the castle in the distance growing\n"
            + "by the second. Your stomach begins to fill with equal parts nerves and excitment. Who knows\n"
            + "what life at court will have in store for you? Eventually, you come to a hault and are greeted\n"
            + "by guards. After identifying yourselves, you are escorted into what you can only assume is the\n"
            + "courtyard. It's unlike anything you've ever seen. Beautiful decorative fountains, green freshly-kept\n"
            + "grass, and people conversing all around you.");
      System.out.println();
      System.out.println("There's three people in particular your uncle points out to you. He brings your attention\n"
            + "first to a young looking man leaning on a fountain and laughing. His name is Jaime, a renowned bard.\n"
            + "However, it's a well known fact that bards don't exactly have the biggest income. He may have fame, but\n"
            + "he most likely lacks money. The next man your uncle points out is an older looking man by the name of\n"
            + "Lucas. While not the most attractive or age appropriate, he is very well off and could most likely\n"
            + "provide financial assistance to your family. Lastly, your attention is brought to a man named Laith.\n"
            + "He apparently is the son of a very well-to-do merchant. However, he holds no title and lacks power.\n");
      System.out.println("Who do you want to talk to?");
      System.out.print(">>");
      boolean choose = false;
      input.nextLine();
      int interact = 0;
      
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
      int response4;
      
      switch (interact) {
      case 0:
         System.out.println("\"Hello, my name's Jaime. It's a pleasure to meet you, Miss...\"");
         System.out.println();
         System.out.println("1. " + global.getName() + ", the pleasure's all mine.");
         System.out.println("2. " + global.getName());
         System.out.println("3. Wouldn't you like to know");
         System.out.print(">> ");
         response4 = input.nextInt();
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
      case 1:
         System.out.println("\"Ah, hello. I don't believe I caught your name.\"");
         System.out.println();
         System.out.println("1. " + global.getName() + ", it's a pleasure to meet you.");
         System.out.println("2. " + global.getName());
         System.out.println("3. I don't believe I'm going to tell you");
         System.out.print(">> ");
         response4 = input.nextInt();
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
      case 2:
         System.out.println("\"How do you do? My name's Laith.\"");
         System.out.println();
         System.out.println("1. I'm " + global.getName() + ". Pleasure to meet you");
         System.out.println("2. " + global.getName());
         System.out.println("3. That's nice, I don't remember asking");
         System.out.print(">> ");
         response4 = input.nextInt();
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
            global.setLaith(global.getLaith() + 1);
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
      System.out.println("Almost as soon as he walks away, you are approached by a lady. She appears to be\n"
            + "very high in station by the way she is dressed.");
      System.out.println();
      System.out.println("\"Miss " + global.getName() + " I presume?\"");
      System.out.println();
      System.out.println("1. Yes, my lady, it's an honor to make your acquaintance");
      System.out.println("2. Yes");
      System.out.println("3. That would be me");
      System.out.print(">> ");
      int response5 = input.nextInt();
      
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
      System.out.println("1. Very well, thank you");
      System.out.println("2. It was alright");
      System.out.println("3. It was the worst experience of my life");
      System.out.print(">> ");
      int response6 = input.nextInt();
      
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
      
      System.out.println();
      System.out.println("You soon find your way up the proper staircase and to your room. As soon as you open\n"
            + "the door, you are stunned. It's almost the size of your entire living room back home, let alone\n"
            + "your bedroom. There's an ornate bed, a gigantic engraved dresser, and even a desk for you to send\n"
            + "letters back home. Upon closer inspection, however, you see what appears to be your Lady's seal sitting\n"
            + "atop your papers. You assume she left it by mistake after inspecting your room to make sure everything\n"
            + "was in order. It could definitely prove useful, but your Lady would be very upset if she found out.");
      System.out.println();
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
      //launch chapter 2
      String[] x = {};
      Chapter3.main(x);
   }
}
