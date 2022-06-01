package lambda.lambda5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        fillList(list);
        System.out.println(list);

        /*
        for(int i = 0 ; i < 10 ; i++){
            list.set(i, list.get(i) * 2);
        }
        System.out.println(list);
         */

        //map
        //list = list.stream().map(a -> a * 2).collect(Collectors.toList());

        // list = list.stream().map(a -> 3).collect(Collectors.toList());

        //filter
        list = list.stream().filter(a -> a % 2 == 0).collect(Collectors.toList());

        System.out.println(list);

        list.stream().forEach(System.out::println);

        // reduce
        int sum = list.stream().reduce((acc,b) -> acc +b).get();
        System.out.println(sum);
    }

    private static void fillList(List<Integer> list){
        for(int i = 0 ; i < 10 ; i++)
            list.add(i + 1);
    }


}
