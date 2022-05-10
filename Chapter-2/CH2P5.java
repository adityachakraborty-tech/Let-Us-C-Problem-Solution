import java.util.Scanner;
import java.lang.Math;

public class CH2P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double l1, l2, g1, g2, d;
        System.out.println("Enter the values of Latitude(L1 & L2):   ");
        l1 = sc.nextDouble();
        l2 = sc.nextDouble();
        System.out.println("Enter The Values of Longitude(G1 & G2):   ");
        g1 = sc.nextDouble();
        g2 = sc.nextDouble();
        // Convert into Degree;
        l1 = l1 * (3.14 / 180);
        l2 = l2 * (3.14 / 180);
        g1 = g1 * (3.14 / 180);
        g1 = g1 * (3.14 / 180);
        d = 3693 * Math.acos(Math.sin(l1) * Math.sin(l2) + Math.cos(l1) * Math.cos(l2) * Math.cos(g2 - g1));
        System.out.println("Distance in Nautical miles is  " + d);

    }
}
