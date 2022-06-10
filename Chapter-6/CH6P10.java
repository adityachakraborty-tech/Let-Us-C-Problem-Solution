import java.util.Scanner;

public class CH6P10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, k;
        for (i = 1; i <= 30; i++) {
            for (j = 1; j <= 30; j++) {
                for (k = 1; k <= 30; k++) {
                    if (i * i + j * j == k * k) {
                        System.out.println(i + "\t" + j + "\t " + k);
                    }
                }
            }
        }
    }
}
