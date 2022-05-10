import java.util.Scanner;

public class CH2P8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c, d, temp = 0;
        System.out.println("Enter first Number : ");
        c = sc.nextInt();
        System.out.println("Enter second Number : ");
        d = sc.nextInt();
        System.out.println("Before Interchange " + "C is :" + c + " " + "D is :" + d);
        temp = c;
        c = d;
        d = temp;
        System.out.println("After Interchange " + "C is :" + c + " " + "D is :" + d);

    }
}
