package Problem_analysis;

import java.util.*;

public class Direction 
{
    public static void main(String[] args) 
    {
        Scanner di = new Scanner(System.in);

        System.out.print("True bearing: ");
        int t_t = di.nextInt();
        int brng = t_t;

        System.out.print("The Bearing is: ");
        if (brng > 0 && brng < 360) 
        {
            System.out.println();
            if (brng > 0 && brng < 90) 
            {
                System.out.print("N " + brng + " E");
            }

            if (brng > 90 && brng < 180) 
            {
                System.out.print("S " + (180 - brng) + " E");
            }

            if (brng > 180 && brng < 270) 
            {
                System.out.print("S" + (brng - 180) + "W");
            }
            if (brng > 270 && brng < 360) 
            {
                System.out.print("N" + (360 - brng) + "E");
            }

            if(brng == 0 || brng == 360)
            {
                System.out.println("DUE N");
            }
            if(brng == 90)
            {
                System.out.println("DUE E");
            }
            if(brng == 180)
            {
                System.out.println("DUE S");
            }
            if(brng == 270)
            {
                System.out.println("DUE W");
            }
            System.out.println();
        }
        else
        {
            System.out.println();
            System.out.println("Invalid True Bearing!");
        }
        di.close();
        System.out.println();
    }
}

