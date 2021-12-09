
import java.util.Scanner;

abstract class Employee {
    String name,design;
    int age,salary;
    Scanner sc = new Scanner(System.in);

    public Employee(){
        System.out.println("Enter the name");
        name=sc.next();
        System.out.println("Enter the age");
        age=sc.nextInt();
    }
    public void display(){
        System.out.println("/n Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Salary : "+salary);
        System.out.println("Designation : "+design);
    }
    public abstract void raise();
}
