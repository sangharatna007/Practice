package Exception;

public class ExceptinonWithTryCatch {

    public static void main(String[] args) {

        method1();
        System.out.println(method1());

    }

    private static int method1() {

        try{
            return 1;

        }catch (Exception ex)
        {
            return 2;
        }
        finally {
            return 3;
        }
    }
}
