import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password length: ");
        int length = sc.nextInt();

        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@#&!";
        Random rand = new Random();

        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = rand.nextInt(chars.length());
            password.append(chars.charAt(index));
        }

        System.out.println("Generated Password: " + password);
    }
}