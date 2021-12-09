package Repeatition_Structures;

import java.util.Scanner;

public class Reversed 
{
    public static void main(String[] args) 
    {
        Scanner rev = new Scanner(System.in);
        
        System.out.print("Input Integer: ");
        int num = rev.nextInt();

        int d = 0 ;
        for (int x = 0; num > x;  x++)
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
