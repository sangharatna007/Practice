package prblem;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
        int intArray[] = {4,2,4,3,2,5,4,2};
        Set<Integer> set = new HashSet<Integer>();
        Set<Integer> linkedSet = new LinkedHashSet<Integer>();
        for(int i =0 ; i < intArray.length; i++)
        {
            set.add(intArray[i]);
            linkedSet.add(intArray[i]);
        }
        System.out.println(set + "This is sorted Set");
        System.out.println("This is the Linked HashSet" + linkedSet);

    }
}
