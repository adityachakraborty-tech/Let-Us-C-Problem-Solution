import java.util.*;

public class CH5P7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ans = 'y';
        int n, pos, neg, zero;
       pos=neg=zero=0;
        
        while (ans == 'y' || ans == 'y') {
            System.out.println("Enter number: ");
            n = sc.nextInt();

            if (n == 0)
                zero++;

            if (n > 0)
                pos++;

            if (n < 0)
                neg++;

            System.out.println("Do You Want to continue:  ");
            ans = sc.next().charAt(0);
        }
        System.out.println("You entered " + pos +" "+ "Positive number");
        System.out.println("You entered " + neg +" "+ "Negative number");
        System.out.println("You entered " + zero +" "+ "Zeroes");

    }
}
