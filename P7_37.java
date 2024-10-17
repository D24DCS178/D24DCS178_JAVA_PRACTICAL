/*Write a program to solve producer-consumer problem
using thread synchronization. */

class SharedData{
    int data;
    boolean available = false;

    synchronized void produce(int data){
        try {
            while (available) wait();
            this.data = data;
            available = true;
            notify();
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    synchronized int consume(){
        try {
            while (!available) wait();
            available = false;
            notify();
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();

        }
        return data;
    }
}

class Producer extends Thread {
    SharedData sharedData;

    Producer(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            sharedData.produce(i);
            System.out.println("Produced: " + i);
        }
    }
}

class Consumer extends Thread {
    SharedData sharedData;

    Consumer(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            int data = sharedData.consume();
            System.out.println("Consumed: " + data);
        }
    }
}

public class P7_37 {
    public static void main(String[] args) {
        SharedData sharedData = new SharedData();
        Producer producer = new Producer(sharedData);
        Consumer consumer = new Consumer(sharedData);

        producer.start();
        consumer.start();
    }
}

