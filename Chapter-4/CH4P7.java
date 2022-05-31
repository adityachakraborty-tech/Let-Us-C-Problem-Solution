import java.util.Scanner;

public class CH4P7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float r, g, b, c, m, y, k, max, white;
        System.out.println("Enter the RGB colour (rg:0 to 255) :   ");
        r = sc.nextFloat();
        g = sc.nextFloat();
        b = sc.nextFloat();

        if (r == 0 && g == 0 && b == 0) {
            c = m = y = 0;
            k = 1;
        } else {
            r = r / 255;
            g = g / 255;
            b = b / 255;

            max = r;
            if (g > max)
                max = g;
            if (b > max)
                max = b;

            white = max;
            c = (white - r) / white;
            m = (white - g) / white;
            y = (white - b) / white;
            k = 1 - white;

            System.out.println("c:=" + c + "M:= " + m + "Y:= " + y + "K:= " + k);

        }
    }
}
