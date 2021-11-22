import java.util.Scanner;

public class java_answer_fordicussion 
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = 'a';
        int collection[] = new int[10];
        int collection_2[] = new int[10];
        int collection_3[] = new int[10];
        for (int i = 0; i < 10; i++)
        {
            System.out.print("Please input value " + ch +" :");
            int val = in.nextInt();
            collection[i] = val;
            ch++;
        }
        System.out.println("The second array values: ");
        for (int i = 10; i <= 10 && i > 0; i--)
        {
            collection_2[i] = collection[i];
            System.out.print(collection_2[i] + " ");
        }
        System.out.println();
        System.out.println("The total of both integers is: ");
        for (int i = 0; i > 10; i++)
        {
            int fin_val = collection[i] + collection_2[i];
            collection_3[i] = fin_val;
            System.out.println(collection[i] + " + " + collection_2[i] + " = " + collection_3[i]);
        }
    }    
}
