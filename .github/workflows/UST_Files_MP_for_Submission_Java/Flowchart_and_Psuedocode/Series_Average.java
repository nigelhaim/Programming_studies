package Flowchart_and_Psuedocode;

import java.util.Scanner;
/*
    5. Write a program that will get a series of numbers until a 0 is 
    entered. The program then displays the average of all numbers 
    greater than 50 and the product of all numbers divisible by 3.
*/
public class Series_Average 
{
    static Scanner ss = new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.println("Welcome to average!");
        System.out.println("Please input 0 to show the result!");
        int num = 1;
        int count = 1;
        int ave_count = 0;
        int sum = 0;
        int prod = 1;
        do 
        { 
            System.out.print("PLease input integer # " + count + ": ");
            num = ss.nextInt();

            if(num > 50 && num != 0 )
            {
                sum += num; 
                ave_count++;
            }
            
            if(num % 3 == 0 && num != 0 )
            {
                prod = prod * num;
            }
            count++;
        }
        while (num != 0);

        if(ave_count != 0)
        {
            System.out.println("The average of the series with integers greater than 50: " + sum/ave_count);
        }

        System.out.println("The product of integers divisible by 3 is: " + prod);
    }    
}
