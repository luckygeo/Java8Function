package hash;

import java.util.Hashtable;
import java.util.Map;

public class HashUse {
    public static void main(String[] args) {
        Integer a = 10000;
        Integer b = 10000;
        Map map = new Hashtable();
        map.put("null", null);
        map.put(a, a);
        map.put(b, 90900);
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(a.equals(b));


    }
}
