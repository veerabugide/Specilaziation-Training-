
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class EmpMenu {
    static Scanner sc = new Scanner(System.in);
    static List Emp = new ArrayList();
    static Clerk clerk;
    static Manager man;
    static Programmer programmer;
    public static void main(String[] args) {
// write your code here
        while (true){
            int choice;
            System.out.println("1.Create");
            System.out.println("2.Display");
            System.out.println("3.Raise");
            System.out.println("Exit(press -1)");
            System.out.println("Enter you choice");
            choice = sc.nextInt();
            switch (choice){
                case 1: create();
                    break;
                case 2: display();
                    break;
                case 3: raise();
                    break;
                case -1: System.exit(0);
            }
        }
    }
    public static void create(){
        System.out.println("Enter designation");
        String des = sc.next();
        System.out.println("Enter name");
        String name = sc.next();
        System.out.println("Enter age");
        int age = sc.nextInt();
        System.out.println("Enter salary");
        int salary = sc.nextInt();
        if(des.equalsIgnoreCase("Clerk")) {
            clerk = new Clerk(name, age, salary, des);
            Emp.add(clerk);
        }
        else if(des.equalsIgnoreCase("Manager")){
            man = new Manager(name,age,salary,des);
        }
        else if(des.equalsIgnoreCase("Programmer")){
            programmer = new Programmer(name,age,salary,des);
        }
        else
            System.out.println("Wrong choice");
    }
    public static void display(){
        for(int i = 0;i<Emp.size();i++){
//emp = Emp.get(i);
            System.out.println(Emp.get(i));
        }
    }
    public static void raise(){
        System.out.println("Enter the name");
        String name = sc.next();
        System.out.println("Enter the designation");
        String des = sc.next();
        System.out.println("Enter the amount to be raised");
        int raise = sc.nextInt();
        for(int i = 0;i<Emp.size();i++){
//emp = (EmployeEmp.get(i);
            //if(Emp.get(i).getClass().{
          //      clerk = (Clerk) Emp.get(i);
            //}
        }
    }
}
