package Arrays;

import java.util.*;

/*
Submitted by: Nigel Haim N. Sebastian 

Write a program to process a data file containing a collection of daily 
temparatures in Celsius(use random values, range: 0-100). 
Your program should print the number of hot days 
(temperature 85 or higher), the number of pleasant days 
(temperature 60 - 84), and the number of cold days 
(temperatures less than 60). The program should also display the 
temperatures in each category. Data size is an input. Maximum value is 
50
*/
public class Randomized_temps 
{
    static Scanner ds = new Scanner(System.in);
    
    public static void main(String[] args) 
    {
        System.out.println("Welcome to temperature simulator!");
        Random temp = new Random();
        int c = 0;
        int p = 0; 
        int h = 0;
        System.out.print("Please input the data size: ");
        int data_s = ds.nextInt();
        int validated = validate(data_s);

        int[] data = new int[validated];

        String cold = "";
        String pleasant = "";
        String hot = "";

        for(int i = 0; i < validated; i++)
        {   
            data[i] = temp.nextInt(100);
        }

        for (int q = 0; q < validated; q++)
        {
            if(data[q] < 60)
            {
                c++;
                cold += (data[q] + " ");
            }
            if(data[q] >= 60 && data[q] <= 84)
            {
                p++;
                pleasant += (data[q] + " ");
            }
            if(data[q] > 84)
            {
                h++;
                hot += (data[q] + " ");
            }
        }

        System.out.print("Data File: ");
        String recs = " ;recorded temperatures: ";
        for(int print = 0; print < validated; print++)
        {
            int printer = data[print];
            System.out.print(printer + " ");
        }
        System.out.println();
        System.out.println("Number of cold days - " + c + recs + cold);
        System.out.println("Number of pleasant days - " + p + recs + pleasant);
        System.out.println("Number of hot days - " + h + recs + hot);
        System.out.println();

    }    
    public static int validate(int a)
    {
        while (a <= 0 || a >= 50)
        {
            System.out.println("Data size error please input data size that is greater than 0 or should not exceed 50!");
            System.out.print("Input new data size: ");
            a = ds.nextInt();
        }
        return a;
    }
}