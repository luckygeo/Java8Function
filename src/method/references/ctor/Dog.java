package method.references.ctor;


public class Dog {
    String name;
    //未知
    int age = -1;

    public Dog() {
        name = "cat";
    }

    public Dog(String name) {
        this.name = name;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return "Name: " + name + "," + "age: " + age;
    }
}
