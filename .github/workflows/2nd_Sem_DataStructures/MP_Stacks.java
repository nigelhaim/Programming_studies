import java.util.*;
public class MP_Stacks
{
    static Scanner input = new Scanner(System.in); 
    public static void main(String[] args) 
    {
        System.out.print("Please input the string:");
        String n = input.nextLine();
        
        int space_count = 0; 
        boolean if_space = false;

        int len = n.length();
        StringBuilder c_stack = new StringBuilder(len);
        StringBuilder c_stack_2 = new StringBuilder(len);
        char [] word_2 = new char [len];
        char [] nextWord = new char[len];
        for(int i = 0; i < len; i++)
        {
           char c = n.charAt(i);
           if(c != ' ' && space_count <= 2)
           {
               if(space_count <= 1  && if_space == false)
               {
                  c_stack.push(c);
               }
               else if(space_count == 2  && if_space == false)
               {
                  c_stack_2.push(c);
               }
               
           }

           else 
           {
              if(c == ' ' && space_count <= 1  && if_space == true)
              {
               word_2[i] = c;
              }
              space_count++;
              if(if_space == false)
              {
               if_space = true;
              }
              else{
                 if_space = false;
              }
           }

           if(space_count <= 1 && if_space == true)
           {
              word_2[i] = c;
           }
           else if(space_count > 2) {
              nextWord[i] = c;
           }

        }
        
        System.out.print("The new String: ");
        finalString(c_stack,c_stack_2, len, word_2, nextWord);
    }
    public static void finalString(StringBuilder c,StringBuilder d, int len, char[] o, char[] p)
    {
       c.reverse(c, len);
       for(int i = 0; i < len; i++)
       {
          char a = o[i];
          System.out.print(a);
       }
       d.reverse(d, len);

       for(int i = 0; i < len; i++)
       {
          char b = p[i];
          System.out.print(b);
       }

    }
}

class StringBuilder
{
    private int maxSize;
    private char[] stackArray;
    private int top;

    StringBuilder(int s) 
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

   public static void reverse(StringBuilder c, int len)
   {
      for(int j = 0; j < len; j++)
      {
         if(c.isEmpty() != true)
         {
             System.out.print(c.peek());
             c.pop();
         } 
      }
      return;
   }
}