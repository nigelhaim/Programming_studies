package Math_class;
import java.lang.Math;
import java.util.*;
/*
Submitted by: Nigel Haim N. Sebastian
Write a java program that will compute and display the value of s and 
c given x, y, and z, z is an angle in degrees.
*/
public class S_C_XY 
{
    static Scanner num = new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.println("Welcome to s and c values!");
        System.out.print("Input the value of x: ");
        int x = num.nextInt();

        System.out.print("Input the value of y: ");
        int y = num.nextInt();

        System.out.print("Input the angle (degrees): ");
        int z = num.nextInt();

        double e = 2.71828182845;
        double s = (((Math.pow(e, x) + (3*y)) / ((2*x) - y)) + Math.sin(z));

        double c = x * Math.pow((1 + (y/3)), x);

        System.out.println("The value of s is: " + s);
        System.out.println("The value of c is: " + c);
    }    
}
