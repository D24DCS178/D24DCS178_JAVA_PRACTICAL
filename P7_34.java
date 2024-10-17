/*Write a java program that implements a multi-thread
application that has three threads. First thread generates
random integer every 1 second and if the value is even,
second thread computes the square of the number and
prints. If the value is odd, the third thread will print the
value of cube of the number. */

import java.util.Random;

class RandomGenerator extends Thread {
    Random random = new Random();
    SquareCalculator squareCalculator;
    CubeCalculator cubeCalculator;

    public RandomGenerator(SquareCalculator squareCalculator, CubeCalculator cubeCalculator) {
        this.squareCalculator = squareCalculator;
        this.cubeCalculator = cubeCalculator;
    }

    @Override
    public void run() {
        while (true) {
            int randomNumber = random.nextInt(100);
            System.out.println("Generated: " + randomNumber);
            if (randomNumber % 2 == 0) {
                squareCalculator.calculateSquare(randomNumber);
            } else {
                cubeCalculator.calculateCube(randomNumber);
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class SquareCalculator {
    public void calculateSquare(int randomNumber) {
        // Create a new thread for each calculation
        new Thread(() -> {
            System.out.println("Square: " + randomNumber * randomNumber);
        }).start();
    }
}

class CubeCalculator {
    public void calculateCube(int randomNumber) {
        // Create a new thread for each calculation
        new Thread(() -> {
            System.out.println("Cube: " + randomNumber * randomNumber * randomNumber);
        }).start();
    }
}

public class P7_34 {
    public static void main(String[] args) {
        SquareCalculator squareCalculator = new SquareCalculator();
        CubeCalculator cubeCalculator = new CubeCalculator();
        RandomGenerator randomGenerator = new RandomGenerator(squareCalculator, cubeCalculator);

        randomGenerator.start();
    }
}