package classandobject.staticdatamember;

import java.util.concurrent.Callable;

class NonStaticComp{
    int nonStaticComponent ;
    static int staticComponent ;
    static {
        staticComponent =20;
    }

    {
        System.out.println("This is non static component");
        nonStaticComponent = 35;
    }

    public static void method1()
    {
        System.out.println("Static method can allow static member only");
        System.out.println(staticComponent);
    }

    public void method2(){
        System.out.println("Non static can allow for both");
        System.out.println(staticComponent);
        System.out.println(nonStaticComponent);
    }
}
public class NonStaticComponent {
    {
        System.out.println("This Non static Component");
    }
    public static void main(String[] args) {
        System.out.println(NonStaticComp.staticComponent);
        NonStaticComp.method1();

        System.out.println(" Non static component need to create the object of the class and use the not static member");
        NonStaticComp comp = new NonStaticComp();
        System.out.println(comp.nonStaticComponent);
        comp.method2();
    }
}
