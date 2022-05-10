import java.util.Scanner;

public class CH1P3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float s1, s2, s3, s4, s5, total;
        System.out.println("Enter total marks of the subject (E.g-100): ");
        int marks = input.nextInt();

        System.out.println("Enter the marks of Sbuject 1:  ");
        s1 = input.nextFloat();

        System.out.println("Enter the marks of Subject 2 :  ");
        s2 = input.nextFloat();

        System.out.println("Enter the marks of Subject 3 :  ");
        s3 = input.nextFloat();

        System.out.println("Enter the marks of Subejct 4 :  ");
        s4 = input.nextFloat();

        System.out.println("Enter the marks of Subject 5 :   ");
        s5 = input.nextFloat();

        total = ((s1 + s2 + s3 + s4 + s5) / 5) * 100;

        System.out.println("Your Percentage is =  " + total + " ");
    }
}
