import java.util.Scanner;

//import javax.lang.model.util.ElementScanner14;

public class CH7P1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,n,choose,fact=1;
        while(true){
            System.out.println("1.Factorial of a Number");
            System.out.println("2.Prime or Not");
            System.out.println("3.Odd or Even");
            System.out.println("4.Exit");


            System.out.println("What option you will Choose:   ");
            choose=sc.nextInt();

            switch(choose){
                case 1:
                System.out.println("Enter the Number:  ");
                n=sc.nextInt();
                for(i=1;i<=n;i++)
                    fact=fact*i;
                    System.out.println("Factorial value is :  "+fact);
                    break;
                
                case 2:
                System.out.println("Enter the Number:  ");
                n=sc.nextInt();
                for(i=2;i<n;i++){
                    if(n%i==0){
                        System.out.println("Not a Prime Number");
                        break;
                    }
                }
                    if(i==n)
                        System.out.println("Prime Number");
                        break;
                
                
                
                case 3:
                System.out.println("Enter the Number:  ");
                n=sc.nextInt();
                if(n%2==0){
                    System.out.println("Even Number");
                }
                else{
                    System.out.println("Odd Number");
                    break;
                }
                case 4:
                return;

            }

        }
    }
}
