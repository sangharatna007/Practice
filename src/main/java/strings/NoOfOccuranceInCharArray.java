package strings;

import java.util.HashMap;
import java.util.Hashtable;

public class NoOfOccuranceInCharArray {
    public static void main(String[] args) {
        charCountArray("Java J2EE Java JSP J2EE");
    }

    private static void charCountArray(String java_j2EE_java_jsp_j2EE) {
        HashMap<Character, Integer> storeArray = new HashMap<>();

        // Convert Sting into

        char charArray[] = java_j2EE_java_jsp_j2EE.toCharArray();

        for(char c : charArray)
        {
            if(storeArray.containsKey(c))
            {
                storeArray.put(c, storeArray.get(c) +1);
            }
            else {
                storeArray.put(c, 1);
            }
        }
        System.out.println(java_j2EE_java_jsp_j2EE + ": " + storeArray);
    }
}
