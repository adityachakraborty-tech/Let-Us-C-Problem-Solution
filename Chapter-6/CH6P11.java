import java.lang.Math;

public class CH6P11 {
    public static void main(String[] args) {
        double pt,r,pop;

        int i;
        pt=100000;
        r=10;
        for(i=1;i<=10;i++){
            pop=pt/Math.pow((1+r/100), i);
            System.out.println("Population"+" "+i+" " +"Years ago:  "+pop);

        }

    }
}
