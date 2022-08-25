import java.util.Random;
import java.util.Scanner;

public class coupon_no {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range of Coupon number: ");
        int d = sc.nextInt();
        String str = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random r = new Random();
        for (int i = 0; i <= d; i++) {
            char c = alphabet.charAt((r.nextInt(alphabet.length())));
            str = str + String.valueOf(c);
        }
        System.out.println("Generated coupon number is: " + str);
    }
}

