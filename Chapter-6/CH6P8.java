import java.util.Scanner;
import java.lang.Math;

public class CH6P8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double q, r, a, n, p;
        int i;
        for (i = 1; i < 10; i++) {
            System.out.println("Enter The Principle Amount:   ");
            p = sc.nextDouble();
            System.out.println("Enter The Rate of Interest:   ");
            r = sc.nextDouble();
            System.out.println("Enter the Year:   ");
            n = sc.nextDouble();
            System.out.println("Enter the Compound Time:  ");
            q = sc.nextDouble();

            a = p * Math.pow((1 + (r / q)), (n * q));

            System.out.println("Total Amount:  " + a);

        }

    }

}
