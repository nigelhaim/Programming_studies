import java.util.*;
public class MP_Stacks
{
   static Scanner input = new Scanner(System.in); //Initiates the scanner
   public static void main(String[] args) 
   {
      System.out.print("Please input the string:");//Prompts the user to input a string 
      String n = input.nextLine();//Stores the string to the variable n 
      int len = n.length();//Gets the length of the string 
      boolean num_word = false;//Initiates the boolean to check if the sstring has 1 or 2 or more strings
      for(int j = 0; j < len; j++)//Loop that checks if the string has 1 or more strings using the space characters 
      {
            char c = n.charAt(j);//Gets teh character in the array
            if(c == ' ')//Checks if the character is a space 
            {
               num_word = true;//retruns true if there is a space in the string 
            }
      }

      if(num_word == true)//If there is multiple words then it runs the method for multiple words 
      {
         mutlipleWords(len, n);
      }
      else
      {
         singleword(len, n);//If only one word then runs the method for a single word 
      }
   }

   //Method for the single word 
   public static void singleword(int len, String n)
   {
      //Initiates the class stack StrignBuilder 
      StringBuilder word = new StringBuilder(len);
      for(int i = 0; i < len; i++)//Loops the string to push each character on the stack 
      {
         char c = n.charAt(i);
         word.push(c);
      }
      
      //Prints the string in reverse order usign the peek and pop methods in the class
      System.out.print("The String in reverse order: ");
      String reversedString = word.reverse(word, len);
      System.out.println(reversedString);//Prints the reverse word using the peek and pop 
      
   }
   //method for multiple words 
   public static void mutlipleWords(int len, String n)
   {
      int space_count = 0; //Initiates the number of spaces in into 0 
      boolean if_space = false;// Initiates if the boolean if the next word is to reverse or not 
      StringBuilder c_stack = new StringBuilder(len);//Stack for the first word to be reversed
      StringBuilder c_stack_2 = new StringBuilder(len);//Stack for the second word to be reversed
      char [] word_2 = new char [len];//Initiates the second word to be stored not to be reversed 
      char [] nextWord = new char[len];//Initiatges the array for the next words after the last reversed 

               
      for(int i = 0; i < len; i++)//loops the string to access each character 
      {
         char c = n.charAt(i);//Converts each character in the string into char 
         if(c != ' ' && space_count <= 2)
         {
            if(space_count <= 1  && if_space == false)
            {
               c_stack.push(c);//Pushes the first word to be reversed 
            }
            else if(space_count == 2  && if_space == false)
            {
               c_stack_2.push(c);//Pushes the third word to be reversed 
            } 
         }

         else 
         {
            if(c == ' ' && space_count <= 1  && if_space == true)//The first space will store the unreversed word to an array 
            {
            word_2[i] = c;//Stores each character on a array 
            }
            space_count++;//Adds 1 to the space counter 
            if(if_space == false)
            {
            if_space = true;//Makes if space is true 
            }
            else{
               if_space = false;//If if space is false 
            }
         }

         if(space_count <= 1 && if_space == true)
         {
            word_2[i] = c;//Stores the second word in the array 
         }
         else if(space_count > 2) {
            nextWord[i] = c;//Stores the 4th and continouing words in the array 
         }
      }

      //Prints the final strign using a method 
      System.out.print("The new String: ");
      String final_string = finalString(c_stack,c_stack_2, len, word_2, nextWord);
      System.out.println(final_string);
   }

   //The method to print the final string of multiple words 
   public static String finalString(StringBuilder c,StringBuilder d, int len, char[] o, char[] p)
   {
      //initiates the variable result 
      String result = ""; 
      result += d.reverse(d, len);//Adds the first reversed word 
      for(int i = 0; i < len; i++)//Loops each characters from the array of the second NOT REVERSED word 
      {
         char a = o[i];
         result += a;
      }

      result += c.reverse(c, len);//Adds the third reversed word 
      
      for(int i = 0; i < len; i++)//Loops each characters from the array of the fourth and continouing word
      {
         char b = p[i];
         result += b;
      }
      return result;//returns the whole array
   }
}


//Class of the string reversed builder
class StringBuilder
{
   private int maxSize;//Variabl for the max array size
   private char[] stackArray;//Array fro the stack of the reversed strgin 
   private int top;//Access the top character in the stack 

   StringBuilder(int s)//Imports the values of the array size top and max array wsize 
   {   
      maxSize = s;
      stackArray = new char[maxSize];
      top = -1;   
   } 

   public void push(char str)//Method pushes the cahracter on the stac k
   {
      top++;      
      stackArray[top] = str;    
   }
   public char pop()//Method pops the character from the stack 
   {
      return stackArray[top--];    
   }

   public boolean isEmpty()//Checks if the array is empty or not 
   {
      return (top == -1);
         
   }
   public char peek() {//Peeks and returns the top most charcter in the stack 
      return stackArray[top];
   }

   public static String reverse(StringBuilder c, int len)
   {  //Reverses the word using the characters and the method of peek and pop
      String result = "";
      for(int j = 0; j < len; j++)
      {
         if(c.isEmpty() != true)
         {
            char f = c.peek();//returns the charcter from the top 
            result += f;//Adds the character to the final word string to be returned
            c.pop();//Removes the character from the stack 
         } 
      }         
      return result; //Retrusn the final string 
   }
}