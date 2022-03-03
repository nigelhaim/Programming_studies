import java.util.*;
public class Stacks{
   static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
      System.out.print("Please input the string: ");
      String n = input.nextLine();
      
      int len = n.length();
      
      Stack c_stack = new Stack(len);
      for(int i = 0; i < len; i++)
      {
         char c = n.charAt(i);
         c_stack.push(c);
      }
      System.out.print("Reversed string: ");
      for(int j = 0; j < len; j++){
         if(c_stack.isEmpty() != true)
         {
            System.out.print(c_stack.peek());
            c_stack.pop();
         }
      }
    }
}

class Stack
{
   private int maxSize;
   private char[] stackArray;
   private int top;
   
    Stack(int s) 
    {   
      maxSize = s;
      stackArray = new char[maxSize];
      top = -1;   
    }
   public void push(char str) 
   {
      top++;      
      stackArray[top] = str;    
   }
   public char pop() 
   {
      return stackArray[top--];    
   }
 
   public boolean isEmpty() 
   {
      return (top == -1);
           
   }
   public char peek() {
      return stackArray[top];
   }
}

 
