import java.util.ArrayList;
import java.util.List;

public class ArrayList3 {
    public static void main(String[] args) {
        List<String> topComp = new ArrayList<>();
        System.out.println("Is the top company  "+topComp.isEmpty());
        topComp.add("Google");
        topComp.add("IBM");
        topComp.add("Apple");
        topComp.add("Facebook");
        System.out.println("here the top comapnies"+topComp.size()+"companies in the world");
        System.out.println(topComp);
        String bestComp = topComp.get(0);
        String second = topComp.get(1);
        String last = topComp.get(topComp.size()-1);
        System.out.println("Top company"+bestComp);
        System.out.println("Second top company"+second);
        System.out.println("Last company in list"+last);
        topComp.set(3,"Walmart");
        System.out.println("Modified results"+topComp);

    }
}
