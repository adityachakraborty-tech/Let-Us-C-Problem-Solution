import java.util.Scanner;
import java.lang.Math;

public class CH2P7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double angle, s, c, t;
        System.out.println("Enter the value of an Angle:   ");
        angle = sc.nextDouble();
        // Converting
        angle = angle * 3.14 / 180;

        s = Math.sin(angle);
        c = Math.cos(angle);
        t = Math.tan(angle);

        System.out.println("sin:" + s +" "+"cos:" + c +" "+"tan:" + t);

    }
}
