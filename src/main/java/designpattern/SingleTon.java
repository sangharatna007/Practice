package designpattern;

public class SingleTon {

    private static SingleTon instance = new SingleTon();

    // creting the private
    private SingleTon()
    {

    }

    // static factory method
    public static SingleTon getInstance()
    {
        if(instance == null)
        {
            instance = new SingleTon();
        }
        return instance;
    }
}
