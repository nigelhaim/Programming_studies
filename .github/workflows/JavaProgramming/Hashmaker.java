import java.util.*;

public class Hashmaker
{
    public static void main(String[] args) 
    {
        Scanner mike = new Scanner(System.in);

        System.out.print("Input Password: ");
            String pass = mike.nextLine();
            System.out.println();

            long num_char = pass.chars().count();
            int x = (int)num_char;
            for (int i = 0; i < x; i++)
            {
                char ch = pass.charAt(i);
                char final_hash = (char) (ch + 5);
                System.out.print(final_hash);
            }
            mike.close();
            
    }    
}
