import java.util.Scanner;

public class CH8P4 {
    static int leap(int yr){
        if((yr%4==0 && yr%100!=0 ) || yr%400==0){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not a Leap Year");
        }
        return 0;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yr,leapyear;
        System.out.println("Enter the year :  ");
        yr=sc.nextInt();
        leapyear=leap(yr);
    }
}
