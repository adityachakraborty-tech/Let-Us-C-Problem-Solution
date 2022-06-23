import java.lang.reflect.Array;
import java.util.Scanner;

public class CH13DP1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[25];
        int i, k, c = 0;
        System.out.println("Enter 25 Numbers in an Array:   ");
        for (i = 0; i < 25; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number to be sreach:   ");
        k = sc.nextInt();

        for (i = 0; i < 25; i++) {
            if (arr[i] == k) {
                c++;
            }
            // else{
            // break;
            // }
        }
        if (c == 0) {
            System.out.println("Searching number not present in the array");
        } else {
            System.out.println("Number " + k + " is found " + c + " Times");
        }

    }

}