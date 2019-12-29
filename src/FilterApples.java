import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterApples {

    public static void main(String[] args) {


        List<Apple> inventory = Arrays.asList(new Apple(120,"red"), new Apple(160,"green"));

        List<Apple> heavyApples = FilterApples.filterApples(inventory, new AppleWeightPredicate());

        heavyApples.forEach(i -> System.out.println("heavy apple"+i.getColor() + i.getWeight()));

        List<Apple> redApples = FilterApples.filterApples(inventory, new AppleColorPredicate());

        redApples.forEach(i -> System.out.println("Color: "+ i.getWeight()));



    }


    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate p){

        List<Apple> result = new ArrayList<>();

        for (Apple apple: inventory){
            if (p.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }
}
