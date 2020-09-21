import java.util.Scanner;

public class Caesar {
    public static String encryptCaesar(String message) {
        int shift = 3;
        int adjusted = 0;
        String encrypted = "";
        for(int i = 0; i < message.length(); i++){
            if (message.charAt(i) >= 'A' && message.charAt(i) <= 'Z'){
                adjusted = ((int)(message.charAt(i)) + shift - 'A') % 26;
                encrypted += (char)((int) 'A' + adjusted);
            }
            else if (message.charAt(i) >= 'a' && message.charAt(i) <= 'z'){
                adjusted = ((int)(message.charAt(i)) + shift - 'a') % 26;
                encrypted += (char)((int) 'a' + adjusted);
            }
            else{
                encrypted += message.charAt(i);
            }
            
        }
        return encrypted;
    }

    public static String decryptCaesar(String message) {
        int shift = 3;
        int adjusted = 0;
        String encrypted = "";
        for(int i = 0; i < message.length(); i++){
            if (message.charAt(i) >= 'A' && message.charAt(i) <= 'Z'){
                adjusted = ((int)(message.charAt(i)) - shift - 'A') % 26;
                if (adjusted < 0) {
                    adjusted = 26 + adjusted;
                }
                encrypted += (char)((int) 'A' + adjusted);
            }
            else if (message.charAt(i) >= 'a' && message.charAt(i) <= 'z'){
                adjusted = ((int)(message.charAt(i)) - shift - 'a') % 26;
                if (adjusted < 0) {
                    adjusted = 26 + adjusted;
                }
                encrypted += (char)((int) 'a' + adjusted);
            }
            else{
                encrypted += message.charAt(i);
            }
            
        }
        return encrypted;
    }

    public static String encryptCaesarKey(String message, int key) {
        int shift = key;
        int adjusted = 0;
        String encrypted = "";
        for(int i = 0; i < message.length(); i++){
            if (message.charAt(i) >= 'A' && message.charAt(i) <= 'Z'){
                adjusted = ((int)(message.charAt(i)) + shift - 'A') % 26;
                encrypted += (char)((int) 'A' + adjusted);
            }
            else if (message.charAt(i) >= 'a' && message.charAt(i) <= 'z'){
                adjusted = ((int)(message.charAt(i)) + shift - 'a') % 26;
                encrypted += (char)((int) 'a' + adjusted);
            }
            else{
                encrypted += message.charAt(i);
            }
            
        }
        return encrypted;
    }

    public static String decryptCaesarKey(String message, int key) {
        int shift = key;
        int adjusted = 0;
        String encrypted = "";
        for(int i = 0; i < message.length(); i++){
            if (message.charAt(i) >= 'A' && message.charAt(i) <= 'Z'){
                adjusted = ((int)(message.charAt(i)) - shift - 'A') % 26;
                if (adjusted < 0) {
                    adjusted = 26 + adjusted;
                }
                encrypted += (char)((int) 'A' + adjusted);
            }
            else if (message.charAt(i) >= 'a' && message.charAt(i) <= 'z'){
                adjusted = ((int)(message.charAt(i)) - shift - 'a') % 26;
                if (adjusted < 0) {
                    adjusted = 26 + adjusted;
                }
                encrypted += (char)((int) 'a' + adjusted);
            }
            else{
                encrypted += message.charAt(i);
            }
            
        }
        return encrypted;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Would you like to \"encrypt\" or \"decrypt\" a message?");
        String command = scan.nextLine().trim().toLowerCase();

        if (command.equals("encrypt")) {
            System.out.println("Please enter your message to be encrypted: ");
            String message = scan.nextLine();
            System.out.println("Here is your encrypted message: ");
            System.out.println(encryptCaesar(message));
        }
        else if (command.equals("decrypt")) {
            System.out.println("Please enter your message to be decrypted: ");
            String message = scan.nextLine();
            System.out.println("Here is your decrypted message: ");
            System.out.println(decryptCaesar(message));
        }
        else {
            System.out.println("Unknown command; please type either \"encrypt\" or \"decrypt\"");
        }

        scan.close();
    }
}
