import java.util.Scanner;

public class CH6P6 {
 public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n,i,mul;

     System.out.println("Enter The Number:  ");
     n=sc.nextInt();
     System.out.println("Multiplication Table:  ");
     for(i=1;i<=10;i++){
         mul=n*i;
         System.out.println(mul);
     }
 }   
}
