package Machine_prob2.Generator_xyz_page292;

import java.util.Scanner;

public class Generator 
{
    public static void main(String[] args) 
    {
        Scanner gen = new Scanner(System.in);
        
        System.out.println("Welcome to generator");
        System.out.println();
        System.out.print("Please input the number of generators: ");
        int num_gen = gen.nextInt();
        double gen_volt = 0; 
        double f_gen_volt = 0; 
        double all_ave = 0;
        for (int gen_count = 1; gen_count <= num_gen; gen_count++)
        {
            System.out.println("Please input the volts for generator #" + gen_count);
            for(int v = 1; v <= 3; v++)
            {
                System.out.print("Please input voltage #" + v + ": ");
                int volt = gen.nextInt();
                gen_volt += volt;
            }
            f_gen_volt = gen_volt  / 3;
            all_ave = all_ave + f_gen_volt; 
            System.out.println();
            System.out.print("The average of generator #" + gen_count + " is " + f_gen_volt + "\n");
            System.out.println();
            f_gen_volt = 0;
            gen_volt = 0;
        } 
        System.out.println();
        System.out.printf("The average voltage of all generators is: %.2f", (all_ave /num_gen));
        System.out.println();
        System.out.println();
        gen.close();
    }    
}
