import java.util.Scanner;

public class CH3P7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a1, a2, a3, triangle;
        System.out.println("Enter the first value of an angle:  ");
        a1 = sc.nextDouble();
        System.out.println("Enter the Second value of an angle:  ");
        a2 = sc.nextDouble();
        System.out.println("Enter the Third value of an angle:  ");
        a3 = sc.nextDouble();

        triangle = a1 + a2 + a3;

        if (triangle == 180) {
            System.out.println("Valid Triangle");
        } else {
            System.out.println("Not a Valid Triangle");
        }

    }
}