import java.util.Scanner;

public class CH14P2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the Size Of Matrix:  ");
        n = sc.nextInt();
        int a[][] = new int[n][n];
        int i, j, l;
        System.out.println("Enter the Matrix Elements :  ");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("The Matrix is :  ");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        l = a[0][0];
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (a[i][j] > l) {
                    l = a[i][j];
                }
            }
        }
        System.out.println("The Largest Number is :  " + l);

    }
}