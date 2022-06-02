import java.util.Scanner;

public class CH5P1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,hr;
        float op;
        for(i=1;i<=10;i++){
            System.out.println("Enter works hour: ");
            hr=sc.nextInt();
            if(hr>=40){
                op=(hr-40)*12;
                System.out.println("Overtime pay is : "+op);

            }
            else{
                System.out.println("NO Overtime pay ");
            }
        }
    }
}
