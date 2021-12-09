public class Manager extends Employee{
    int id;
    String name;
    int age;
    int salary=10000;
    String designation="manager";
    public Manager() {
    }
    public Manager(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;



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



    @Override
    public String toString() {
        return "Manager{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", designation='" + designation + '\'' +
                '}';
    }
}