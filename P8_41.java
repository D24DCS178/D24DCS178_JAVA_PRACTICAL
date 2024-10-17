/*Write a code which counts the number of the keywords in
a Java source file. Store all the keywords in a HashSet
and use the contains () method to test if a word is in the
 keyword set. */

import java.io.*;
import java.util.*;

public class P8_41 {
    private static final Set<String> keywords = new HashSet<>(Arrays.asList(
        "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", 
        "class", "const", "continue", "default", "do", "double", "else", "enum", 
        "extends", "final", "finally", "float", "for", "goto", "if", "implements", 
        "import", "instanceof", "int", "interface", "long", "native", "new", "null", 
        "package", "private", "protected", "public", "return", "short", "static", 
        "strictfp", "super", "switch", "synchronized", "this", "throw", "throws", 
        "transient", "try", "void", "volatile", "while", "true", "false"));

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the path of the Java source file: ");
        String filePath = scanner.nextLine();

        int keywordCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader("first.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\W+");

                for (String word : words) {
                    if (keywords.contains(word)) {
                        keywordCount++;
                    }
                }
            }

            System.out.println("Number of Java keywords in the file: " + keywordCount);

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
