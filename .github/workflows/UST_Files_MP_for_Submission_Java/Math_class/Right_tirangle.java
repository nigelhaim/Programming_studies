package Math_class;
import java.util.*;
import java.lang.Math;
/*
Submitted by: Nigel Haim N. Sebastian 
Write a java program that will ask the user to enter the 
2 sides (a and b) of a right triangle. The program will then 
compute and display the hypotenuse c, the six trigonometric functions 
of angle A and angles A and B in degrees.
*/
public class Right_tirangle 
{
    static Scanner side = new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.println("Welcome to the right triangle!");
    
        System.out.println();

        System.out.print("Please input side a: ");
        double a = side.nextDouble();
        System.out.print("Please input side b: ");
        double b = side.nextDouble();
        System.out.println();

        double c = Math.sqrt((Math.pow(a, 2) + (Math.pow(b, 2))));

        double sin = b/c;
        double cos = a/c;
        double tan = b/a;

        double csc = c/b;
        double sec = c/a;
        double cot = a/b;

        System.out.printf("The hypotenuse of the right triangle is: %.2f%n", c);

        System.out.println("Six trigonometric functions");

        System.out.printf("sin: %.2f \t csc: %.2f%n", sin, csc);
        System.out.printf("cos: %.2f \t sec: %.2f%n", cos, sec);
        System.out.printf("tan: %.2f \t cot: %.2f%n", tan, cot);

        System.out.println();
    }    
}
