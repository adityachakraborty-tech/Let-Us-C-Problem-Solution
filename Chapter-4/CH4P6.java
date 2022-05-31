import java.util.Scanner;

public class CH4P6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int w;
        System.out.println("Enter the weight:  ");
        w=sc.nextInt();
        if(w<115){
            System.out.println("FLYWEIGHT");
        }
        if(w>=115 && w<=121){
            System.out.println("BANTAMWEIGHT");
        }
        if(w>=122 && w<=153)
        {
            System.out.println("FEATHERWEIGHT");

        }
        if(w>=154 && w<=189){
            System.out.println("MIDDLEWEIGHT");
        }
        if(w>=190){
            System.out.println("HEAVYWEIGHT");
        }

    }
}
