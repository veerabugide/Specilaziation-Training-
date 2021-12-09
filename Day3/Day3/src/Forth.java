import java.util.Scanner;
public class Forth{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the first number");
        int num1= s.nextInt();
        System.out.println("enter the Second number");
        int num2= s.nextInt();
        sum(num1,num2);
    }

    static void sum(int num1, int num2) {
       int sum= 0;
       sum= num1+num2;
        System.out.println("sum is "+sum);

    }
}