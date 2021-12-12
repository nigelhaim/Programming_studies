import java.util.*;
public class First_personal_program 
{
    public static void main (String[] args)
	{
		Scanner mike = new Scanner(System.in);
		
		System.out.println("Hello world this is what I have learened in Java!");
		System.out.println("This is made by Nigel Haim N. Sebastian using only notepad");

		System.out.println();
		
		System.out.println("What kind of app shall we use? ");
		System.out.print("Hash maker - H || Calculator - C: ");
		char app = mike.nextLine().toUpperCase().charAt(0);
		

		switch(app)
		{
			case 'H':
				System.out.print("Input Password: ");
				String pass = mike.nextLine();
				System.out.println();

				long num_char = pass.chars().count();
				int mm = (int)(num_char);
				for (int i = 0; i < mm; i++)
				{
					char ch = pass.charAt(i);
					char final_hash = (char) (ch + 10);
					System.out.print(final_hash);
				}
				break;
			
			case 'C':
				System.out.println("Welcome to the calculator please input the number and operator. The program will continue to run until an equal sign (=) has input.");
				System.out.println();
				System.out.print("Opperators: Addition (+) || Subtraction (-) || Multiplication (*) || Division (/)");
				System.out.println();
				System.out.print ("Input x: ");
				double x = mike.nextDouble();

				System.out.print ("Input y: ");
				double y = mike.nextDouble();

				System.out.println();
				System.out.print("Input operator: ");
				char op = mike.next().charAt(0);
				double ans = 0;

					if (op == '+')
					{
						ans = y + x;
					}

					if (op == '-')
					{
						ans = y - x;
					}

					if (op == '*')
					{
						ans = y + x;
					}
					if (op == '/')
					{
						ans = y / x;
					}
					System.out.print("The answer is: " + ans);
					break;
					
					
				
		}
		mike.close();

		
	}
}
