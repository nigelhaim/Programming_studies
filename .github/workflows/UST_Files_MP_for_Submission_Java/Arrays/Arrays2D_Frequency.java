package Arrays;
import java.lang.reflect.Array;
import java.util.*;
/*
Submitted by: Nigel Haim N. Sebastian 
Write a java program that loads a 1D array with 20 random integers 
(range: 1-20) and outputs how many times a particular number appears 
in the list. Store the result in a 2D array, where the first column 
contains the number and the second column containts the number of times 
that number appears in the list. The numbers must be output in increasing
order. 

*/
public class Arrays2D_Frequency 
{
    public static void main(String[] args) 
    {
        Random gen = new Random();
        int [] arr_1 = new int [20];
        int [][] arr_2 = new int [20][2];
        for (int cn = 0; cn < 20; cn++)
        {
            arr_1[cn] = gen.nextInt(20 - 1) + 1;
        }

        Arrays.sort(arr_1);

        System.out.println();
        for (int i = 0; i < 20; i++)
        {
            int counter = 0; 
            for (int j = 0; j < 20; j++)
            {                    
                int num = arr_1[j];
                if (num == i)
                {
                    counter++;
                }
            }
            if (counter != 0)
            {
                arr_2[i][1] = counter;
            }
        }

        System.out.println("Number\tFrequency");
        for(int p = 0; p < 20; p++)
        {
            int num = arr_2[p][1];
            if(num != 0)
            {
                System.out.println("  " + p + "\t    " + num);
            }
        }
    }    
}
