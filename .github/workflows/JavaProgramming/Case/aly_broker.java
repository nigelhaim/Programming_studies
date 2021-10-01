package Case;
import java.util.*;
public class aly_broker {
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("\n\n");
        System.out.print("Enter broker type (I for In-house | A for Accredited): ");
        char brokerType = in.next().charAt(0);
        brokerType = Character.toLowerCase(brokerType);
        if (brokerType == 'i' || brokerType == 'a');
        else
        {
            System.out.print("\nInvalid broker type. Please try again.");
            System.out.print("\n\n");
            System.exit(0);
        }
        System.out.print("Enter property code (R for Residential | C for Commercial | G for Agricultural): ");
        char propertyCode = in.next().charAt(0);
        propertyCode = Character.toLowerCase(propertyCode);
        if (propertyCode == 'r' || propertyCode == 'c' || propertyCode == 'g');
        else
        {
            System.out.print("\nInvalid property code. Please try again.");
            System.out.print("\n\n");
            System.exit(0);
        }
        System.out.print("Enter sales price of the property (in PHP): ");
        double salesPrice = in.nextDouble();
        if (salesPrice > 0);
        else
        {
            System.out.print("\nInvalid sales price. Please try again.");
            System.out.print("\n\n");
            System.exit(0);
        }
        double grossCommission = 0;
        double netCommission = 0;
        
        switch (brokerType)
        {
            case 'i':
                switch (propertyCode)
                {
                    case 'r': grossCommission = salesPrice * 0.06; break;
                    case 'c': grossCommission = salesPrice * 0.045; break;
                    default: grossCommission = salesPrice * 0.04; break;
                }
                netCommission = grossCommission - (grossCommission * 0.20); break;
            
            default:
                switch (propertyCode)
                {
                    case 'r': grossCommission = salesPrice * 0.06; break;
                    case 'c': grossCommission = salesPrice * 0.045; break;
                    default: grossCommission = salesPrice * 0.04; break;
                }
                netCommission = grossCommission - (grossCommission * 0.25); break;
        }
        System.out.printf("\nGross Commission: P %.2f %n", grossCommission);
        System.out.printf("Net Commission: P %.2f %n", netCommission);
        in.close();
        System.out.print("\n\n");
    }
    
}
