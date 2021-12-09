package Arrays;
import java.util.*;
/*
Submitted by: Nigel Haim N. Sebastian 

Write a program that will load A with N random integers (range: 10 - 30).
The program will and add then swap the contents of the first element 
and last element, the second element and second to the last element, 
the thrid element and third to the last element, and so on... The sum 
of the 2 elements should be stored in array B. Display the original 
contents of A on one line, on another line display contents of A after 
swapping the elements, then display contents of B. 
*/
public class Swap_and_sum 
{
    static Scanner num_count = new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.println("Welcome to add and swap contents ");
        System.out.print("Input number of elements: ");
        int n = num_count.nextInt();
        int n_v = validate(n);

        int [] loaded_arr = loadArray(n_v);
        int [] swapAddElements = swapAddElements(loaded_arr, n_v);
        
        System.out.print("Elements of a: ");
        for (int a = 0; a < n_v; a++)
        {
            System.out.print(loaded_arr[a] + " ");
        }
        System.out.println();
        System.out.print("Elements of A after swapping: ");
        for(int b = n_v - 1; b < n_v && b >= 0; b--)
        {
            int c = loaded_arr[b];
            System.out.print(c + " ");
        }
        System.out.println();
        System.out.print("Elements of B: ");
        for (int a = 0; a < n_v; a++)
        {
            System.out.print(swapAddElements[a] + " ");
        }

    } 
    
    static int validate(int n)
    {
        while (n < 10 || n > 30)
        {
            System.out.print("Please input an integer greater than to 10 or less than 30: ");
            n = num_count.nextInt();
        }
        return n;
    }

    static int [] loadArray(int n)
    {
        Random rand = new Random();
        int [] loaded = new int [n];
        for(int i = 0; i < n; i++)
        {
            loaded[i] = rand.nextInt(30 - 10) + 10;
        }
        return loaded;
    }

    static int [] swapAddElements(int [] loaded_arr, int n_v)
    {
        int [] reversed = new int[n_v];
        int [] sum = new int[n_v];

        for(int b = n_v-1, a = 0; b < n_v && b >= 0; b--)
        {
            int c = loaded_arr[b];
            reversed[a] = c;
            a++;
        }

        for (int k = 0; k < n_v; k++)
        {
            int d = loaded_arr[k];
            int c = reversed[k];
            sum[k] = d + c;
        }
        return sum;
    }
}
