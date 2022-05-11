import java.util.Scanner;

public class CH1P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = 1189, w = 841, temp;
        for (int i = 0; i < 9; i++) {
            System.out.println("A" + i + ":" + w + "mm" + "X" + h + "mm");
            temp = h;
            h = w;
            w = temp / 2;
        }

    }
}
