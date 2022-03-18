import java.math.*;
public class Numberproblem_neechan{
    public static void main(String[] args) {
        double i = 1.142857143;
        double exp = 0;
        double x = .5;
        System.out.println("If x = " + x);
        System.out.print("Base: " + i + " || Exp: " + 0  + " || Answer: ");
        Rational r = new Rational(i);
        System.out.println(r);
        while(i <= 1/* 8/7 */)
        {
            exp += 3;
            double add = Math.pow(x, exp);
            i -= add;
            System.out.print("Base: " + i + " || Exp: " + exp  + " || Answer: ");
            Rational s = new Rational(i);
            System.out.println(s + " || X: " + x);
        }

    }
}

class Rational {

    private int num, denom;

    public Rational(double d) {
        String s = String.valueOf(d);
        int digitsDec = s.length() - 1 - s.indexOf('.');
        int denom = 1;
        for (int i = 0; i < digitsDec; i++) {
            d *= 10;    
            denom *= 10;
        }

        int num = (int) Math.round(d);
        this.num = num;
        this.denom = denom;
    }

    public Rational(int num, int denom) {
        this.num = num;
        this.denom = denom;
    }

    public String toString() {
        return String.valueOf(num) + "/" + String.valueOf(denom);
    }

}