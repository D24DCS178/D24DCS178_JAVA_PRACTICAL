/*Write a program to create thread which display "Hello
World" message. A. by extending Thread class B. by using
Runnable interface */

class A extends Thread {
    @Override
    public void run()
    {
        System.out.println("Hello World using thread class");
    }
}

class B implements Runnable {
    @Override
    public void run()
    {
        System.out.println("Hello World using runnable interface");
    }
}

public class P7_32 {
    public static void main(String[] args) {
        A obj = new A();
        obj.start();

        B obj1 = new B();
        Thread th = new Thread(obj1);
        th.start();
    }
}
