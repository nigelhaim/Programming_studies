/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author nigel
 */

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.*;

public class Security {
    //private static byte[] key = {'l','a','w','r','e','n','c','e',
    //                                 'd','e','c','a','m','o','r','a'};
    private static byte[] key;
    public Security(String k){
        this.key = k.getBytes();
    }
    public static String StrEncrypt(String strToEncrypt){
        String encryptedString = null; 
        try{
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            final SecretKeySpec secretKey = new SecretKeySpec(key, "AES");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            encryptedString = Base64.encodeBase64String(cipher.doFinal(strToEncrypt.getBytes()));            
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
        return encryptedString;
    }
    
    public static String StrDecrypt(String hashedString){
        String decryptedString = null;
        try{
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
            System.out.print("Support get");
            final SecretKeySpec secretKey = new SecretKeySpec(key, "AES");
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            decryptedString = new String(cipher.doFinal(Base64.decodeBase64(hashedString)));
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
        return decryptedString;
    }
}
