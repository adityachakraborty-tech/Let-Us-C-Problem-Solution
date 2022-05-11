import java.util.Scanner;

public class CH3P11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int x,y,r;
       int dis,d;
       System.out.println("Enter the co-ordinstes of point:   ");
       x=sc.nextInt();
       y=sc.nextInt();
       System.out.println("Enter the radius:  ");
       r=sc.nextInt();
       dis=x*x+y*y;
       d=r*r;
       if(dis==d){
           System.out.println("Point on the circle");

       }
       else{
           if(dis>d){
               System.out.println("Outside the Circle");
           }
           else{
               System.out.println("Inside Circle");
           }
       }
    }
}
