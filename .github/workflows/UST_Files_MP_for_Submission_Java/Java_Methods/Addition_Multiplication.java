package Java_Methods;

import java.util.Scanner;
/*
Submitted by: Nigel Haim N. Sebastian

Write a java program that asks the user to enter 2 integers. 
The program should display the sum and product of two integers. 
*/
public class Addition_Multiplication 
{
    static Scanner ab = new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.println("Welcome to sum and product!");

        System.out.print("Input integer a: ");
        int a = ab.nextInt();

        System.out.print("Input integer b: ");
        int b = ab.nextInt();

        int sum = sum(a, b);
        int product = product(a, b);

        System.out.println();
        display(sum, product);
    }    
    
    static int sum (int a, int b)
    {
        int sum = a + b;
        return sum;
    }

    static int product (int a, int b)
    {
        int product = a * b;
        return product;
    }
    static void display(int sum, int product)
    {
        System.out.println("The sum of the integers is: " + sum);
        System.out.println("The product of the integers is: " + product);
    }
}
