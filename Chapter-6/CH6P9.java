import java.util.Scanner;

public class CH6P9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,x;
        double result=0;
        System.out.println("Enter the number:  ");
        x=sc.nextInt();

        result=result+((x-1.0)/x);
        for(i=2;i<=7;i++){
            result=result+(1.0/2)*Math.pow((x-1.0)/x, i);
        }
        System.out.println("Sum of Seven series is:   "+result);
    
    }
}
