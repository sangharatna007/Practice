package quetion;

public interface Interface1 {

    void abstractMethod1();
    default void method1(){
        System.out.println("Interface1 default method");
    }
}
