import java.util.*;

public class RemoveDublicateArrayElementWithoutStream {
    public static void main(String[] args) {
    List<Integer>list= Arrays.asList(1,1,4,5,8,7,9,9);
    Set<Integer>set =new HashSet<>(list);
    List<Integer>distinct=new ArrayList<>(set);
    System.out.print(distinct);
    }

    }

