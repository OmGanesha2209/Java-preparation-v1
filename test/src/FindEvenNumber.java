import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindEvenNumber {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(2,3,4,5,8,6,7,9);
        List<Integer>even = list.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.print(even);
    }
}
