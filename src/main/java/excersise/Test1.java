package excersise;
class Parent{
    static void check(){
        System.out.println("Parent");
    }
}
class Child extends Parent{
    static void test(){
        System.out.println("Child");
    }
}
public class Test1 {
    public static void main(String[] args) {
        Parent parent = new Child();
        ((Child)parent).test();
        Child child = new Child();
        child.test();
    }
}
