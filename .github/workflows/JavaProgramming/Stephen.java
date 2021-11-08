import java.util.Scanner;

public class Stephen 
{
    public static void main(String[] args) 
    {   
        Scanner steph = new Scanner(System.in);
        int five_pesos, one_pesos, total_coins; 
        int five_p = 0;
        int one_p = 0;

        System.out.print("Please input the total amount: ");
        total_coins = steph.nextInt();
        steph.close();
        
        for (five_pesos = 5; five_pesos < total_coins; five_pesos += 5)
        {
            total_coins -= 5;
            five_p++;
        }

        

        for(one_pesos = 1; one_pesos < total_coins; one_pesos++)
        {
            total_coins -= 1;
            one_p++;
        }
        
        System.out.println();
        System.out.println("The total amount of 5 pesos is: " + five_p);
        System.out.println("The total amount of 1 pesos is: " + one_p);

        

    }    
}
