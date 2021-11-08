package Selfpaced_righttri_magnitudeandd_xy;
import java.util.*;
import java.lang.Math;
public class x_y_mathfunction 
{
    double a = 0.00;
    static Scanner num = new Scanner(System.in);
    static Scanner ak = new Scanner(System.in);
    static double input()
    {
        return num.nextDouble();
    }

    static double compute(double a, double b)
    {
        return ((3 * Math.pow(a, 5)) - (2 * Math.pow(a, 3)) + a);    
    }

    static void display(double a, double b)
    {
        System.out.println("  x" + "\t\t"  + "   y");
        for(double x = a; x <= b; x += 0.2)
        {
            double y = compute(x, b);
            System.out.printf("%.2f\t\t", x);
            System.out.printf("%.2f%n", y);
        }  
    }
    static double Inputvalidation(double a, double b)
    {
        while (a > b)
        {
            System.out.println();
            System.out.print("Please input the new number: ");
            b = num.nextDouble();
        }
        return b;
    }

    public static void main(String[] args) 
    {
        char ask = 'Y';
        do
        {
            System.out.print("Please input the starting number: ");
            double x = input();
            System.out.print("Please input the ending number: ");
            double b = input();
            double b_f = Inputvalidation(x, b);
    
            display(x, b_f);
            System.out.println();
            System.out.println("Do you wish to continue? (Y/N)");
            System.out.print("Answer: ");
            ask = ak.nextLine().toUpperCase().charAt(0);
        }
        while (ask == 'Y');  
        System.out.println("Thank you!");
        System.out.println();     
    }        
}
