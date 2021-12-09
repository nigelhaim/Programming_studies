package Java_Methods;
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

        int p = perimeter(s, n);

        double a = area(r, p);

        display(a, p);
        
    }    
    static int perimeter(int s, int n)
    {
        int perimeter = s * n;
        return perimeter;
    }

    static double area (int r, int p)
    {
        double area = (r * p) / 2;
        return area;
    }
    static void display(double a, int p)
    {
        System.out.println("The Perimeter of the polygon is: " + p);
        System.out.printf("The area of the polygon is: %.2f", a);
    }
}
