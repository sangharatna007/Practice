package classandobject.inheritance;
class TestIn{
    int i = 202;
}
class TestIn2 extends TestIn
{
    int i = 505;
}
public class Quiz1 {

    public static void main(String[] args) {
        TestIn test = new TestIn2();
        System.out.println(test.i);
    }
}
