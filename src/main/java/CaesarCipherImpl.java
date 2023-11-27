import java.util.Locale;

public class CaesarCipherImpl {

    private String ALPHABET = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) {

    }

    public String encrypt(String plainText, int key){
        String cipherText = "";
        plainText = plainText.toUpperCase(Locale.ROOT);
        for(int i=0;i<plainText.length();i++){
            char character = plainText.charAt(i);
            int charIndex = ALPHABET.indexOf(character);
            int encryptedIndex = (charIndex+key) % ALPHABET.length();
            cipherText = cipherText.concat(String.valueOf(ALPHABET.charAt(encryptedIndex)));
        }
        return cipherText;
    }

    public String decrypt(String cipherText,int key){
        return "";
    }
}
