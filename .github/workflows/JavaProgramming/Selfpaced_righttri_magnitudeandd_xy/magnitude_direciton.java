package Selfpaced_righttri_magnitudeandd_xy;

import java.util.Scanner;

public class magnitude_direciton 
{
    static Scanner loc = new Scanner(System.in);
    
    public static void main(String[] args) 
    {
        System.out.println("Welcome to magnitude and direction!");
        System.out.println();
        System.out.print("Please input the magnitude of force 1: ");
        double m_1_f = loc.nextDouble();

        System.out.print("Please input the direction of force 1: ");
        double d_1 = loc.nextDouble();

        System.out.println();

        System.out.print("Please input the magnitude of force 2: ");
        double m_2_f = loc.nextDouble();

        System.out.print("Please input the direction of force 2: ");
        double d_2 = loc.nextDouble();

        //Validate input for the direction
        double d_1_f = validateInput(d_1);
        double d_2_f =validateInput(d_2);

        double resultantX = resultantX(m_1_f, m_2_f, d_1_f, d_2_f);
        double resultantY = resultantY(m_1_f, m_2_f, d_1_f, d_2_f);
        double resultant = resultant(resultantX, resultantY);
        double direction = direction(resultantX, resultantY);
        displayResults(resultant, direction);
    }   
    
    //Validate
    public static double validateInput(double a)
    {
        while (a <= 0 || a >= 360)
        {
            System.out.println("Please input a direction less than 0 or greater than 360!");
            System.out.print("Input the new direction: ");
            a = loc.nextDouble();
        }
        return a;
    }

    static double resultantX(double m_1, double m_2, double d_1, double d_2)
    {
        double resultant_X = m_1 * Math.cos(Math.toRadians(d_1)) + m_2 * Math.cos(Math.toRadians(d_2));
        return resultant_X;
    }

    static double resultantY(double m_1, double m_2, double d_1, double d_2)
    {
        double resultant_Y = m_1 * Math.sin(Math.toRadians(d_1)) + m_2 * Math.sin(Math.toRadians(d_2));
        return resultant_Y;
    }

    static double resultant(double resultantX, double resultantY)
    {
        double resultant = Math.hypot(resultantX, resultantY);
        return resultant;
    }

    static double direction(double resultantX, double resultantY)
    {
        double direction =  Math.toDegrees(Math.atan(resultantY/resultantX));
        return direction;
    }

    public static void displayResults(double resultant, double direction)//[16]c- void to stop the program after
    {
        System.out.printf("Resultant: %.2f%n", resultant);
        System.out.printf("Direction: %.2f%n", direction);
    }   
}
