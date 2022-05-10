import java.util.Scanner;
import java.lang.Math;

public class CH2P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, y, r, theta;
        System.out.println("Enetr the two points :   ");
        x = sc.nextDouble();
        y = sc.nextDouble();
        r = Math.sqrt((x * x) + (y * y));
        theta = Math.tan(y / x);
        theta = theta * (3.14 / 180);
        System.out.println("Value of r is :  " + r + "   Value of theta is :  " + theta);
    }
}
