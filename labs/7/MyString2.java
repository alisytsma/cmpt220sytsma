
import java.util.Arrays;

class MyString2 {
   char[] chars;

   MyString2(String s) {
      chars = s.toCharArray();
   }
   
   static MyString2 valueOf(boolean b) {
      return new MyString2(b ? "true" : "false");
   }

   int compare(String s) {
      char[] chars = s.toCharArray();
      int length = this.chars.length < chars.length ? this.chars.length : chars.length;
         for (int i = 0; i < length; i++) {
            if (this.chars[i] != chars[i]) {
               if (this.chars[i] < chars[i]) return -1;
                  else return 1;
               }
            }
         if (this.chars.length < chars.length) return -1;
         else if (this.chars.length > chars.length) return 1;
         else return 0;
   }

   MyString2 substring(int begin) {
      char[] chars = new char[this.chars.length - begin];
      System.arraycopy(this.chars, begin, chars, 0, chars.length);
      return new MyString2(new String(chars));
   }

   MyString2 toUpperCase() {
      char[] newChars = new char[chars.length];
      for (int i = 0; i < chars.length; i++) {
         if (chars[i] >= 'a' && chars[i] <= 'z')
            newChars[i] = (char) (chars[i] - ('a' - 'A'));
         else
            newChars[i] = chars[i];
         }
      return new MyString2(new String(newChars));
   }

   char[] toChars() {
      return chars;
   }
    
}