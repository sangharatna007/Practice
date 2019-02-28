package polymophism;

class SuperClass
{
    public void superClassMethod()
    {
        System.out.println("this is call from super class");
    }
}

class ChildClass extends SuperClass
{
    public void superClassMethod()
    {
        System.out.println("this is call form child class");
    }
}

public class DyanamicPolyMorphism {


    public static void main(String[] args) {



        SuperClass superClass = new SuperClass();

        ChildClass child = new ChildClass();

        child.superClassMethod();

        superClass.superClassMethod();
    }
}
