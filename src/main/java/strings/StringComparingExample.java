package strings;

public class StringComparingExample {

    public static void main(String[] args) {

        String s1 = "XYZ";
        String s2 = "xyz";
        String s3 = new String("XYZ");
        String s4 = new String("XYZ");

        String s5 = "XYZ";

        System.out.println(s1.equals(s2) + "using equals method");
        System.out.println(s1 == s2 + "Using Operator");
        System.out.println(s3 == s4 + "Using == Operator");
        System.out.println(s3.equals(s4) + "Using equal method for object");
        System.out.println(s1==s5);

        s1.concat(s5);
        System.out.println(s1);
    }
}
