public class CH5P5 {
    public static void main(String[] args) {
        int a, b, c;
        int i = 1;
        while (i <= 500) {
            a = i % 10;
            b = i % 100;
            b = (b - a) / 10;
            c = i / 100;

            if ((a * a * a) + (b * b * b) + (c * c * c) == i)
                System.out.println("Armstrong Numbers are: " + i);

            i++;
        }
    }
}
