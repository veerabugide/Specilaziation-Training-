import java.util.Scanner;
public class Ninth {
    static double taxCalculator(int salary, int savings){
        double tax = 0;
        if(savings>=100000 && savings<200000){
            tax=(salary-savings)*0.1;
        }
        else if(savings>200000 && savings<500000){
            tax=(salary-savings)*(0.1+0.2);
        }
        else if(savings>500000){
            tax=(salary-savings)*(0.1+0.2+0.3);
        }
        return tax;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter gross salary");
        int salary = sc.nextInt();
        System.out.println("Enter total savings");
        int savings= sc.nextInt();
        /*GrossSalary.taxCalculator(salary,savings);*/
        System.out.println("The tax is "+taxCalculator(salary,savings));
    }
}

