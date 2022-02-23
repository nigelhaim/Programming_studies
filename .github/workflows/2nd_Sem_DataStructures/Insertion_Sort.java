import java.util.*;
public class Insertion_Sort 
{
    public static void main(String[] args) 
    {
        int count = 0;
        int[] uns_arr = {5, 2, 8, 1, 3 ,6, 4 ,7};
        printer(uns_arr, count);
        count++;
        Insertionsort(uns_arr, count);
        System.out.println();
    }    
    public static int findLowest(int[] arr)
    {
        int lowest = arr[0];
        int loc = 0;
        for(int i = 1; i < arr.length; i++)
        {
            int a = arr[i];
            if(a < lowest)
            {
                lowest = a;
                loc++;
            }
        }
        return loc;
    }                                   //Unsorted
    public static int[] Insertionsort(int[] arr, int count)
    {
        int i = 1;
  
        while(i < arr.length)
        {
            int[] arrcomp = new int[arr.length];//array compare
            System.arraycopy(arr, 0, arrcomp, 0, arr.length);
            for(int j = i; (j > 0) && (arr[j-1] > arr[j]);j--)
            {
                int a = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = a;  
            }
            //Always remember after ng loop same na kaagad arrcomp and arr 
            if(!Arrays.equals(arr, arrcomp))
            {
                printer(arr, count);
                count++;
            }
            i++;

        }
        return arr;
    }
    public static void printer(int[] arr, int count)
    {
        if (count < 10)
        {
            System.out.print(count + " ");
        }
        else
        {
            System.out.print(count);
        }
        
        for(int i = 0; i < arr.length; i++)
        {
            int p = arr[i];
            System.out.print(" |" + p + "| ");
        }
        System.out.println();
    }
}
