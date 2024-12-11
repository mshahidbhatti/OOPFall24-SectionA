import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class WordFrequencyMultiThread {
    public static void main(String[] args) throws Exception {
        long startTime = System.nanoTime(); // Start time

        // Read the entire file first to divide it into chunks
        BufferedReader reader = new BufferedReader(new FileReader("LongText.txt"));
        List<String> lines = new ArrayList<>();
        String line;
        while ((line = reader.readLine()) != null) {
            lines.add(line);
        }
        reader.close();

        // Number of threads
        int numberOfThreads = 4;
        ExecutorService executor = Executors.newFixedThreadPool(numberOfThreads);

        // List of tasks (Callable) for each thread
        List<Future<Map<String, Integer>>> futures = new ArrayList<>();
        int linesPerThread = lines.size() / numberOfThreads;

        // Assigning chunks of lines to each thread
        for (int i = 0; i < numberOfThreads; i++) {
            final int start = i * linesPerThread;
            final int end = (i == numberOfThreads - 1) ? lines.size() : (i + 1) * linesPerThread;

            Callable<Map<String, Integer>> task = () -> {
                Map<String, Integer> localCount = new HashMap<>();
                for (int j = start; j < end; j++) {
                    String[] words = lines.get(j).split("\\W+");
                    for (String word : words) {
                        word = word.toLowerCase();
                        if (!word.isEmpty()) {
                            localCount.put(word, localCount.getOrDefault(word, 0) + 1);
                        }
                    }
                }
                return localCount;
            };
            futures.add(executor.submit(task));
        }

        // Combine the results from each thread
        Map<String, Integer> wordCount = new HashMap<>();
        for (Future<Map<String, Integer>> future : futures) {
            Map<String, Integer> localCount = future.get();
            localCount.forEach((key, value) -> wordCount.merge(key, value, Integer::sum));
        }

        executor.shutdown(); // Shutdown the executor service

        // Output word counts
        wordCount.forEach((k, v) -> System.out.println(k + ": " + v));

        long endTime = System.nanoTime(); // End time
        long duration = endTime - startTime; // Time taken
        System.out.println("Time taken (multi-threaded): " + duration / 1_000_000 + " ms");
    }
}

