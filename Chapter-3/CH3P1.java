import java.util.Scanner;

public class CH3P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cs, sp;
        System.out.println("Enter the cost price(cs):  ");
        cs = sc.nextInt();
        System.out.println("Enter the selling price(sp):  ");
        sp = sc.nextInt();
        if (sp > cs) {
            System.out.println("The Seller has made a Profit: " + (sp - cs));
        }
        if (sp < cs) {
            System.out.println("The Seller is in Loss: " + (sp - cs));
        }
        if (sp == cs) {
            System.out.println("There is no loss no profit");
        }
    }
}
