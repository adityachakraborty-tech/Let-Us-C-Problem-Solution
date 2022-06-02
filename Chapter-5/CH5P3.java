import java.util.Scanner;

public class CH5P3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,i;
        int pow=1;
        System.out.println("Enter two numbers:  ");
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=1;i<=b;i++){
            pow=pow*a;
        }
        System.out.println("Power is :  "+pow);

    }
}
