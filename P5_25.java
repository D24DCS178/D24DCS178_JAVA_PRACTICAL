/*Write a Java program that throws an exception and catch
it using a try-catch block.*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class P5_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two no. to do division=");

        try { 
            int x = sc.nextInt();
            int y = sc.nextInt();
            sc.close();
            int ans = x/y;
            System.out.println("x/y ="+ans);
        }
        // catch (ArithmeticException | InputMismatchException e) {
        //     System.out.println("you are trying to divide by zero(0) or you have entered value which is not integer(number)");
        // }
        catch (ArithmeticException e) {
            System.out.println("you are trying to divide by zero(0)");
        }
        catch (InputMismatchException e) {
            System.out.println("you have entered value which is not integer(number)");
        }
        finally
        {
            System.out.println("Program executed successfully :)");
        }
    }
}