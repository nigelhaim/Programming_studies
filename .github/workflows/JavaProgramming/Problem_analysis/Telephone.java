package Problem_analysis;

import java.util.*;

public class Telephone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What time of the Day?");
        System.out.print("Day - A or Night - B: ");
        char time = sc.nextLine().charAt(0);

        System.out.print("Input time of call (In minutes): ");
        int minu = sc.nextInt();

        double cost = (minu * 4);
        double price = cost;
        double final_net = 0.00;
        double ded = 0.00;
        if (time == 'B' || time == 'b') {
            price = cost * 0.50;
        }

        if (minu > 60) {
            while (minu > 60) {
                ded = price * 0.15;
                price = price - ded;
                minu -= 60;
            }

        }

        final_net = price + (price * 0.12);

        System.out.println("Gross: P" + cost);
        System.out.println("Net cost: P" + final_net);
        System.out.println();

        sc.close();
    }

}