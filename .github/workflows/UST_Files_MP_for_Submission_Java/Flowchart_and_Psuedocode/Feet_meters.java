package Flowchart_and_Psuedocode;
//Submitted by: Nigel Haim N. Sebastian
/*
    4. Write a program that converts feet to meters. The program 
    should display feet from 3 to 30 in 3-foot increments and 
    the corresponding metere equivalents.
*/ 
public class Feet_meters 
{
    public static void main(String[] args) 
    {
        System.out.println("Welcome to the Feet to meters converter!");

        System.out.println("3 to 30 Feet to meters");
        System.out.println();

        System.out.println("Feet\tMeters");

        for(double i = 3; i <= 30; i+=3)
        {
            double meters = i * 0.3048;

            System.out.printf("%.2f\t%.2f %n",i, meters);
        }
    }    
}
