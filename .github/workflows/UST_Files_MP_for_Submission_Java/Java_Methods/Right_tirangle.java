package Java_Methods;

import java.util.*;
import java.lang.Math;

/*
Submitted by: Nigel Haim N. Sebastian 

Write a java program that accepts the lenghts of 2 sides 
of a right triangle, a and b, respectively. 
The program then computes and displays the hypotenuse 
and the area of the triangle. 
*/

public class Right_tirangle 
{
    static Scanner side = new Scanner(System.in);
    //Input validation
    public static double validateInput(double a)
    {
        while(a <= 0)
        {
            System.out.println("Please input an integer greater than 0!");
            System.out.print("Please input side: ");
            a = side.nextDouble();
        }
        return a;
    }
    //Compute hypothenouse 
    public static double hypo(double a, double b)
    {
        double hypo = Math.sqrt((Math.pow(a, 2) + (Math.pow(b, 2))));
        return hypo;
    }

    public static double area(double a, double b)
    {
        double area = (a * b) / 2;
        return area;
    }
    

    public static void display(double hypo, double area)
    {
        System.out.printf("The hypotenouse is: %.2f%n", hypo);
        System.out.print("The area is: " + area);
    }
    public static void main(String[] args) 
    {        
        System.out.println("Welcome to the right triangle!");
    
        System.out.println();

        System.out.print("Please input side a: ");
        double adj = side.nextDouble();
        System.out.print("Please input side b: ");
        double opp = side.nextDouble();
        System.out.println();

        double adj_f = validateInput(adj);
        double opp_f = validateInput(opp);

        double h = hypo(adj_f, opp_f);
        System.out.println();
        double a = area(adj_f, opp_f);

        display(h, a);
        System.out.println();
    }
}
