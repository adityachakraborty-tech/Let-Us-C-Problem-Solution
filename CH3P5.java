import java.util.Scanner;

public class CH3P5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,rev=0,d,org;
        System.out.println("Enter any five digit number:  ");
        n=sc.nextInt();
        org=n;
        while(n>0)
        {
            d=n%10;
            rev=rev*10+d;
            n/=10;
        }
        System.out.println("REV IS "+rev);
        if(rev==org)
        {
            System.out.println("Numbers are Equal");
        }
        else
        {
            System.out.println("Numbers are not equal");
        }
    }
}
