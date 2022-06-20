import java.util.Scanner;

public class CH8P2 {
    static int power(int a,int b){
        int i,p=1;
        for(i=1;i<=b;i++){
            p=p*a;

        }
        return p;

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a ,b,pow;
        System.out.println("Enter value a and b:  ");
        a=sc.nextInt();
        b=sc.nextInt();

        pow=power(a,b);

        System.out.println("The value is :   "+pow);


    }
}
