import java.util.Scanner;

public class CH5P8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,d,r=0,p=1;
        System.out.println("Enter any Integer Value:  ");
        n=sc.nextInt();
        int i=n;
        while(i>0){
            d=i%8;
            r=r+(d*p);
            p=p*10;
            i/=8;
        }
        System.out.println("Octal value is:  "+r);
    }
}
