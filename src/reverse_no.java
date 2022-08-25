import java.util.Scanner;

public class reverse_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = sc.nextInt();
        int remainder = 0;
        int reverse = 0;
        while (a != 0) {
            remainder = a % 10;
            reverse = reverse * 10 + remainder;
            a=a/10;
        }
        System.out.println(reverse);

    }
}
/*2121%10=212.1//0*10=0+1=1//2121/10=212
212%10=21.2//1*10=10+2=12//212/10=21
21%10=2.1//12*10=120+1=121//21/10=2
2%10=0.2//121*10=1210+2=1212//2/10=0
1212 2121*/
