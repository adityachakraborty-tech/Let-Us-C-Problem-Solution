import java.util.Scanner;

public class CH2P9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int amount,hun,fif,ten,five,two,one,notes;
        System.out.println("Enter the Amonut:  ");
        amount=sc.nextInt();
        hun=amount/100;
        amount=amount%100;
        fif=amount/500;
        amount=amount%50;
        ten=amount/10;
        amount=amount%10;
        five=amount/5;
        amount=amount%5;
        two=amount/2;
        amount=amount%2;
        one=amount/1;
        amount=amount%1;

        notes=hun+fif+ten+five+two+one;

        System.out.println("Smallest Number of Notes :"+notes);



    }
}
