import java.util.Scanner;

public class CH13IP1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
         System.out.println("Enter the size of array: ");
         n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        int i, j;
        for (i = 0; i < n; i++) {
            System.out.println("Enter the elements:  ");
            a[i] = sc.nextInt();
        }
        for (i = n-1, j = 0; i >= 0; i--, j++) {

            b[j] = a[i];

        }
        System.out.println("After stored elements 2nd array:   ");
        for (i = 0; i < n; i++) {
            System.out.println(b[i]);
        }

    }

}