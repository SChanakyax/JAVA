package week5;

class Student {
    void hello() {
        System.out.println("Heloo ");
    }
}

public class Test2 {

    public static void main(String[] args) {
        Student std = new Student(); //std is a reference variable
        std.hello();
    }
}
