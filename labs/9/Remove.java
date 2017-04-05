import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Remove {
   public static void main(String[] args) {
      File file = new File(args[1]);
      //file not found exception
      if (!file.exists()) {
         System.out.println("The file denoted by this pathname does not exist.");
         System.exit(0);
      }
      //methods
      ArrayList<StringBuilder> text = readFile(file);
      removeText(text, args[0]);
      writeFile(file, text);
  }

   //writes file
   private static void writeFile(File file, ArrayList<StringBuilder> text) {
      try (PrintWriter fileOut = new PrintWriter(file)) {
         for (StringBuilder line : text) {
            fileOut.println(line);
         }
      //file not found exception
      } catch (FileNotFoundException e) {
         System.out.println("destination file is not found");
         System.exit(0);
      }
   }
   //removes text
   private static void removeText(ArrayList<StringBuilder> text, String s) {
      for (StringBuilder line : text) {
         while (line.indexOf(s) >= 0) {
            line.delete(line.indexOf(s), line.indexOf(s) + s.length());
         }
      }
   }
  
   //add file to array
   private static ArrayList<StringBuilder> readFile(File file) {
      ArrayList<StringBuilder> text = new ArrayList<>();
      try (Scanner fileIn = new Scanner(file)){
         while (fileIn.hasNext()) {
            StringBuilder line = new StringBuilder(fileIn.nextLine());
            text.add(line);
         }
      //not found exception
      } catch (FileNotFoundException e) {
         System.out.println("source file is not found");
         System.exit(0);
      }
      return text;
   }
}
