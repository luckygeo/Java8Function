package annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

/**
 * @author: i
 * @createDate: 2021/7/9
 * @version: 1.0
 */
public class AnnotationTest {
    public static void main(String[] args) {

        int j = 1 ^ 2;

        int k = 3 ^ 2;
        System.out.println(j);
        System.out.println(k);
        //----|01
        //----|10
        //----|
        //----|
        //----|
//        Auth auth = new Auth();
//        AnnotatedElement annotatedElement = Auth.class;
//        Annotation[] is = annotatedElement.getAnnotations();
//        Annotation guest = annotatedElement.getAnnotation(Guest.class);
//        Guest annotation = annotatedElement.getAnnotation(Guest.class);
//
//
//        System.out.println(annotation.is());
//        for (Annotation i : is) {
//            Class aClass = i.annotationType();
//
//            //aClass.getDeclaredMethod("is");
//            if (aClass.equals(Guest.class)) {
//                System.out.println("guest");
//            }
//            System.out.println(i.toString());
//        }
    }
}
