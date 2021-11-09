//Made by Nigel Haim N. Sebastian
import java.util.*;

public class java_tester 
{
    public static void main(String[] args) 
    {   

        int current = 1;
        int previous = 1;
        int newVal = 0;
        int maxVal = 5;
        
        //String[] = array initiatior that is indicated for strings only 
        //Kira = name of the array
        //new String[maxVal] = the size of the string on how many values can it have
        //Java Tester do not base it on MP
        String[] kira = new String[maxVal];
                //Java Tester do not base it on MP
        char c = '*';
         for (int count = 0; count < maxVal; count++)
         {
                     //Java Tester do not base it on MP
            String prt = repeatChar(c, current);
            kira [count] = prt;
            newVal = current + previous; 
            previous = current; 	         
            current = newVal;
            System.out.println(kira[count]);
         }
         
    }
    public static String repeatChar(char c, int cnt) 
    {
      //Creates how many repititions of char into 1 string 
      String prt = Character.toString(c).repeat(cnt);
      return prt;
    }

}
/*
Scanner b = new Scanner(System.in);

System.out.print("Please input the number of blocks: ");
int block = b.nextInt();
for (int a = 0; a < block; a++)
{
    for(int e = block; e < block + a; e++)
    {
        System.out.print("#");
    }
    System.out.println();
}
b.close();*/