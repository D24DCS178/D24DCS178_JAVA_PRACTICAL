/*Imagine you are developing an e-commerce application.
The platform needs to sort lists of products based on
different criteria, such as price, rating, or name. Each
product object implements the Comparable interface to
define the natural ordering. To ensure flexibility and
reusability, you need a generic method that can sort any
array of Comparable objects. Create a generic method in
Java that sorts an array of Comparable objects. This method
should be versatile enough to sort arrays of different types
of objects (such as products, customers, or orders) as long
as they implement the Comparable interface. */

import java.util.Arrays;

public class P8_39 {
    public static <T extends Comparable<T>> void sort(T[] comparableArray) {
        Arrays.sort(comparableArray);
    }
    public static <T extends Comparable<T>> void sortDescending(T[] comparableArray) {
        Arrays.sort(comparableArray);
        reverseArray(comparableArray);
    }
    private static <T> void reverseArray(T[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            T temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product("Laptop", 1000, 4.5),
            new Product("Smartphone", 500, 4.2),
            new Product("Tablet", 800, 4.8)
        };

        System.out.println("Before sorting:");
        printArray(products);

        sort(products);

        System.out.println("After sorting by price (ascending):");
        printArray(products);

        sortDescending(products);

        System.out.println("After sorting by price (descending):");
        printArray(products);
    }

    private static void printArray(Product[] products) {
        for (Product product : products) {
            System.out.println(product);
        }
    }
}

class Product implements Comparable<Product> {
    private String name;
    private double price;
    private double rating;

    public Product(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    @Override
    public int compareTo(Product other) {
        return Double.compare(this.price, other.price);
    }

    @Override
    public String toString() {
        return "Product{" +
            "name='" + name + '\'' +
            ", price=" + price +
            ", rating=" + rating +
            '}';
    }
}
