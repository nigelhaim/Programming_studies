package Selection_Structures;
import java.util.*;

/* 
Submitted by: Nigel Haim N. Sebastian 
Write a program segmet (use if-else chain) that will display the equivalent grade 
(EQ) based on the given final grade (FG).
*/
public class Equivalent_grade 
{
    static Scanner g = new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.print("Input final grade: ");
        double grade = g.nextInt();

        double eq = 0;
        if (grade >= 0 && grade <= 74)
        {
            eq = 5.0;
        }

        else if (grade >= 75 && grade <= 85)
        {
            eq = 3.0;
        }

        else if (grade >= 86 && grade <= 95)
        {
            eq = 2.0;
        }
        
        else if (grade >= 96 && grade <= 100)
        {
            eq = 1.0;
        }

        else
        {
            System.out.println("Grade not in range!");
            System.exit(0);
        }

        System.out.println("The equivalent grade is: " + eq);
    }    

}
