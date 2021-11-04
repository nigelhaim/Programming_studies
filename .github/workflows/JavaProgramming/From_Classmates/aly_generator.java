package From_Classmates;

import java.util.Scanner;

public class aly_generator {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("\n\n");
        System.out.println("This program will ask the user to enter the amount of generators to test.");
        System.out.println("It will then ask 3 voltages from the user and display the average of the 3 voltages of each generator");
        System.out.println("and the average of all the volatages.");
        System.out.print("\nEnter the number of generators you would like to test (greater than 0): "); int gen = in.nextInt();
        for (; gen <= 0; gen = in.nextInt())
        {
            System.out.print("Sorry 0 or less is invalid, try again: ");
        }
        System.out.print("\nYou entered " +gen+ " generators to test!");
        double sumAve = 0;
        for(int ctr = 1; ctr <= gen; ctr++)
        {
            System.out.println("\n\nGenerator " +ctr+ ":");
            double sum = 0;
            for (int volt = 1; volt <= 3; volt++)
            {
                System.out.print("Enter voltage " +volt+ ": "); double voltage = in.nextDouble();
                sum += voltage;
            }
            double aveV = sum/3;
            sumAve += aveV;
            System.out.printf("Average of voltages in generator " +ctr+ ": %.2f", aveV);
        }
        double aveAll = sumAve/gen;
        System.out.printf("\n\nAverage of all voltages: %.2f", aveAll);
        System.out.print("\n\n");
    }
}
