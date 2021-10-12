package Case;

import java.util.Scanner;

public class Commission 
{
    public static void main(String[] args) 
    {
        System.out.println("ABC Tading");
        System.out.println();  
        
        Scanner x = new Scanner (System.in);
        System.out.print("Input Employee Type (R - Regular | C - Contractual): ");
        char t = x.nextLine().toUpperCase().charAt(0);

        System.out.print("Input Sales per Month: P ");
        double s = x.nextDouble();

        System.out.print("Input cash advacne (Max of P10,000): ");
        double ca = x.nextDouble();
        double coms = 0.00;
        double sc = 0.00;
        double nc = 0.000;
        if (ca <= 10000 && ca > 0)
        {
            switch (t)
            {
                case 'R':

                if (s > 0 && s <= 200000)
                    sc = s * 0.05;
                else if (s < 500000)
                    sc = s * 0.0625;
                else
                    sc = s * 0.082;
                coms = sc - ca;      
                break;

                case 'C':

                if (s > 0 && s <= 200000)
                    sc = s * 0.045;
                else if (s < 500000)
                    sc = s * 0.0575;
                else
                    sc = s * 0.075;
                coms = sc - ca;      
                break;

                default:
                    System.out.println("Invalid Employee type!");
                
            }
        }
        else
        {
            System.out.print("Invalid cash advance!");
        }

        if (coms < ca)
        {
            nc = ca - coms;
        }

        else 
        {
            nc = sc - (sc * 0.12) - ca;
        }
        System.out.println();
        System.out.println("Gross Commission: P " + sc);
        System.out.println("Net Commission: P " + nc);
        x.close();
    }    
}
