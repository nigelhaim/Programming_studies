package Arrays;
/*
Submitted by: Nigel Haim N. Sebastian

Write a Java program that constructs a jagged two-dimensional array 
of integers with five rows and an increasing number of columns in each 
row, such that the first row has one column, the second row has two, 
the third has three, and so on. The array elements should have 
increasing values in top-to-bottom, left-to-right order 
(also called row-major order)
*/
public class Pyramid_15 
{
    public static void main(String[] args) 
    {
        System.out.println("Welcome to the pyramid of 15 \n");
        int py [][] = new int [5][15];
        int c = 1;
        for (int lvl = 0; lvl < 5; lvl++)
        {
            int a = 0;
            for(int nd = 0; nd <= lvl; nd++)
            {
                py[lvl][a] = c;
                c++;
                a++;
            }
        }

        for(int pr = 0; pr < 5; pr++)
        {
            for(int pr_2 = 0; pr_2 <= pr; pr_2++)
            {
                int num = py[pr][pr_2];
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }    
}
