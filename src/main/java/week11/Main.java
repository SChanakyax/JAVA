package week11;

/**
 * @Author Sandeep Chanakya
 * Generics and Collections
 * Object class is the parent class of all the classes in java by default
 * Java.lang.object is the super class- Every class you create implicitly inherited by java.lang.Object class (implicit -without the programmer's interference)
 * no need to use extend for java.lang.Object
 * Modifiers - accessModifiers(private,public,protected) and non access modifiers(stictfp, final,abstract)
 * Default access (Class Vehicle) can be accessed by classes in same package
 * <p>
 * public -  class can be accessed from any other class regardless the package. Only one public class in the source file.
 * abstract - class cannot be instantiated directly and intended to be subclass only,all abstract methods should be implemented by subclasses
 * final class- class cannot be subclassed, prevent inheritance
 * static - class is nested with another class no required an instance to access
 * strictfp - (strict floating point) enforce strict floating point precision standards
 * protected/private cannot be used for classes(public/protected -for class)
 * <p>
 * Class Access(1.create an instance 2.Access certain methods and variables 3.extend classes
 * <p>
 * Access Modifiers
 * Public -
 * Protected -within the package + subclasses
 * Private
 * Default - within the package
 * <p>
 * Access (How?)
 * 1.One class can access a member of another class (Class:SportsCar->goFast(){}) (Class:Convertible->SportsCar sc = new SportsCar(); sc.goFast())(
 * 2.One class can inherit a member of its super class (superclass->goFast(),doFast(), (subclass->goFast())
 * 3.Invoke methods declared in the same class
 * <p>
 * Protected member can be accessed through inheritance by a subclass even if the subclass is in a different package (protected = package + children)
 * <p>
 * Access  modifiers cannot be assigned to local variables it will give errors
 * <p>
 * Visisbility             public protected Default Private
 * From the same class      Yes      Yes      Yes       Yes
 * From Any class(same packge) yes   yes      yes         No
 * From subclass(same package) Yes   Yes      Yes       No
 * From subclass(outside package)Yes Yes(inheritance)  No  No
 * From any nonsubcls outside the pkg Yes No No No
 * <p>
 * Reference variables can be declared as static variables (ex:- Car mycar)
 * <p>
 * Instance variables - declared inside the class outside the method when class get instantiated they get initialized.
 * Local variables - declared within the method , should be initialized before using and instace variables no need to initialize
 * <p>
 * Method - Overloading - Reuse the same method name
 * -must change the argument list,
 * -can change return type,
 * -can change the access modifiers,
 * -can declare new or broader checked exceptions
 */

public class Main {

}

class MyClass {
    public int beta; //public access
    int gamma; //default access
    private int alpha; //private access

    int getAlpha() {
        return alpha;
    }

    void setAlpha(int a) {
        alpha = a;
    }

}


class AccessDemo {
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        obj.setAlpha(-99);

        System.out.println("ob.alpha is : " + obj.getAlpha());

        //obj.alpha = 10; private
        obj.beta = 888;
        obj.gamma = 99;


    }
}

/*
out put will be -99
    alpha is a private variable but set alpha is a default access
    getAlpha is also a default method
    default methods can be access in the same package

obj.beta is a public variable and can assign values easily
obj.gamma is a default access variable can assign values

MyClass is also a default class so objects can be created.
 */