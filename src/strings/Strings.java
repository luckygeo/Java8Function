package strings;

import java.util.Arrays;

/**
 * @author: i
 * @createDate: 2021/12/21
 * @version: 1.0
 */
public class Strings {
    // 测试string 相等
    public static String s1 = "abc";
    public static String s1_1 = new String("abc");
    public static String s_2 = "bc";
    public static String s2 = "a" + s_2;

    public static String s3 = "a";
    public static String s4 = s3 + "bc";
    public static String s5 = "a" + "bc";

    public final static String s3_1 = "a";
    public final static String s3_2 = "bc";
    public static String s3_3 = s3_1 + s3_2;


    public static void main(String[] args) {
        System.out.println(s1 == s1_1.intern());




        //因为str1指向的是字符串中的常量，str2是在堆中生成的对象，所以str1==str2返回false。
        System.out.println(s1 == s1_1);//false

        System.out.println(s1 == s1_1.intern()); //true

        //true，因为final变量在编译后会直接替换成对应的值，所以实际上等于s4="a"+"bc"，而这种情况下，编译器会直接合并为s4="abc"，所以最终s1==s4。
        System.out.println(s1 == s3_3); //true

        String stra = new String("str") + new String("01");
        stra.intern();
        String strb = "str01";
        System.out.println(stra == strb);//#7
        String str1 = "str01";
        String str2 = new String("str") + new String("01");
        str2.intern();
        System.out.println(str2 == str1);//#8

        /**************************************************************************/
        String greeting = "Hello";
        //代码点的位置，由于unicode字符65535
        //在unicode的世界中，每种字符都有一个唯一的数字编号，这个数字编号就叫unicode code point。目前code point的数值范围是0~0x10FFFF，也就是一共可以表示1114112种不同的字符。
        //由于code point的数值范围比较尴尬，直接用四字节的long类型来存储太浪费空间，直接用双字节的char类型来存储又存不下。最终有个折衷方案，数值范围较小的code point用一个char存储，数字范围较大的code point用两个char来存储。所以一个char就叫一个code unit，而这种方案就叫utf-16。//
        int cpCount = greeting.codePointCount(0, greeting.length());
        System.out.println(cpCount);

        /********************************   a.compareTo(String other)     ******************************************/

        /*  比较unicode 字典顺序，如果 用 a - other 返回数值，负数（<0）则说明 a位于 other 之前
         *   反之则说明位于之后 ，等于0则相等
         *
         * */

        System.out.println("a".compareTo("d"));// -3


        /********************************   public String(char[] a, int off ,int length)     ******************************************/
        char[] chars = {'h', 'e', 'l', 'l', 'o', 'j', 'a', 'v', 'a'};
        String helloJava = new String(chars);
        //offset 是从第一个字符的下标索引开始的
        String java_ = new String(chars, 5, 4);
        helloJava.intern();
        String hellojava = "hellojava";
        System.out.println(helloJava == hellojava);
        //copyOf

        System.out.println(Arrays.toString(Arrays.copyOf(chars, 2)));


        /********************************   substring(int begin, int end) ******************************************/

        /**
         *  截取字符串 ，从 开始索引到结束的索引
         *
         *  beginIndex   the beginning index, inclusive.包含开始索引，
         *
         *  the ending index, exclusive  不包含结束索引
         *
         *  例如hello　0-h-1-e-2-l-3-l-4-o
         *
         *
         *
         */
        String th = "let's begin";
        //System.out.println(th.charAt('b'));
        char[] chars1 = new char[10];
        th.getChars(0, 3, chars, 0);
        System.out.println(Arrays.toString(chars1));
        System.out.println(th.substring(2, 6).length());

        /********************************   valueOf 和toString 和（String） obj  ********************************/
        Integer obj = new Integer(100);
        //String strVal = (String)obj; 错误代码
        String nulls = (String) null;
        System.out.println(nulls);
    }
}
