package exception;

public class TestException {


    public static void main(String[] args) {
        method();
    }

    private static void method() {
        throw new RuntimeException();
    }
}
