import java.util.Scanner;

public class CH10P3 {

    static int fib(int n){
      if(n==0){
        return 0;
      }
      else if(n==1){
        return 1;
      }
      else{
        return (fib(n-1)+fib(n-2));
      }
      

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num,i,ct=0;

        System.out.println("Enter the Number :  ");
        num=sc.nextInt();

        System.out.println("Fibonacci series is :  ");
        for(i=1;i<=num;i++){
            System.out.println(fib(ct));
            ct++;
            
        }
    }
}
