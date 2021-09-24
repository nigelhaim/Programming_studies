package Test;
import java.util.*;
public class Test_attributes 
{
    public static void main(String[] args) 
    {
        Scanner calc = new Scanner(System.in);     
        System.out.println();
        System.out.println("Hello This is Java");
        System.out.println();
        
        System.out.println("Please input Digits to test the calculator"); 
        System.out.print("a: ");
        double a = calc.nextDouble();

        System.out.print("b: ");
        double b = calc.nextDouble();

        /*This is addition */
        double d = a + b;

        calc.close();
        System.out.print("The answer is: " + d);
        System.out.println();

        
    }
}
