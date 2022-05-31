import java.util.Scanner;

public class CH4P4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c,l;
        int flag=0;
        System.out.println("Enter the side1 value:  ");
        a=sc.nextInt();
        System.out.println("Enter the side2 value:  ");
        b=sc.nextInt();
        System.out.println("Enter the side3 value:  ");
        c=sc.nextInt();

        l=a;
        if(l<b){
            l=b;
        }
        if(l<c){
            l=c;
        }
        
        if(l==a && a<(c+b)){
            flag=1;
        }
        if(l==b && b<(a+c)){
            flag=1;
        }
        if(l==c && c<(a+b))
        {
            flag=1;
        }
    
        if(flag==1)
            System.out.println("Valid Triangle");
        
        else
            System.out.println("Not Valid ");
    }
    

}
