/*SELECTON SORT */
import java.util.Scanner;


public class CH13DP2A1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int [30];
        int i,j,t=0;
        System.out.println("Enter 25 numbers:   ");
        for(i=0;i<25;i++){
            arr[i]=sc.nextInt();
        }
        for(i=0;i<25;i++){
            for(j=i+1;j<=25;j++){
                if(arr[i]>arr[j]){
                t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
                }
            }
        }
        System.out.println("Using Selction sort the sorted array is :  ");
        for(i=1;i<=25;i++){
            System.out.println(arr[i]);
        }
    }
}
