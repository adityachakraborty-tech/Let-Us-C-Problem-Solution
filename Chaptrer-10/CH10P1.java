import java.util.Scanner;

/**
 * CH10P1
 */
public class CH10P1 {
    static int recsum(int n){
        int r,s=0;
        if(n!=0){
            r=n%10;
            s=s+r+recsum(n/10);
        }
        return s;
    }
    static int nrecsum(int n){
        int i,s=0,d;
        for(i=n;i>0;i=i/10){
            d=i%10;
            s=s+d;
        }
        return (s);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=12345;
        System.out.println("Sum is using Recursive fucntion :  "+recsum(num));
        System.out.println("Sum is Without Recursive Function:  "+nrecsum(num));
    }
}