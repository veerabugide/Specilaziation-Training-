import java.util.Scanner;



public class Programmer extends Employee{
    int id;
    String name;
    int age;
    int salary =30000;
    String designation ="programmer";



    public Programmer() {
    }



    public Programmer(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;



    }



    @Override
    public String toString() {
        return "Programmer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", designation='" + designation + '\'' +
                '}';
    }



    public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }



    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    public int getAge() {
        return age;
    }



    public void setAge(int age) {
        this.age = age;
    }



    public int getSalary() {
        return salary;
    }



    public void setSalary(int salary) {
        this.salary = salary;
    }



    public String getDesignation() {
        return designation;
    }



    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
