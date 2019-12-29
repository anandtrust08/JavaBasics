import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class StaticTest {
    public static void main(String[] args) {

        List<Integer> values = Arrays.asList(1,2,3,4,5,6);
        Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer o) {
                System.out.println("value is "+ o);
            }
        };

        values.forEach(consumer);
    }
}
