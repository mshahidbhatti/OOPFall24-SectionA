import java.io.IOException;
import java.nio.file.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class UniqueWordCountWithTiming {
    public static void main(String[] args) {
        String folderPath = "your_folder_path_here"; // Replace with your folder path
        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        List<Future<Map<String, Integer>>> futureTasks = new ArrayList<>();
        Map<String, Integer> globalWordCounts = new ConcurrentHashMap<>();

        // Start timing
        long startTime = System.nanoTime();

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(Paths.get(folderPath), "*.txt")) {
            for (Path filePath : stream) {
                Callable<Map<String, Integer>> wordCountTask = new WordCountTask(filePath);
                Future<Map<String, Integer>> future = executorService.submit(wordCountTask);
                futureTasks.add(future);
            }
        } catch (IOException e) {
            System.err.println("Error reading files: " + e.getMessage());
        }

        for (Future<Map<String, Integer>> future : futureTasks) {
            try {
                Map<String, Integer> localWordCounts = future.get();
                mergeWordCounts(globalWordCounts, localWordCounts);
            } catch (InterruptedException | ExecutionException e) {
                System.err.println("Error counting words: " + e.getMessage());
            }
        }

        executorService.shutdown();

        // End timing
        long endTime = System.nanoTime();
        long durationInMillis = (endTime - startTime) / 1_000_000;

        System.out.println("Unique Word Counts:");
        globalWordCounts.forEach((word, count) -> System.out.println(word + ": " + count));

        System.out.println("Time taken: " + durationInMillis + " ms");
    }

    private static void mergeWordCounts(Map<String, Integer> globalCounts, Map<String, Integer> localCounts) {
        localCounts.forEach((word, count) ->
                globalCounts.merge(word, count, Integer::sum)
        );
    }
}

class WordCountTask implements Callable<Map<String, Integer>> {
    private final Path filePath;

    public WordCountTask(Path filePath) {
        this.filePath = filePath;
    }

    @Override
    public Map<String, Integer> call() throws Exception {
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
}

