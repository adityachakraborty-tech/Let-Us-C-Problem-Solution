import java.util.Scanner;

public class CH6P7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int y;
        double x,i;
        for(y=1;y<=6;y++){
            for(x=5.5;x<=12.5;x+=0.5){
                i=2+(y+0.5*x);
                System.out.println("y:="+y);
                System.out.println("x:="+x);
                System.out.println("i:="+i);
            }
        }
    }
}
