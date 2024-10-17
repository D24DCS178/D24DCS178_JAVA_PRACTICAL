class Odd extends Thread {
    @Override
    public void run()
    {
        for (int i = 0; i < 100; i++) {
            if (i%2 != 0) {
                System.out.println("odd number" + i);
            }
        }
    }
}

class Even extends Thread {
    @Override
    public void run()
    {
        for (int i = 0; i < 100; i++) {
            if (i%2 == 0) {
                System.out.println("even number" + i);
            }
        }
    }
}

public class P7_32_1 {
    public static void main(String[] args) {
        Odd o = new Odd();
        Even e = new Even();
        o.start();
        e.start();
    }
}
