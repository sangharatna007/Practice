package excersise;








import java.io.*;

public class Question12 implements Serializable {
    private Tree tree = new Tree();
    public static void main(String[] args) {
        Question12 question12 = new Question12();
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("forest.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(objectOutputStream);
            objectOutputStream.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }

    }
}
class Tree {}