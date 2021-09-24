import java.util.*;
public class odd_even 
{
    public static void main(String[] args) 
 {
    Scanner na = new Scanner (System.in);
    
    System.out.print("X: ");
    int x = na.nextInt();

    if (x % 2 == 1)
    {
        System.out.println("Odd");
    }
    
    else
    {
        System.out.println("Even");
    }
    System.out.println();
    na.close();
}
}
