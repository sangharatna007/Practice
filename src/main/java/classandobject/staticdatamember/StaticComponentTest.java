package classandobject.staticdatamember;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

class StaticComponent{
    static int staticinteger;
    int non_static;
    static {
        System.out.println("Static Component SIB");
        staticinteger=0;
    }
    static void staticMethod()
    {
        System.out.println("This is the static method can't allow non static");
        System.out.println(staticinteger);
    }

    {
        non_static = 30;
    }
}
public class StaticComponentTest {

    static {
        System.out.println("Main Class SIB ");
    }

    public static void main(String[] args) {
        System.out.println(StaticComponent.staticinteger);
//        StaticComponent.staticMethod();
    }


}
