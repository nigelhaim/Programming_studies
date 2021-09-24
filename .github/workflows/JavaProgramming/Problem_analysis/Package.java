package Problem_analysis;

import java.util.*;

public class Package {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Scanner t_s = new Scanner(System.in);
        double gross = 0.0;
        double net = 0.0;
        int A = 500;

        System.out.print("Weight in Kg: ");
        int w = inp.nextInt();

        System.out.print("Package type A or B: ");
        char t = t_s.nextLine().charAt(0);

        System.out.print("Distance in Km: ");
        int d = inp.nextInt();

        if (d <= 500) {
            if (t == 'A' || t == 'a') {
                if (w <= 5 && w > 0) {
                    gross = w * (10.50 * (1));
                    net = gross + (gross * 0.10);
                }
                if (w > 5 && w < 10) {
                    gross = w * (15.75 * (1));
                    net = gross + (gross * 0.10);
                }
                if (w > 10 && w < 20) {
                    gross = w * (20.65 * (1));
                    net = gross + (gross * 0.10);
                }
            }

            if (t == 'B' || t == 'b') {
                if (w <= 5 && w > 0) {
                    gross = w * (11.75 * (1));
                    net = gross + (gross * 0.10);
                }
                if (w > 5 && w < 10) {
                    gross = w * (18.50 * (1));
                    net = gross + (gross * 0.10);
                }
                if (w > 10 && w < 20) {
                    gross = w * (23.65 * (1));
                    net = gross + (gross * 0.10);
                }
            }
        }
        if (d > 500) {
            if (t == 'A' || t == 'a') {
                if (w <= 5 && w > 0) {
                    gross = w + (10.50 * (d / A));
                    net = gross + (gross * 0.10);
                }
                if (w > 5 && w < 10) {
                    gross = w + (15.75 * (d / A));
                    net = gross + (gross * 0.10);
                }
                if (w > 10 && w < 20) {
                    gross = w + (20.65 * (d / A));
                    net = gross + (gross * 0.10);
                }
            }

            if (t == 'B' || t == 'b') {
                if (w <= 5 && w > 0) {
                    gross = w * (11.75 * (d / A));
                    net = gross + (gross * 0.10);
                }
                if (w > 5 && w < 10) {
                    gross = w * (18.50 * (d / A));
                    net = gross + (gross * 0.10);
                }
                if (w > 10 && w < 20) {
                    gross = w * (23.65 * (d / A));
                    net = gross + (gross * 0.10);
                }
            }
        }

        System.out.println("Charge: " + gross);
        System.out.println("Total Charge: " + net);

        System.out.println();
        inp.close();
        t_s.close();
    }
}
