import java.util.Scanner;
public class Two {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number");
        int num = s.nextInt();
      OddOrEven(num);
    }

    static void OddOrEven(int num) {
        if (num % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

    }
}