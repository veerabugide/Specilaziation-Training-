import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {
    static Scanner s=new Scanner(System.in);
    static Clerk c=new Clerk();
    static Programmer p=new Programmer();
    static Manager m=new Manager();
    static List<Employee> employees = new ArrayList<>();
    public static void main(String args[]){



        Scanner s=new Scanner(System.in);
        while (true) {
            int i=1;
            System.out.println("Enter the designation : 1:clerk 2:programmer 3:Manager 4:exit");
            int des = s.nextInt();
            if(des==4){
                break;
            }
            while (i==1) {



                System.out.println("Enter choice 1:create 2:Display 3:Raise 4:exit");
                int choice = s.nextInt();
                switch (choice) {
                    case 1:
                        creation(des);
                        break;
                    case 2:
                        display();
                        break;
                    case 3:raise();
                        break;
                    case 4:i=2;
                        break;
                }
            }
        }
    }
    static void creation(int des){
        int designation=des;
        System.out.print("Enter id :");
        int id=s.nextInt();
        System.out.print("Enter name :");
        String name=s.next();
        System.out.print("Enter age :");
        int age=s.nextInt();
        if(designation==1){
            employees.add(new Clerk(id,name,age));
        }
        else if(designation==2){
            employees.add(new Programmer(id,name,age));
        }
        else if(designation==3){
            employees.add(new Manager(id,name,age));
        }
        else{



        }
    }
    static void display(){
        System.out.println(employees);
    }
    static void raise(){
        System.out.println("Enter id:");
        int id=s.nextInt();
        System.out.println("Enter the amount to be raised :");
        int amount=s.nextInt();
        int salary=0;
        for(int i=0;i<employees.size();i++) {
            Employee e = employees.get(i);
            if (e.getId() == id) {
                if(e.getDesignation()=="clerk") {
                    salary=c.getSalary();
                    amount=amount+salary;
                    e.setSalary(amount);
                    System.out.println("Successfully updated");
                }
                else if(e.getDesignation()=="programmer") {
                    salary=p.getSalary();
                    amount=amount+salary;
                    e.setSalary(amount);
                    System.out.println("Successfully updated");
                }
                else if(e.getDesignation()=="manager") {
                    salary=m.getSalary();
                    amount=amount+salary;
                    e.setSalary(amount);
                    System.out.println("Successfully updated");
                }
            }
        }
    }
}