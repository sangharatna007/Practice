package classandobject.abstraction;

public class TestingAbsrtractClass extends TestAbstreact {
    public void abstreactMethod() {
        System.out.println("Need to implementation");
    }

    public void abstreactMethod1() {
        System.out.println("This is the implementation of the abstract Method");
    }

    public static void main(String[] args) {
        TestingAbsrtractClass absrtractClass = new TestingAbsrtractClass();
        absrtractClass.abstreactMethod();
        absrtractClass.abstreactMethod1();
        absrtractClass.method();
    }
}
