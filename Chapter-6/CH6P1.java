import java.util.Scanner;

public class CH6P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        System.out.println("prime numbers are: ");
        for (i = 1; i <= 300; i++) {
            for (j = 2; j < i; j++) {
                if (i % j == 0)
                    break;
            }
            if (i == j) {
                System.out.println(i); 
            }
        }

    }
}
