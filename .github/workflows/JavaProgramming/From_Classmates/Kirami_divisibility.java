package From_Classmates;

import java.util.Scanner;

public class Kirami_divisibility {
    public static void main(String[] args)
    { 

        Scanner in = new Scanner(System.in);

        System.out.println("Input x: ");
        System.out.println("Input y: ");

        int x = in.nextInt();
        int y = in.nextInt();

        int average = 0;

        while (x <= y) {
            if (x % 3 == 0 || x % 4 == 0) {
                average+=x;
            }
            x++;
        }
        System.out.println("The average of all integers is " + average);
        in.close();
    }
}
