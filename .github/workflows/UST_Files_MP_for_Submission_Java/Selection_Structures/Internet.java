package Selection_Structures;
import java.util.*;
public class Internet 
{
    public static void main(String[] args) 
    {
        /* Package a */
        int a = 200;
        int a_tadd = 20;
        
        /* Package b */
        int b = 495;
        int b_add = 10;

        /* Package c */ 
        int c = 995;  //Unlimited access

        int cost = 0;
        int add_hour = 0;
        Scanner pack = new Scanner(System.in);

        System.out.print("Insert package: ");
        char type = pack.nextLine().charAt(0);

        System.out.print("Number of Hours: ");
        int hour = pack.nextInt();

        if(type == 'A' || type == 'a')
        {
            if(hour <= 30)
            {
                cost = a;
            }
            else
            {
                while(hour > 30)
                {
                    add_hour += a_tadd;
                    cost = a + add_hour;
                    hour = hour - 1;
                }
            }

        }

        if(type == 'B' || type == 'b')
        {
            if (hour == 50)
            {
                cost = b; 
            }
            else
            {
                while (hour > 50)
                {
                    add_hour += b_add;
                    cost = b + add_hour;
                    hour -= 1;
                }
            }
        }

        if(type == 'C' || type == 'c')
        {
            cost = c;
        }
        System.out.print("The price is: ");
        System.out.print(cost + " Pesos");


        System.out.println();
        pack.close();
    }
}
