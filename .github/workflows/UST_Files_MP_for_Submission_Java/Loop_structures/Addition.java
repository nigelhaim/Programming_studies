package Loop_structures;

import java.util.Scanner;
/*
Submitted by: Nigel Haim N. Sebastian 

Write a program that prompts the user to input an integer and then outputs
both the individual digits of the number and the sum of the digits. For
example, the program should: output the individual digits of 3456 as 3 4 5 6
and the sum as 18, output the individual digits of 8030 as 8 0 3 0 and the
sum as 11, output the individual digits of 2345526 as 2 3 4 5 5 2 6 and the
sum as 27, output the individual digits of 4000 as 4 0 0 0 and the sum as 4,
and output the individual digits of -2345 as 2 3 4 5 and the sum as 14.
*/
public class Addition 
{
    public static void main(String[] args) 
    {
        Scanner inte = new Scanner(System.in);
        
        System.out.print("Input Integer: ");
        int num  = inte.nextInt();
        int add = 0;
        String num_s = String.valueOf(num);
        System.out.println();
        for(int x = 0; num_s.length() > x; x++)
        {
            System.out.print(num_s.charAt(x) + " ");
            String num_i = Character.toString(num_s.charAt(x));
            add += (Integer.parseInt(num_i));
        }
        System.out.println();
        System.out.println();
        System.out.print("The total of the integers is: "+ add);
        System.out.println();
        System.out.println();
        inte.close();

    }    
}
