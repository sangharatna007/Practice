package classandobject.staticdatamember;

import java.util.concurrent.Callable;

public class ConstructorTest {

   private ConstructorTest(){
        System.out.println("Default Constructor call");
    }

    ConstructorTest(String string)
    {
        System.out.println("this is String define constructor");
    }


    void ConstructorTest(){
        System.out.println("this not consider as Constructor");
    }

    public static void main(String[] args) {

       ConstructorTest test = new ConstructorTest();
        System.out.println(test);
        test.ConstructorTest();
        ConstructorTest constructorTest = new ConstructorTest("Test");
        constructorTest.ConstructorTest();

    }

}
