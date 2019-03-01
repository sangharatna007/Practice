package java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Test{
    int id;
    String name;
    String dept;

    public Test(int id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }
}
public class CollectDataAsSet {

    public static void main(String[] args) {
        List<Test> testList = new ArrayList<>();

        // Add into list
        testList.add(new Test(101, "Sangha", "IT"));
        testList.add(new Test(102, "Rangha", "HR"));
        testList.add(new Test(103, "Pangha", "TEST"));
        testList.add(new Test(104, "Langha", "IT"));

        // collecting data as set

        Set<Test> set = testList.stream().filter(t->t.id > 101).collect(Collectors.toSet());

        for (Test test: set) {

            System.out.println(test.id + " " + test.dept + " "+ test.name);
        }
    }

    }
