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
      //insert code here
    }

    public static String[] makeFooter(char c, int desiredLen) 
    {
      //insert code here
    }

    public static String createFancyTitle(String message, char c) 
    {
      //insert code here
    } 
        
    public static void main(String args[]) 
    {
    System.out.println(countFibSteps(10));
    }
}
