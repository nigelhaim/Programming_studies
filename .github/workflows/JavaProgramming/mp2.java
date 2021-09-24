import java.util.*;
import java.lang.Math;

public class mp2 {
    public static void main(String[] args) {
        Scanner math_MP2 = new Scanner(System.in);
        /* Find the value of a */
        System.out.print("a: ");
        double a = math_MP2.nextDouble();

        /* Find the value of b */
        System.out.print("b: ");
        double b = math_MP2.nextDouble();

        /* Find the value of t in degrees */
        System.out.print("t: ");
        double tt = math_MP2.nextDouble();

        /* The value of pi */
        double pi = 3.1416;
        /* Convert tt to degrees */
        double t = Math.toRadians(tt);

        /* Find the value of x */
        double x_1 = (10.0 * pi) / (a + b);
        double sec = Math.pow((1.0 / Math.cos(t)), 3.0);
        double x_3 = 3.0 * Math.log10(Math.abs(Math.pow(a, 2.0) - Math.pow(b, 2.0)));
        double x = (x_1 * sec) + x_3;

        /* Find the value of y */
        double y_1_add1 = (-1.0 + (Math.atan(a * b)));
        double y_2_add1 = (1.0 + (Math.pow(2.71828, a * b)));
        double y_add1 = y_1_add1 / y_2_add1;

        double y_1_add2 = 5.0 * b + (Math.pow(a, 2.0));
        double y_2_add2 = Math.sqrt(3.0 * a * b);
        double y_add2 = y_1_add2 / y_2_add2;

        double y = (y_add1 + y_add2);

        /* Find the value of z */
        double z_1 = x + (y * Math.log(Math.pow(x, 2.0))) - (2.0 * Math.sin(t));
        double z_2 = Math.pow(Math.abs(z_1), 3.0 / 5.0);
        double z = (2.0 / 3.0) * z_2;

        /* Print the final values */
        System.out.println();
        System.out.printf("x: %.3f \n", x);
        System.out.printf("y: %.3f \n", y);
        System.out.printf("z: %.3f \n", z);

        System.out.println();
        math_MP2.close();
    }
}
