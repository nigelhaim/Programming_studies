package Arrays;
import java.util.*;
/* 
Submitted by: Nigel Haim N. Sebastian
Write a java program that will load A with 15 random 
integers (rangbe: 35 - 50). Display elements of A in ascending order. 
Then get a number x. compare x to each element of A, if array element 
is less than x, replace that element with x. On another line, display 
elements of A after replacing all elements less than x with x.
*/ 
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
