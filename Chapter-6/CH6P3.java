public class CH6P3 {
    public static void main(String[] args) {
        int i;
        float l, f = 1, t = 0;
        for (i = 1; i <= 7; i++) {
            f = f * i;
            l = (i / f);
            t = t + l;
        }
        System.out.println("Add first seven terms is:  " + t);
    }
}
