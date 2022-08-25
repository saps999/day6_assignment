import java.util.Scanner;

public class fibonacci_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range : ");
        int r = sc.nextInt();
        int a = 0;
        int b = 1;
        int result = 0;
        for (int i = 1; i <= r; i++) {
            result = a + b;
            System.out.println(result);
            a = b;
            b = result;
        }
    }
}
