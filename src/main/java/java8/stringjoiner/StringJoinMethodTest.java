package java8.stringjoiner;

import java.util.ArrayList;
import java.util.List;

public class StringJoinMethodTest {
    public static void main(String[] args) {

        List<String> string = new ArrayList<>();
        string.add("Test1");
        string.add("Test2");
        string.add("Test3");
        string.add("Test4");
        String joining = String.join("|", "Test1", "Test2", "Test3");
        System.out.println(joining);
        String joinedString = String.join("|", string);
        System.out.println(joinedString);
    }
}
