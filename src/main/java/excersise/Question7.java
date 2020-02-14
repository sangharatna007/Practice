package excersise;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Question7 {
    public static void main(String[] args) {
        List<Object> lo = new ArrayList<>();
        List<?> al = new ArrayList<>();
        lo.add("");
//        al.add("");
        System.out.println(lo);
        System.out.println(al);

        Random random = new Random();
        random.ints().limit(15).sorted().forEach(System.out::println);
//         String str = str.( String tesxt)->{
//            System.out.println("Welcome");
//        };
    }
}
