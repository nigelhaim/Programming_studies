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
      //Creates how many repititions of char into 1 string 
      String prt = Character.toString(c).repeat(cnt);
      return prt;
    }

    public static String[] makeFibStringList(char c, int levels)
    {
      //Initiates variables like in the fibonacchi 
      int current = 1;
      int previous = 1;
      int newVal = 0;
      //Initiate an array of Strings with its length 
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
      return str_chr;
    }

    public static String makeFilledCenterString(String border, int desiredLen) 
    {
        int brd_len = border.length();

        char c_spc = ' ';

        int space = desiredLen - (brd_len * 2);

        String space_String = repeatChar(c_spc, space);

        String final_border = border + space_String + border;
        return final_border;
    }

    public static String[] makeFooter(char c, int desiredLen) 
    {

      int fib_str = countFibSteps(desiredLen / 2);
      String arr_footer[] = new String[fib_str]; 
      String fib_array[] = makeFibStringList(c, fib_str);

      for (int lvl = 0; lvl < fib_str; lvl++)
      {
          String border = fib_array[lvl];
          String line = makeFilledCenterString(border, desiredLen); 
          arr_footer[lvl] = line;
      }
      return arr_footer;
    }

    public static String createFancyTitle(String message, char c) 
    {

      int mesg = (message.length()) + 4;
      int mess = message.length();
      String up_down = repeatChar(c, mesg) + "\n";
      String border_char = Character.toString(c);
      char space = ' ';
      String outp_arr_bot ="";
      String outp_arr_top ="";
      String footer[] = makeFooter(c, mesg);
      int foot_length = footer.length;
      for (int lnm = (foot_length - 1); lnm < foot_length && lnm > -1; lnm--)
      {
        String ft = footer[lnm];
        outp_arr_top += ft + "\n";
      }
      
      for (int lnm = 0; lnm < foot_length; lnm++)
      {
        String ft = footer[lnm];
        outp_arr_bot += ft + "\n";
      }


      String output = up_down + outp_arr_top + border_char + space + message + space + border_char + "\n" + outp_arr_bot + up_down;
      return output;  
    } 
        
    public static void main(String args[]) 
    {
    System.out.println(countFibSteps(10));
    }
}
