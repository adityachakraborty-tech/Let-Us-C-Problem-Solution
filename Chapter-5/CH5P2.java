import java.util.Scanner;

public class CH5P2 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int i,f=1,n;
      System.out.println("Enter the Number :  ");    
      n=sc.nextInt();
      for(i=1;i<=n;i++){
          f=f*i;
      }
      System.out.println("Factorial is :  "+f);
    }
}
