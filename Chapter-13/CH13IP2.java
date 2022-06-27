import java.util.Scanner;

public class CH13IP2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of array: ");
        n = sc.nextInt();
        int a[] = new int[n];
        int i, j;
        System.out.println("Enter the elements:  ");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Equal elements is :  ");
        for(i=0;i<n;i++){
            if(a[i]==a[n-(i+1)])
            System.out.println(a[i]);
        }
    
    }
}
