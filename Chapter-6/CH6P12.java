import java.util.Scanner;

public class CH6P12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int i,j,k,num,c;
        System.out.println("Enter the numbers:  ");
        num=sc.nextInt();
        for(i=1;i<=num;i++){
            c=0;
            for(j=1;j*j*j<i;j++){
                for(k=j;j*j*j+k*k*k<=i;k++){
                    if(j*j*j+k*k*k==i)
                    c++;
                }
            }
            if(c==2){
                System.out.println(i);
            }
        }
    }
}
