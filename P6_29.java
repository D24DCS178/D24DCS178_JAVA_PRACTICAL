/*Write a Java Program to Search for a given word in a
File. Also show use of Wrapper Class with an example. */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class P6_29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the file to search: ");
        String fileName = scanner.nextLine();

        System.out.print("Enter the word to search for: ");
        String searchWord = scanner.nextLine();

        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = br.readLine()) != null) {
                // Split the line into words
                String[] words = line.split("\\W+");

                for (String word : words) {
                    count += Integer.valueOf(word.equalsIgnoreCase(searchWord) ? 1 : 0);
                }
            }
            System.out.println("The word '" + searchWord + "' was found " + count + " times.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        } finally {
            scanner.close(); // Close the scanner to avoid memory leaks
        }
    }
}
