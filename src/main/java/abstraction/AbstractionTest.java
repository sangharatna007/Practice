package abstraction;

public class AbstractionTest extends Abstactclass {
    @Override
    void method() {
        System.out.println("this is abstract method");
    }

    public static void main(String[] args) {
        AbstractionTest test = new AbstractionTest();

        test.method();
    }
}
