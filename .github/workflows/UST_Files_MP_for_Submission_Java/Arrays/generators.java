package Arrays;
import java.util.*;

public class generators 
{
    static Scanner gen = new Scanner(System.in);
    public static void main(String[] args) 
    {
        int[][] generators = new int[4][3];
        int [] ave = new int[4];
        
        System.out.println("Welcome to the generator!");
        System.out.println();
        System.out.println("Test Results");
        for(int inp = 0; inp < generators.length; inp++)
        {
            System.out.println("Generator "+(inp+1));
            for(int res = 0; res < generators[inp].length; res++)
            {
                System.out.print("Please input result #" + (res+1) + ": ");
                generators[inp][res] = gen.nextInt();
            }
        }

        System.out.println(" \t\tOutput 1     Output 2    Output 3    Average");

        for(int r = 0; r < generators.length; r++)
        {
            int sum = 0;
            System.out.print("Generator #"+ (r+1) + "| ");
            for(int c = 0; c < generators[r].length; c++)
            {
                sum += generators[r][c]; 
                System.out.printf("%7d      ", generators[r][c]);
            }
            ave[r] = (sum/3);
            int average = ave[r];
            System.out.print("\t" + average); 
            System.out.println();
        }
    }    
}
