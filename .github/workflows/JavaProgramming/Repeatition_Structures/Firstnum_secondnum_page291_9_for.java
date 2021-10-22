package Repeatition_Structures;

import java.util.Scanner;

public class Firstnum_secondnum_page291_9_for
{
    public static void main(String[] args) 
    {
        Scanner num = new Scanner(System.in);

        System.out.print("Input the first Integer: ");
        int f_num = num.nextInt();

        System.out.println("Please input an integer greater than the first integer.");
        System.out.print("Input the second Integer: ");
        int s_num = num.nextInt();

        System.out.println();
       
        if (f_num < s_num)
        {
            //Prints odd integers 
            System.out.print("Odd Integers are: ");
            for (int odd = f_num; odd < s_num; odd++)
            {
                if (odd % 2 == 1)
                {
                    System.out.print(odd + " ");
                }
            }
            
            System.out.println();
            System.out.println();

            //Prints even integers
            System.out.print("Even Integers are: ");
            for (int even = f_num; even < s_num; even++)
            {
                if (even % 2 == 0 )
                {
                    System.out.print(even + " ");
                }
            }

            System.out.println();
            System.out.println();
             //Output all squared version of odd numbers
            System.out.print("The sum of the squared odd integers: ");
            int total = 0; 
            for (int sqr = f_num; sqr < s_num; sqr++)
            {
                if(sqr % 2 == 1)
                {
                    total += sqr;
                }
            }
            System.out.print(total);
            System.out.println();
            System.out.println();

           
        }
        else 
        {
            System.out.println();
            System.out.print("Please input the second integer greater than the first integer!");
        }

        //Output the squres between 1 and 10
        System.out.print("Number"); 
        System.out.println("\t Squared");
        for (int a = 0; a <= 10; a++ )
        {
            System.out.print(a);
            System.out.println("\t    " + a * a);
            a++;
        }
        System.out.println();
        num.close();
    }
}
