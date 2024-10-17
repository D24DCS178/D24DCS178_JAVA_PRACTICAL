import java.util.Scanner;

public class P5_26_1 {
    public static void divide(int numerator, int denominator) throws ArithmeticException 
    {
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        } else {
            int result = numerator / denominator;
            System.out.println("The result of the division is: " + result);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two no. to do division=");
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();
        try {
            divide(x, y);
            divide(x, y);  
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
