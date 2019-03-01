package java8.stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingTheElement {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Sandip", "Randeep", "Santosh", "test1" , "Sandip", "Randeep");

        Map<String, Long> map = names.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(map);

//        HashMap<String, String> map = new HashMap<>();

    }
}
