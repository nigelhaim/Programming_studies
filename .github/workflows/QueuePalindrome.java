import java.util.*;
public class QueuePalindrome
{
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.print("Enter a word: "); String word = in.next();
		System.out.print("Is " + word + " a palindrome?: " + (isPalindrome(word) == true ? "yes" : "no"));
	}
	
	static boolean isPalindrome(String input)
	{
		//Binago ko ito
		boolean test = false; 
		Stack<Character> stack = new Stack<Character>();
		Queue<Character> queue = new LinkedList<Character>();
		
		for (int i = 0; i < input.length(); i++)
		{
			stack.push(input.charAt(i));
			queue.add(input.charAt(i));
		}
		
		String reversedInput = "";
		String dequeuedInput = "";
		for (int i = 0; i < input.length(); i++)
			reversedInput += stack.pop();
		for (int i = input.length()-1; i >= 0; i--)
			dequeuedInput += queue.remove();
		//Binago ko ito 
		if (dequeuedInput.equals(reversedInput))
			test = true;
		return test;
	}
}