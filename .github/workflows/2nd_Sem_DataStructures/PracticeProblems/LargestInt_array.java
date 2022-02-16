package PracticeProblems;
import java.util.*;//Imports the utility class
public class LargestInt_array 
{
    static Random rand = new Random();//Initiates the randomizer
    public static void main(String[] args) 
    {
        int len = rand.nextInt(50);//randomizes the lenght of the array that is up to 50
        int[] arr = makearr(len);
        System.out.println();
        System.out.println("Array contents: ");
        for(int i = 0; i < arr.length; i++)
        {
            int x = arr[i];
            System.out.print(x + "|");
        }

        System.out.println();
        System.out.print("The largest integer in the array: ");
        int count = 0;
        int large = 0;
        Printlarge(arr, count, large);

    }    

    public static int[] makearr(int n)
    {
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++)
        {
            int x = rand.nextInt(50);
            arr[i] = x;
        }
        return arr;
    }

    public static void Printlarge(int[] arr, int count, int l)
    {
        int x = arr[count];
        if(count == arr.length - 1)
        {
            System.out.println(l);
            System.out.println();
            return;
        }
        else
        {
            if(x >= l)
            {
                l = x;
            }
            count++;
            Printlarge(arr, count, l);    
        }
    }
}
