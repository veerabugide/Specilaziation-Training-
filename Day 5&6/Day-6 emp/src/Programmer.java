public class Programmer extends  Emp{
    public Programmer(String name, int age , int salary , String designation) {

        this.name= name;
       this.age = age;
       this.salary= salary;
       this.designation= designation;
    }
    public void display(){
        System.out.println(this.name+" "+this.age+" "+ this.salary+ " "+ this.designation);
    }
    public void raiseSalary(int amt){
        this.salary= this.salary +amt;
        System.out.println("The raised salary is " +this.salary);
    }
}
