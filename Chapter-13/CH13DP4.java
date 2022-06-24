//import java.lang.reflect.Array;
import java.util.Scanner;

public class CH13DP4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[25];
        int i,p=0,n=0,even=0,odd=0;
        System.out.println("Enter the Numbers:  ");
        for(i=0;i<25;i++){
            a[i]=sc.nextInt();
        }
        for(i=0;i<25;i++){
            if(a[i]>0)
                p++;
            
            if(a[i]<0)
                n++;
            
            if(a[i]%2==0)
                even++;
            else
                odd++;

            
        }
        System.out.println("Positive Numbers are:  "+p);
        System.out.println("Negative Numbers are:  "+n);
        System.out.println("Odd Numbers are:  "+even);
        System.out.println("Even Numbers are:  "+odd);



        
    }
}
