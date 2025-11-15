import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondHighestNumberWithoutusingStream {
    public static void main(String[] args) {
       List<Integer>list=Arrays.asList(5,4,6,3,2,1,9);
       int first=Integer.MIN_VALUE;
       int second =Integer.MIN_VALUE;
       for(int num :list){
           if(num>first){
               second=first;
               first=num;
           }else if(num >second && num!=first){
               num=second;
           }
       }
       System.out.println(second);

    }
}
