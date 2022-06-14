public class CH6P13 {
    public static void main(String[] args) {
        int i;
        for(i=0;i<=23;i++){
            if(i==0){
                System.out.println("12 Midnight");
                continue;
            }
            if(i<12){
                System.out.println(i%12+""+"AM");
                
            }
            if(i==12){
                System.out.println("12 Noon");
            }
            if(i>12){
                System.out.println(i%12+""+"PM");
            }

        }
    }
}
