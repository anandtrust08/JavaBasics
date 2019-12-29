import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LineNumbering {

    public static void main(String[] args) {

        List<String> input = Arrays.asList("a", "b", "c");
        List<String> input1 = Arrays.asList();
        List<String> output = LineNumberingCalculate.number(input);
        System.out.println(output);
    }


}





 class LineNumberingCalculate {
    public static List<String> number(List<String> lines) {
        System.out.println(lines.size());
        List<String> output = new ArrayList<>();
      for (int i = 0; i < lines.size(); i++){

          System.out.println(lines.get(i));
          String temp = (i+1) + ":" + lines.get(i);
          output.add(temp);
          System.out.println(temp);
            //output.add(i + ":" + lines.get(i));
        }

        return output;
    }
}