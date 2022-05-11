import java.util.Scanner;

public class CH3P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yr, ld;
        long fd, nd, td;
        System.out.println("Enter the year :  ");
        yr = sc.nextInt();
        nd = (yr - 1) * 365;
        ld = (yr - 1) / 4 - (yr - 1) / 100 + (yr - 1) / 400;
        td = nd + ld;
        fd = td % 7;
        System.out.println("The day on 01 january " + yr + " " + "was");
        if (fd == 0) {
            System.out.println("Monday");
        }
        if (fd == 1) {
            System.out.println("Tuesday");
        }
        if (fd == 2) {
            System.out.println("Wednesday");
        }
        if (fd == 3) {
            System.out.println("Thursday");
        }
        if (fd == 4) {
            System.out.println("Friday");
        }
        if (fd == 5) {
            System.out.println("Saturday");
        }
        if (fd == 6) {
            System.out.println("Sunday");
        }

    }
}
