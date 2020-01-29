package classandobject.inheritance;

class  A{
    int i = 10;
    static{
        System.out.println("SIB is here");
    }
    {
        System.out.println("Non SIB is here");
    }

    A(){
        System.out.println("Constructor init");
    }
}
class B extends A {
}
public class MainclassIn {
    public static void main(String[] args) {
        B b = new B();
    }
}
