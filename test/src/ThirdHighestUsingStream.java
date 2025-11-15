import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ThirdHighestUsingStream {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(2,5,8,9,6,4,7,33,55);
        int thirdHighest=list.stream().distinct().sorted(Comparator.reverseOrder())
                .skip(2).findFirst().orElseThrow(()->new RuntimeException("not found"));
        System.out.println(thirdHighest);
    }
}
