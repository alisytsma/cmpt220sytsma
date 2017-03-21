
public class StackOfIntegers {
   //variables
   private int[] elements;
   private int size;
   //no args constructor
   public StackOfIntegers(){
      this(16);
   }
   //constructor
   public StackOfIntegers(int capacity){
      elements = new int[capacity];
   }
   //push
   public void push(int value){
      if (size == elements.length){
         int[] temp = new int[elements.length * 2];
         for(int i = 0; i < elements.length; i++)
            temp[i] = elements[i];
         elements = temp;
      }
      elements[size++] = value;
   }
   //pop
   public int pop() {
      // TODO Auto-generated method stub
      if (!empty()){
         return elements[--size];
      }
      return -1;
   }
   //empty
   public boolean empty() {
      // TODO Auto-generated method stub
      return size == 0;
   }
}
