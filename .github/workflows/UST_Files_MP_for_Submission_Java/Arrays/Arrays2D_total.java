package Arrays;
public class Arrays2D_total 
{
    public static void main(String[] args) 
    {
        int values[/*What array number*/][/*value of the array*/] = {{5,9,12,6}, {8,13,10,2}, {1, 15, 0, 7}};
        System.out.println("\t Array num");
        int all_total = 0;
        for(int r = 0; r < values.length;r++)//This will increment only the number of times how many arrays 
        {
            int ans_c = 0;
            for (int c = 0; c < values[r].length;c++)
            {
                System.out.printf("%3d  |", values[r][c]);
                ans_c += values[r][c];
            }
            all_total += ans_c;
            System.out.print("  " + ans_c);
            System.out.println();
        }
        
        for (int sum_r = 0; sum_r < values[0].length; sum_r++)
        {
            int all_total_r = 0;
            for (int sum_c = 0; sum_c < values.length; sum_c++)
            {
                all_total_r += values[sum_c][sum_r];
            }
            System.out.printf("%3d   ", all_total_r);
        }
        System.out.print("  " + all_total);
        
    }  
}
