package Arrays;
import java.util.Scanner;

public class Array1_reverse 
{
    public static void main(String[] args) 
    {
        Scanner num = new Scanner(System.in);
        
        int[] array_A = new int[10];
        int[] array_B = new int[10];
        int[] array_C = new int[10];
        int var_p = 1;

        for (int a = 0; a < 10; a++)
        {
            System.out.print("Please input the number for A[" + a + "]: ");
            int numb = num.nextInt();
            array_A[a] = numb;
        }

        for (int b = 9, cnt = 0; b < 10 && b > -1; b--)
        {
            array_B[cnt] = array_A[b];
            cnt++;
        }

        for(int c = 0; c < 10; c++)
        {
            array_C[c] = array_A[c] + array_B[c];
        }


        System.out.println("Index \t Array A \t Array B \t Array C");
        for(int p = 0; p < 10; p++)
        {
            int a = array_A[p];
            int b = array_B[p];
            int c = array_C[p];
            System.out.println("  " + var_p + "\t    " + a + "\t\t   " + b + "\t\t   " + c);
            var_p++;
        }
        System.out.println();
        num.close();
    }    
}
