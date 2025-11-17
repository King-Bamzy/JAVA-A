package Java2Session4;

import java.util.concurrent.*;

public class ThreadDemo {
    public static void main(String[] args) {
        // Creating an ExecutorService with a fixed thread pool
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        // Using OS threads (ExecutorService)
        executorService.execute(() -> cpuBoundTask());

        // Using CompletableFuture for asynchronous tasks (emulating virtual threads)
        CompletableFuture<Void> ioTask = CompletableFuture.runAsync(() -> ioBoundTask());

        // Shutdown the ExecutorService after submitting tasks
        executorService.shutdown();

        // Wait for the CompletableFuture to complete
        ioTask.join();

        System.out.println("All tasks completed");
    }

    // Function to simulate a CPU-bound task
    public static void cpuBoundTask() {
        long total = 0;
        for (int i = 0; i < 10_000_000; i++) {
            total += i;
        }
        System.out.println("CPU-bound task completed");
    }

    // Function to simulate an I/O-bound task
    public static void ioBoundTask() {
        try {
            Thread.sleep(2000); // Sleep for 2 seconds to simulate I/O
            System.out.println("I/O-bound task completed");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}