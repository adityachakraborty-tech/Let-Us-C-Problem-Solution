import java.util.Scanner;

public class CH10P5 {
    static int nn(int n){
        int d=1,a=1;
        if(n==0){
            return 0;
        }
        else{
            return (n/2*(2*a+(n-1)*d));
            //return ((n+1/2));
        }
    }
   /* private static int a(int i) {
        return 0;
    }*/
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter the number :  ");
        num=sc.nextInt();

        System.out.println("The Sum of First  "+num+"  Numbers are  :  "+  nn(num));

    }
}
