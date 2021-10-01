package Case;

import java.util.*;


public class Broker 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Property Code: ");
        char pc = input.nextLine().toUpperCase().charAt(0);

        System.out.print("Broker Type: ");
        char bt = input.nextLine().toUpperCase().charAt(0);
        
        System.out.print("Sale price: ");
        double sp = input.nextDouble();

        System.out.println();
        
        double final_p = 0.00;
        switch (pc)
        {
           
            case 'R':
                double R_final = (sp * 0.06); 
                System.out.println("Gross Commission: " + R_final);
                if (bt == 'I')
                    final_p = R_final - (R_final * 0.20);
                else if (bt == 'A')
                    final_p = R_final - (R_final * 0.25);
                else
                    System.out.println("Invalid Broker type! ");
                    break;

            case 'C':
                double C_final = (sp * 0.045);
                System.out.println("Gross Commission: " + C_final);
                if (bt == 'I')
                    final_p = C_final - (C_final * 0.20);
                else if (bt == 'A')
                    final_p = C_final - (C_final * 0.25); 
                else
                    System.out.println("Invalid Broker type! ");
                    break;
                    
            case 'G':
                double G_final = (sp * 0.04);
                System.out.println("Gross Commission: " + G_final);
                if (bt == 'I')
                    final_p = G_final - (G_final * 0.20);
                else if (bt == 'A')
                    final_p = G_final - (G_final * 0.25);
                
                else
                    System.out.println("Invalid Broker type! ");
                    break;

            
            default:
                System.out.println("Invalid Property Code! ");
                System.exit(0);
        }

        System.out.print("Net Commission: " + final_p);

        input.close();
        System.out.println();
    }    
}
