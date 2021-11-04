package Methods;

import java.lang.Math;
import java.util.Scanner;


public class circiumference 
{
    public static void main(String[] args) 
    {
        Scanner cir = new Scanner(System.in);
        System.out.print("Please input the radius: ");
        double rad = cir.nextDouble();
        System.out.println();
        area(rad);
        System.out.println();
        circumference(rad);
        cir.close();
    }    
    public static void area(double a)
    {
        double area = (a * a) * Math.PI;
        System.out.print("The area of the circle is: " + area + "\n");
    }
    static void circumference(double a)
    {
        double circu =  2 * Math.PI * a;
        System.out.print("The circumference of the circle is: " + circu + "\n");
    }
}
