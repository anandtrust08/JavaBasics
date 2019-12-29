import com.sun.security.jgss.GSSUtil;

import java.util.*;

public class CalcuateFrequency {
    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(1);
        input.add(2);
        input.add(3);
        input.add(1);
        input.add(3);
        input.add(3);
        input.add(3);
        input.add(5);
        input.add(5);
        input.add(5);

        //Arrays.asList(1, 2, 1, 2, 3, 1, 2, 4, 5);
        int limit = 2;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < input.size(); i++) {

            if (hashMap.containsKey(input.get(i))) {

                hashMap.put(input.get(i), hashMap.get(input.get(i)) + 1);
               //int freq =  hashMap.get(input.get(i)) + 1 ;
                //System.out.println(freq);




            } else {
                hashMap.put(input.get(i), 1);
            }

        }
       // System.out.println(hashMap);
hashMap.entrySet().removeIf(i -> i.getValue() <= limit);

        for(Map.Entry entry: hashMap.entrySet()){

            int iterations = (int)entry.getValue() - limit;
            //System.out.println("lastIndex: "+ lastIndex+ "value: "+ entry.getKey()+ "iterations: "+ iterations);
            while (iterations != 0){
                int lastIndex = input.lastIndexOf((int)entry.getKey());
                input.remove(lastIndex);
                iterations -= 1;
            }



        }

//input.remove(input.lastIndexOf(1));
      //  System.out.println("last index of 1: " + lastIndex);






        System.out.println(hashMap);
        System.out.println(input);
    }
}