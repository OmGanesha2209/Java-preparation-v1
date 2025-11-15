import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepetatingCharacter {
    public static void main(String[] args) {
        //FirstNonRepetatingCharacter
     String str="programming";
        Character ch=str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(e->e.getValue()==1).map(Map.Entry::getKey).findFirst().orElse(null);
        System.out.print(ch);


        //Remove Repetative Characters
        String remove ="programming";
        List<Character>list=remove.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().map(Map.Entry::getKey).toList();
        System.out.print(list);
    }
}
