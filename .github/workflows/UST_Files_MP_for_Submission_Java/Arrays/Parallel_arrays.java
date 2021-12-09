package Arrays;
import java.util.Scanner;

public class Parallel_arrays 
{
    public static void main(String[] args) 
    {
        Scanner eplr = new Scanner(System.in);
        
        int[] rate = new int[5];
        int[] hr_w = new int [5];
        for (int n = 0; n < 5; n++)
        {
            int emp = 1;
            System.out.println("Employee no. " + (emp + n));
            System.out.print("Please input the rate per hour: ");
            int rate_h = eplr.nextInt();
            rate[n] = rate_h;
    
            System.out.print("Please input the employee's hours of work: ");
            int hrs = eplr.nextInt();
            hr_w[n] = hrs;
            System.out.println();
        }
        System.out.println("Employee No. \t" + "Rate \t" + "Hours Worked \t" + "Salary");
        
        int emp = 1;
        for(int p = 0 ; p < 5; p++)
        {

            int sallary = rate[p] * hr_w[p];
            System.out.println("\t\b\b\b" + emp + "\t\t " + rate[p] + "\t\t\b\b\b" + hr_w[p] + "\t\t  " + sallary);
            emp++;
        }
        eplr.close();

    }    
}
