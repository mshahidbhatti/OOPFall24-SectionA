import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class UniqueWordCountWithSingleThread {
    public static void main(String[] args) {
        String folderPath = "C:\\Users\\mshah\\Desktop\\FilesCollection"; // Update with your folder path
        Map<String, Integer> globalWordCounts = new HashMap<>();

        // Start timing
        long startTime = System.nanoTime();

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(Paths.get(folderPath), "*.txt")) {
            for (Path filePath : stream) {
                Map<String, Integer> localWordCounts = countWordsInFile(filePath);
                mergeWordCounts(globalWordCounts, localWordCounts);
            }
        } catch (IOException e) {
            System.err.println("Error reading files: " + e.getMessage());
        }

        // End timing
        long endTime = System.nanoTime();
        long durationInMillis = (endTime - startTime) / 1_000_000;

        System.out.println("Unique Word Counts:");
        globalWordCounts.forEach((word, count) -> System.out.println(word + ": " + count));

        System.out.println("Time taken: " + durationInMillis + " ms");
    }

    private static Map<String, Integer> countWordsInFile(Path filePath) {
        Map<String, Integer> wordCounts = new HashMap<>();
        try {
            List<String> lines = Files.readAllLines(filePath);
            for (String line : lines) {
                String[] words = line.toLowerCase().split("\\W+"); // Splitting by non-word characters
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
                    }
                }
            }
            System.out.println("Processed file: " + filePath.getFileName());
        } catch (IOException e) {
            System.err.println("Error reading file " + filePath + ": " + e.getMessage());
        }
        return wordCounts;
    }

    private static void mergeWordCounts(Map<String, Integer> globalCounts, Map<String, Integer> localCounts) {
        localCounts.forEach((word, count) ->
                globalCounts.merge(word, count, Integer::sum)
        );
    }
}
