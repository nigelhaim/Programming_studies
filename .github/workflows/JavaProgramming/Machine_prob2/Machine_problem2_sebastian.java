package Machine_prob2;
//Import
import java.util.*;
import java.lang.Math;

public class Machine_problem2_sebastian 
{
    public static void main(String[] args) 
    {
        Scanner nhs = new Scanner(System.in);
        //Display welcome page
        System.out.println("Welcome to the machine problem 2 made by:");
        System.out.println("Nigel Haim N. Sebastian");
        
        //Main menu
        System.out.println("MAIN MENU");
        
        System.out.println();
        
        System.out.println("A – Arithmetic Series");
        System.out.println("B – Geometric Series");
        System.out.println("C – Harmonic Series");
        System.out.println("D – Geometric mean");
        System.out.println("E – Largest Prime number");
        System.out.println("Q – Quit the program");
        System.out.print("Please input what to display: ");
        char i = nhs.nextLine().toUpperCase().charAt(0);

        //Initialize variable for harmonic and geometric programs 
        char var = 'a';
        //Program proper
        System.out.println();
        //If user input A or a

        System.out.println();
        //Prompts for 1st value 
        System.out.print("Input the value of the first term: ");
        int a = nhs.nextInt();
        int d = 0 ;
        int r = 0;
        //Prompts for 2nd value
        if (i == 'A' || i == 'B')
        {
            switch (i)
            {
                //For arithmetic series
                case 'A':
                    System.out.print("Input the common difference: ");
                    d = nhs.nextInt();
                    break;
                //For geometric series
                case 'B':
                    System.out.print("Input the common ratio: ");
                    r = nhs.nextInt();
                    break;
            }
        }
        

        System.out.println();
        int n = 1;
        //Prompts for 3rd value 
        if (i != 'C')
        {
            System.out.println("The number of terms must be greater than 0");
            System.out.print("Input the number of terms: ");
            n = nhs.nextInt();
            System.out.println();
        }      
        
        //N must be greater than 0
        if (n > 0)
        {
            int total = a;
            int count_num = 0;
            switch (i)
            {
                case 'A':
                    System.out.println("Arithmetic Series");
                    System.out.println();
                    System.out.print("The sequence is: " + "\n" + a + " ");
                    for (int x = count_num; x <= (n - 1); x++)
                    {
                        total += (a + d);
                        System.out.print(total + " ");
                    }
                    System.out.println();
                    System.out.println();
                    System.out.print("The final total is: " + total);
                    break; 
                
                case 'B':
                    System.out.println("Geometric Series");
                    System.out.println();
                    System.out.print("The sequence is: " + "\n" + a + " ");
                    while(count_num < n)
                    {
                        System.out.print(total + " ");
                        total += a * (Math.pow(r, a));
                        count_num++; 
                    }
                    System.out.println();
                    System.out.println();
                    System.out.print("The final total is: " + total);
                    break;

                case 'C':
                    System.out.println("Harmonic Mean");
                    total = (1 / a);
                    int x = 1;
                    int count_count = 0;
                    System.out.println("To show the result of the harmonic mean, please input 0.");
                    do 
                    {
                        System.out.print("Input Additional integer " + var + ": ");
                        x = nhs.nextInt();
                        if (x != 0)
                        {
                            total += (1 / x);
                            count_count++;
                        }
                        var++;

                    }
                    while(x != 0);

                    double final_ans = count_count / total;
                    System.out.print("The harmonic mean is: " + final_ans);
                    break;
                
                case 'D':
                    System.out.println("Geometric mean");
                    System.out.println();
                    int y = 1;
                    total = a;
                    int counter_count = 0 ;
                    System.out.println();
                    System.out.println();
                    System.out.println("To show the result of the harmonic mean, please input 0.");
                    do
                    {
                        System.out.print("Input additional integer " + var + ": ");
                        y = nhs.nextInt();
                        if (y != 0)
                        {
                            total *= y;
                        }
                        var++;
                        counter_count++;
                    }
                    while(y != 0);   
                    double final_total = Math.pow(total, (1.0 / counter_count));
                    System.out.println("The geometric mean is: " + final_total); 
                    break;   
                    
                case 'E':
                    System.out.println("Largest Prime number");
                    System.out.println("Input 0 to get the result.");
                    System.out.println();
                    int t = a;
                    int q = a;
                    for (int cn = 2; cn <= a / 2; cn++)
                    {
                        System.out.print("Input the next integer " + var + ": ");
                        t = nhs.nextInt();
                        if (t != 0)
                        {
                            if (a % cn == 0 && t > q)
                            {
                                q = t;
                            }
                            var++;
                        }
                        else
                        {
                            System.out.print("The largest prime number is: " + q);
                            break;
                        }
                    }
                    break;
                case 'Q':
                    System.out.print("Goodbye!");
                    System.out.println();
                    System.exit(0);
            }
        }
        else 
        {
            System.out.print("The number of terms must be greater than 0!");
        }

        //Closes scanner
        System.out.println();
        nhs.close();
    }   
}
