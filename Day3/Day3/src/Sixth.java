

import java.util.Scanner;



public class Sixth{
    static void display(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks");
        int marks = sc.nextInt();



        if(marks<=40){
            System.out.println("Fail");
        }
        else if(marks>=41 && marks<=50){
            System.out.println("Grade is DD");
        }
        else if(marks>=51 && marks<=60){
            System.out.println("Grade is CD");
        }
        else if(marks>=61 && marks<=70){
            System.out.println("Grade is BC");
        }
        else if(marks>=71 && marks<=80){
            System.out.println("Grade is BB");
        }
        else if(marks>=81 && marks<=90){
            System.out.println("Grade is AB");
        }
        else if(marks>=91 && marks<100){
            System.out.println("Grade is AA");
        }
        else{
            System.out.println("Enter correct marks");
        }
    }



    public static void main(String[] args) {
        Sixth.display();
    }



}/*import java.util.Scanner;
public class Sixth{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the marks");
        int num = s.nextInt();
        marks(num);
    }

    static void marks(boolean num) {
        switch (num){
            case ((num >= 91 || num == 100)):
                System.out.println("Grade is AA");

            break;
            case 2: if(num >= 81 || num == 90){
                System.out.println("Grade is AB");
            }
                break;
            case 3: if(num >= 71 || num == 80){
                System.out.println("Grade is BB");
            }
                break;
            case 4: if(num >= 61 || num == 70){
                System.out.println("Grade is BC");
            }
                break;
            case 5: if(num >= 51 || num == 60){
                System.out.println("Grade is CD");
            }
                break;
            case 6: if(num >= 41 || num == 50){
                System.out.println("Grade is DD");
            }
                break;
            case 7: if(num <= 40){
                System.out.println("Fail");
            }
                break;
            default:
                System.out.println("invalid");
        }

    }
}*/