public class CH6P14 {
    public static void main(String[] args) {
        int i,j,k,c=1;
        for(i=1;i<=4;i++)
        {
           for(j=1;j<=4-i;j++)
           {
               System.out.print("*");
           }
           for(k=1;k<=i;k++){
               System.out.print(c);
               c++;
           }
           System.out.println("\n");
        }
    }
}
