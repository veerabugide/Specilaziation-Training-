import java.util.HashMap;
import java.util.Map;

public class subjectClass {
    int subid;

    public int getSubid() {
        return subid;
    }

    public int setSubid(int subid) {
        this.subid = subid;
        return  subid;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public void subjectClass(int subid, int rollno) {
        this.subid = subid;
        this.rollno = rollno;
    }

    int rollno;
    public static void main(String[] args) {


        Map<Integer, Integer> subc;
        subc = new HashMap<Integer, Integer>();
        subc.put(1,21);
        subc.put(2,27);
        subc.put(3,24);
        System.out.println();
    }
}
