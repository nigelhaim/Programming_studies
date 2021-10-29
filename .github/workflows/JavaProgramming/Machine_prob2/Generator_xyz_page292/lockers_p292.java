package Machine_prob2.Generator_xyz_page292;

import java.util.Scanner;

public class lockers_p292 
{
    public static void main(String[] args) 
    {
        Scanner prin = new Scanner(System.in);
        
        System.out.println("Locker game!");
        System.out.println();

        System.out.print("Input the number of lockers: ");
        int lock = prin.nextInt();

        int open_lock = 0;
        String status = "Open";
        int x = 1;
        while (x <= 1)
        {
            for (int y = x; y <= lock; y++)
            {
                if (y <= Math.floor(Math.sqrt(lock)))//ctr <= number of open lockers
                {
                    open_lock++;
                }
            }
            x++;
        }
        int nn = open_lock - (open_lock - 1);
        for (int stat = 1; stat <= lock; stat++)
        {
            if(stat == nn * nn)
            {
                System.out.println("Locker #" + stat + " is open");
                nn++;
            }
            else 
            {
                System.out.println("Locker #" + stat + " is Close"); 
            }
        }
        System.out.println();
        System.out.print("The number of opened lockers is: " + open_lock);
        prin.close();
    }    
}
