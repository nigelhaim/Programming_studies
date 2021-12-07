package Flowchart_and_Psuedocode;
import java.util.*;

/* 
Submitted by: Nigel Haim N. Sebastian 
    1. Write a program that will get N numbers
    2. Modify problem 1 such that it will also compute and display the numbers entered. 
*/
public class N_numbers 
{
    static Scanner n = new Scanner(System.in);
    public static void main(String[] args) 
    {
        //Write a program that will get N numbers
        System.out.println("Welcome to the first program!\n");
        System.out.print("Please input the value of N: "); 
        int val_N = n.nextInt();//Get the value of n
        
        //Modify problem 1 such that it will also compute and display the numbers entered. 
        int sum = 0;//Initialize sum 
        for(int cnt = 0; cnt < val_N; cnt++)
        {
            System.out.print("Input value of integer# " + (cnt + 1) + ": ");
            sum += n.nextInt();//Adds the input value
        }

        System.out.println("The sum of all integers is: " + sum + "\n");//Prints the sum
    }
}
