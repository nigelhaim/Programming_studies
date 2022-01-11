// SEBASTIAN, NIGEL HAIM   1CSA 
// note: change the name of the class to FancyTitle
public class FancyTitle
 {
    public static int countFibSteps(int maxVal) 
    {
        int current = 1;
        int previous = 1;
        int steps = 0;
        int newVal = 0;

       	 while (current < maxVal) 
      	 {
            newVal = current + previous; 
            previous = current; 	         
            current = newVal;		 
	          steps++;
         }
        return steps;
    }

    
    public static String repeatChar(char c, int cnt) 
    {
      //Creates how many repititions of a character into 1 string 
      String prt = "";
      for (int i = 0; i <= cnt; i++)
      {
        prt += Character.toString(c);
      }
      
      //Returns the created string 
      return prt;
    }

    public static String[] makeFibStringList(char c, int levels)
    {
      //This method creates an array of strings that will look like a half pyramid that is based on the fibbonachi sequence
      //Initiates variables like in the fibonacchi 
      int current = 1;
      int previous = 1;
      int newVal = 0;
      
      //Initiate 
      String[] str_chr = new String[levels];
      for (int count = 0; count < levels; count++)
      {
        //Repeats the character in based on the value of current
        String f_prt = repeatChar(c, current);
        
        //Adds a string value 
        str_chr [count] = f_prt;
        
        //Fibbonachi sequence
        newVal = current + previous; 
        previous = current; 	         
        current = newVal;
      }
      
      //Returns the array of strings 
      return str_chr;
    }

    public static String makeFilledCenterString(String border, int desiredLen) 
    {
        //Initialize the length of the string (border)
        int brd_len = border.length();
        
        //This is a character to print a space in a string 
        char c_spc = ' ';

        //The length of number of spaces
        int space = desiredLen - (brd_len * 2);

        //repeats on the number of spaces that will be printed on the returned string 
        String space_String = repeatChar(c_spc, space);
        
        //The final string that will be returned
        String final_border = border + space_String + border;
        
        //Returns the string 
        return final_border;
    }

    public static String[] makeFooter(char c, int desiredLen) 
    {
      //Initiates the number of how many levels of the pyramid will be printed through the fibbonachi 
      int fib_str = countFibSteps(desiredLen / 2);
           
      //Initiates the String array that is the char fibbonachi 
      String fib_array[] = makeFibStringList(c, fib_str);
    
      //Initiates the string array will be returned
      String arr_footer[] = new String[fib_str]; 
      
      //A loop that creates the half part of the Fancy title (Bottom part)
      for (int lvl = 0; lvl < fib_str; lvl++)
      {      
          //Appends each level of the array into a string 
          String border = fib_array[lvl];
          
          //Makes the String with a border + space + border effect of each layer
          String line = makeFilledCenterString(border, desiredLen); 
          
          //Appends the string to the array 
          arr_footer[lvl] = line;
      }
      //Returns the array 
      return arr_footer;
    }

    public static String createFancyTitle(String message, char c) 
    {
      //Initiates the base length of the Fancy title added 4 because of the spaces and border
      int mesg = (message.length()) + 4;
      
      //This is the top most and bottomost border of the fancy title 
      String up_down = repeatChar(c, mesg) + "\n";
      
      //converts the character c into a string 
      String border_char = Character.toString(c);
      
      //Initiates the character space
      char space = ' ';
      
      //Initiates the strings for the top most and bottom most part of the fancy title
      String outp_arr_bot ="";
      String outp_arr_top ="";

      //Initiates an array of strings that is composed of the bottom half of the fancy title
      String footer[] = makeFooter(c, mesg);
      
      //The lenght of the array
      int foot_length = footer.length;
      
      //Loops and appends the array of make Footer to create the top part of the title 
      for (int lnm = (foot_length - 1); lnm < foot_length && lnm > -1; lnm--)
      {
        String ft = footer[lnm];
        outp_arr_top += ft + "\n";
      }
      
      //Loops and appends the array of make Footer to create the bottom part of the title 
      for (int lnm = 0; lnm < foot_length; lnm++)
      {
        String ft = footer[lnm];
        outp_arr_bot += ft + "\n";
      }

      //Compile the whole string before returning 
      String output = up_down + outp_arr_top + border_char + space + message + space + border_char + "\n" + outp_arr_bot + up_down;
      
      //Returns the whole title 
      return output;  
    } 
        
    public static void main(String args[]) 
    {
    System.out.println(countFibSteps(10));
    }
}