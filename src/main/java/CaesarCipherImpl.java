import java.util.Locale;

public class CaesarCipherImpl {

    private String ALPHABET = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public String encrypt(String plainText, int key){
        String cipherText = "";
        plainText = plainText.toUpperCase();
        for(int i=0;i<plainText.length();i++){
            char character = plainText.charAt(i);
            int charIndex = ALPHABET.indexOf(character);
            int encryptedIndex = Math.floorMod((charIndex+key),ALPHABET.length());
            cipherText = cipherText.concat(String.valueOf(ALPHABET.charAt(encryptedIndex)));
        }
        return cipherText;
    }

    public String decrypt(String cipherText,int key){
        String plainText = "";
        for(int i=0; i < cipherText.length();i++){
            char character =cipherText.charAt(i);
            int charIndex = ALPHABET.indexOf(character);
            int decryptedIndex = Math.floorMod((charIndex - key),ALPHABET.length());
            plainText = plainText.concat(String.valueOf(ALPHABET.charAt(decryptedIndex)));
        }
        return plainText;
    }
}
