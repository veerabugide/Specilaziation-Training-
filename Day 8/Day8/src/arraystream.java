import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class arraystream {
    public static void main(String[] args) {
        List<Integer> nos= Arrays.asList(11,4,33,2,45,78,22);
        List<Integer> cubes_of_nos = nos.stream().map(i-> i* i* i).collect(Collectors.toList());
        System.out.println("cubes of " +nos+ " "+cubes_of_nos);
        List<String> citynames = Arrays.asList("Bangalore","Delhi","Noida","Pune","Chennai","Chattisgarh");
        List <String> city_staring_with_c= citynames.stream().filter(i->i.startsWith("C")).collect(Collectors.toList());
        System.out.println("city staring with C" +city_staring_with_c);
    }
}
