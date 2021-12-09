import java.util.HashSet;
import java.util.Set;

public class hashsetExample {
    public static void main(String[] args) {
        Set<String> daysofWeek = new HashSet<>();
        daysofWeek.add("Monday");
        daysofWeek.add("Tueday");
        daysofWeek.add("Wednesday");
        daysofWeek.add("Thurday");
        daysofWeek.add("Friday");
        daysofWeek.add("Saturday");
        daysofWeek.add("Sunday");
        daysofWeek.add("Monday");// adding duplicate
        System.out.println(daysofWeek);
    }

}
