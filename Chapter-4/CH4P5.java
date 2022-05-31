import java.util.Scanner;

public class CH4P5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s1, s2, s3;
        boolean a, b, c;
        System.out.println("Enter the side 1 value:  ");
        s1 = sc.nextInt();
        System.out.println("Enter the side 2 value:  ");
        s2 = sc.nextInt();
        System.out.println("Enter the side 3 value:  ");
        s3 = sc.nextInt();
        if (s1 != s2 && s2 != s3 && s3 != s1) {
            System.out.println("SCALENCE");
        } 
         if ((s1 == s2 && s2 != s3) || (s2 == s3 && s3 != s1) || (s3 == s1 && s1 != s2)) {
            System.out.println("ISOSELENCE");
        } 
         if (s1 == s2 && s2 == s3) {
            System.out.println("EQUILATERAL");
        }
        a = (s1 * s1) == (s2 * s2) + (s3 * s3);
        b = (s2 * s2) == (s1 * s1) + (s3 * s3);
        c = (s3 * s3) == (s1 * s1) + (s2 * s2);
        if (a || b || c) {
            System.out.println("RIGHT ANGLED TRIANGLE");
        }

    }
}
