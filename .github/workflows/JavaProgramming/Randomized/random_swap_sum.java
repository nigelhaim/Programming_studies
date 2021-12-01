package Randomized;

import java.util.*;


public class random_swap_sum 
{
    static Scanner lego = new Scanner(System.in);
    public static void main(String[] args) 
    {
        


        System.out.println("Welcome to the swap and add!");
        System.out.println();
        
        System.out.print("Please input the number of values: ");
        int inp = lego.nextInt();

        int num = validateN(inp);

        int[] arr_num = loadArray(num);    
        int[] rev_num = swapElements(num, arr_num);
        int[] sum_num = swapADDElements(num, arr_num, rev_num); 
        System.out.println("Original Number \t \b\bReversed \t Sum");
        for(int p = 0; p < inp; p++)
        {
            int index = arr_num[p];
            int reversed = rev_num[p];
            int sum = sum_num[p];
            System.out.println("\t" + index + "\t\t  " + reversed + "\t\t " + sum);
        }
    }  
    
    static int validateN(int n)
    {
        while (n <= 0)
        {
            System.out.println("Please input an integer greater than 0!");
            System.out.print("Input new number: ");
            n = lego.nextInt();
        }
        return n;
    }  

    static int[] loadArray(int num)
    {
        Random list = new Random();
        int min = 10;
        int max = 30;
        int[] arr_num = new int[num];
        for(int i = 0; i < num; i++)
        {
            arr_num[i] = list.nextInt(max - min) + min;
        }
        return arr_num;
    }
    
    static int[] swapElements(int num, int [] arr)
    {
        int[] rev_num = new int[num];
        int va = 0;
        for(int i = num-1; i < num && i >= 0; i--)
        {
            int integer = arr[i];
            rev_num[va] = integer; 
            va++;
        }
        return rev_num;
    }

    static int[] swapADDElements(int num, int [] arr, int [] rev)
    {
        int[] arr_num = arr;    
        int[] rev_num = rev;
        int[] sum_num = new int[num];

        for(int i = 0; i < num; i++)
        {
            int index =  arr_num[i];
            int reversed = rev_num[i];
            int sum = index + reversed;
            sum_num[i] = sum;
        }
        return sum_num;

    }

}
