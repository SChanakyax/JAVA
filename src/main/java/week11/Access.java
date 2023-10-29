package week11;

public class Access {

}

class Zoo {
    public String coolMethod() {
        return "wow baby";
    }
}

class Moo {
    public void useZoo() {
        Zoo z = new Zoo();

        System.out.println("A zoo says " + z.coolMethod());
    }
}
