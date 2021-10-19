package Repeatition_Structures;
import java.lang.Math;
import java.util.Scanner;

public class CoordinatesX_Y 
{
    public static void main(String[] args) 
    {
        Scanner n = new Scanner(System.in);
        System.out.println("Welcome to coordinates maker");
        System.out.println();
        System.out.print("Input Velocity: ");
        double v = n.nextDouble();

        System.out.print("Input angle (Degrees): ");
        double a_1 = n.nextDouble();
        double a = Math.toRadians(a_1);
        System.out.println();
        System.out.println("Time \t\tx \t\t      y");
        
        for (double t = 0; t <= 5; t += 0.5)
        {
            double x = v * t * Math.cos(a);
            double y = v *t * Math.sin(a);
            System.out.printf("%n%.1f %15.2f %20.2f",t, x, y);
        }

        n.close();
    }    
}
