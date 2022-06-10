public class CH6P5 {
    public static void main(String[] args) {
        int yr = 0, inv, alt;
        while (alt>inv) {
            yr++;
            alt = yr * 90;
            inv = (1000 * yr) - 4000;
        }
        System.out.println("The Minimum Year is : " + yr);
    }
}
