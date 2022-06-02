import java.util.Scanner;

public class CH5P9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lim, n;
        int b, s, r;
        System.out.println("Enter the Limit:  ");
        lim = sc.nextInt();
        System.out.println("Enter the Numbers:  ");
        n = sc.nextInt();
        s = b = n;
        for (int i = 1; i < lim; i++) {
            System.out.println("Enter the Numbers:  ");
            n = sc.nextInt();
            if (n > b) {
                b = n;
            }
            if (n < s) {
                s = n;
            }

        }
        r = (b - s);
        System.out.println("Smallest Number is :  " + s);
        System.out.println("Biggest Number is :  " + b);
        System.out.println("Range is :  " + r);

    }
}
