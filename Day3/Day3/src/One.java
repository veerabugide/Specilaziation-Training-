
import java.util.Scanner;



public class One {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter three numbers");
        int n1=s.nextInt();
        int n2=s.nextInt();
        int n3=s.nextInt();
        int maximun=max(n1,n2,n3);
        int minimum=min(n1,n2,n3);
        System.out.println("maximum is :"+maximun);
        System.out.println("Minimum is :"+minimum);
    }
    static int max(int n1,int n2,int n3){
        int max=0;
        if(n1>n2 && n1>n3){
            max=n1;
        }
        else if(n2>n3){
            max=n2;
        }
        else{
            max=n3;
        }
        return max;
    }
    static int min(int n1,int n2,int n3){
        int min=0;
        if(n1<n2 && n1<n3){
            min=n1;
        }
        else if(n2<n3){
            min=n2;
        }
        else{
            min=n3;
        }
        return min;
    }
}