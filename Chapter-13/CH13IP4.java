import java.util.Scanner;

public class CH13IP4 {
    static int modify(int a[],int n){
        int i;
        for(i=0;i<n;i++){
            a[i]=a[i]*3;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        int i;
        System.out.println("ENTER THE ARAAY ELEMENTS:  ");
        for(i=0;i<=9;i++){
            arr[i]=sc.nextInt();
        }
        modify(arr, 10);
        System.out.println("Enter the modify array:  ");
        for(i=0;i<=9;i++){
            System.out.println(arr[i]);
        
        }
    }
}
