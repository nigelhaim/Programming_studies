package Repeatition_Structures;
import java.util.*;
public class Firstnum_secondnum_page291_9_Do_while 
{
    public static void main(String[] args) 
    {
        Scanner num = new Scanner(System.in);

        System.out.print("Input the first Integer: ");
        int f_num = num.nextInt();

        System.out.println("Please input an integer greater than the first integer");
        System.out.print("Input the second integer: ");
        int s_num = num.nextInt();

        System.out.println();

        //Initialize variables 
        int ev_lp = f_num; 
        int sqr = f_num; 
        if (f_num < s_num)
        {
            System.out.print("Odd Integers are: ");
            do
            {
                if (f_num % 2 == 1)
                {
                    System.out.print(f_num + " ");
                }
                f_num++;
            }
            while (f_num < s_num);

            System.out.println();
            System.out.println();

            System.out.print("Even Integers are: ");
            do
            {
                if (ev_lp % 2 == 0)
                {
                    System.out.print(ev_lp + " ");
                }
                ev_lp++;
            }
            while(ev_lp < s_num);

            System.out.println();
            System.out.println();

            //Output all squared versions of odd numbers 
            System.out.print("The sum of the squares of all the odd numbers: ");
            int total = 0;
            do
            {
                if (sqr % 2 == 1)
                {
                    total += sqr;
                }
                sqr++;
            }
            while(sqr < s_num);

            System.out.print(total);

            System.out.println();
            System.out.println();

        }
        
        else 
        {
            System.out.println();
            System.out.print("Please input the second integer greater thatn the first integer!");
        }

        //Output the squares between 1 and 10
        System.out.print("Number");
        System.out.println("\t Squared");
        int a = 1;
        do 
        {
            System.out.print(a);
            System.out.println("\t    "+ a * a);
            a++;
        }
        while (a <=10);
        System.out.println();
        num.close();
    }    
}
