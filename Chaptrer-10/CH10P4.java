import java.util.Scanner;

public class CH10P4 {
    static int nonrec(int n){
        int i,bi=0,d,p=1;
        for(i=n;i>0;i/=2){
            d=i%2;
            bi=bi+(d*p);
            p=p*10;
        }
        return bi;
    }
    static int rec(int n){
        if(n==0){
            return 0;
        }
        else{
            return ((n%2)+10*rec(n/2));
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter the Number :   ");
        num=sc.nextInt();

        System.out.println("Using Recursive binary equivalent value is :  "+rec(num));
        System.out.println("Without Using  Recursive binary equivalent value is :  "+nonrec(num));



    }
}
