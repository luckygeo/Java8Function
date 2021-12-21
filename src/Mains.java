import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author: i
 * @createDate: 2021/8/5
 * @version: 1.0
 */
public class Mains {
    int head;
    static void chang(String b) {
        b = "c";
    }

    public static void main(String[] args) throws Exception{
        boolean flag = false;
        InetAddress address = InetAddress.getLocalHost();
        try {
            Socket socket = new Socket(address, 8080);  //建立一个Socket连接
            socket.getInetAddress();
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
        }


        final List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        final Optional<Integer> sum = numbers.stream().reduce((a, b) -> a + b);
        sum.ifPresent(System.out::println);

        List<String> stringList = new ArrayList<>();
        stringList.add("hello");
        stringList.add("world");
        //String a = "JFK冷静思考";
        //chang(a);
        // System.out.println(a);
    }
}
