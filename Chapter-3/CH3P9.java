import java.util.Scanner;

public class CH3P9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=5,b=4,area,peri;
        area=l*b;
        peri=2*(l+b);
        if(area>peri)
        {
            System.out.println("Area of a rectangle is greater than Perimeter");
        }
        else
        {
            System.out.println("Area of a rectangle is less than Perimeter");
        }
    }
    
}
