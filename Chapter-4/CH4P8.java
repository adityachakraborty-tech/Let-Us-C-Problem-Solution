import java.util.Scanner;

public class CH4P8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int d,m;
        System.out.println("Enter the Day and Month:  ");
        d=sc.nextInt();
        m=sc.nextInt();

        if(d>22 && m==12 || d<=19 && m==1){
            System.out.println("CAPRICORN");
        }
        if(d>=20 && m==1 || d<=17 && m==2 ){
            System.out.println("AQUARIUS");
        }
        if(d>=18 && m==2 || d<=19 && m==3 ){
            System.out.println("PISCES");
        }
        if(d>=20 && m==3 || d<=19 && m==4){
            System.out.println("ARIES");
        }
        if(d>=20 && m==4 || d<=20 && m==5){
            System.out.println("TAURUS");
        }
        if(d>=21 && m==5 || d<=20 && m==6){
            System.out.println("GEMINI");
        }
        if(d>=21 && m==6 || d<=22 && m==7){
            System.out.println("CANCER");
        }
        if(d>=23 && m==7 || d<=22 && m==8){
            System.out.println("LEO");
        }
        if(d>=23 && m==8 || d<=22 && m==9){
            System.out.println("VIRGO");
        }
        if(d>=23 && m==9 || d<=22 && m==10){
            System.out.println("LIBRA");
        }
        if(d>=23 && m==10 || d<=21 && m==11){
            System.out.println("SCORPIO");
        }
        if(d>=22 && m==11 || d<=21 && m==12){
            System.out.println("SAGITTARIUS");
        }
    }
}
