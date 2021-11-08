package From_Classmates;

import java.util.*;
public class magnitude_direction 
{
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("\n\n");
        System.out.println("This program will display the magnitude of the resultant and its direction (in degrees) of 2 forces.");
        System.out.println("Note: Your input for the direction must be greater than 0.");
        System.out.print("\nEnter the magnitude of force 1: "); double Mx = in.nextDouble();//[1]
        System.out.print("Enter the direction of force 1: "); double Dx = in.nextDouble(); Dx = validateInput(Dx);//[2]
        System.out.print("Enter the magnitude of force 2: "); double My = in.nextDouble();//[4]
        System.out.print("Enter the direction of force 2: "); double Dy = in.nextDouble(); Dy = validateInput(Dy);//[5]
        double resultantX = resultantX(Mx, Dx, My, Dy);//[7]
        double resultantY = resultantY(Mx, Dx, My, Dy);//[9]
        double resultant = resultant(resultantX, resultantY);//[11]
        double direction = direction(resultantX, resultantY);//[13]
        displayResults(resultant, direction);//[15]
        System.out.print("\n\n");
    }
    public static double validateInput(double angle)//[3], [6] 
    {
        while (angle <= 0 || angle >= 360)//condition: direction must be greater than 0 (but will not exceed 360 degrees)
        {
            System.out.println("\nSorry, the input should be greater than 0.");
            System.out.print("Enter the direction again: "); angle = in.nextDouble(); System.out.println();
        }
        return angle;//Dx (or Dy) = angle
    }
    public static double resultantX(double Mx, double Dx, double My, double Dy)//[8]
    {
        return Mx*Math.cos(Math.toRadians(Dx)) + My*Math.cos(Math.toRadians(Dy));//Rx = Mxcos(Dx) + Mycos(Dy)
    }
    public static double resultantY(double Mx, double Dx, double My, double Dy)//[10]
    {
        return Mx*Math.sin(Math.toRadians(Dx)) + My*Math.sin(Math.toRadians(Dy));//Ry = Mxsin(Dx) + Mysin(Dy)
    }
    public static double resultant(double resultantX, double resultantY)//[12]
    {
        return Math.hypot(resultantX, resultantY);//R = sqrt(Rx^2 + Ry^2)
    }
    public static double direction(double resultantX, double resultantY)//[14]
    {
        return Math.toDegrees(Math.atan(resultantY/resultantX));//D = tan^-1(Ry/Rx) 
    }
    public static void displayResults(double resultant, double direction)//[16]c- void to stop the program after
    {
        System.out.printf("%nResultant: %.2f%n", resultant);
        System.out.printf("Direction: %.2f%n", direction);
    }    
}
