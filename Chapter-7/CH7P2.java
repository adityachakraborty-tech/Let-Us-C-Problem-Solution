import java.util.Scanner;

//import javax.swing.SwingConstants;

public class CH7P2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sub,cls;
        System.out.println("Enter the class:  ");
        cls=sc.nextInt();
        System.out.println("Number subject he failed:  ");
        sub=sc.nextInt();


        switch (cls) {
            case 1:
                if(sub<=3)
                System.out.println("the total grace marks is :  "+5*sub);
                else
                System.out.println("does not any grace marks");
                break;
            case 2:
                if(sub<=2)
                System.out.println("the total grace marks is :  "+4*sub);
                else
                System.out.println("does not any grace marks");
                break;
            case 3:
                if(sub==1)
                System.out.println("He get  5 grace marks ");
                else
                System.out.println("does not any grace marks");
                break;
            default:
               System.out.println("Wrong class entered ");
                break;
        }

    }
}
