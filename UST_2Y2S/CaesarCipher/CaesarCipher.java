import java.util.*;
public class CaesarCipher{
	private static int key = 5;

	public static String encrypt(String message){
		String mesg = "";
		for(int i = 0; i < message.length(); i++){
			char character = message.charAt(i);
			if((character < 'A' || character > 'Z') && (character < 'a' || character > 'z')){
				mesg += (char)(character);
			}
			else{	
				if((character >= 'a') && ((character +key) >= 'z') && (character  != ' ')){
					mesg += (char)((96 - (122 - character ))+key);//ASCII DECIMAL VALUE OF a
				}
				else if((character < 'a') && ((character +key) >= 'Z') && (character  != ' ')){
				//ASCII DECIMAL VALUE OF A
					mesg += (char)((65 - (90 - character ))+key);
				}
				else{
					mesg += (char)(character+key);
				}
			}
		}
		return mesg;
	}

	public static String decrypt(String message){
		String mesg = "";
		for(int i = 0; i < message.length(); i++){
			char character = message.charAt(i);
			if((character < 'A' || character > 'Z') && (character < 'a' || character > 'z')){
				mesg += (char)(character);
			}
			else{			
				//mesg += (char)(message.charAt(i)-key);
				if((character >= 'Z') && ((character - key) <= 'a')){
					mesg += (char)((122 + (character-key)) - 96);//ASCII DECIMAL VALUE OF a
				}
				else if(((character - key) <= 'A')){
				//ASCII DECIMAL VALUE OF A
					mesg += (char)((90 + (character-key)) - 65);
				}
				else{
					mesg += (char)(character-key);
				}
			}
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