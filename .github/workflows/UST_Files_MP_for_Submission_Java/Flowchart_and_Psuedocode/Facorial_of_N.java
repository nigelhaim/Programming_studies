package Flowchart_and_Psuedocode;

import java.util.Scanner;

/* 
Submitted by: Nigel Haim N. Sebastian
 3. Write a program that will compute the factorial of integer N. 
*/
public class Facorial_of_N 
{
    static Scanner n = new Scanner(System.in);
    
    public static void main(String[] args) 
    {
        System.out.println("Welcome to the Factorial!");
        System.out.print("Please input the value of N: ");
        int val_N = n.nextInt();
        int f_fact = 1;
        for(int fact = 1; fact <= val_N; fact++)
        {
            f_fact *= fact;
        }

        System.out.println("The factorial of " + val_N + " = " + f_fact);
    }
}
