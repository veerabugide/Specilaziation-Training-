import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class student {
    public static void main(String[] args) {
        List<Employee> std = new ArrayList<Employee>();
        std.add(new Employee(3,"sujan",21));
        std.add(new Employee(2,"ram",22));
        std.add(new Employee(1,"ajay",20));

                std.stream()
                .sorted((object1, object2) -> object1.getName().compareTo(object2.getName())).forEach(System.out::println);



        std.stream()
                .sorted((p1, p2)->p1.name.compareTo(p2.name))
                .forEach(System.out::println);
    }
}
