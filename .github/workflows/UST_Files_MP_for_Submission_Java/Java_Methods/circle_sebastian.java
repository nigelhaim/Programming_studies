package Java_Methods;
import java.util.*;
import java.lang.Math;

/*
Submitted by: Nigel Haim N. Sebastian 

Write a Java program will compute the area and circumference of a 
circle given its radius.
*/
public class circle_sebastian 
{

    static Scanner cir = new Scanner(System.in);
    static double getRadius()
    {
        System.out.print("Please input the radius: ");
        return cir.nextDouble();
    }
    static void area(double a)
    {
        double area = (a * a) * Math.PI;
        System.out.print("The area of the circle is: " + area + "\n");
    }
    static void circumference(double a)
    {
        double circu =  2 * Math.PI * a;
        System.out.print("The circumference of the circle is: " + circu + "\n");
    }   
    public static void main(String[] args) 
    {
        double rad = getRadius();
        System.out.println();
        area(rad);
        System.out.println();
        circumference(rad);
    }  
    
}
