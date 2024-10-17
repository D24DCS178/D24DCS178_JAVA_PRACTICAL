import java.util.Scanner;

/* Create a Java program that prompts the user to enter the
number of days (n) for which they want to generate their
exercise routine. The program should then calculate and
display the first n terms of the Fibonacci series, representing
the exercise duration for each day.
 */

public class P1_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter no. of days:");
        int days = sc.nextInt();
        sc.close();

        int first  = 0;
        int second = 1;
        for (int i = 0; i < days; i++) {
            System.out.println((i+1)+" day's exercise duration: "+first+" minute");
            int next = first + second;
            first = second;
            second = next;
        }

    }
}
