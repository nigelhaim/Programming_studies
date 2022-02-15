/*Nigel Haim N. Sebastian
1CSA*/
import java.util.*;
public class Recurssion 
{
    static Random rand = new Random();//Initiates Random for random numbers
    static Scanner in = new Scanner(System.in);//Initiates Scanner to get inputs
    public static void main(String[] args) 
    {
        int lowerbound = 5;//The lowerbound for the random 
        int upperbound = 15;//The Upperbound for the Random 

        //Gets the number of elements for the first array from the user
        System.out.print("Enter number of elements of Array A: ");
        int x = in.nextInt();

        //Initiates the first array 
        int[] a = LoadArr(lowerbound, upperbound, x);
        //The array for the multiplied numbers
        int[] b = Timesarr(a);
        System.out.println();

        //Prints the original array
        System.out.println("Original Array");
        for(int m = 0; m < a.length; m++)
        {
            int h = a[m];//Gets the integer from the array
            System.out.print(h + "\t");//Prints the integer
        }
        System.out.println();

        //Prints the multiplied array
        System.out.println("Multiplied Array\n");
        for(int n = 0; n < b.length; n++)
        {
            int h = b[n];//Gets the integer from the array
            System.out.print(h + "\t");//Prints the integer
        }

        System.out.println();
        int n = 0;//Initiates the loop
        int r = 0;//Initiates the counter of numbers greater than 5xA[0]
        System.out.println("Elements Greater than 5xA[0]");
        PrintGreat5(a, b, n, r);//Method that prints how many numbers greater than 5xA[0]
    } 
    //A recursion Method that loads the array
    public static int[] LoadArr(int lowerbound, int upperbound, int len)
    {
        //Initiates the array and the array size based from the length given by the user
        int [] Arr = new int[len];
        //Loop that stores random integers in the array
        for(int i = 0;  i < Arr.length; i++)
        {
            int ran = rand.nextInt(upperbound-lowerbound)+lowerbound;//Generates random integers ranging form 5 to 15
            Arr[i] = ran;//Stores the random integer on the array 
        }
        return Arr;//Returns the array
    }   
    
    //Method that creates and finalize Array B 
    public static int[] Timesarr(int[] Array)
    {  
        int count = 0; //Initiates the count 
        int[] b = new int[Array.length - 1];
        int c = 0;
        b = Multiappender(b, count, Array, c);
        return b;
    }

    //A recursive method that appends the b on the array
    public static int[] Multiappender(int[] b, int count, int[] Array, int c)
    {
        //If c is equal to the length of the array then it will return array b
        if(c == b.length)
        {
            return b;
        }

        else {
            int x = Array[count];//Gets the first integer form the array a
            count++;//Increments for the second integer from the array a 
            int y = Array[count];//Gets the second integer form the array a
            b[c] = Multipicator(x, y);//Calls the method that multiplies both integers
            c++;//Increments c
            return Multiappender(b, count, Array, c);//Returns for an another loop
        }
    }
    //Recursive method that multiplies both integers
    public static int Multipicator(int x, int y)
    {
        if(y == 1)//If the incrementing 
        {
            return x;//Returns the final result 
        }
        else 
        {
            return x + Multipicator(x, y - 1);//Loops and adds x if y is still not y
        }
    }
    //Recursive method that prints if the other values in the array b is greater than the first value in the array 
    public static void PrintGreat5(int[] a, int[] b, int n, int r)
    {
        //Tests if n has now compered all values in the array it will return the number of values 
        if (n == b.length)
        {
            System.out.println(r);
            return;
        }
        else
        {
            int li = a[0];//Gets the value of the first element in the array
            int l = li * 5;//Multiplies the value of li to 5
            if(l < b[n])//If l is less than the selected element in the array 
            {
                r++;//Adds 1 to the return value 
            }
            n++;//Increments for the next loop
            PrintGreat5(a, b, n, r);//Calles the method for an another loop
        }
    }
}
