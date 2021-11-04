package From_Classmates;
import java.lang.Math;
import java.util.Scanner;
public class kirami_circle 
{
    static Scanner in = new Scanner(System.in);

    static double getRadius()
    {
        System.out.print("Enter Radius: ");
        return in.nextDouble();
    }

        public static double area(double a)
        {
            double area = Math.PI*Math.pow(a,2);
            System.out.println("The area of the circle is " + area);
            return area;
        }
        public static double circumference(double a)
        {
            double circumference = (2*Math.PI*a);
            System.out.println("The circumference of the circle is " + circumference);
            return circumference;
        }
        public static void main(String[] args)
        {   
            double radius = getRadius();
            area(radius);
            circumference(radius);
    
        }

}    
