import java.util.Scanner;
import java.lang.Math;

public class CH2P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float t, v;
        double wcf;
        System.out.println("Enetr the Temperature (t) :   ");
        t = sc.nextFloat();
        System.out.println("Enter the wind velocity (v) :   ");
        v = sc.nextFloat();
        wcf = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
        System.out.println("Wind Chill Factor is :  " + wcf);
    }

}
