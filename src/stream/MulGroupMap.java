package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author: i
 * @createDate: 2021/8/13
 * @version: 1.0
 */
public class MulGroupMap {
    public static void main(String[] args) throws Exception{
        List<Grade> bookRes = new ArrayList() {{
            add(new Grade("01", "1", "1"));
            add(new Grade("01", "5", "1"));
            add(new Grade("01", "1", "2"));
            add(new Grade("02", "1", "1"));
            add(new Grade("02", "2", "2"));
            add(new Grade("03", "1", "2"));
            add(new Grade("02", "1", "2"));
            add(new Grade("02", "2", "1"));
            add(new Grade("02", "4", "1"));
        }};
        Function<Grade, String> getGrade = Grade::getGrade;
        Map<String, Map<String, List<Grade>>> collect = bookRes.stream().collect(Collectors.groupingBy(Grade::getGrade, Collectors.groupingBy(Grade::getSubject)));
        Map<String, List<Grade>> collect1 = bookRes.stream().collect(Collectors.groupingBy(Grade::getGrade));
        System.out.println(collect1.toString());
    }
}
