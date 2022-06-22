import java.util.Scanner;

public class CH10P2 {

    static void pf(int n ){
       int i;
       for(i=2;i<=n;i++){
        if(n%i==0){
            System.out.println(i);
            pf(n/i);
            break;
        }
       }
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter the number :  ");
        num=sc.nextInt();
        System.out.println("Prime Factors are:  ");
        pf(num);
    }
}
