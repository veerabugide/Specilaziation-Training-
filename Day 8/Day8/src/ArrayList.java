import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        List<String> animals = new java.util.ArrayList<>();
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Deer");
        System.out.println(animals);
        animals.add(2,"Elephant");
        System.out.println(animals);
    }
}
