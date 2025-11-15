import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RemoveDublicateStream {
    public static void main(String[] args) {
       String str="programming";
       String updated =str.toLowerCase();
      Character distinct=updated.chars().distinct().mapToObj(c->(char)c).
              collect(Collectors.groupingBy(Function.identity(),LinkedHashMap ::new,Collectors.counting()))
              .entrySet().stream().filter(e->e.getValue()==1).map(Map.Entry::getKey).
              findFirst().orElse(null);
      System.out.println(distinct);

    }
}
