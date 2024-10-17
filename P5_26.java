
import java.util.Scanner;

/*Write a java program to generate user defined exception
using "throw" and "throws" keyword.
Also Write a java that differentiates checked and
unchecked exceptions. (Mention at least two checked and
two unchecked exceptions in program). */

class AgeNotValidException extends Exception {
    public AgeNotValidException(String message) {
        super(message);
    }
}

public class P5_26 {
    public static void checkAge(int age) throws  AgeNotValidException {
        if (age < 18 && age < 60) {
            throw new AgeNotValidException("Age is not valid to vote.");
        } else {
            System.out.println("Welcome to vote!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        sc.close();
        try {
            checkAge(age);
            System.out.println("You are eligible to vote.");
        } catch (AgeNotValidException e) {
            System.out.println(e.getMessage());
        }
    }
}
