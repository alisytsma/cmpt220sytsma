import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Read {

   public static void main(String[] args) throws Exception{
      // TODO Auto-generated method stub
      java.io.File file = new java.io.File(args[0]);
      
      Scanner input = new Scanner(file);
      StringBuilder text = readFile(file);
      //variables
      int words = 0;
      //char counter
      int chars = text.length();
      int lines = 0;
      //word counter
      while(input.hasNext()){
         input.next();
         words++;
      }
      input = new Scanner(file);
      //line counter
      while(input.hasNextLine()){
         input.nextLine();
         lines++;
      }
      //print
      System.out.println("Words: " + words);
      System.out.println("Lines: " + lines);
      System.out.println("Characters: " + chars);
   }
      
   //read file
   private static StringBuilder readFile(File file) {
      StringBuilder text = new StringBuilder();
      try (Scanner fileIn = new Scanner(file)) {
         while (fileIn.hasNext()) {
            text.append(fileIn.nextLine());
            if (fileIn.hasNext()) text.append("\n");
            }
         //exception if file isn't found
         } catch (FileNotFoundException e) {
            System.out.println("source file is not found");
            System.exit(0);
         }
         return text;
   }

}
