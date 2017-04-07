import java.util.Scanner;

public class Chapter3 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      
      Scanner input = new Scanner(System.in);
      Global global = new Global();
      
      System.out.println("~Chapter 3~");
      System.out.println();
      
      System.out.println("Before you know it, the sun is shining through the window above your bed. You are\n"
            + "awakened by a knock.");
      System.out.println();
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
      System.out.println("It's a servant delivering a letter from Lady Marcella. She requests your presence\n"
            + "at your earliest convienence.");
      boolean go = false;
      System.out.print(">> ");
      
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
      System.out.println("1. Very well, thank you. My room is wonderful");
      System.out.println("2. I slept alright, thanks.");
      System.out.println("3. Horribly, actually");
      System.out.print(">> ");
      int response1 = input.nextInt();
      
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
      System.out.println("1. That sounds wonderful, lead the way!");
      System.out.println("2. Okay");
      System.out.println("3. Do I have to?");
      System.out.print(">> ");
      int response2 = input.nextInt();
      
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
      System.out.println("1. Pleasure to meet you, I'm " + global.getName());
      System.out.println("2. " + global.getName());
      System.out.println("3. Hi, can I eat now?");
      System.out.print(">> ");
      int response3 = input.nextInt();
      
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
      System.out.println("1. Me too!");
      System.out.println("2. Yeah");
      System.out.println("3. Whatever you say...");
      System.out.print(">> ");
      int response4 = input.nextInt();
      
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
      System.out.println("1. A small town called Loterdam, my lady");
      System.out.println("2. You probably haven't heard of it");
      System.out.println("3. Why do you want to know?");
      System.out.print(">> ");
      int response5 = input.nextInt();
      
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
      System.out.println("1. No, my lady, my duty comes first");
      System.out.println("2. Yes, they are everything to me");
      System.out.println("3. No, I value my friends more");
      System.out.print(">> ");
      int response6 = input.nextInt();
      
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
            + "your duties begin early tomorrow.");
      
      if(global.getJaime() > 0 || global.getLucas() > 0 || global.getLaith() > 0){
         global.setInvite(1);
         System.out.println();
         System.out.println("You head back to your room and as soon as you open the door, your attention\n"
               + "is drawn to a letter on your desk. You could've sworn it wasn't there before. Perhaps you\n"
               + "should open it.");
         boolean open2 = false;
         System.out.print(">> ");
         
         while(open2 == false){
            String letter = new String(input.nextLine());
            
            if (letter.equals("open letter") || letter.equals("open")){
               open = true;
               System.out.println();
               System.out.println("You nervously open the strange letter. It appears to be an invitation from"
                     + global.getHighestRelationship() + "\nto the masquerade tomorrow. This is a tremedonous opportunity to make connections\n"
                     + "and get your name out there. It will also give you the chance to get to know " + global.getHighestRelationship() + "\n"
                     + " a little better. Plus, if you decide he's not for you, everyone who's anyone will be there. It's the perfect place to\n"
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
         System.out.println("1. Thank you so much for telling me, Florence. But I don't have an invite");
         System.out.println("2. But I'm not invited, what am I gonna do?");
         System.out.println("3. Gee thanks Florence, that's kind of useless information without an invite");
         System.out.print(">> ");
         int response7 = input.nextInt();
         
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
      
      System.out.println("Marcella: " + global.getMarcella()); 
      System.out.println("Florence: " + global.getFlorence()); 
      System.out.println("Jaime: " + global.getJaime()); 
      System.out.println("Lucas: " + global.getLucas()); 
      System.out.println("Laith: " + global.getLaith()); 
      
      global.enter();
      //launch act 2
      
   }
}
