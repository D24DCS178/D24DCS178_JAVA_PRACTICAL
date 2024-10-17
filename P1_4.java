
import java.util.Scanner;

public class P1_4 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter no. of days in month: ");
        int days = sc.nextInt();

        Integer exapanse[] = new Integer[days];

        for (int i = 0; i < days; i++) {
            System.out.print("enter "+(i+1)+" day's exapanse: ");
            exapanse[i] = sc.nextInt();
        }

        int totalexpanse = 0;
        for (int i = 0; i < days; i++) {
        totalexpanse = totalexpanse + exapanse[i];
        }

        System.out.println("total expanse:"+totalexpanse);
        sc.close();
    
    }
}
