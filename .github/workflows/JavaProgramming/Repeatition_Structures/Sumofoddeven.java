package Repeatition_Structures;

import java.util.*;


public class Sumofoddeven 
{
    public static void main(String[] args) 
    {
        Scanner mouse = new Scanner(System.in);
        
        int even = 0;
        int odd = 0;
        
        System.out.println("Please input an integer if you want to output the answer please input an equal sign (=)");
        System.out.print("Please input an integer: ");
        String integer = mouse.nextLine();
        char mike = integer.charAt(0);

        while (mike != '=')
        {
            System.out.print("Please input an integer: ");
            integer = mouse.nextLine();
            mike = integer.charAt(0);
            if (mike != '=')
            {
                int num = Integer.parseInt(integer);

                if (num % 2 == 0)
                {
                    even += num;
                }

                else if (num % 2 == 1)
                {
                    odd += num;
                }

            }
        }
        System.out.println();
        System.out.println("The sum of even numbers is: " + even);

        System.out.print("The sum of odd numbers is: " + odd);

 
        mouse.close();

    }
}
