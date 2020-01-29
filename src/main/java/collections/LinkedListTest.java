package collections;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Long> list = new LinkedList<>();
        for(long i = 0l; i < 36000; i ++)
        {
            list.add(i);
        }
        
        for(int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    }


}
