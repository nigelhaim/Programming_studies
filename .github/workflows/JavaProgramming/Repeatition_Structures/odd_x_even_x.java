package Repeatition_Structures;
import java.util.*;
public class odd_x_even_x 
{
    public static void main(String[] args) 
    {
        Scanner vic = new Scanner(System.in);
        
        System.out.print("Input x: ");
        int x = vic.nextInt();
        int k = 0;
        System.out.println();
        System.out.print("The x values are: ");
        while (x != 1)
        {
            if (x % 2 == 1)
            {
                x = (3 * x) + 1;
                System.out.print(x + " ");
                k++; 
            }
            if (x % 2 == 0)
            {
              x /= 2; 
              System.out.print(x + " "); 
              k++;
            }
            
        }
        System.out.println();
        System.out.print("The k value is: " + k);
        vic.close();
    }    
}
