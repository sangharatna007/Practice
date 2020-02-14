package collections;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        map.put(1, "test1");
        map.put(2, "test1");
        map.put(3, "test1");
        map.put(1, "test2");

        map.forEach((k, v) -> System.out.println("Key is :" + k +"Value is:"+v));
    }
}
