package week11;

/**
 * Variable Shadowing
 * <p>
 * Its possible to declare local variable with the same name as an instance variable which is known as variable shadowing
 */
public class Shadowing {
    public static void main(String[] args) {
        TestServer t = new TestServer();
        t.logIn();
        t.count();
    }

}

class TestServer {
    int count = 9;

    public void logIn() {
        int count = 10;
        System.out.println(count);
    }

    public void count() {
        System.out.println("count: " + count);
    }
}
