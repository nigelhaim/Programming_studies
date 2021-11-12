package Methods;

import java.util.Scanner;
import java.lang.Math;
public class A_Q_Self_paced_methodspt2 
{
    static Scanner ssd = new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.println("Welcome to a program of multiple programs");
        System.out.println("Made by: Nigel Haim N. Sebastian");
        System.out.println();
        
        char cont = 'Y';
        do 
        {
            char cc = getChar();
            char cc_f = validation(cc);
            switch (cc_f)
            {
                case 'A':
                    System.out.println("Welcome to the Arithmetic program!");
                    System.out.println("This program will return an arithmetic series and display the sum of every number");
                    System.out.println();
                    System.out.print("Please input the first integer: ");
                    int a_a = ssd.nextInt();
            
                    System.out.println();
            
                    System.out.print("Please input the common differnce: ");
                    int d = ssd.nextInt();

                    System.out.println();
            
                    System.out.print("Please input the number of terms: ");
                    int n_n = ssd.nextInt();

                    System.out.println();

                    System.out.print("\n\nThe sum of all arithmetic values is: " + Arithmetic_n(a_a, d, n_n));
                    break;
                
                case 'B':
                    System.out.println("Welcome to the Geometric program!");
                    System.out.println("This program will return a geometric series and display the sum of every number");
                    
                    System.out.println();

                    System.out.print("Please input the first term: ");
                    double a_g = ssd.nextDouble();
                    System.out.print("Please input the common ratio: ");
                    double r = ssd.nextDouble();

                    System.out.print("Please input the number of terms: ");
                    double n_g = ssd.nextDouble();
                    System.out.println();
                    
                    System.out.print(Geometic_n(a_g, r, n_g));

                case 'C':
                    System.out.println("Welcome to the harmonic mean!");
                    System.out.println("This will show the harmonic mean of the given integers");

                    System.out.println();

                    System.out.printf("The harmonic mean is: %.5f", Harmonic_mean());
                
                case 'D':
                System.out.println("Welcome to the harmonic mean!");
                System.out.println("This will show the Geometric mean of the given integers");

                System.out.println();

                System.out.printf("The Geometric mean is: %.5f", Geometric_mean());


            }
            System.out.println();
            cont = continuation();
        }
        while(cont == 'Y');  
        
        System.out.println();
        System.out.println("Thank you for using the program, hope to see you soon!");
    }

    public static char getChar()
    {
        System.out.println();
        System.out.println("MAIN MENU");
        
        System.out.println();
        
        System.out.println("A – Arithmetic Series");
        System.out.println("B – Geometric Series");
        System.out.println("C – Harmonic Series");
        System.out.println("D – Geometric mean");
        System.out.println("E – Largest Prime number");
        System.out.println("Q – Quit the program");
        System.out.print("Please input what to display: ");
        char i = ssd.next().toUpperCase().charAt(0); 
        return i; 
    }

    static char validation(char cc)
    {
        while (cc < 'A' || cc > 'E') //Discrete Math 'or'
        {
            System.out.println();
            System.out.println("Invalid letter!");
            System.out.print("Please input a letter on the Main Menu: ");
            cc = ssd.nextLine().toUpperCase().charAt(0);
            System.out.println();
        }
        char cc_f = cc;
        return cc_f;
    }
    
    static int Arithmetic_n(int a, int d, int n)
    {
        int sum = 0;
        System.out.println("The Arithmetic sequence is: ");
        for (int cnt = a; cnt <= n; cnt++)
        {
            int ar = a + (cnt - 1) * d;
            System.out. print(ar + " ");
            sum += ar;
        }
        return sum;
    }

    static double Geometic_n(double a_g, double r, double n_g)
    {
        double sum_g = 0.00;
        System.out.println("The Geometric sequence is: ");
        for (double cnt = a_g; cnt <= n_g; cnt++)
        {
            double curr_term = a_g * Math.pow(r, cnt);
            System.out.printf("%.2f ", curr_term);
        }
        return sum_g;
    }

    static double Harmonic_mean()
    {
        double quack = 1;
        double quacker = 0; 
        double n = 0;
        char var = 'a';
        while (quack != 0)
        {

            System.out.print("Please input number " + var + ": ");
            quack = ssd.nextDouble();
            if (quack != 0)
            {
                quacker += (1/quack);
                n++;
            }
            
            var++;
        }
        double ans = n/quacker;
        return ans;
    }


    static double Geometric_mean()
    {
        double i =0 ;
        return i;
    }
    static char continuation()
    {
        System.out.println("Do you want to continue? (Y or N)");
        System.out.print("Answer: ");
        char cont = ssd.next().toUpperCase().charAt(0);
        return cont;
    }
}
