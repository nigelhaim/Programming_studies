package Repeatition_Structures;

import java.util.Scanner;

public class Addition 
{
    public static void main(String[] args) 
    {
        Scanner inte = new Scanner(System.in);
        
        System.out.print("Input Integer: ");
        int num  = inte.nextInt();
        int add = 0;
        String num_s = String.valueOf(num);
        System.out.println();
        for(int x = 0; num_s.length() > x; x++)
        {
            System.out.print(num_s.charAt(x) + " ");
            String num_i = Character.toString(num_s.charAt(x));
            add += (Integer.parseInt(num_i));
        }
        System.out.println();
        System.out.println();
        System.out.print("The total of the integers is: "+ add);
        System.out.println();
        System.out.println();
        inte.close();

    }    
}
