import java.util.Scanner;

public class CH2P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a, b, c, s, area;
        System.out.println("Enter the lengths of three side in a triangle :    ");
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        s = (a + b + c) / 2;
        area = (s * (s - a) * (s - b) * (s - c));
        System.out.println("Area of a Triangle is :  " + area);
    }
}
