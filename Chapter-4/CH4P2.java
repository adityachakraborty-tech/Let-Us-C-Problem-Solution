import java.util.Scanner;

public class CH4P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        System.out.println("Enter any Character:  ");
        ch = sc.next().charAt(0);
        if (ch >= 65 && ch <= 90) {
            System.out.println("Character is a  Capital Letter");
        }
        if (ch >= 97 && ch <= 122) {
            System.out.println("Character is a  Small Letter");
        }
        if (ch >= 48 && ch <= 57) {
            System.out.println("Character is a  Digit ");
        }
        if ((ch >= 0 && ch <= 47) || (ch >= 58 && ch <= 64) || (ch >= 91 && ch <= 96) || (ch >= 123 && ch <= 127)) {
            System.out.println("Character is a  Special Symbol");
        }

    }
}
