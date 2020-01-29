package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateFromArr {
    public static void main(String[] args) {
//        int intArray[] = {2,3,2,4,2,4};

        List<Integer> arrayList = Arrays.asList(2,3,2,4,2,4);
        System.out.println(arrayList.stream().distinct().collect(Collectors.toList()));
        System.out.println(arrayList + "ArrayList");



    }
}
