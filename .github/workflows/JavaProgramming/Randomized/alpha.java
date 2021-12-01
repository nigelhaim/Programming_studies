package Randomized;

import java.util.*;

public class alpha 
{
   
    public static void main(String[] args) 
    {
        double[] arr = dd(50);
        
        double[] tripled = trip(arr);
        
        double[] squared = sqr(arr);

        for (int m = 0; m < 25; m++)
        {
            double index = arr[m];
            double f_sqr = squared[m];
            System.out.println(index + "\t" + f_sqr);
        }
        System.out.println();
        System.out.println();
        
        for (int t = 25; t < 50; t++)
        {
            double index = arr[t];
            double f_tri = tripled[t - 25];
            System.out.println(index + "\t" + f_tri);
        }
    }  
    
    static double[] dd(int a)
    {
        Random d_rand = new Random();
        double[] double_arr = new double[a];

        for (int d = 0; d < a; d++)
        {
            double_arr[d] = d_rand.nextDouble();
        }
        return double_arr;
    }

    static double[] sqr(double [] array)
    {
        double[] ret = new double[25];
        for (int i = 0; i < 25; i++)
        {
            double begin = array[i];
            double fn = begin * begin;
            ret[i] = fn;
        }
        return ret;
    }

    static double[] trip(double [] array)
    {
        double[] ret = new double[25];
        int cnt = 25;
        for(int i = 0; i < 25; i++)
        {
            double begin = array[cnt];
            double fn = begin * 3.00;
            ret[i] = fn;
            cnt++;
        }
        return ret;
    }
}
