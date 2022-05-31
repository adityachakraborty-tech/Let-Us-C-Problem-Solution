import java.util.Scanner;

public class CH4P9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float wt,ht,bmi;
        System.out.println("Enter the weight in kg and height in meters:  ");
        wt=sc.nextFloat();
        ht=sc.nextFloat();

        bmi=wt/(ht*ht);
        System.out.println("Bmi is ="+bmi);

        if(bmi<15){
            System.out.println("STARVATION");
        }
        else if(bmi>=15.1 && bmi<=17.5){
            System.out.println("ANOREXIC");
        }
        else if(bmi>=17.6 && bmi<=18.5){
            System.out.println("UNDERWEIGHT");
        }
        else if(bmi>=18.6 && bmi<=24.9){
            System.out.println("IDEAL");
        }
        else if(bmi>=25 && bmi<=25.9){
            System.out.println("OVERHEIGHT");
        }
        else if(bmi>=30 && bmi<=30.9){
            System.out.println("OBESE");
        }
        else if(bmi>=40){
            System.out.println("MORBIDLY OBESE");
        }
        else{
            System.out.println("Wrong Input");
        }
          

    }
}
