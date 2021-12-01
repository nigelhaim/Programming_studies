package From_Classmates;

public class kira 
{
    public static void main(String[] args) 
    {                          //This was returned or made by makeFibStringlist
        //if c = '*' and desiredLen = 20
        
    }  
    
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

        
    public static String repeatChar(char c, int cnt) 
    {
      //Creates how many repititions of a character into 1 string 
      String prt = Character.toString(c).repeat(cnt);
      //Returns the created string 
      return prt;
    }
}
