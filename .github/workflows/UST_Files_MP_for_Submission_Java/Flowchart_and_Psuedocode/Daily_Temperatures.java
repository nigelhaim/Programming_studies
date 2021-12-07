package Flowchart_and_Psuedocode;
import java.util.*;

/* 
Submitted by: Nigel Haim N. Sebastian 
Write a program to process a data file containing a collection of 
daily temperatures. Your program should count and print the number 
of hot days (temperature 85 or higher), the number of pleasant days 
(temperature 60-84), and the number of cold days 
(temperatures less than 60). The program should also display 
the category of each temperature. (let -999 be the sentinel value).
*/

public class Daily_Temperatures 
{
    static Scanner t = new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.println("Welcome to the temperature data!");
        System.out.println("To show the result please input -999\n");
        int temp = 2;
        int c = 0;
        int p = 0; 
        int h = 0;
        int count = 1;
        while (temp != -999)
        {
            System.out.print("Please input the the temperure #" + count + ": ");
            temp = t.nextInt();
            if(temp < 60)
            {   
                c++;
            }
            if(temp >= 60 && temp <= 84)
            {
                p++;
            }
            if(temp > 84)
            {
                h++;
            }
            count++;
        }
        System.out.println("The number of cold days: " + c);
        System.out.println("The number of pleasant days: " + p);
        System.out.println("The number of hot days: " + h);
    }    
}
