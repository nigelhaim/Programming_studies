package From_Classmates;
import java.util.Scanner;
import java.lang.Math;
public class kira_code 
{

        public static void main(String[] args) {
    
            Scanner in = new Scanner(System.in);
    
            System.out.println("Table XYZ");
            System.out.println("This program will produce a table of x, y, and z values based on the functions given.");
            System.out.println();
    
            System.out.print("Enter minimum value: ");
            double a = in.nextDouble();
    
            System.out.print("Enter maximum value: ");
            double b = in.nextDouble();
    
            System.out.print("Enter increment value: ");
            double i = in.nextDouble();
    
            System.out.print("Enter angle: ");
            double t = in.nextDouble();
            double tFinal = Math.toRadians(t);
    
            while (a > b) {
                System.out.println("Invalid inputs. Your minimum value must be lower than your maximum value.");
    
                System.out.print("Enter minimum value: ");
                a = in.nextDouble();
    
                System.out.print("Enter maximum value: ");
                b = in.nextDouble();
    
                System.out.print("Enter increment value: ");
                i = in.nextDouble();
    
                System.out.print("Enter angle: ");
                t = in.nextDouble();
                tFinal = Math.toRadians(t);
            }
    
            System.out.println("x \ty \t\tz");
    
            for (double x = a ; x <= b ; x += i) {
                double y = (3*Math.pow(x, 5)) - (2*Math.pow(x, 3)) + x;
                double z = (y*Math.sin(tFinal)) + 0.6 * x * 2;
                if (y < 9999)
                {
                    System.out.print(x + "\t" + String.format("%.2f", y) + "\t\t" + String.format("%.2f", z));
                }
                else{
                    System.out.print(x + "\t" + String.format("%.2f", y) + "\t" + String.format("%.2f", z));
                }
                
                System.out.println();
            }
    
            System.out.println();
            System.out.println("Thank you for using this program!");
            in.close();
        }
}    

