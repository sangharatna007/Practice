package PolyMorphism;

class Human{

    public static void method1()
    {
        System.out.println("Human method");

    }
}

class Child extends Human{
    public static void method1()
    {
        System.out.println("Child method");
    }
}

public class StaticBinding {
    public static void main(String[] args) {

        Child test = new Child();
        Human test2 = new Child();
        Human test3 = new Human();
        test.method1();
        test2.method1();
        test3.method1();

    }
}
