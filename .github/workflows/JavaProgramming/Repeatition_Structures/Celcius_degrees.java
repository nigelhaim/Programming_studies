package Repeatition_Structures;

import java.util.Scanner;

public class Celcius_degrees 
{
    public static void main(String[] args) 
    {
        Scanner deg = new Scanner(System.in);
        System.out.println("Welcome to the converter");
        System.out.println();
        System.out.print("Input Starting Celsius value: ");
        int c = deg.nextInt();

        System.out.print("Input Number of convertions: ");
        int conv = deg.nextInt();

        System.out.print("Input the number of increments: ");
        double inc = deg.nextDouble();
        System.out.println();
        System.out.print("Celcius \t Farenheit");
        System.out.println();
        
        for (int count = 0; count <= conv; count++)
        {
            double f = c * 1.8 + 32;
            System.out.println("  " + c + "\t\t" + "    " + f);
            c += inc;
        }
        deg.close();
    }    
}
