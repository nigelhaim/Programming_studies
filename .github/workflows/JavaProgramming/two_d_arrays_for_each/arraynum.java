package two_d_arrays_for_each;

import java.util.*;

public class arraynum 
{
    static Random ran_int = new Random();  
    public static void main(String[] args) 
    {
        int [][] arr_1 = loadarray(1, 50);
        int [][] oddeven = oddeven(arr_1);
        int [][] sorted = sortArray(oddeven);
        display(sorted);
    }  
    
    static int [][] sortArray(int [][] array)
    {
        int temp;
        for (int n = 0; n < 1; n++)//current element
        {
            for (int i = 0; i < array[n].length; i++)
            {
                for(int c = i + 1; c < array[n].length; c++)
                {
                    if (array[n][i] > array[n][c])//if the current element is greater than the next element 
                    {
                        temp = array[c][i];
                        array[n][i] = array[n][c];
                        array[n][c] = temp;
                    }
                }
            }

        }
        return array;
    }
    static void display(int [][] arr)
    {
        
        for (int r = 0; r < 2; r++)
        {
            if (r == 0 )
                System.out.print("Even integers: ");
            if (r == 1)
                System.out.print("Odd integers: ");
            for(int c = 0; c < 16; c++)
            {
                int num = arr[r][c];
                if (num != 0)
                {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
        }
    }
    static int[][] oddeven(int [][] arr)
    {
        int [][] oddev = new int [2][16];
        int cnt_odd = 0;
        int cnt_even = 0;
        for (int r = 0; r < 4; r++)
        {
            for (int c = 0; c < 4; c++)
            {
                int num = arr[r][c];
                if (num % 2 == 0)
                {
                    oddev[0][cnt_even] = num;
                    cnt_even++;
                }
                else 
                {
                    oddev[1][cnt_odd] = num;
                    cnt_odd++;   
                }
            }
        }
        return oddev;
    }
    static int[][] loadarray(int min, int max)
    {
        int[][] num = new int[4][4];
        for (int r = 0; r < 4; r++)
        {
            for (int c = 0; c < 4; c++)
            {
                int rand = ran_int.nextInt(max) + min;
                num[r][c] = rand;
            }
        }
        return num;
    }
}
