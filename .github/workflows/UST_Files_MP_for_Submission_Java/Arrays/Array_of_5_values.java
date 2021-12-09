package Arrays;

import java.util.Scanner;

/*
Submitted by: Nigel Haim N. Sebastian 

Given the declaration: int[] num = new int [5]
a. write a for loop that will load num with data
b. write a for-each loop that will display tyhe contents of array num
c. write a for loop that will multiply each element of num by 10 and display the results
d. write a for-each that will add all the contents of num 
e. write a for loop that will display the first, third and fifth element only 
f. write a program segment that will display all the elements that are greater than 60

*/

public class Array_of_5_values 
{
    static Scanner x = new Scanner(System.in);
    public static void main(String[] args) 
    {
        int [] num = new int[5];  
        System.out.println("Welcome to arrays!");
        for (int count = 0; count < num.length; count++)
        {
            System.out.print("Input value for num[" + count + "]: ");
            num[count] = x.nextInt();
        }
        System.out.println();
        System.out.print("The contents of array num: ");
        for (int prod = 0; prod < num.length; prod++)
        {
            int mult_prod = num[prod];
            System.out.print(mult_prod + " ");
        }
        
        System.out.println();
        System.out.print("The multiplied integers by 10: ");
        for (int prod = 0; prod < num.length; prod++)
        {
            int mult_prod = num[prod] * 10;
            System.out.print(mult_prod + " ");
        }

        System.out.println();
        System.out.print("The sum of all array num values: ");
        int sum = 0;
        for (int prod = 0; prod < num.length; prod++)
        {
            sum += num[prod];
        }
        System.out.print(sum + " ");

        System.out.println();
        System.out.print("The 1st, 3rd, 5th: ");
        for (int prod = 0; prod < num.length; prod+=2)
        {
            int mult_prod = num[prod];
            System.out.print(mult_prod + " ");
        }

        System.out.println();
        System.out.print("The values in array num that is greater than 60: ");
        for (int prod = 0; prod < num.length; prod++)
        {
            int mult_prod = num[prod];
            if (mult_prod > 60)
            {
                System.out.print(mult_prod + " ");
            }

        } 
    }    
}
