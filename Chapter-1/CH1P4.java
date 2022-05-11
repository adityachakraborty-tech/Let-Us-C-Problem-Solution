import java.util.Scanner;

public class CH1P4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float c, fah;
        System.out.println("Enter the Temp in Fahrenheit degree (F):  ");
        fah = sc.nextFloat();
        c = (5 / 9) * (fah - 32);
        System.out.println("Temp in Celcius :  " + c + "deg");
    }
}
