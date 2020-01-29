package classandobject.inheritance;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

class BT{
    {
        System.out.println(1);
    }
}
class BTR extends BT{
    {
        System.out.println(2);
    }
}

class BTB extends BTR{
    {
        System.out.println(3);
    }
}
public class Quiz2 {
    public static void main(String[] args) {
        BT btb = new BT();
    }
}
