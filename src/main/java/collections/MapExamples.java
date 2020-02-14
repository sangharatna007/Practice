package collections;
import java.util.HashMap;
import java.util.Map;

public class MapExamples {

    public static void main(String[] args) {
        Map<String, Integer> prices = new HashMap<>();
        System.out.println("Prices map: " + prices);

        // Integer::sum(a,b) is perfect two-argument
        // function (BiFunction)
        prices.merge("fruits", 3, Integer::sum);
        prices.merge("fruits", 5, Integer::sum);
        System.out.println("Prices map: " + prices);

        // null removes mapping for the key:
        prices.merge("fruits", 7, (oldVal, newVal) -> {
            System.out.printf("Old val: %d, new val: %d%n",
                    oldVal, newVal);
            return null;
        });
        System.out.println("Prices map: " + prices);

        prices.put("veggies", null);
        System.out.println("Prices map: " + prices);
        // No need to handle initial null value:
        prices.merge("veggies", 42, Integer::sum);
        System.out.println("Prices map: " + prices);
    }
}