import java.util.Scanner;
public class Emp {
    String name,desig;
    int age, sal;
    Scanner sc = new Scanner(System.in);
    public Emp(){
        System.out.println("Enter Name");
        name= sc.next();
        System.out.println("Enter Age");
        age = sc.nextInt();
    }
    public void disp(){
        System.out.println("Name : "+name);
        System.out.println("Age :" +age);
        System.out.println("Salary:" +sal);
        System.out.println("Designation:" +desig);
    }
    public abstract void raise();

}
final class clerk extends Emp {
    public clerk(){
        sal=8000;
        desig="clerk";
    }
    public void raise(){
        sal+=1000;
    }
}
final class Programmer extends Emp {
    public Programmer(){
        sal=20000;
        desig="Programmer";
    }
    public void raise(){
        sal+=5000;
    }
}
final class Manager extends Emp {
    public Manager(){
        sal=25000;
        desig="Manager";
    }
    public void raise(){
        sal+=7000;
    }

}
