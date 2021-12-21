package collection;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

/**
 * @author: i
 * @createDate: 2021/8/11
 * @version: 1.0
 */
public class CollectionTest {
    private int[] i;

    public static void main(String[] args) {
        CollectionTest ii = new CollectionTest();
        System.out.println(Arrays.toString(ii.i));

        int i = 1000 >>> 1;
        AA<String> deque = new AA();
        List<String> list = new ArrayList<>();
        for(String s : "My dog has fleas".split(" ")){
            deque.push(s);

            list.add(s);
        }
        String peek = deque.peek();
        peek = deque.poll();
        System.out.println(peek);
    }
}
