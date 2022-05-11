import java.util.Scanner;

public class CH2P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter five digit number :  ");
        int n = sc.nextInt();
        int d, rev = 0;
        while (n > 0) {
            d = n % 10;
            rev = rev * 10 + d;
            n/=10;

        }
        System.out.println("Reverse is :  " + rev);

    }

}
