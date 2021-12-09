import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class hashset3 {
    public static void main(String[] args) {
        Set<String> program = new HashSet<>();
        program.add("C");
        program.add("Java");
        program.add("C++");
        program.add("Python");
        program.add("PHP");
        program.add("HTML");
        System.out.println("Iterate over a Hash Set using Java 8 for Each and lamdda ");
        program.forEach(programs->{
            System.out.println(program);
        });
        System.out.println("Iterate over a hastset using iterator() ==");
        Iterator<String>programIter = program.iterator();
        while (programIter.hasNext()){

        }
    }
}
