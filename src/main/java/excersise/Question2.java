package excersise;
class Parent11{
    Parent11(int i){
        System.out.println("Parent");
    }
}
public class Question2 extends Parent11 {
    Question2(){
        System.out.println("Child");
    }

    public static void main(String[] args) {
        Parent11 p = new Question2();
    }

}
