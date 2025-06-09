import java.io.InvalidClassException;

public class Main {

    public static void greet(){
        System.out.println("Hello, world!");
    }

    public static void greet(String name){
        System.out.println("Hello, " + name + "!");
    }

    public static void greet(String name, int age){
        System.out.println(name + "나이 : " + age);
    }



    public static void main(String[] args) {
        greet();
        greet("Alice");
        greet("Alice", 25);
    }
}
