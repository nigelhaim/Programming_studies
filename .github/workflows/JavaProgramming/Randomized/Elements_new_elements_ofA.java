package Randomized;
import java.util.*;
public class Elements_new_elements_ofA 
{
    static Scanner inte = new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.println("Welcome to elements replacement!");
        System.out.println();
        
        Random thirty5_fifty = new Random();

        int upperbound = 50;
        int lowerbound = 35;
        System.out.println();
        
        int[] arr_int = new int[15];
        for (int i = 0; i < 15; i++)
        {
            arr_int[i] = thirty5_fifty.nextInt(upperbound - lowerbound) + lowerbound;

        }
       Arrays.sort(arr_int);
       System.out.print("Elements of A: ");
        for(int i = 0; i < 15; i++)
        {
            int num = arr_int[i];
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("InputX: ");
        int x = inte.nextInt();

        System.out.print("New elements: ");
        for (int check = 0; check < 15; check++)
        {
            if (arr_int[check] < x)
            {
                arr_int[check] = x;
            }

            System.out.print(arr_int[check] + " ");
        }
    }    
}
