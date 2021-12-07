package Flowchart_and_Psuedocode;

import java.util.Scanner;
import java.lang.Math;

/*
Submitted by: Nigel Haim N. Sebastian

Using the geometric and harmonic formula write a program 
that continues to accept numbers until the number 0 is 
entered and then calculates and displayss both geometric and 
harmonic means of the entered numberrs. (hint: it will be necessary 
for your program to correctly count the number of values entered).
*/
public class Geometric_Harmonic_mean 
{
    static Scanner n = new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.println("Welcome to the geometric and harmonic mean!");
        System.out.println("Please input 0 to show the result");
        double num = 1;
        double cnt = 0;
        double geo_prod = 1;
        double har_sum = 0;
        int count = 1;
        while (num != 0)
        {
            System.out.print("Please input the integer #" + count + ": ");
            num = n.nextDouble(); 
            if (num != 0)
            {
                geo_prod *= num;
                har_sum += (1/num); 
                cnt++;
            }
            count++;
        }
        if (cnt != 0)
        {
            double geo_mean =  Math.pow(geo_prod, 1.0/cnt);
            System.out.printf("The geometric mean is: %.2f", geo_mean);
            System.out.println();
    
            double har_mean = cnt/har_sum;
            System.out.printf("The harmonic mean is: %.2f" + har_mean);
            System.out.println();
        }

    }    
}
