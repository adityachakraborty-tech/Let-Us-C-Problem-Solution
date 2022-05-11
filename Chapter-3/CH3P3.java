import java.util.Scanner;

public class CH3P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yr;
        System.out.println("Enter the Year:  ");
        yr = sc.nextInt();
        if (yr % 400 == 0) {
            System.out.println("Leap Year");

        } else if (yr % 100 == 0) {
            System.out.println("Not a Leap Year");
        } else if (yr % 4 == 0) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }
    }
}
