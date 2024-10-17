/*import java.util.Scanner;

class P1_d {
    public static void main(String[] args) {
        int code[] = {1,2,3,4,5};
        int price[] = {20000,1500,500,600,900};
        double tax;
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Motor");
        System.out.println("2. Fan");
        System.out.println("3. Tube");
        System.out.println("4. Wires");
        System.out.println("5. Mouse");

        System.out.println("enter your item number:");
        int item_no = sc.nextInt();

        switch (item_no) {
            case 1:
                
                break;
            default:
                throw new AssertionError();
        }
    }
}*/

public class P1_5 {
    public static void main(String[] args) {
        // Sample data
        int[] productCodes = {1, 2, 3, 4, 5}; // Product codes
        double[] prices = {100.0, 150.0, 200.0, 50.0, 300.0}; // Corresponding prices
        
        // Validate arrays length
        if (productCodes.length != prices.length) {
            System.out.println("Product codes and prices arrays must have the same length.");
            return;
        }
        
        double totalBill = 0.0;
        
        // Process each product
        for (int i = 0; i < productCodes.length; i++) {
            int code = productCodes[i];
            double price = prices[i];
            double salesTaxRate;
            
            // Determine sales tax rate based on product code
            salesTaxRate = switch (code) {
                case 1 -> 0.08;
                case 2 -> 0.12;
                case 3 -> 0.05;
                case 4 -> 0.075;
                default -> 0.03;
            }; // 8% for motor
            // 12% for fan
            // 5% for tube light
            // 7.5% for wires
            // 3% for other items
            
            double salesTax = price * salesTaxRate;
            double totalPrice = price + salesTax;
            totalBill += totalPrice;
            
            // Print individual item details
            System.out.printf("Product Code: %d, Price: %.2f, Sales Tax: %.2f, Total Price: %.2f\n", 
                              code, price, salesTax, totalPrice);
        }
        
        // Print total bill
        System.out.printf("Total Bill (including sales tax): %.2f\n", totalBill);
    }
}

