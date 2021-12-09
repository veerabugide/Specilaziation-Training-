import java.util.stream.*;
public class SteamDemo {
    public static void main(String[] args) {
        Stream<String> fruit = Stream.of("Apple","Banana","Orange","Kiwi");
        fruit.filter(s->s.contains("a")) .map(String::toUpperCase).sorted().forEach(System.out::println);
    }
}
