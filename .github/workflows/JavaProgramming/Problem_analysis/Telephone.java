package Problem_analysis;

import java.util.*;

public class Telephone 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Gets the Time of the day
        System.out.println("What time of the Day?");
        System.out.print("Day - A or Night - B: ");
        char time = sc.nextLine().charAt(0);

        // Checks the validity of the time of the day 
        if (time == 'A' || time =='a' || time == 'B' || time == 'b')
        {
            // Gets the duration of the call 
            System.out.print("Input time of call (In minutes): ");
            int minu = sc.nextInt();

            double cost = (minu * 4);
            double price = cost;
            double final_net = 0.00;
            double ded = 0.00;
            //If night include discount 
            if (time == 'B' || time == 'b') 
            {
                price = cost * 0.50;
            }

            //Checks the validity of the duration
            if (minu > 60) 
            {
                //If more than 1 hour include discount 
                while (minu > 60) 
                {
                    ded = price * 0.15;
                    price = price - ded;
                    minu -= 60;
                }
                final_net = price + (price * 0.12);
                System.out.println();
                System.out.println("Gross: P" + cost);
                System.out.println("Net cost: P" + final_net);

            }
            if (minu < 0)
            {
                System.out.println();
                System.out.println("Invalid Duration!");
            }
        }

        else
        {
            System.out.println();
            System.out.println("Invalid time!");
        }
        
        System.out.println();
        sc.close();
    }

}