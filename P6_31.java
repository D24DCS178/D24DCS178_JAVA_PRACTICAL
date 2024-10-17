/*Write a program to show use of character and byte stream.
Also show use of
BufferedReader/BufferedWriter to read console input
and write them into a file */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class P6_31 {
    public static void main(String[] args) {
        String inputFilePath = "first.txt";    // File to read/write character stream
        String byteFilePath = "firsts.dat";  // File to read/write byte stream

        // Using BufferedReader to read input from the console and write it into a file
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(inputFilePath))) {
            
            System.out.println("Enter text (type 'exit' to stop):");

            String line;
            while (!(line = bufferedReader.readLine()).equalsIgnoreCase("exit")) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();  // Write a new line after each input line
            }

            System.out.println("Text has been written to " + inputFilePath);

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Demonstrating character stream: Reading from file and displaying contents
        try (FileReader fileReader = new FileReader(inputFilePath)) {
            int character;
            System.out.println("\nReading from " + inputFilePath + ":");
            while ((character = fileReader.read()) != -1) {
                System.out.print((char) character);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Demonstrating byte stream: Writing and reading binary data
        try (FileOutputStream fos = new FileOutputStream(byteFilePath);
             FileInputStream fis = new FileInputStream(byteFilePath)) {

            // Write byte data
            fos.write("This is byte stream data.".getBytes());
            System.out.println("\nByte stream data has been written to " + byteFilePath);

            // Read byte data
            int byteData;
            System.out.println("\nReading from " + byteFilePath + ":");
            while ((byteData = fis.read()) != -1) {
                System.out.print((char) byteData);  // Print as char
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
