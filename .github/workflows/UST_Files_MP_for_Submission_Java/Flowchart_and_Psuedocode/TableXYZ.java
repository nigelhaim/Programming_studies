package Flowchart_and_Psuedocode;

import java.util.*;
import java.lang.Math;
/*
Submitted by: Nigel Haim N. Sebastian
2. Write a program that will produce a table of x, y, and z 
values for the given functions 
*/
public class TableXYZ 
{
    static Scanner num = new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.println("Welcome to XYZ Table!");

        System.out.println("Please input the minimum number: ");
        int a = num.nextInt();
        
        System.out.println("Please input the maximum number: ");
        int b = num.nextInt();

        System.out.println("Please input the increment value: ");
        int i = num.nextInt();
        
        System.out.println("Please input the angle: ");
        int t = num.nextInt();

        System.out.println("x\t\ty\t\tz");
        for(int x = a; x <= b; x += i)
        {
            double y = (3*Math.pow((x), 5) - 2*(Math.pow((x), 3)) + x);
            double z = (y*Math.sin(Math.toRadians(t))) + 0.6*x*2;
            
            System.out.printf(x + "\t");
            System.out.format("%10.2f", y);
            System.out.format("\t%10.2f\n", z);
        }
    }    
}
