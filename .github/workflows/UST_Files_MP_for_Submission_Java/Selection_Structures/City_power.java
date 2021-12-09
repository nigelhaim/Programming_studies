package Selection_Structures;
import java.util.*;
import java.lang.Math;
/*
Submitted by: Nigel Haim N. Sebastian 
Write a program that will calculate and print bills for the city 
power company
*/
public class City_power 
{
    static Scanner power = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Welcome to electrical bill!");
        System.out.print("Input code (R|C|I): ");
        char cd = power.next().toUpperCase().charAt(0);

        System.out.print("Input kilowats per hour: ");
        double kwh = power.nextDouble();
        
        double bill = 0;
        if(cd == 'R')
        {
            bill = 175.3 + (3.5 * kwh); 
        }

        if(cd == 'C')
        {
            if (kwh <= 1000)
            {
                bill = 1550.75;
            }
            
            else
            {
                kwh -= 1000;
                bill = 1550.75 + (5.75 * kwh);
            }
        }

        if (cd == 'I')
        {
            bill = Math.ceil(kwh/500)*875.45;
        }

        System.out.println("The total bill is: " + bill);
    }    
}
