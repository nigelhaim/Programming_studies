package Basic_elements_of_java;

import java.util.Scanner;

/*
Submitted by: Nigel Haim N. Sebastian

Write a program that will ocmpute the final grade (FG) of a student given his/her class
standings(CS), quizzes, prelim exasm (PE) and final exam(FE). Assume that there are 3 quizzes. 

Final grade = 0.2CS + 0.4QA + 0.2PE + 0.2FE
QA - Quiz average  

*/
public class Grade_computation 
{
    static Scanner grader = new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.println("Welcome to the student grade calculator!");
        System.out.println();
        System.out.print("Please input the student's class standing: ");
        int CS = grader.nextInt();
        System.out.print("Please input the students Final exam grade: ");
        int FE = grader.nextInt();
        System.out.print("Please input the students Preliminary exam grade: ");
        int PE = grader.nextInt();
        
        int quiz_ave = 0;
        System.out.println();
        for(int q = 0; q < 3; q++)
        {
            System.out.print("Please input the studnet's quiz #" + (q+1) + (": "));
            quiz_ave += grader.nextInt();
        }
        double QA = quiz_ave / 3;
        double FG = (0.2 * CS) + (0.4 * QA) + (0.2 * PE) + (0.2 * FE);

        System.out.printf("The final grade of the student is: %.2f",FG);
    }    
}
