import java.util.Arrays;
import java.util.List;

public class ThirdHighestWithoutStream {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(2,5,8,9,7,6,66,22);
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        int third =Integer.MIN_VALUE;
        for(int num :list){
            if(num>first){
              third=second;
              second=first;
              first=num;
            } else if (num > second && num !=first) {
                third=second ;
                second=num;

            }else if (num >third && num !=second && num!=first){
                third=num;
            }
        }
        System.out.print("First Hightest : " +first);
        System.out.print("Second Highest : " +second);
        System.out.print("Third Highest : " +third);
    }
}
