import java.util.*;
public class CaesarCipher{
	private static int key = 5;

	public static String encrypt(String message){
		String mesg = "";
		for(int i = 0; i < message.length(); i++){
			mesg += (char)(message.charAt(i)+key);
		}
		return mesg;
	}

	public static String decrypt(String message){
		String mesg = "";
		for(int i = 0; i < message.length(); i++){
			mesg += (char)(message.charAt(i)-key);
		}
		return mesg;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to Ceasar Cipher");

		System.out.println("Please select what method to be used");
		System.out.println("| 1 | Encrypt |");
		System.out.println("| 2 | Decrypt |");
		System.out.println();
		System.out.print("Method:");
		int method = sc.nextInt();

		String result = "";
			if(method == 1){
				System.out.print("Input the text to be encrypted:");
				String message = in.nextLine();
				result = encrypt(message);
			}
			else if(method == 2){
				System.out.print("Input the text to be decrypted:");
				String message = in.nextLine();
				result = decrypt(message);
			}
			else{
				System.out.println("Invalid method!");
			}

		System.out.print("The result string is: " + result);
	}

}