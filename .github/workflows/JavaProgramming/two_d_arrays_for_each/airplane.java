package two_d_arrays_for_each;

import java.util.Scanner;

public class airplane 
{
    static Scanner seater = new Scanner(System.in);
    public static void main(String[] args) 
    {

       System.out.println("Welcome to the airplane!");
       System.out.println();
       char airplane[][] = initialize_array(13, 6);
       display(airplane);
       System.out.println();
       
       System.out.print("Please enter the number of passengers: ");
       int pass_num = validation_passnum(seater.nextInt());

       char designated_airplane[][] = input_passenger_seat(pass_num, airplane);
       
       display(designated_airplane);

    }

    static void display(char [][] array)
    {
        System.out.println("\tA B C  D E F");
        for(int r = 0; r < 13; r++)
        {
            if (r+1 <= 9)
                System.out.print("Row " + (r+1) + "  ");
            if (r+1 >= 10)
                System.out.print("Row " + (r+1) + " ");
            for (int c = 0; c < 3; c++)
            {
                 System.out.printf("%2c",array[r][c]);
            }
            System.out.print(" ");
            for (int c = 3; c < 6; c++)
            {
                 System.out.printf("%2c",array[r][c]);
            }
            System.out.println();
        }
    }
    static char [][] initialize_array(int a, int b)
    {
        char [][] air = new char[a][b];
        for(int r = 0; r < a; r++)
        {
            for (int c = 0; c < b; c++)
            {
                air[r][c] = '*';
            }
        }
        return air;
    }
    static char[][] input_passenger_seat(int a, char [][] array)
    {
        char [][] air = array;
        for(int cnt = 0; cnt < a; cnt++)
        {
            int col = 0;
            int row = 0;
             System.out.print("Passenger # " + (cnt + 1) + "\n");
             System.out.print("Row (1-13): ");
             row = validation_row(seater.nextInt() - 1);
             System.out.print("Letter (A|B|C|D|E|F): ");
             char Letter = validation_char(seater.next().toUpperCase().charAt(0));
             switch (Letter) 
             {
                case 'A':
                    col = 0;
                    break;
                case 'B':
                    col = 1;
                    break;
                case 'C':
                    col = 2;
                    break;
                case 'D':
                    col = 3;
                    break;
                case 'E':
                    col = 4;
                    break;
                case 'F':
                    col = 5;
                    break;
             }
             air[row][col] = 'X';
             System.out.println();
        }
        return air;
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
        while(a < 'A' || a > 'F')
        {
            System.out.println("Exceeded the amount of Columns!");
            System.out.print("Please enter the new Column letter: ");
            a = seater.next().toUpperCase().charAt(0);
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
