package strings;

public class ReverseStringInJava {
    public static void main(String[] args) {
        // 1.  String Buffer Class 2. Iterative Method 3. Recursive
        StringBuffer reverse = new StringBuffer("Sangharatna");
        System.out.println("Using reverse method" +  reverse.reverse());

        String string = "Sangharatna";
        char stringArray[] = string.toCharArray();
        for(int i = stringArray.length -1 ; i >= 0; i--)
        {
            System.out.println("Using iterative method" + stringArray[i]);
        }


    }
    static String recursiveMethod(String str) {
        if ((null == str) || (str.length() <= 1)) {
            return str;
        }

        return recursiveMethod(str.substring(1)) + str.charAt(0);
    }
}
