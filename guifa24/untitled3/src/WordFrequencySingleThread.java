import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordFrequencySingleThread {
    public static void main(String[] args) {
        long startTime = System.nanoTime(); // Start time

        // HashMap to store the word frequencies
        Map<String, Integer> wordCount = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader("LongText.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\W+"); // Split line into words by non-word characters

                for (String word : words) {
                    word = word.toLowerCase(); // Convert to lowercase for case-insensitivity
                    if (!word.isEmpty()) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Output word counts
        wordCount.forEach((k, v) -> System.out.println(k + ": " + v));

        long endTime = System.nanoTime(); // End time
        long duration = endTime - startTime; // Time taken
        System.out.println("Time taken (single-threaded): " + duration / 1_000_000 + " ms");
    }
}

