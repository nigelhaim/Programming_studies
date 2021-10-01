package Problem_analysis;

import java.util.Scanner;

public class order 
{
    public static void main(String[] args) 
    {
        Scanner ct = new Scanner(System.in);

        System.out.print("Insert Meal Code: ");
        char mc = ct.nextLine().charAt(0);

        System.out.print("Meal Size: ");
        char s = ct.nextLine().charAt(0);

        System.out.print("Number of orders: ");
        int o = ct.nextInt();

        double cost = 0.00;
        if (mc == 'A' || mc == 'a')
        {
            if (s == 'r' || s == 'R')
            {
                cost = 78.75 * o;
            }

            if (s == 'u' || s == 'U')
            {
                cost = 102.5 * o;
            }
        }

        if (mc == 'B' || mc == 'b')
        {
            if (s == 'r' || s == 'R')
            {
                cost = 68.75 * o; 
            }
            if (s == 'u' || s == 'U')
            {
                cost = 85.7 * o; 
            }
            if (mc == 'C' || mc == 'c')
            {
                if(s == 'r' || s == 'R')
                {
                    cost = 70.25;
                }
                if (s == 'u' || s == 'U')
                {
                    cost = 95.6 * o;
                }
            }
            if (o > 5)
            {
                cost = 0.88*cost;
            }
        }

        System.out.println();
        double net = cost * 1.1;
        System.out.println("The total cost is: " + net);
        System.out.println();
        ct.close();

    }
}
