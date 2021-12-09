import java.util.Scanner;




public class Eight {
    public static void main(String args[]) {
        for(int i =1;i<=1000;i++)
            Perfect(i);





    }
    public static void Perfect(int n){
        int q =0;
        for(int i = 1;i<=n/2;i++){
            if(n%i==0){
                q = q+i;
            }
            if(q==n) {
                System.out.println(q);
                break;
            }
        }
    }
}