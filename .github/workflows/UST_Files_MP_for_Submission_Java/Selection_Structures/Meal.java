package Selection_Structures;

import java.util.*;

public class Meal 
{
    public static void main(String[] args) 
    {
        Scanner yu = new Scanner(System.in);

        System.out.print("Input Meal Code (A || B || C): ");
        char mc = yu.nextLine().toUpperCase().charAt(0);

        System.out.print("Input Size (Regular - R || Upsize - U): ");
        char s = yu.nextLine().toUpperCase().charAt(0);

        System.out.print("Number of Orders: ");
        int no = yu.nextInt();

        double cost = 00.00;
        switch(mc)
        {
            case 'A':
                if (s == 'R')
                {
                    cost = no * 78.5;
                }

                if (s == 'U')
                {
                    cost = no * 102.50;
                }
                break;
            
            case 'B':
                if (s == 'R')
                {
                    cost = no * 68.75;
                }
                if (s == 'U')
                {
                    cost = no * 85.70;
                }
                break;
            
            case 'C':
                if (s == 'R') 
                {
                    cost = no * 70.25;
                }         
                
                if (s == 'U')
                {
                    cost = no * 95.60;
                } 
                break;        
        }

        if (no > 5)
        {
             cost = cost - (cost * 0.12);
        }

        double net = cost + (cost * 0.10);

        System.out.println();

        System.out.print("The total Cost is: " + net);

        System.out.println();
        System.out.println();

        yu.close();
    }    
}
