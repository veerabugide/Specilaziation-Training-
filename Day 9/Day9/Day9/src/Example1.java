import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Example1 {
    public static void main(String[] args) {
        Queue<String> x = new LinkedList<>();
        x.add("One");
        x.add("two");
        x.add("three");
        x.add("one");
        System.out.println(x.poll());

    }
}
