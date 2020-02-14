package java8.stringjoiner;


import java.util.StringJoiner;
public class StringJoinerDelimeterPreSuffix {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(",", "[", "]");
        joiner.add("FB");
        joiner.add("TW");
        joiner.add("YT");
        joiner.add("WP");
        System.out.println(joiner);
    }
}
