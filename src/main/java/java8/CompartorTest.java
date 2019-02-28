package java8;

import java.util.*;

public class CompartorTest {

    public static void main(String[] args) {

        List<Developer>  getDevsList = getAllDeveloperList();

        // Before Sorting the list
        System.out.println("Before sorting the list");
        for(Developer developer: getDevsList)
        {
            System.out.println(developer);
        }


        // Aftar sorting the list
//        Collections.sort(getDevsList, new Comparator<Developer>() {
//            @Override
//            public int compare(Developer o1, Developer o2) {
//                return o1.getId() - o2.getId();
//            }
//        });

        Collections.sort(getDevsList, new Comparator<Developer>() {
            @Override
            public int compare(Developer o1, Developer o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

//        System.out.println("After sorting the list");
//        for(Developer developer: getDevsList)
//        {
//            System.out.println(developer);
//        }


        // Java 8 Lambada expression

        getDevsList.sort((Developer d1, Developer d2)->d1.getId()-d2.getId());

        getDevsList.forEach((developer -> System.out.println(developer)));
    }

    public static List<Developer> getAllDeveloperList()
    {
        List<Developer> list = new ArrayList<>();

        list.add(new Developer(101, "Test"));
        list.add(new Developer(105, "Test5"));
        list.add(new Developer(102, "Test2"));
        list.add(new Developer(104, "Test3"));

        return list;

    }

}

