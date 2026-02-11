package Task2;

public class Main {
    public static void main(String[] args) {
        final int size = 10000;
        final int threadCount = Runtime.getRuntime().availableProcessors();
        final int range = size / threadCount;

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 10) + 1; // Random number between 1 and 10
        }
        System.out.println("Array generated with " + size + " random integers.");
        System.out.println("Using " + threadCount + " threads to calculate the sum.");

        ArrayThread[] threads = new ArrayThread[threadCount];
        for (int i = 0; i < threadCount; i++) {
            int startIndex = i * range;
            int endIndex = (i == threadCount - 1) ? size : startIndex + range;
            threads[i] = new ArrayThread(array, startIndex, endIndex);
            threads[i].start();
        }
        long totalSum = 0;
        try {
            for (int i = 0; i < threadCount; i++) {
                threads[i].join();
                totalSum += threads[i].getPartialSum();
            }
            }
            catch (InterruptedException e) {
                System.err.println("Thread interrupted: " + e.getMessage());
            }
        System.out.println("Total sum of the array: " + totalSum);
    }
}
