import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;

public class PathTest {


    static String   getString (){
        return "hello";
    }
    static String   s (){
        try {
            return getString();
        }finally {
            System.out.println("uiu");
        }

    }

    public static void main(String[] args){
        Optional.ofNullable(null).orElseThrow(() -> new RuntimeException("good"));


        System.out.println(5 << 6);
        String s = s();
        System.out.println("s");
//        String getUrl = "http://git.bcbook.cn/users/sign_in";
//        URL url = new URL(getUrl);
//        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//        conn.setConnectTimeout(30000);
//        conn.setRequestMethod("POST");
//        conn.setRequestProperty("date", "google");
//        conn.setRequestProperty("auth", "123456879");
//        conn.getResponseMessage();
//
//
//        String a = "h";
//        String b = a + "i";
//
//        String c = "hi";
//        Thread.sleep(1000);
//        System.out.println(b == c);
//        Path path = Paths.get("temp");
//        System.out.println(path.getFileName());
    }
}
