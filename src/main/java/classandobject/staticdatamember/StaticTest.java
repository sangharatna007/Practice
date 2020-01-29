package classandobject.staticdatamember;

public class StaticTest {
    static int a = 50;
    static {
        System.out.println("first block");
        a=50;
    }
    static {
        a=50;
        System.out.println("Second block");
    }

    public static void main(String[] args) {
        System.out.println(a);
    }
}
