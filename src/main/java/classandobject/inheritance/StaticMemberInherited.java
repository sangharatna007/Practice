package classandobject.inheritance;

class Test{
    static int i = 40;
    static void method(){
        System.out.println("static method");
    }
}

class Test2 extends Test{

}
public class StaticMemberInherited {
    public static void main(String[] args) {
        Test2.method();
        System.out.println(Test2.i);
    }
}
