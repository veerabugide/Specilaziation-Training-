public class Manager extends Employee{
    public Manager(){
        salary=30000;
        design="Manager";
    }

    @Override
    public void raise() {
        salary+=7000;
    }
}