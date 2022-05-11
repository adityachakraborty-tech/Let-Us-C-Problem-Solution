import java.util.Scanner;

public class CH3P8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter any Number: ");
        num = sc.nextInt();
        if (num < 0) {
            num = num * (-1);
            System.out.println("The Absolute value of given number:   " + num);
        }

    }
}
