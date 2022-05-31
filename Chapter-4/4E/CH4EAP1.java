import java.util.Scanner;

public class CH4EAP1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch;
        System.out.println("Enter the Character:  ");
        ch=sc.next().charAt(0);
        if(ch>=97 && ch<=122){
            System.out.println("LOWER CASE");
        }
        else{
            System.out.println("NOT LOWER CASE");
        }

    }
}
