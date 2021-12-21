import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author: i
 * @createDate: 2021/8/26
 * @version: 1.0
 */
public class Strings {
    public static void main(String[] args) throws Exception{
        List<String> list = new ArrayList();
        list.add("tai");
        list.add("liu");
        list.add(1,"sun");
        for (String arg : list) {
            System.out.println(arg);
        }
//        String s = String.format("^<p[^>]*>[\\s　]*%s[\\s　]*</p>$", "(【%s】)(.*?)");
//        Matcher 材料 = Pattern.compile(String.format("【材料】121212", "材料")).matcher("【材料】121212");
//        System.out.println(s);
        //System.out.println(材料.matches());

    }
}
