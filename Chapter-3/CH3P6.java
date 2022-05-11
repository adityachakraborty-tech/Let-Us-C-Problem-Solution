import java.util.Scanner;

public class CH3P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rage, sage, aage, young;
        System.out.println("Enter age of Ram:  ");
        rage = sc.nextInt();
        System.out.println("Enter age of Shyam:  ");
        sage = sc.nextInt();
        System.out.println("Enter age of Ajay:  ");
        aage = sc.nextInt();
        if (rage < sage) {
            if (rage < aage)
                young = rage;
            else
                young = aage;
        } else {
            if (sage < aage)
                young = sage;
            else
                young = aage;
        }
        // System.out.println("The youngest of Ram"+" " +rage+" ,"+"Shyam"+" " +sage+"
        // ,"+"Ajay" +" "+aage+","+"is"+" " +young);

        System.out.println("Youngest is :  " + young);

    }
}
