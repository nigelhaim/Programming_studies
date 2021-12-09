package Loop_structures;
import java.util.*;

/*
Submitted by: Nigel Haim N. Sebastian

Write a program that prompts the user to input an integer and then outputs
the number with the digits reversed. For example, if the input is 12345, the
output should be 54321. Your program must also output 5000 as 0005 and
980 as 089
*/
public class Reversed 
{
    public static void main(String[] args) 
    {
        Scanner rev = new Scanner(System.in);
        
        System.out.print("Input Integer: ");
        int num = rev.nextInt();

        int d = 0 ;
        for (int x = 0; num >= x;  x++)
        {
            int reversed = num % 10;
            d = d * 10 + reversed;

            num /= 10 + 0;

            x -= x;    
        }
        System.out.print("The reversed version is: " + d);
        rev.close();   
    }    
}
