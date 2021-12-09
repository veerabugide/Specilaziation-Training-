import java.util.HashMap;
import java.util.Map;

public class Mainteacher {

    public static void main(String[] args) {
        Map<String ,Integer> run;
        run = new HashMap<String,Integer>();
        Teacher t1 = new Teacher();
        subjectClass c1 = new subjectClass();
        run.put(t1.setName("sri"),c1.setSubid(22));
        run.put(t1.setName("shara"),c1.setSubid(23));
        run.put(t1.setName("raju"),c1.setSubid(24));
        run.put(t1.setName("rama"),c1.setSubid(25));
        System.out.println(run);
    }
}
