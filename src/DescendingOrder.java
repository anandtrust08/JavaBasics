import java.util.*;

public class DescendingOrder {
    public static void main(String[] args) {

        System.out.println(DescendingOrder.arrangeDesc(21445));
    }


    public static int arrangeDesc(int num) {

        // int number = num;

        List<Integer> numbers = new LinkedList<>();

        for(int i = num; i > 0 ; i /=10){
           // System.out.println(i + ":: modulo ->" + (i % 10));
            numbers.add(i%10);


        }
        System.out.println("Ascending Order");
        numbers.stream().sorted().forEach(System.out::println);
        System.out.println("Ascending Order");
      // return Integer.valueOf(numbers.stream().sorted(Comparator.reverseOrder()).forEach(i -> ););//.forEach(i -> i. +=i));)
      return  Integer.valueOf(Arrays.toString(numbers.toArray()));


    }

}