import java.util.Scanner;

public class CH3P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Eneter a number :  ");
        n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("This is Even Number ");
        } else {
            System.out.println("This is a Odd Number ");
        }
    }
}
