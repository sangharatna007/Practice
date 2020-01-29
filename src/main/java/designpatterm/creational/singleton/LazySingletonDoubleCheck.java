package designpatterm.creational.singleton;

public class LazySingletonDoubleCheck {
    private static volatile LazySingletonDoubleCheck instance = null;

    private LazySingletonDoubleCheck(){

    }

    public static LazySingletonDoubleCheck getInstance(){
        if(instance == null)
        {
            synchronized (LazySingletonDoubleCheck.class){
                if(instance == null)
                    instance = new LazySingletonDoubleCheck();

            }
        }
        return instance;
    }
}
