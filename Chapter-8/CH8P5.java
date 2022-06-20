import java.util.Scanner;

public class CH8P5 {
    static int posint(int n){
        int i;
        for(i=2;i>1;i++)
        {
            if(n%i==0){
                System.out.println(i);
                n=n/i;
            }
        }
        return 0;

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num;
        System.out.println("Enter the Number :  ");
        num=sc.nextInt();
        System.out.println("Prime factors are :  ");
         posint(num);
    }
}
