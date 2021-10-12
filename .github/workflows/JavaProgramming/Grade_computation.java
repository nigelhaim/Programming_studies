import java.util.*;

public class Grade_computation 
{
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        String status = "";
        System.out.print("Input quiz grade: ");
        int quiz_1 = num.nextInt();

        System.out.print("Input MP 1 grade: ");
        int mp_1 = num.nextInt();

        System.out.print("Input Exam grade: ");
        int PE = num.nextInt();

        double TG = (0.3 * mp_1) + (0.3 * quiz_1) + (0.4 * PE);

        double bb_grade = (0.625 * (TG - 60)) + 75;

        if (bb_grade <= 84.0)
        {
            status = "HOY BAGSAK!";
        }

        else if (bb_grade >= 85.0 && bb_grade <= 89.0)
        {
            status = "SUMABIT RIN NAMAN! #BARELY SURVIVING!";
        }

        else if (bb_grade >= 90.0 && bb_grade <= 94.0)
        {
            status = "PASADO!";
        }

        else if (bb_grade >= 95.0)
        {
            status = "GOD LIKE!";
        }
        System.out.println();
        System.out.print("Total Grade: " + TG);
        System.out.println();
        System.out.print("Your Grade: " + bb_grade + "%");
        System.out.println();
        System.out.print("Status: " + status);

        num.close();



    }    
}
