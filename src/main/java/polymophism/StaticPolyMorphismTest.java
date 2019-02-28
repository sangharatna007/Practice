package polymophism;

public class StaticPolyMorphismTest {

    public static void main(String[] args) {

        A a = new A();

        A t = new B();

        B b = new B();

        ((B) t).method2();


        // Parent class can not access the direct child object. if we want to access the child class object need to cast the object into child objet than we can use


    }


}
