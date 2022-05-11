import java.util.Scanner;

public class CH1P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float dis;
        System.out.println("Enter the Distance in (km) :  ");
        dis = sc.nextFloat();
        System.out.println("the distance is meter : " + dis * 1000);
        System.out.println("the distance is feet : " + dis * 3280.84);
        System.out.println("the distance is inchess : " + dis * 39370.1);
        System.out.println("the distance is cm : " + dis * 10000);
    }
}
