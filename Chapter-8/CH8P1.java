import java.util.Scanner;
import java.util.function.Function;

public class CH8P1 {
    static int fac(int x){
        int i,fact=1;
        for(i=1;i<=x;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n,factorial;
       System.out.println("Enter the number :  "); 
       n=sc.nextInt();
       factorial=fac(n);
       System.out.println("The factorial value is :  "+factorial);
    }
}
