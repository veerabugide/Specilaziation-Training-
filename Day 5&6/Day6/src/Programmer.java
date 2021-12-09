public class Programmer extends Employee{
    public Programmer(){
        salary=20000;
        design="Programmer";
    }

    @Override
    public void raise() {
        salary+=5000;
    }
}
