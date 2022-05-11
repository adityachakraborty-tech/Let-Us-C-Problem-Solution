import java.util.Scanner;

public class CH3P12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,y;
        System.out.println("Enter the x and y point:  ");
        x=sc.nextInt();
        y=sc.nextInt();

        if(x==0 && y==0)
        {
            System.out.println("Points lies on origin");

        }
        else if(x!=0 && y==0)
        {
            System.out.println("Points lies on X axis");
        }
        else if (x==0 && y!=0){
            System.out.println("Points lies on Y axis");
        }
        else{
            System.out.println("Points neither lies on any axis");
        }
    }
}
