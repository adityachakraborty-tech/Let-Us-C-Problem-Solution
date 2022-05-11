import java.util.Scanner;

public class CH3P10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x1,x2,x3,y1,y2,y3;
        int s1,s3;
        System.out.println("Enter the value of x1:  ");
        x1=sc.nextInt();
        System.out.println("Enter the value of x2:  ");
        x2=sc.nextInt();
        System.out.println("Enter the value of x3:  ");
        x3=sc.nextInt();
        System.out.println("Enter the value of y1:  ");
        y1=sc.nextInt();
        System.out.println("Enter the value of y2:  ");
        y2=sc.nextInt();
        System.out.println("Enter the value of y3:  ");
        y3=sc.nextInt();

        //Slope part
        s1=y2-y1/x2-x1;
        s3=y3-y2/x3-x2;

        if(s1==s3)
        {
            System.out.println("All three point lie on same straight line");
        }
        else{
            System.out.println("All three point do not lie on same straight line");
           
        }


    }
}
