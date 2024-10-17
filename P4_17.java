/* Create a class with a method that prints "This is parent
class" and its subclass with another method that prints "This
is child class". Now, create an object for each of the
class and call 1 - method of parent class by object of parent*/

class Parent {
    void parentDisply()
    {
        System.out.println("This is parent class");
    }    
}

class Child extends Parent {
    void childDisply()
    {
        System.out.println("This is child class");
    }    
}

public class P4_17 {
    public static void main(String[] args) {
        Parent per = new Parent();
        per.parentDisply();
        Child ch = new Child();
        ch.childDisply();
    }
}
