package javafullstack;
public class MultiThread {
    public static void main(String[] args) {
        // Array to hold the numbers for the second thread
        int[] arr = {10, 15, 20, 25, 30};

        // Create and start the thread for calculating the average
        Thread averageThread = new Thread(new AverageCalculator());
        averageThread.start();

        // Create and start the thread for printing squares
        Thread squareThread = new Thread(new SquarePrinter(arr));
        squareThread.start();

        // Wait for both threads to finish
        try {
            averageThread.join();
            squareThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Preserve interrupt status
            e.printStackTrace();
        }
    }
}

// Runnable class to calculate the average of the first 50 numbers
class AverageCalculator implements Runnable {
    @Override
    public void run() {
        int sum = 0;
        int count = 50;

        for (int i = 1; i <= count; i++) {
            sum += i;
        }

        double average = (double) sum / count;
        System.out.println("Average of the first 50 numbers: " + average);
    }
}

// Runnable class to print the square of each number in the given array
class SquarePrinter implements Runnable {
    private final int[] arr;

    // Constructor to initialize the array
    public SquarePrinter(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        for (int num : arr) {
            System.out.println("Square of " + num + " is " + (num * num));
        }
    }
}
