package two_d_arrays_for_each;

import java.util.Scanner;

public class airplane 
{
    static Scanner seater = new Scanner(System.in);
    public static void main(String[] args) 
    {

       System.out.println("Welcome to the airplane!");
       
       System.out.println();

       System.out.print("Please enter the number of passengers: ");
       int pass_num = validation_passnum(seater.nextInt());

       for(int cnt = 0; cnt < pass_num; cnt++)
       {
           System.out.print("Passenger # " + (cnt + 1) + "\n");
            System.out.print("Row: ");
            int row = validation_row(seater.nextInt());
            System.out.print("Letter: ");
            char Letter = validation_char(seater.nextLine().toUpperCase().charAt(0));
            

       }
    }  
    
    static int validation_row(int a)
    {
        while (a > 13)
        {
            System.out.println("Exceeded maximum amount of rows! ");
            System.out.print("Please input new row number: ");
            a = seater.nextInt();
        }
        return a;
    }

    static char validation_char(char a)
    {
        while(a < 'A' && a > 'Z')
        {
            System.out.println("Exceeded the amount of Columns!");
            System.out.println("Please enter the new Column letter: ");
            a = seater.nextLine().toUpperCase().charAt(0);
        }
        return a;
    }
    static int validation_passnum(int a)
    {
        while(a > 78)
        {
            System.out.println("Exceeded the maximum number of passengers!");
            System.out.print("Please input the new number of passengers: ");
            a = seater.nextInt();
        }
        return a;
    }
}
