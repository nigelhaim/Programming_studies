package Basic_elements_of_java;
import java.util.*;
/*
Submitted by: Nigel Haim N. Sebastian 
Write a Java program that will ask the user to enter 
the side(s) of a regular polygon, the number of sides(n) 
and its apothem(r). The program will then compute 
and display the perimeter(P) and area(A) of the polygon. 

*/
public class Polygon 
{
    static Scanner p = new Scanner (System.in);
    public static void main(String[] args) 
    {
        System.out.println("Welcome to polygon!");
        System.out.print("Please input the number of sides of the polygon: ");
        int n = p.nextInt();

        System.out.print("Please input the length of the side: ");
        int s = p.nextInt();

        System.out.print("Please input the apothem of the polygon: ");
        int r = p.nextInt();

        int p = s * n;

        double a = (r * p) / 2;

        System.out.println("The Perimeter of the polygon is: " + p);
        System.out.printf("The area of the polygon is: %.2f", a);
        
    }    
}
