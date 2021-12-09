import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Emp {
    public Emp(int id, String name, int age) {
    }

    public static void main(String[] args) {

        ArrayList<Employee> ar = new ArrayList<Employee>();
        ar.add(new Employee(3, "srini", 21));
        ar.add(new Employee(2, "sujan", 22));
        ar.add(new Employee(1, "ram", 21));



        Collections.sort(ar, new sortByRoll());



        System.out.println("\nSorted by id");
        for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));

       // ArrayList <Emp> stort_by_id= l1.stream().collect(Collectors.toList());
       // System.out.println(stort_by_id);
    }
}
