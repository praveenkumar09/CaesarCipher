public class App {
    public static void main(String[] args) {
        int key = 3;
        String plainText = "This message is to be encrypted confidentially";
        CaesarCipherImpl impl = new CaesarCipherImpl();
        String cipherText = impl.encrypt(plainText,3);
        System.out.println("Encrypted Text ===>"+cipherText);
        String outText = impl.decrypt(cipherText,key);
        System.out.println("Decrypted Text ====>"+outText);
    }
}
