package excersise;

import quetion.Interface2;

import java.util.HashSet;
import java.util.Set;

public class Question6 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Integer itr = 40;
        Integer itr2 = 50;
        set.add(itr);
        set.add(itr);
        set.add(itr2);
        set.remove(itr);
        itr2 = 47;
        set.remove(itr2);
        System.out.println(set.size());
        System.out.println(set);


    }
}
