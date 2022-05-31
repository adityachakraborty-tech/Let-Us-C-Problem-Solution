import java.util.Scanner;

public class CH4P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yr;
        System.out.println("Enter the Year:  ");
        yr = sc.nextInt();
        if (yr % 400 == 0 && yr % 100 != 0 || yr % 4 == 0) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }
    }

}