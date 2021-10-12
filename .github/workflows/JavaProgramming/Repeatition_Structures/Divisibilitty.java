package Repeatition_Structures;

import java.util.Scanner;

public class Divisibilitty 
{
    public static void main(String[] args) 
    {
        Scanner div = new Scanner(System.in);
        
        System.out.println("Welcome to Divisibility!");
        
        System.out.println();
        //Inputs the value of X
        System.out.print("Input x: ");
        int x = div.nextInt();

        System.out.print("Input y: ");
        int y = div.nextInt();
        
        //Initiate total vairable
        int total = 0;

        //Checks if x is < or = to y if true then adds to total but not then not add to toal while incremementing plus 1
        while (x <= y)
        {
            if (x % 3 == 0 || x % 4 == 0)
            {
                total += x;   
            }
            x++;
        }
        
        System.out.print("The sum of all integers divisible by 3 or 4 from x to y is  = " + total);

        div.close();
        System.out.println();
    }    
}
