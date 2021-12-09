import java.util.Comparator;

public class sortByRoll implements Comparator<Employee> {
    public int compare(Employee a, Employee b)
    {
        return a.id - b.id;
    }



}