import java.util.Scanner;
public class Three{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the age");
        int num = s.nextInt();
        age(num);
    }

    static void age(int num) {
        if (num>= 18) {
            System.out.println("elligible to vote");
        } else {
            System.out.println("not eligible to vote");
        }

    }
}