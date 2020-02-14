package designpatterm.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {
    public static class ModelType{
        public static final String MOVIE = "movie";
        public static final String ALBUM = "album";
        public static final String SHOW = "show";
    }
    private static Map<String, PrototypeCapable> map = new HashMap<>();

    static {
        map.put(ModelType.MOVIE, new Movie());
        map.put(ModelType.ALBUM, new Album());
        map.put(ModelType.SHOW, new Show());
    }

    public static PrototypeCapable getInstance(final String s) throws CloneNotSupportedException{
        return( (PrototypeCapable) map.get(s)).clone();
    }
}
