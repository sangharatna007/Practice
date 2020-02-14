package collections.list;

import java.util.ArrayList;
import java.util.List;

public class TestingList {
    public static void main(String[] args) {
        List<Object> nameList = new ArrayList<>();
        String firstName = "Look";
        String secondName = "Hyper";
        Object thirdName = "Mike";
        nameList.add(firstName);
        nameList.add(secondName);
        nameList.add(thirdName);


        System.out.println(nameList.size());
        System.out.println(nameList.get(0));
    }
}
