package PracticeProblems;
import java.util.*;

import javax.naming.spi.DirStateFactory.Result;
public class Exponent 
{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input base number: ");
        int base = input.nextInt();
        System.out.print("Input exponent: ");
         int exp = input.nextInt();
         System.out.println();
         int result = 1;
         compute(base, exp, result);
         System.out.println();
    }

    public static void compute(int num_1, int num_2, int result){

        if (num_2 == 0)
        {
            System.out.print(result);
            return;
        }
        else {
            result *= num_1;
            num_2--;
            compute(num_1, num_2, result);
        }
    }
}
