import java.util.Arrays;
import java.util.List;

public class RemoveDublicateArrayElementUsingStream {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(0,0,1,1,2,2,3,3,5,5,8,8,7,7);
        List<Integer> dublicate=list.stream().distinct().toList();
        System.out.print(dublicate);

    }
}
