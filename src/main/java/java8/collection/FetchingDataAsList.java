package java8.collection;


import java.util.ArrayList;
import java.util.List;
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
public class FetchingDataAsList {

    public static void main(String[] args) {
        List<Test> testList = new ArrayList<>();

        // Add into list
        testList.add(new Test(101, "Sangha", "IT"));
        testList.add(new Test(102, "Rangha", "HR"));
        testList.add(new Test(103, "Pangha", "TEST"));
        testList.add(new Test(104, "Langha", "IT"));

        // Fetching the Data from the list

        List<String> names = testList.stream()
                .map(n->n.name)
                .collect(Collectors.toList());


    }
}
