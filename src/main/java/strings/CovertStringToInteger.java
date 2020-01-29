package strings;

public class CovertStringToInteger {

    public static void main(String[] args) {
        String string = "2019";

        int test = 2020;

        int intString = Integer.valueOf(string);
        System.out.println(intString);

        String testString = String.valueOf(test);

        String inStr = Integer.toString(test);

        System.out.println(inStr);

        System.out.println(testString);
    }
}
