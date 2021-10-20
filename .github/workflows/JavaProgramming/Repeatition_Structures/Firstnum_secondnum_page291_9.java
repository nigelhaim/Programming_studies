package Repeatition_Structures;

import java.util.Scanner;

public class Firstnum_secondnum_page291_9 
{
    public static void main(String[] args) 
    {
        Scanner num = new Scanner(System.in);
        
        System.out.print("Input the first Integer: ");
        int f_num = num.nextInt();

        System.out.println("Please the input an integer greater than the first integer");
        System.out.print("Input the second Integer : ");
        int s_num = num.nextInt();
        System.out.println();
        //Initialize variables
        int ev_lp = f_num;
        int sqr = f_num;
        if (f_num < s_num)
        {
            //Prints odd integers
            System.out.print("Odd Integers are: ");
            while (f_num < s_num)
            {
                if (f_num % 2 == 1)
                {
                    System.out.print(f_num + " ");
                }

                f_num++;
            }
            
            System.out.println();
            System.out.println();
           
            // Prints even Integers 
            System.out.print("Even Integers are: ");
            while (ev_lp < s_num)
            {
               
                if (ev_lp % 2 == 0)
                {
                    System.out.print(ev_lp + " ");
                }
                ev_lp++;
            }

            System.out.println();
            System.out.println();

            //Output all squared versions of odd numbers   
            System.out.print("Odd integers in their squared form: ");
            while (sqr < s_num)
            {
                if (sqr % 2 == 1)
                {
                    System.out.print((sqr * sqr) + " ");
                }
                sqr++;
            }
            System.out.println();
            System.out.println();
        }


        else
        {
            System.out.println();
            System.out.print("Pleae input the second integer greater than the first integer!");
        }
         //Output the squares between 1 and 10 
        System.out.print("Number"); 
        System.out.println("\t Squared");
        int a = 1;
        while (a <= 10)
        {
            System.out.print(a);
            System.out.println("\t    " + a * a);
            a++; 
        }
        System.out.println();
        num.close();

    }    
}
