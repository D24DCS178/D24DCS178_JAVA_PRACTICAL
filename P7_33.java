/*Write a program which takes N and number of threads as
an argument. Program should distribute the task of
summation of N numbers amongst number of threads and
final result to be displayed on the console */

class SumThread extends Thread {
    private int start;
    private int end;
    private long partialSum = 0;

    public SumThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            partialSum += i;
        }
    }

    public long getPartialSum() {
        return partialSum;
    }
}

public class P7_33 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please provide N and the number of threads as arguments.");
            return;
        }

        int N = Integer.parseInt(args[0]);
        int numThreads = Integer.parseInt(args[1]);

        SumThread[] threads = new SumThread[numThreads];

        int range = N / numThreads;
        int remainder = N % numThreads;

        int start = 1;
        int end;

        for (int i = 0; i < numThreads; i++) {
            end = start + range - 1;

            if (i < remainder) {
                end++;
            }

            threads[i] = new SumThread(start, end);
            threads[i].start();

            start = end + 1;
        }

        long totalSum = 0;
        try {
            for (int i = 0; i < numThreads; i++) {
                threads[i].join();
                totalSum += threads[i].getPartialSum();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("The sum of numbers from 1 to " + N + " is: " + totalSum);
    }
}

