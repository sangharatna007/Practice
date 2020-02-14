package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

public class mapTesting {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>(17, 1);
//        Map<Integer, String> map = new LinkedHashMap<>();

        map.put(1, null);
        map.put(2, "STring");
        map.put(3, "Hadap");
        map.put(4, "mager");
        map.put(1, "mager22");
        map.forEach((k,v)-> System.out.println("key :" + k + "   value :" + v));
    }
}
