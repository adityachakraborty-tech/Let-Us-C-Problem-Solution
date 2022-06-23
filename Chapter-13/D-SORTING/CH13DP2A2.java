/*BUBBBLE SORT */

import java.util.Scanner;

public class CH13DP2A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[30];
        int i, j, t = 0;
        System.out.println("Enter 25 numbers:   ");
        for (i = 0; i < 25; i++) {
            arr[i] = sc.nextInt();
        }
        for (i = 0; i < 25; i++) {
            for (j = 0; j < 25 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
        System.out.println("Using Bubble sort the Sorted array is:  ");
        for (i = 1; i <= 25; i++) {
            System.out.println(arr[i]);
        }

    }
}
