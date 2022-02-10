import java.util.*;
import java.lang.Math;
public class Formative_MP1_arrays
{
    static Random num = new Random();
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.print("Input number of integers: ");
        int n = in.nextInt();
    
        int[] list =  new int[n];
        generate_arr(list, n);
        int[] prime = new int[n];
        primearr(list, prime, n);
        int[] composite = new int[n];
        comparr(list, composite, n);

        System.out.println("Array len: " + n);
        
        System.out.print("Array: ");
        for(int q = 0; q < list.length; q++)
        {
            int nb = list[q];
            System.out.print(nb + " || ");
        }

        System.out.println();
        System.out.print("Prime: ");
        for(int q = 0; q < prime.length; q++)
        {
            int nm = prime[q];
            if (nm != 0)
            {
                System.out.print(nm + " || ");
            }
        }

        System.out.println();
        System.out.print("Composite: ");
        for(int q = 0; q < composite.length; q++)
        {
            int vb = composite[q];
            if (vb != 0)
            {
                System.out.print(vb + " || ");
            }
        }
        
    }

    public static void generate_arr(int[] list, int n)
    {        
        /*for(int i = 0; i < gen.length; i++)
        {
            int nn = num.nextInt(300 - 2) + 2;
            gen[i] = nn;
        }*/
        if (n == 0)
        {
            return;
        }
        else {
            int nn = num.nextInt(300 - 2) + 2;
            list[n-1] = nn;
            n--;
            generate_arr(list, n);
        }
    }

    /*public static int[] primearr(int[] arr)
    {
        int c = 0;
        for(int t = 0; t < arr.length; t++)
        {
            int num = arr[t];
            boolean test = testPrime(num);
            if (test == true)
            {
                c++;
            }
        }
        int[] prime = new int[c];
        int count = 0;
        for(int t = 0; t < arr.length; t++)
        {
            int num = arr[t];
            boolean test = testPrime(num);
            if (test == true)
            {
                prime[count] = num;
                count++;
            }
        }
        return prime;
    }*/

    public static void primearr(int[] init, int[] prime, int n)
    {
        if (n == 0){
            return;
        }
        else{
            int num = init[n-1];
            boolean t = testPrime(num);
            if (t == true)
            {
                prime[n-1] = num;
            }
            n--;
            primearr(init, prime, n);
        }
    }

    public static boolean testPrime(int num)
    {
        if(num == 2 || num == 3)
        {
            return true;
        }

        if(num % 2 == 0)
        {
            return false;
        }

        int sqrt = (int) Math.sqrt(num) + 1; 
        for (int i = 3; i < sqrt; i += 2) 
        { 
            if (num % i == 0) 
            { 
                return false; 
            } 
        }     
        return true; 

    }


    /*public static int[] comparr(int[] arr)
    {
        int c = 0;
        for(int t = 0; t < arr.length; t++)
        {
            int num = arr[t];
            boolean test = testPrime(num);
            if (test == false)
            {
                c++;
            }
        }
        int[] prime = new int[c];
        int count = 0;
        for(int t = 0; t < arr.length; t++)
        {
            int num = arr[t];
            boolean test = testPrime(num);
            if (test == false)
            {
                prime[count] = num;
                count++;
            }
        }
        return prime;
    }*/

    
    public static void comparr(int[] init, int[] composite, int n)
    {
        if (n == 0){
            return;
        }
        else{
            int num = init[n-1];
            boolean t = testPrime(num);
            if (t == false)
            {
                composite[n-1] = num;
            }
            n--;
            comparr(init, composite, n);
        }
    }
}