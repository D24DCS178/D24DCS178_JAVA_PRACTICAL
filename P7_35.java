/*Write a program to increment the value of one variable by
one and display it after one second using thread using
sleep() method. */

class Counter extends Thread
{
    private int count = 0;

    @Override
    public void run()
    {
        while (true) { 
            System.out.println("Count:"+count);
            count++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class P7_35 {
    public static void main(String[] args) {
        Counter c = new Counter();
        c.start();
    }
}
