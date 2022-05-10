import java.util.Scanner;

public class CH1P1 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        float b;
        float da;
        float hra;
        float gross;

        System.out.println("Enter the basic salary of an employee:");
        b = sc.nextInt();

        da = (b * 20) / 100;
        hra = (b * 30) / 100;

        gross = b + da + hra;

        System.out.println("Gross salary of an employee is: " + gross);

    }
}
