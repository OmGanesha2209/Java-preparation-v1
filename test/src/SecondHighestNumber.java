import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighestNumber {
    public static void main(String[] args) {
      List<Integer>list=Arrays.asList(2,5,69,54,78,55);
      int secondHighest=list.stream().distinct()
              .sorted(Comparator.reverseOrder()).skip(1).findFirst()
              .orElseThrow(()->new RuntimeException("Not Found"));
      System.out.print(secondHighest);

    }


}
