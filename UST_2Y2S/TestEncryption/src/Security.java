
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.*;

public class Security {

//	private static byte[] key = {
//	 	0x74, 0x68, 0x69, 0x73, 0x49, 0x73, 0x41, 0x53, 
//                0x65, 0x63, 0x72, 0x65, 0x74, 0x4b, 0x65, 0x79
//                 // thisisasecretkey
//	};

      //private static byte[] key = {'l','a','w','r','e','n','c','e',
      //                               'd','e','c','a','m','o','r','a'};

        private static byte[] key = {'i', 'c', 's', '_', '2', '5', '0', '9', '0'};
        public static byte[] keyCheck(byte key[]){
            if(key.length < 16){//If the key is less than 16 
                byte[] FinalKey = new byte[16];//Initiate the 
                int j = 0;
                for(int i = 0; i < 16; i++){
                    FinalKey[i] = key[j];
                    if(j < key.length){
                        j = 0;
                    }
                    j++;
                }
                System.out.println("Returned array length is:" + FinalKey.length);
                return FinalKey;
            }
            else{
                return key;
            }
        }
	public static String encrypt(String strToEncrypt) {
		String encryptedString = null;
		try {
			Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
			final SecretKeySpec secretKey = new SecretKeySpec(keyCheck(key), "AES");
                        //final SecretKeySpec secretKey = new SecretKeySpec(key, "AES");
			cipher.init(Cipher.ENCRYPT_MODE, secretKey);
			encryptedString = Base64.encodeBase64String(cipher.doFinal(strToEncrypt.getBytes()));
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return encryptedString;
	}

	public static String decrypt(String codeDecrypt){
		String decryptedString = null;
		try{
			Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
			final SecretKeySpec secretKey = new SecretKeySpec(keyCheck(key), "AES");
                        //final SecretKeySpec secretKey = new SecretKeySpec(key, "AES");
			cipher.init(Cipher.DECRYPT_MODE, secretKey);
			decryptedString = new String(cipher.doFinal(Base64.decodeBase64(codeDecrypt)));
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return decryptedString;
	}
}
