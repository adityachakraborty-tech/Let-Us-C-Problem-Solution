import java.util.Scanner;

public class CH13IP3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int n;
        // System.out.println("Enter the size of array: ");
        // n = sc.nextInt();
        int a[]=new int[6];
        int i;
        System.out.println("Enter the array elements:  ");
        for(i=0;i<5;i++){
            a[i]=sc.nextInt();
        }
        int s=a[0];
        for(i=0;i<5;i++){
            if(a[i]<s){
                s=a[i];
            }
        }
        System.out.println("The Smalles element is :   "+s);
        
    }
}
