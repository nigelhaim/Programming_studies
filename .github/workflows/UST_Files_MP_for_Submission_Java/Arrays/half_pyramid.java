package Arrays;

import java.util.Scanner;

public class half_pyramid 
{
    static Scanner maker = new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.println("Welcome to half pyramid maker!");

        System.out.print("Input the number of levels: ");
        int lvl = maker.nextInt();

        String [][] pyramid = pyramid_lvl(lvl);

        for(int p = 0; p < lvl; p++)
        {
            System.out.println(pyramid[p][0]);
        }
    }    

    static String [][] pyramid_lvl(int lvl)
    {
        String [][] full_p = new String [lvl][lvl];
        for (int i = 0; i < lvl; i++)
        {
            full_p[i][0] = repeater(i+1);
        }
        return full_p;
    }
    static String repeater(int lvl)
    {
        char s = '*';
        String r = Character.toString(s).repeat(lvl);
        return r;
    }

}
