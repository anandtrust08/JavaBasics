import java.util.Arrays;
import java.util.List;

public class ListToNumber {
    public static void main(String[] args) {
        List<Integer> digits = Arrays.asList(2,3);
        int number = 0;
        for (int i = 0; i < digits.size(); i++ ) {
            System.out.println("val: " +digits.get(i));
            System.out.println("power: "+Math.pow(10,digits.size()-1 - i));

            number += (digits.get(i))* (Math.pow(10,digits.size() -1 - i));

        }


        System.out.println("output number: "+number);

    }
}
