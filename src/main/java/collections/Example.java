package collections;

import java.util.HashMap;

public class Example {

    public static void main(String[] args) {


        String name1="nishant";
        String name2 = new String();
        name2 = "nishant";

        System.out.println(name1.hashCode());
        System.out.println(name2.hashCode());

        System.out.println(name1.equals(name2));

        HashMap<Integer,String> hmap = new HashMap<>();
        hmap.put(1,"hadapsar");

        HashMap<Integer,String> hmap2 = new HashMap<>();
        hmap.put(1,"hadapsar");
        System.out.println(hmap.hashCode());
        System.out.println(hmap2.hashCode());

        System.out.println(hmap.equals(hmap2));
    }
}
