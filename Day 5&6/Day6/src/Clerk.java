public final class Clerk extends Employee{
    public Clerk(){
        salary=10000;
        design="Clerk";
    }

    @Override
    public void raise() {
        salary+=1000;
    }
}
