import java.util.Scanner;

public class CH2P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Five Digit Number :  ");
        int n = sc.nextInt();
        int sum = 0;
        int d;
        for (int i = n; i > 0; i = i / 10) {
            d = i % 10;
            sum = sum + d;
        }
        System.out.println("Sum of digit is : " + sum);

    }
}
