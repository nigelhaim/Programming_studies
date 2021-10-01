package Case;

import java.util.Scanner;

public class Hotel 
{
    public static void main(String[] args) 
    {
        System.out.println("Welcome to the XYZ hotel!");

        Scanner x = new Scanner (System.in);

        System.out.print("Input room type ( G – garden view, P – pool view, L – lake view): ");
        char rt = x.nextLine().toUpperCase().charAt(0);

        System.out.print("Will the guest have extra bed (Y/N)? ");
        char q = x.nextLine().toUpperCase().charAt(0);

        int begin = 0;
        switch(q)
        {
            case 'Y':
                System.out.print("How Many Beds? ");
                int b = x.nextInt();

                if(rt == 'G')
                    begin = b * 500;
                else if(rt == 'P')
                    begin = b * 400;
                else if(rt == 'L')
                    begin = b * 700; 
                break; 
            case 'N':
                begin = 0;
                break;

            default:
                System.out.print("Invalid input of beds!");
                System.exit(0);

        }  

        System.out.print("Number of Days: ");
        int d = x.nextInt();
        
        double gross = 0.00;
        switch(rt)
        {

            case 'G':
                gross = d * (2000 + begin);
                break;
                            
            case 'P':
                gross = d * (1800 + begin);
                break;

            case 'L':
                gross = d * (1500 + begin);
                break;
            
            default:
                System.out.println();
                System.out.print("Invalid Room Type!");
                System.exit(0);
        }

        if(d > 5)
        {
            gross = gross - (gross * 0.08);
        }
        System.out.println();
        System.out.println("Total Gross = " + gross);

        double net = gross + (gross * 0.12);

        System.out.print("Net Charge = " + net);
        System.out.println();

        x.close();
    }    
}
