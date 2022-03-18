import java.util.*;
import java.util.Stack;
public class StackInfixtoPostfix
{
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.print("Enter an infix expression: "); String str = in.nextLine();
		System.out.print("Postfix expression: " + toPostfix(str));
	}
	
	static String toPostfix(String str)
	{
		Stack<Character> stack = new Stack<>();
		String FinalString = "";
		
		for (int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122) || (ch >= 48 && ch <= 57))
				FinalString += ch;
			else if (ch == 41)
			{
				while (!stack.isEmpty() && stack.peek() != '(')
					FinalString += stack.pop(); 
				if (!stack.isEmpty())
					stack.pop();
			}
			else if (ch == 40)
				stack.push('(');
			else
			{
				while ((!stack.isEmpty()) && (pre(stack.peek()) >= pre(ch))) 
					FinalString += stack.pop();
				stack.push(ch);
			}	
		}
		
		while (!stack.isEmpty())
			FinalString += stack.pop(); 
		return FinalString;
	}
	
	static int pre(char ch)
	{
		if (ch == '^')
			return 2;
		else if (ch == '*' || ch == '/' || ch == '%')
			return 1;
		else if (ch == '+' || ch == '-')
			return 0;
		else
			return -1;
	}
}