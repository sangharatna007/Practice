package java8.collection;

import java.util.*;
import java.util.stream.Collectors;

public class ConverHashMapToArrayListJava8 {

    public static void main(String[] args) {
        // Createing the HasmMap Objects
        HashMap<String, String> map = new HashMap<String, String>();

        map.put("101", "Test1");
        map.put("102", "Test2");
        map.put("105", "Test5");
        map.put("103", "Test3");
        map.put("104", "Test4");

        // Getting the set of key from hasmp

        Set<String> keySet = map.keySet();

        // Creating the ArrayList of Key and passing it keySet

        /*ArrayList<String> list = new ArrayList<String>(keySet);
        for (String str: list) {
            System.out.println(str);

        }*/

        System.out.println("By Using java 8");
        List<String> listofKey = map.keySet().stream().collect(Collectors.toList());
        listofKey.forEach(System.out::println);


        System.out.println("convert the HashMap Value into Before java 8 ArrayList");

        Collection<String> values = map.values();


            for(String str : map.values())
            {
                System.out.println(str);
            }

        System.out.println("convert the value using java 8");

            List<String> listofValues = map.values().stream().collect(Collectors.toList());
            listofValues.forEach(System.out::println);

    }


}


/*How to conver HashMap to ArrayList ?
*
* There are three way to convert Hashmap to arrayList
* 1.    HashMap key into ArrayList
* 2.    HashMap Values into ArrayList
* 3.    HashMap Key-Values into ArrayList
*
* */