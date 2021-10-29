package From_Classmates;
import java.util.*;
public class lockers_aly 
{
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("\n\n");
        System.out.print("Enter the number of lockers in the school: "); int numOfLockers = in.nextInt();
        for (; numOfLockers <= 0; numOfLockers = in.nextInt())//validation that 0 or less is invalid
        {
            System.out.print("Sorry 0 or less is invalid, try again: ");
        }
        System.out.print("\nOpen locker numbers:");
        for (int lockerNum = 1; lockerNum <= 1; lockerNum++)//1 iteration and no repeats of open locker numbers
        {
            for (int ctr = lockerNum; ctr <= numOfLockers; ctr++)
            {
                if (ctr <= Math.floor(Math.sqrt(numOfLockers)))//ctr <= number of open lockers
                {
                    System.out.print(" " + (ctr*ctr));
                }
            }
        }
        System.out.println();
        System.out.println("Note: The open locker numbers are perfect squares.");
        System.out.println();
        System.out.printf("Number of open lockers: %.0f%n", Math.floor(Math.sqrt(numOfLockers)));//rounds down the decimal
        System.out.print("\n\n");
    }
}
