package From_Classmates;

public class aly_xyz 
{
    public static void main(String[] args) {
        System.out.print("\n\n");
        System.out.println("This program will calculate and display the values of y when y = (xz)/(x-z) from values of x (1-5) and values of z (2-6).");
        System.out.println("It will display 'Function Undefined' when the value of x is equal to the value of z.");
        System.out.println("\n x\t\t  z\t\t  y\n");
        for (double x = 1.0; x <= 5; x++)//x values from 1 to 5
        {
            for (double z = 2.0; z <= 6; z++)//z values from 2 to 6
            {
                System.out.print(x+ "\t\t " +z);
                if (x == z) System.out.println("\t\tFunction Undefined");// if x == z
                else//if x != z
                {
                    double y = (x*z) / (x-z);//formula
                    System.out.printf("\t\t%.2f%n", y);//value of y in 2 decimal places
                }
            }
        }
        System.out.print("\n\n");
    }    
}
