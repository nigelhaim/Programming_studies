package Arrays;
import java.util.*;

/*
Submitted by: Nigel Haim N. Sebastian 

Write a program that producs the first n rows of Pascal's Triangle. 
*/
public class Pascal 
{
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.println("Welcome to the pascaline triangle!");
        System.out.print("Input the number of rows that will display in the Pascal's triangle?: "); 
        int input = validate(in.nextInt());
        int[][] pascal = new int[input][input];
        loadpascalTriangle(pascal); System.out.println(); display(pascal);
    }
    static int validate(int row)
    {
        for (; row <= 0; row = in.nextInt())
            System.out.print("Invalid number of rows!. Try again: ");
        return row;
    }
    static int[][] loadpascalTriangle(int[][] pascal)
    {
        pascal[0][0] = 1;
        for (int i = 1; i < pascal.length; i++)
        {
            pascal[i][0] = 1;
            for (int j = 1; j <= i; j++)
                pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];
        }
        return pascal;
    }
    static void display(int[][] pascal)
    {
        for (int i = 0; i < pascal.length; i++)
        {
            for (int j = 0; j <= i; j++)
                System.out.print(pascal[i][j] + " ");
            System.out.println();
        }
        System.out.println();
    }
}