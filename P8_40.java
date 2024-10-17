/*Write a program that counts the occurrences of words in
a text and displays the words and their occurrences in
alphabetical order of the words. Using Map and Set
Classes. */

import java.util.*;

public class P8_40 {
    public static void main(String[] args) {
        String text = "This is a sample text. This text is just a sample.";
        countWords(text);
    }

    public static void countWords(String text) {
        String[] words = text.toLowerCase().split("\\s+");
        Map<String, Integer> wordCounts = new HashMap<>();
        for (String word : words) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }
        Set<String> uniqueWords = new TreeSet<>(wordCounts.keySet());

        for (String word : uniqueWords) {
            System.out.println(word + ": " + wordCounts.get(word));
        }
    }
}
