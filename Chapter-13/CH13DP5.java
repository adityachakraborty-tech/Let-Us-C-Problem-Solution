import java.util.Scanner;

public class CH13DP5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[20];
        int i,j,t=0;

        System.out.println("Enter the numbers:  ");
        for(i=0;i<10;i++){
            a[i]=sc.nextInt();
        }

        for(i=0;i<10;i++){
            if(a[i]%2!=0){
                for(j=10;j>i;j--){
                    if(a[j]%2==0){
                        t=a[i];
                        a[i]=a[j];
                        a[j]=t;
                        break;
                    }
                }
            }
        }
        System.out.println("New Array is:  ");
        for(i=1;i<=10;i++){
            System.out.println(a[i]);
        }
    }
}
