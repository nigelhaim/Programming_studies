//Nigel Sebastian
import java.util.Scanner;
public class TitleProgram
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter message: ");
		String message = s.nextLine();
		System.out.println(FancyTitle.createFancyTitle(message, '*'));
		System.out.println(FancyTitle.createFancyTitle(message, '$'));
		s.close();
	}
}