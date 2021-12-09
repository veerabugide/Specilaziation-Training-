import java.util.ArrayList;
import java.util.List;

public class ArrayList2 {
    public static void main(String[] args) {
        List<Integer> firstfivePrimeNumber = new ArrayList<>();
        firstfivePrimeNumber.add(2);
        firstfivePrimeNumber.add(3);
        firstfivePrimeNumber.add(1);
        firstfivePrimeNumber.add(5);
        firstfivePrimeNumber.add(6);
        firstfivePrimeNumber.add(4);
        List<Integer>firstTenNumber = new ArrayList<>(firstfivePrimeNumber);
        List<Integer>nextFivenumber = new ArrayList<>();
        nextFivenumber.add(13);
        nextFivenumber.add(17);
        nextFivenumber.add(19);
        nextFivenumber.add(23);
        firstTenNumber.addAll(nextFivenumber);
        System.out.println(firstTenNumber);
    }
}
