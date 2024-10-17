/*Write a java that implements an interface
AdvancedArithmetic which contains amethod signature
int divisor_sum(int n). You need to write a class
calledMyCalculator which implements the interface.
divisorSum function just takes an integer as input and
return the sum of all its divisors.
For example, divisors of 6 are 1, 2, 3 and 6, so
divisor_sum should return 12. The value of n will be at
most 1000.*/

import java.util.Scanner;

interface AdvancedArithmetic {
    int divisor_sum(int n);                
}

class MyCalculator implements AdvancedArithmetic {
    @Override
    public int divisor_sum(int n)
    {
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            if (n%i == 0) {
                sum = sum + i;
                if (i == n) {
                    break;
                }
            }
        }
        return sum;
    }
}

public class P4_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyCalculator mc = new MyCalculator();
        sc.close();
        System.out.print("enter no.:");
        int n = sc.nextInt();
        int ds = mc.divisor_sum(n);
        System.out.println("sum of all divisor of "+ n + " is "+ds);
    }
}
