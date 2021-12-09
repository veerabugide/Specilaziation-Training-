import java.util.Scanner;
public class Fifth {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the first number");
        int num1 = s.nextInt();
        System.out.println("enter the Second number");
        int num2 = s.nextInt();
        int res = pro(num1, num2);
        System.out.println("Product is " + res);
    }

    static int pro(int num1, int num2) {
        int sum = 0;
        sum = num1 * num2;

        return sum;
    }
}