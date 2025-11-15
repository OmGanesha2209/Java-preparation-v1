import java.util.HashSet;
import java.util.Set;

public class RemoveDublicateGivenString {
    public static void main(String[] args) {
        String str = "Aparna Learnimg Programmng";
        String updated =str.toLowerCase();
        StringBuilder sb=new StringBuilder();
        Set<Character>set=new HashSet<>();
        for(char c:updated.toCharArray()){
            if(!set.contains(c) && c !=' '){
                set.add(c);
                sb.append(c);
            }
        }
        System.out.print(sb);

    }
}
