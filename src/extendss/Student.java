package extendss;

/**
 * @author: i
 * @createDate: 2021/9/17
 * @version: 1.0
 */
public class Student extends Person {
    private String name = "student";

    public Student() {
        move();
    }

    @Override
    public void move(){
        System.out.println(name);
    }
}
