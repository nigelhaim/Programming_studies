package From_Classmates;

import java.util.*;

public class aly_x_y {
    static Scanner in = new Scanner(System.in); static char choice;
    public static void main(String[] args)
    {
        System.out.print("\n\n");
        System.out.println("This program will display a table of x and y values for the function y = 3x^5 - 2x^3 + x when a < b.");
        System.out.println("Note: The program will execute for as long as you want to continue. Typing other letters aside from 'Y' or 'y' will end the program.");
        do
        {
            System.out.print("\nEnter a lower bound [a]"); double a = input();//[1]
            System.out.print("Enter an upper bound [b]"); double b = input();//[3]
            while (a > b)//validation of limits
            {
                System.out.println("\nThis input is invalid. a should be less than b.");
                System.out.print("Please enter a lower limit [a]"); a = input();
                System.out.print("Please enter an upper limit [b]"); b = input(); System.out.println();
            }
            System.out.print("Enter a value [x] (must be between [a] and [b])"); double x = input();//[5]
            while (x <= a || x >= b)//validation of x
            {
                System.out.println("\nThis input is invalid. [x] should be between [a] and [b].");
                System.out.print("Please enter another value [x]"); x = input(); System.out.println();
            }
            System.out.println("\n\t\t x\t\t   y");//[7]
            for (; x < b; x+=0.2)
            {
                double y = compute(x, b);//[8]
                display(x, y);//[10]
            }
            System.out.println("\n\nThank you for using the program! Do you want to continue?");
            System.out.print("Enter 'Y'/'y' to continue or any letter to stop: "); choice = Character.toLowerCase(in.next().charAt(0));//[12]
        } while (choice == 'y');//[program repeats until a non-'y' letter is entered]
        System.out.print("\n\n");
    }
    public static double input()//uses input entered by the user [2], [4], [6] 
    {
        System.out.print(": "); double n = in.nextDouble();
        return n;//n goes the the variables
    }
    public static double compute(double x, double y)//[9]
    {
        return (3*Math.pow(x, 5)) - (2*Math.pow(x, 3)) + x;//y = 3x^5 - 2x^3 + x
    }
    public static void display(double x, double y)//[11]
    {
        System.out.printf("%n\t\t%.2f\t\t%.2f", x, y);
    }
}
