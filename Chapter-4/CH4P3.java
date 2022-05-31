import java.util.Scanner;

//java.System.exit;
public class CH4P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float h, c, t;
        System.out.println("Enter Hardness of steel:   ");
        h = sc.nextFloat();
        System.out.println("Enter Carbon conternt:  ");
        c = sc.nextFloat();
        System.out.println("Enter Tensile Strength:  ");
        t = sc.nextFloat();

        if (h > 50 && c < 0.7 && t > 5600) {
            System.out.println("Grade is 10");
            System.exit(0);

        }
        if (h > 50 && c < 0.7) {
            System.out.println("Grade is 9");
            System.exit(0);
        }
        if (c < 0.7 && t > 5600) {
            System.out.println("Grade is 8");
            System.exit(0);
        }
        if (h > 50 && t > 5600) {
            System.out.println("Grade is 7");
            System.exit(0);
        }
        if (h > 0.7 || c < 0.7 || t > 5600) {
            System.out.println("Grade is 6");
            System.exit(0);
        }
        System.out.println("Grade is 5");
        System.exit(0);

    }
}
