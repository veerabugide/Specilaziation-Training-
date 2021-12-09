import java.util.HashMap;
import java.util.Map;

public class Teacher {
    String name;
    int classid;

    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public int getClassid() {
        return classid;
    }

    public void setClassid(int classid) {
        this.classid = classid;
    }

    public void Teacher(String name, int classid) {
        this.name = name;
        this.classid = classid;
    }

    public static void main(String[] args) {

        Map<String,Integer> teach;
        teach= new HashMap<String,Integer>();
        teach.put("Mythi",1);
        teach.put("santosh",2);
        teach.put("Manju",1);
        teach.put("sanju",4);
        teach.put("tharun",5);
        teach.put("ram",6);
        System.out.println(teach);
    }
}
