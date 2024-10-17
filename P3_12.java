/* Imagine you are developing a currency conversion tool for a
travel agency. This tool should be able to convert an amount
in Pounds to Rupees. For simplicity, we assume the
conversion rate is fixed: 1 Pound = 100 Rupees. The tool
should be able to take input both from command-line
arguments and interactively from the user.*/

import java.util.Scanner;
class PoundToRupee {
    int pound;
    int ruppes;

    PoundToRupee(int pound) {
        this.pound = pound;
    }

    void conversion()
    {
        ruppes = 100 * pound;
        System.out.println(pound+" Pound in ruppes is "+ruppes);
    }
}

public class P3_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter pound to rupees:-");
        int currency1 = sc.nextInt();
        sc.close();
        int currency = Integer.parseInt(args[0]);

        PoundToRupee pr = new PoundToRupee(currency1);
        pr.conversion();
        PoundToRupee pr1 = new PoundToRupee(currency);
        pr1.conversion();
    }
}
