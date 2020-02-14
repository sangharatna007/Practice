package exception;

public class Exception {
    public static void main(String[] args) {
        try{
            int a[]=new int[1];
            a[1]=30/0;
            a[2]=50;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception 2");
        }
        catch ( java.lang.Exception e){
            System.out.println("Exception");
        }

    }
}
