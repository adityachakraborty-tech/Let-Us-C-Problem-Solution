import java.util.Scanner;

public class CH8P3 {
    static int roman(int yr){
        if(yr>=1000)
        {
            System.out.print("M");
            roman(yr-1000);
        }
        else if(yr>=500)
        {
            System.out.print("D");
            roman(yr-500);
        }
        else if(yr>=100)
        {
            System.out.print("C");
            roman(yr-100);
        }
        else if(yr>=50)
        {
            System.out.print("L");
            roman(yr-100);
        }
        else if(yr>=10)
        {
            System.out.print("X");
            roman(yr-10);
        }
        else if(yr>=5)
        {
            System.out.print("V");
            roman(yr-5);
        }
        else if(yr>=1)
        {
            System.out.print("I");
            roman(yr-1);
        }
        return 0;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int yr;
        System.out.print("Enter the year:  ");
        yr=sc.nextInt();
        System.out.println("Roman Eqiivalent year is :   ");
        roman(yr);

       // System.out.print("Roman eqivalent year is :   "+re);

    }
}
