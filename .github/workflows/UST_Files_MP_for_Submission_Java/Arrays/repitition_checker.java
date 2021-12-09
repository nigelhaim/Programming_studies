package Arrays;
import java.util.*;

import two_d_arrays_for_each.arraynum;
/*
Submitted by: Nigel Haim N. Sebastian 
Write a program that will generate N random numbers (range: 1-50) 
and store it in a 1-dimensional array, list; then the program will 
read a number d and check whether the number d is present in the array. 
If it is so, print how many times the number d is repeated in the array. 
The program will also sort the array in ascending order and display the 
sorted array.
*/
public class repitition_checker 
{
    static Scanner size = new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.println("Welcom to repitition checker!");
        System.out.print("How many numbers will be generated: ");
        int d = size.nextInt();

        int [] arr_num = loadlist(d);
        int [] sorted = sortList(arr_num);
        int result = searchList(d, sorted);
        System.out.print("The values in the array are: ");
        for (int i = 0; i < d; i++)
        {
            System.out.print(sorted[i] + " ");
        }
        System.out.println();
        System.out.println("The number of d repeated " + result + " times!");

    }   
    static int[] loadlist(int arr_size)
    {
        Random num = new Random();
        int [] arr_num = new int[arr_size];
        for (int i = 0; i < arr_size; i++)
        {
            int inte = num.nextInt(50 - 1) + 1;
            arr_num[i] = inte;
        }

        return arr_num;
    }

    static int[] sortList(int [] arr_num)
    {
        Arrays.sort(arr_num);
        return arr_num;
    }

    static int searchList(int d, int [] sorted)
    {
        int counter = 0;
        for (int i = 0; i < d; i++)
        {
            int test = sorted[i];
            if (test == d)
            {
                counter++;
            }
        }
        return counter;
    }
}
