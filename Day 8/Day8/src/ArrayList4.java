import java.util.ArrayList;
import java.util.List;

public class ArrayList4 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("alices");
        names.add("Sri");
        names.add("Rama");
        names.add("Sita");
        names.add("Kira");
        System.out.println("Does name array contain Rama  " +names.contains("Rama"));
        System.out.println("IndexOf steve " +names.indexOf("Sri"));
        System.out.println("LastIndexOf Kira  " +names.lastIndexOf("Kira"));
    }
}
